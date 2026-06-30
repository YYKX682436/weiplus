package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.plugin.downloader.model.z0 {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f96980j = vz.e1.f441540a;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f96981c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f96982d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f96983e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f96984f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f96985g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f96986h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f96987i;

    public b0(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        super(l0Var);
        this.f96982d = new byte[0];
        this.f96986h = new java.util.HashMap();
        this.f96987i = new java.util.HashMap();
        com.tencent.mm.plugin.downloader.model.w wVar = new com.tencent.mm.plugin.downloader.model.w(this);
        this.f96981c = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f96983e = new java.util.HashMap();
        this.f96984f = new java.util.HashMap();
        this.f96985g = new java.util.concurrent.ConcurrentHashMap();
        iv1.f.f().f295114h = wVar;
    }

    public static com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo g(com.tencent.mm.plugin.downloader.model.b0 b0Var, h02.a aVar) {
        b0Var.getClass();
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo();
        cDNTaskInfo.f95498d = true;
        java.lang.String str = aVar.field_downloadUrl;
        cDNTaskInfo.f95500f = str;
        cDNTaskInfo.f95499e = str;
        cDNTaskInfo.f95501g = aVar.field_filePath;
        cDNTaskInfo.f95502h = aVar.field_secondaryUrl;
        cDNTaskInfo.f95504m = 15;
        cDNTaskInfo.f95505n = 3600;
        cDNTaskInfo.f95506o = true;
        cDNTaskInfo.f95507p = aVar.field_downloadInWifi;
        cDNTaskInfo.f95509r = aVar.field_md5;
        cDNTaskInfo.f95510s = aVar.field_enableBrotli;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            long j17 = aVar.field_fileSize;
            if (j17 > 0) {
                jSONObject.put("Content-Length", j17);
            }
            cDNTaskInfo.f95503i = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + e17.getMessage());
        }
        return cDNTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean a(long j17) {
        return k(j17, true);
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        if (t0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97150a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", "Invalid Request");
            return -1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, appId : %s", t0Var.f97156g);
        java.lang.String str = t0Var.f97150a;
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            f17 = com.tencent.mm.plugin.downloader.model.m0.d(t0Var.f97156g);
        }
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = null;
        if (f17 != null) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = d(f17.field_downloadId);
            if (d17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + d17.f96963f);
                int i17 = d17.f96963f;
                if (i17 == 1 || i17 == 6) {
                    return d17.f96961d;
                }
                if (i17 == 3) {
                    if (f17.field_autoInstall) {
                        k02.l.a(d17.f96961d, false, null);
                    }
                    return d17.f96961d;
                }
            }
            fileDownloadTaskInfo = d17;
        }
        if (f17 != null) {
            com.tencent.mm.plugin.downloader.model.m0.i(f17.field_downloadId);
        }
        h02.a b17 = com.tencent.mm.plugin.downloader.model.u0.b(t0Var);
        if (!t0Var.f97162m || f17 == null) {
            b17.field_downloadId = java.lang.System.currentTimeMillis();
            b17.field_userSessionId = com.tencent.mm.plugin.game.commlib.util.i.e();
        } else {
            b17.field_downloadId = f17.field_downloadId;
        }
        b17.field_downloaderType = 3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97175z)) {
            b17.field_filePath = f96980j + com.tencent.mm.plugin.downloader.model.z0.f(str);
        } else {
            b17.field_filePath = t0Var.f97175z;
        }
        java.lang.String str2 = b17.field_filePath;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2.substring(0, str2.lastIndexOf("/") + 1));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(s17.o());
                if (r6Var2.J()) {
                    r6Var2.L(s17);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", s17.o());
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", java.lang.Boolean.valueOf(r6Var.J()));
        }
        if (fileDownloadTaskInfo != null) {
            java.lang.String str3 = b17.field_filePath;
            java.lang.String str4 = fileDownloadTaskInfo.f96964g;
            if (str3 != null && str4 != null && !str3.equals(str4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "removeLastFile, new File = %s, oldFile = %s", str3, str4);
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str4));
                if (r6Var3.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var3.l()));
                }
            }
            int i18 = fileDownloadTaskInfo.f96963f;
            if (i18 == 2) {
                b17.field_startState = 1;
            } else if (i18 == 4) {
                b17.field_startState = 2;
            } else {
                b17.field_startState = 0;
            }
            b17.field_startSize = fileDownloadTaskInfo.f96967m;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, startSize = " + fileDownloadTaskInfo.f96967m);
        } else {
            b17.field_startState = 0;
        }
        if (!t0Var.f97163n || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                b17.field_downloadInWifi = true;
            }
            return e(b17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "downloadInWifi, not in wifi");
        b17.field_status = 0;
        b17.field_downloadInWifi = true;
        com.tencent.mm.plugin.downloader.model.m0.a(b17);
        return b17.field_downloadId;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean c(long j17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.downloader.model.z(this, j17));
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d(long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, downloadid ; %d, appId : %s, status : %d", java.lang.Long.valueOf(c17.field_downloadId), c17.field_appId, java.lang.Integer.valueOf(c17.field_status));
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState h17 = java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId() ? iv1.f.f().h(c17.field_downloadUrl) : iv1.f.f().h(c17.field_downloadUrl);
        if (h17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, cdntaskstate: %d", java.lang.Integer.valueOf(h17.f95511d));
            switch (h17.f95511d) {
                case 100:
                    fileDownloadTaskInfo.f96963f = 1;
                    fileDownloadTaskInfo.f96967m = h17.f95512e;
                    fileDownloadTaskInfo.f96968n = h17.f95513f;
                    break;
                case 101:
                    fileDownloadTaskInfo.f96963f = 1;
                    fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
                    fileDownloadTaskInfo.f96968n = c17.field_totalSize;
                    break;
                case 102:
                    fileDownloadTaskInfo.f96963f = 2;
                    fileDownloadTaskInfo.f96967m = h17.f95512e;
                    fileDownloadTaskInfo.f96968n = h17.f95513f;
                    break;
                case 103:
                default:
                    int i17 = c17.field_status;
                    if (i17 == 1) {
                        fileDownloadTaskInfo.f96963f = 2;
                    } else {
                        fileDownloadTaskInfo.f96963f = i17;
                    }
                    fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
                    fileDownloadTaskInfo.f96968n = c17.field_totalSize;
                    break;
                case 104:
                    if (!com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                        fileDownloadTaskInfo.f96963f = 0;
                        break;
                    } else if (c17.field_status != 6) {
                        fileDownloadTaskInfo.f96963f = 3;
                        break;
                    } else {
                        fileDownloadTaskInfo.f96963f = 6;
                        break;
                    }
            }
            long abs = java.lang.Math.abs(fileDownloadTaskInfo.f96968n);
            fileDownloadTaskInfo.f96968n = abs;
            long j18 = fileDownloadTaskInfo.f96967m;
            if (j18 > abs) {
                j18 = abs;
            }
            fileDownloadTaskInfo.f96967m = j18;
            c17.field_downloadedSize = j18;
            c17.field_totalSize = abs;
        } else {
            fileDownloadTaskInfo.f96963f = c17.field_status;
            if (com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
                fileDownloadTaskInfo.f96968n = c17.field_totalSize;
            } else {
                fileDownloadTaskInfo.f96967m = 0L;
                fileDownloadTaskInfo.f96968n = 0L;
            }
        }
        int i18 = fileDownloadTaskInfo.f96963f;
        if ((i18 == 6 || i18 == 3) && !com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
            fileDownloadTaskInfo.f96963f = 0;
        }
        if (fileDownloadTaskInfo.f96963f == 6) {
            if (!((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).contains(java.lang.Long.valueOf(fileDownloadTaskInfo.f96961d))) {
                fileDownloadTaskInfo.f96963f = 3;
            }
        }
        fileDownloadTaskInfo.f96961d = j17;
        fileDownloadTaskInfo.f96970p = c17.field_downloaderType;
        fileDownloadTaskInfo.f96969o = c17.field_autoDownload;
        fileDownloadTaskInfo.f96964g = c17.field_filePath;
        fileDownloadTaskInfo.f96962e = c17.field_downloadUrl;
        fileDownloadTaskInfo.f96965h = c17.field_md5;
        fileDownloadTaskInfo.f96966i = c17.field_appId;
        fileDownloadTaskInfo.f96973s = c17.field_userSessionId;
        int i19 = c17.field_status;
        int i27 = fileDownloadTaskInfo.f96963f;
        if (i19 != i27 && (i27 == 1 || i19 == 1)) {
            c17.field_status = i27;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, url: %s, status = %d, downloadedSize = %d, totalSize = %d", fileDownloadTaskInfo.f96962e, java.lang.Integer.valueOf(fileDownloadTaskInfo.f96963f), java.lang.Long.valueOf(fileDownloadTaskInfo.f96967m), java.lang.Long.valueOf(fileDownloadTaskInfo.f96968n));
        return fileDownloadTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long e(h02.a aVar) {
        p95.a.a(new com.tencent.mm.plugin.downloader.model.x(this, aVar));
        return aVar.field_downloadId;
    }

    public final void h(java.lang.String str) {
        synchronized (this.f96982d) {
            java.lang.Integer num = (java.lang.Integer) this.f96985g.get(str);
            if (num == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "No notification id found");
                return;
            }
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(num.intValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "cancelNotification, id = " + num);
            this.f96985g.remove(str);
        }
    }

    public final android.app.PendingIntent i(h02.a aVar) {
        android.content.Context context = this.f96981c;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.downloader.ui.FileDownloadNotificationClickReceiver.class);
        if (aVar.field_status != 4) {
            intent.putExtra("extra_download_id", aVar.field_downloadId);
        }
        return android.app.PendingIntent.getBroadcast(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r12 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(h02.a r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 4
            if (r11 != r0) goto L5
            r0 = 2
            goto L10
        L5:
            r1 = 3
            if (r11 != r1) goto L9
            goto Lf
        L9:
            r1 = 1
            if (r11 != r1) goto Lf
            if (r12 == 0) goto Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.Class<m33.l1> r11 = m33.l1.class
            i95.m r11 = i95.n0.c(r11)
            m33.l1 r11 = (m33.l1) r11
            java.lang.String r2 = r10.field_extInfo
            r3 = 11311002(0xac979a, double:5.5883775E-317)
            r5 = 0
            r7 = 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "{\"status\":"
            r10.<init>(r12)
            r10.append(r0)
            java.lang.String r12 = "}"
            r10.append(r12)
            java.lang.String r8 = r10.toString()
            r1 = r11
            com.tencent.mm.plugin.game.p0 r1 = (com.tencent.mm.plugin.game.p0) r1
            r1.nj(r2, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader.model.b0.j(h02.a, int, boolean):void");
    }

    public boolean k(long j17, boolean z17) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || (d17 = d(c17.field_downloadId)) == null) {
            return false;
        }
        int i17 = d17.f96963f;
        if (i17 != 1 && i17 != 6) {
            if (i17 == 3) {
                if (c17.field_autoInstall) {
                    k02.l.a(d17.f96961d, false, null);
                }
                return true;
            }
            if ((c17.field_reserveInWifi || c17.field_downloadInWifi) && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask, downloadInWifi, not wifi");
                return true;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                c17.field_downloadInWifi = true;
            }
            p95.a.a(new com.tencent.mm.plugin.downloader.model.a0(this, c17, z17, j17));
        }
        return true;
    }

    public final void l(java.lang.String str, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", "updateNotification failed: null task info");
            return;
        }
        if (f17.field_showNotification) {
            if (f17.field_fileType == 5 && (i17 == 4 || (i17 == 1 && z17))) {
                j(f17, i17, z19);
            }
            z2.k0 k0Var = new z2.k0(this.f96981c, "reminder_channel_id");
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f96983e.put(str, java.lang.Long.valueOf(currentTimeMillis));
                k0Var.D.when = currentTimeMillis;
            } else {
                java.lang.Long l17 = (java.lang.Long) this.f96983e.get(str);
                if (l17 != null) {
                    k0Var.D.when = l17.longValue();
                } else {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    this.f96983e.put(str, valueOf);
                    k0Var.D.when = valueOf.longValue();
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(f17.field_notificationTitle)) {
                com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(f17.field_appId, false, false);
                if (j17 == null || com.tencent.mm.sdk.platformtools.t8.K0(j17.field_appName)) {
                    k0Var.f(f17.field_fileName);
                } else {
                    k0Var.f(j17.field_appName);
                }
            } else if (f17.field_fileType == 5) {
                k0Var.f(f17.field_notificationTitle);
            } else {
                k0Var.f(f17.field_notificationTitle + " · " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cef));
            }
            if (i17 == 1) {
                k0Var.D.icon = android.R.drawable.stat_sys_download;
                if (i18 == 0) {
                    i18 = 1;
                }
                boolean z27 = i18 == 0;
                k0Var.f469470n = 100;
                k0Var.f469471o = i18;
                k0Var.f469472p = z27;
                if (f17.field_fileType != 5) {
                    if (f17.field_reserveInWifi) {
                        k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.cem) + "·" + this.f96981c.getString(com.tencent.mm.R.string.cek));
                    } else {
                        k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.cek));
                    }
                    android.content.Context context = this.f96981c;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI.class);
                    intent.putExtra("extra_download_id", f17.field_downloadId);
                    k0Var.f469463g = android.app.PendingIntent.getActivity(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
                } else {
                    k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.nhn));
                    k0Var.f469463g = i(f17);
                }
                k0Var.h(2, true);
            } else {
                if (i17 != 4) {
                    h(str);
                    return;
                }
                k0Var.D.icon = android.R.drawable.stat_sys_download_done;
                k0Var.d(true);
                if (f17.field_fileType != 5) {
                    if (z18) {
                        k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.cei));
                    } else {
                        k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.ceh));
                    }
                    k0Var.f469463g = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, new android.content.Intent(), fp.g0.a(0));
                } else {
                    k0Var.e(this.f96981c.getString(com.tencent.mm.R.string.nhl));
                    k0Var.f469463g = i(f17);
                }
            }
            synchronized (this.f96982d) {
                java.lang.Integer num = (java.lang.Integer) this.f96985g.get(str);
                if (num == null) {
                    this.f96985g.put(str, java.lang.Integer.valueOf(((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(k0Var.b(), true)));
                } else {
                    ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(num.intValue(), k0Var.b(), true);
                }
                if (i17 == 4) {
                    this.f96985g.remove(str);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public int removeDownloadTask(long j17) {
        p95.a.a(new com.tencent.mm.plugin.downloader.model.y(this, j17));
        return 1;
    }
}
