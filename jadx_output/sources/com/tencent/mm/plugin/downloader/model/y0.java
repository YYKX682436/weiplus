package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public final class y0 extends com.tencent.mm.plugin.downloader.model.z0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.app.DownloadManager f97201c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f97202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f97203e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f97204f;

    public y0(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        super(l0Var);
        this.f97204f = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.downloader.model.w0(this), false);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f97202d = context;
        this.f97201c = (android.app.DownloadManager) context.getSystemService("download");
        this.f97203e = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public static void g(com.tencent.mm.plugin.downloader.model.y0 y0Var, java.lang.Long l17) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = y0Var.f97203e;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(l17.longValue());
        if (c17 == null) {
            return;
        }
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(c17.field_sysDownloadId);
        try {
            android.database.Cursor query2 = y0Var.f97201c.query(query);
            if (query2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                copyOnWriteArraySet.remove(l17);
                c17.field_status = 4;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                return;
            }
            if (query2.moveToFirst()) {
                int columnIndex = query2.getColumnIndex("status");
                int columnIndex2 = query2.getColumnIndex("local_uri");
                int columnIndex3 = query2.getColumnIndex("bytes_so_far");
                int columnIndex4 = query2.getColumnIndex("total_size");
                if (columnIndex != -1) {
                    try {
                        int i17 = query2.getInt(columnIndex);
                        if (i17 == 1 || i17 == 2) {
                            if (columnIndex3 != -1) {
                                c17.field_downloadedSize = query2.getLong(columnIndex3);
                            }
                            if (columnIndex4 != -1) {
                                c17.field_totalSize = query2.getLong(columnIndex4);
                            }
                            c17.field_status = 1;
                            com.tencent.mm.plugin.downloader.model.m0.l(c17);
                            y0Var.f97212a.f(l17.longValue(), "", 0L, 0L);
                        } else {
                            com.tencent.mm.plugin.downloader.model.l0 l0Var = y0Var.f97212a;
                            if (i17 == 4) {
                                copyOnWriteArraySet.remove(l17);
                                c17.field_status = 2;
                                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                                l0Var.e(l17.longValue());
                            } else if (i17 == 8) {
                                copyOnWriteArraySet.remove(l17);
                                if (columnIndex2 != -1) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.field_filePath) && com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                                        android.content.Intent intent = new android.content.Intent();
                                        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
                                        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, c17.field_downloadId);
                                        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
                                        j45.l.A(intent);
                                    }
                                    com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "path not exists, path = %s", c17.field_filePath);
                                    c17.field_status = 4;
                                    com.tencent.mm.plugin.downloader.model.m0.l(c17);
                                    return;
                                }
                            } else if (i17 == 16) {
                                copyOnWriteArraySet.remove(l17);
                                c17.field_status = 4;
                                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                                l0Var.c(l17.longValue(), 901, false);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        copyOnWriteArraySet.remove(l17);
                        c17.field_status = 4;
                        com.tencent.mm.plugin.downloader.model.m0.l(c17);
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e17.toString());
                    }
                }
            }
            query2.close();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e18.toString(), l17);
            copyOnWriteArraySet.remove(l17);
            c17.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean a(long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.field_downloaderType != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", java.lang.Long.valueOf(j17));
            com.tencent.mm.vfs.w6.h(c17.field_filePath);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask, delete file: %s", c17.field_filePath);
            com.tencent.mm.plugin.downloader.model.m0.i(j17);
            return false;
        }
        if (c17.field_status == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", java.lang.Long.valueOf(j17));
            return false;
        }
        this.f97201c.remove(c17.field_sysDownloadId);
        long h17 = h(c17);
        if (h17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
            return false;
        }
        this.f97203e.add(java.lang.Long.valueOf(c17.field_downloadId));
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f97204f;
        if (b4Var.e()) {
            b4Var.c(100L, 100L);
        }
        c17.field_sysDownloadId = h17;
        c17.field_status = 1;
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        java.lang.String str;
        if (t0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97150a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
            return -1L;
        }
        if (t0Var.f97160k) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", t0Var.f97156g);
            return -1L;
        }
        java.lang.String str2 = t0Var.f97150a;
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str2);
        if (f17 != null) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo i17 = i(f17.field_sysDownloadId);
            if (i17.f96963f == 1) {
                return i17.f96961d;
            }
            str = f17.field_filePath;
            this.f97201c.remove(f17.field_sysDownloadId);
        } else {
            str = "";
        }
        java.lang.String str3 = android.os.Environment.DIRECTORY_DOWNLOADS;
        wo.o oVar = wo.v1.f447833m;
        java.lang.String absolutePath = (com.tencent.mm.sdk.platformtools.t8.K0(oVar.A) ? android.os.Environment.getExternalStoragePublicDirectory(str3) : new java.io.File(oVar.A)).getAbsolutePath();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(absolutePath)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(absolutePath);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", java.lang.Boolean.valueOf(!m18.a() ? false : m18.f213266a.r(m18.f213267b)));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var.l()));
            }
        }
        com.tencent.mm.plugin.downloader.model.m0.k(str2);
        com.tencent.mm.plugin.downloader.model.m0.j(t0Var.f97156g);
        h02.a b17 = com.tencent.mm.plugin.downloader.model.u0.b(t0Var);
        b17.field_downloadId = java.lang.System.currentTimeMillis();
        b17.field_userSessionId = com.tencent.mm.plugin.game.commlib.util.i.e();
        b17.field_status = 0;
        b17.field_downloaderType = 1;
        java.lang.String f18 = com.tencent.mm.plugin.downloader.model.z0.f(str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((com.tencent.mm.sdk.platformtools.t8.K0(oVar.A) ? android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS) : new java.io.File(oVar.A)).getAbsolutePath());
        sb6.append("/");
        sb6.append(f18);
        b17.field_filePath = sb6.toString();
        b17.field_startTime = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.downloader.model.m0.a(b17);
        gm0.j1.e().j(new com.tencent.mm.plugin.downloader.model.v0(this, t0Var, b17));
        return b17.field_downloadId;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean c(long j17) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = d(j17);
        this.f97203e.remove(java.lang.Long.valueOf(j17));
        if (d17.f96963f != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", java.lang.Long.valueOf(j17));
            return true;
        }
        int removeDownloadTask = removeDownloadTask(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(removeDownloadTask));
        return removeDownloadTask > 0;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d(long j17) {
        if (com.tencent.mm.plugin.downloader.model.r0.i().m(j17)) {
            com.tencent.mm.plugin.downloader.model.r0.i().getClass();
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.downloader.model.r0.f97123h).get(java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo i17 = i(l17 == null ? -1L : l17.longValue());
            i17.f96961d = j17;
            i17.f96970p = 1;
            return i17;
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        }
        int i18 = c17.field_status;
        if (i18 == 4 || i18 == 2 || i18 == 5 || i18 == 3) {
            this.f97203e.remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        fileDownloadTaskInfo.f96961d = c17.field_downloadId;
        fileDownloadTaskInfo.f96962e = c17.field_downloadUrl;
        fileDownloadTaskInfo.f96963f = c17.field_status;
        fileDownloadTaskInfo.f96964g = c17.field_filePath;
        fileDownloadTaskInfo.f96965h = c17.field_md5;
        fileDownloadTaskInfo.f96969o = c17.field_autoDownload;
        fileDownloadTaskInfo.f96970p = c17.field_downloaderType;
        fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
        fileDownloadTaskInfo.f96968n = c17.field_totalSize;
        fileDownloadTaskInfo.f96973s = c17.field_userSessionId;
        return fileDownloadTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long e(h02.a aVar) {
        return aVar.field_downloadId;
    }

    public final long h(h02.a aVar) {
        try {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(aVar.field_downloadUrl));
            request.setAllowedNetworkTypes(3);
            request.setShowRunningNotification(aVar.field_showNotification);
            request.setVisibleInDownloadsUi(aVar.field_showNotification);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_fileName)) {
                request.setTitle(aVar.field_fileName);
            }
            request.setDestinationUri(com.tencent.mm.sdk.platformtools.i1.b(this.f97202d, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.w6.i(aVar.field_filePath, true))));
            long enqueue = this.f97201c.enqueue(request);
            if (enqueue > 0) {
                return enqueue;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
            return -1L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", e17.toString(), aVar.field_downloadUrl);
            return -1L;
        }
    }

    public final com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo i(long j17) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(j17);
        try {
            android.database.Cursor query2 = this.f97201c.query(query);
            if (query2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                return fileDownloadTaskInfo;
            }
            if (query2.moveToFirst()) {
                int columnIndex = query2.getColumnIndex("status");
                int columnIndex2 = query2.getColumnIndex("uri");
                int columnIndex3 = query2.getColumnIndex("local_uri");
                int columnIndex4 = query2.getColumnIndex("bytes_so_far");
                int columnIndex5 = query2.getColumnIndex("total_size");
                int columnIndex6 = query2.getColumnIndex("userSessionId");
                if (columnIndex != -1) {
                    try {
                        int i17 = query2.getInt(columnIndex);
                        if (i17 == 1 || i17 == 2) {
                            fileDownloadTaskInfo.f96963f = 1;
                        } else if (i17 == 4) {
                            fileDownloadTaskInfo.f96963f = 2;
                        } else if (i17 == 8) {
                            fileDownloadTaskInfo.f96963f = 3;
                        } else if (i17 == 16) {
                            fileDownloadTaskInfo.f96963f = 4;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e17.toString());
                        fileDownloadTaskInfo.f96963f = 4;
                    }
                }
                if (columnIndex2 != -1) {
                    fileDownloadTaskInfo.f96962e = query2.getString(columnIndex2);
                }
                if (columnIndex3 != -1) {
                    java.lang.String string = query2.getString(columnIndex3);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", string);
                        java.lang.String path = android.net.Uri.parse(string).getPath();
                        fileDownloadTaskInfo.f96964g = path;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", path);
                    }
                }
                if (columnIndex4 != -1) {
                    fileDownloadTaskInfo.f96967m = query2.getLong(columnIndex4);
                }
                if (columnIndex5 != -1) {
                    fileDownloadTaskInfo.f96968n = query2.getLong(columnIndex5);
                }
                if (columnIndex6 != -1) {
                    fileDownloadTaskInfo.f96973s = query2.getString(columnIndex6);
                }
            }
            query2.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(fileDownloadTaskInfo.f96963f), fileDownloadTaskInfo.f96962e, fileDownloadTaskInfo.f96964g);
            return fileDownloadTaskInfo;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e18.toString(), java.lang.Long.valueOf(j17));
            return fileDownloadTaskInfo;
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public int removeDownloadTask(long j17) {
        java.lang.Exception e17;
        int i17;
        boolean m17 = com.tencent.mm.plugin.downloader.model.r0.i().m(j17);
        android.app.DownloadManager downloadManager = this.f97201c;
        int i18 = 0;
        if (m17) {
            com.tencent.mm.plugin.downloader.model.r0.i().getClass();
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.downloader.model.r0.f97123h).get(java.lang.Long.valueOf(j17));
            return downloadManager.remove(l17 == null ? -1L : l17.longValue());
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "Invalid id");
            return 0;
        }
        try {
            i17 = downloadManager.remove(c17.field_sysDownloadId);
        } catch (java.lang.Exception e18) {
            e17 = e18;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: id: %d", java.lang.Long.valueOf(j17));
        } catch (java.lang.Exception e19) {
            e17 = e19;
            i18 = i17;
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "remove task error:[%d], [%s]", java.lang.Long.valueOf(j17), e17.toString());
            i17 = i18;
            com.tencent.mm.vfs.w6.h(c17.field_filePath);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c17.field_filePath);
            c17.field_status = 5;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            this.f97212a.g(j17);
            this.f97203e.remove(java.lang.Long.valueOf(j17));
            return i17;
        }
        com.tencent.mm.vfs.w6.h(c17.field_filePath);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c17.field_filePath);
        c17.field_status = 5;
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        this.f97212a.g(j17);
        this.f97203e.remove(java.lang.Long.valueOf(j17));
        return i17;
    }
}
