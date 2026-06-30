package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public final class y0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.app.DownloadManager f178734c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f178735d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f178736e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f178737f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var) {
        super(l0Var);
        this.f178737f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w0(this), false);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f178735d = context;
        this.f178734c = (android.app.DownloadManager) context.getSystemService("download");
        this.f178736e = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 y0Var, java.lang.Long l17) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = y0Var.f178736e;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(l17.longValue());
        if (c17 == null) {
            return;
        }
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(c17.f68442x143643eb);
        try {
            android.database.Cursor query2 = y0Var.f178734c.query(query);
            if (query2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                copyOnWriteArraySet.remove(l17);
                c17.f68441x10a0fed7 = 4;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
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
                                c17.f68413xf432b5ad = query2.getLong(columnIndex3);
                            }
                            if (columnIndex4 != -1) {
                                c17.f68443x78351860 = query2.getLong(columnIndex4);
                            }
                            c17.f68441x10a0fed7 = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                            y0Var.f178745a.f(l17.longValue(), "", 0L, 0L);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var = y0Var.f178745a;
                            if (i17 == 4) {
                                copyOnWriteArraySet.remove(l17);
                                c17.f68441x10a0fed7 = 2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                                l0Var.e(l17.longValue());
                            } else if (i17 == 8) {
                                copyOnWriteArraySet.remove(l17);
                                if (columnIndex2 != -1) {
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68419xf1e9b966) && com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                                        android.content.Intent intent = new android.content.Intent();
                                        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
                                        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, c17.f68408x32b20428);
                                        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
                                        j45.l.A(intent);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "path not exists, path = %s", c17.f68419xf1e9b966);
                                    c17.f68441x10a0fed7 = 4;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                                    return;
                                }
                            } else if (i17 == 16) {
                                copyOnWriteArraySet.remove(l17);
                                c17.f68441x10a0fed7 = 4;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                                l0Var.c(l17.longValue(), 901, false);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        copyOnWriteArraySet.remove(l17);
                        c17.f68441x10a0fed7 = 4;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e17.toString());
                    }
                }
            }
            query2.close();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e18.toString(), l17);
            copyOnWriteArraySet.remove(l17);
            c17.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean a(long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.f68414xf4f8adf4 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask, delete file: %s", c17.f68419xf1e9b966);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j17);
            return false;
        }
        if (c17.f68441x10a0fed7 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", java.lang.Long.valueOf(j17));
            return false;
        }
        this.f178734c.remove(c17.f68442x143643eb);
        long h17 = h(c17);
        if (h17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
            return false;
        }
        this.f178736e.add(java.lang.Long.valueOf(c17.f68408x32b20428));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f178737f;
        if (b4Var.e()) {
            b4Var.c(100L, 100L);
        }
        c17.f68442x143643eb = h17;
        c17.f68441x10a0fed7 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        java.lang.String str;
        if (t0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t0Var.f178683a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
            return -1L;
        }
        if (t0Var.f178693k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", t0Var.f178689g);
            return -1L;
        }
        java.lang.String str2 = t0Var.f178683a;
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str2);
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 i17 = i(f17.f68442x143643eb);
            if (i17.f178496f == 1) {
                return i17.f178494d;
            }
            str = f17.f68419xf1e9b966;
            this.f178734c.remove(f17.f68442x143643eb);
        } else {
            str = "";
        }
        java.lang.String str3 = android.os.Environment.DIRECTORY_DOWNLOADS;
        wo.o oVar = wo.v1.f529366m;
        java.lang.String absolutePath = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.A) ? android.os.Environment.getExternalStoragePublicDirectory(str3) : new java.io.File(oVar.A)).getAbsolutePath();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(absolutePath)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(absolutePath);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", java.lang.Boolean.valueOf(!m18.a() ? false : m18.f294799a.r(m18.f294800b)));
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var.l()));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.j(t0Var.f178689g);
        h02.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.b(t0Var);
        b17.f68408x32b20428 = java.lang.System.currentTimeMillis();
        b17.f68446x1294bc41 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.e();
        b17.f68441x10a0fed7 = 0;
        b17.f68414xf4f8adf4 = 1;
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0.f(str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.A) ? android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS) : new java.io.File(oVar.A)).getAbsolutePath());
        sb6.append("/");
        sb6.append(f18);
        b17.f68419xf1e9b966 = sb6.toString();
        b17.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.v0(this, t0Var, b17));
        return b17.f68408x32b20428;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = d(j17);
        this.f178736e.remove(java.lang.Long.valueOf(j17));
        if (d17.f178496f != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", java.lang.Long.valueOf(j17));
            return true;
        }
        int mo54687xdf0c94d1 = mo54687xdf0c94d1(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(mo54687xdf0c94d1));
        return mo54687xdf0c94d1 > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d(long j17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().m(j17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().getClass();
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.f178656h).get(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 i17 = i(l17 == null ? -1L : l17.longValue());
            i17.f178494d = j17;
            i17.f178503p = 1;
            return i17;
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        }
        int i18 = c17.f68441x10a0fed7;
        if (i18 == 4 || i18 == 2 || i18 == 5 || i18 == 3) {
            this.f178736e.remove(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        c13222x107de37.f178494d = c17.f68408x32b20428;
        c13222x107de37.f178495e = c17.f68411x238eb002;
        c13222x107de37.f178496f = c17.f68441x10a0fed7;
        c13222x107de37.f178497g = c17.f68419xf1e9b966;
        c13222x107de37.f178498h = c17.f68426x4b6e68b9;
        c13222x107de37.f178502o = c17.f68405x56e99a7c;
        c13222x107de37.f178503p = c17.f68414xf4f8adf4;
        c13222x107de37.f178500m = c17.f68413xf432b5ad;
        c13222x107de37.f178501n = c17.f68443x78351860;
        c13222x107de37.f178506s = c17.f68446x1294bc41;
        return c13222x107de37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long e(h02.a aVar) {
        return aVar.f68408x32b20428;
    }

    public final long h(h02.a aVar) {
        try {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(aVar.f68411x238eb002));
            request.setAllowedNetworkTypes(3);
            request.setShowRunningNotification(aVar.f68435x73c7b92d);
            request.setVisibleInDownloadsUi(aVar.f68435x73c7b92d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68418xf1e8cfcc)) {
                request.setTitle(aVar.f68418xf1e8cfcc);
            }
            request.setDestinationUri(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(this.f178735d, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.w6.i(aVar.f68419xf1e9b966, true))));
            long enqueue = this.f178734c.enqueue(request);
            if (enqueue > 0) {
                return enqueue;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
            return -1L;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", e17.toString(), aVar.f68411x238eb002);
            return -1L;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 i(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(j17);
        try {
            android.database.Cursor query2 = this.f178734c.query(query);
            if (query2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
                return c13222x107de37;
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
                            c13222x107de37.f178496f = 1;
                        } else if (i17 == 4) {
                            c13222x107de37.f178496f = 2;
                        } else if (i17 == 8) {
                            c13222x107de37.f178496f = 3;
                        } else if (i17 == 16) {
                            c13222x107de37.f178496f = 4;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", e17.toString());
                        c13222x107de37.f178496f = 4;
                    }
                }
                if (columnIndex2 != -1) {
                    c13222x107de37.f178495e = query2.getString(columnIndex2);
                }
                if (columnIndex3 != -1) {
                    java.lang.String string = query2.getString(columnIndex3);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", string);
                        java.lang.String path = android.net.Uri.parse(string).getPath();
                        c13222x107de37.f178497g = path;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", path);
                    }
                }
                if (columnIndex4 != -1) {
                    c13222x107de37.f178500m = query2.getLong(columnIndex4);
                }
                if (columnIndex5 != -1) {
                    c13222x107de37.f178501n = query2.getLong(columnIndex5);
                }
                if (columnIndex6 != -1) {
                    c13222x107de37.f178506s = query2.getString(columnIndex6);
                }
            }
            query2.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(c13222x107de37.f178496f), c13222x107de37.f178495e, c13222x107de37.f178497g);
            return c13222x107de37;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", e18.toString(), java.lang.Long.valueOf(j17));
            return c13222x107de37;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    /* renamed from: removeDownloadTask */
    public int mo54687xdf0c94d1(long j17) {
        java.lang.Exception e17;
        int i17;
        boolean m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().m(j17);
        android.app.DownloadManager downloadManager = this.f178734c;
        int i18 = 0;
        if (m17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().getClass();
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.f178656h).get(java.lang.Long.valueOf(j17));
            return downloadManager.remove(l17 == null ? -1L : l17.longValue());
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "Invalid id");
            return 0;
        }
        try {
            i17 = downloadManager.remove(c17.f68442x143643eb);
        } catch (java.lang.Exception e18) {
            e17 = e18;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: id: %d", java.lang.Long.valueOf(j17));
        } catch (java.lang.Exception e19) {
            e17 = e19;
            i18 = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "remove task error:[%d], [%s]", java.lang.Long.valueOf(j17), e17.toString());
            i17 = i18;
            com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c17.f68419xf1e9b966);
            c17.f68441x10a0fed7 = 5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            this.f178745a.g(j17);
            this.f178736e.remove(java.lang.Long.valueOf(j17));
            return i17;
        }
        com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", c17.f68419xf1e9b966);
        c17.f68441x10a0fed7 = 5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        this.f178745a.g(j17);
        this.f178736e.remove(java.lang.Long.valueOf(j17));
        return i17;
    }
}
