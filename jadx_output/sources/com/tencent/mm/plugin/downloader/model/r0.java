package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public final class r0 implements vz.s1 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f97123h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static int f97124i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static com.tencent.mm.plugin.downloader.model.r0 f97125j;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.h1 f97126a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.h1 f97127b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.h1 f97128c;

    /* renamed from: d, reason: collision with root package name */
    public i02.h f97129d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.h1 f97130e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.l0 f97131f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97132g = false;

    public r0() {
        java.util.Map<java.lang.String, ?> all;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("off_line_download_ids", 0);
        if (sharedPreferences != null && (all = sharedPreferences.getAll()) != null && all.size() != 0) {
            java.util.Map map = f97123h;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.clear();
            for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                if (entry != null && !com.tencent.mm.sdk.platformtools.t8.K0(entry.getKey())) {
                    try {
                        long V = com.tencent.mm.sdk.platformtools.t8.V(entry.getKey(), 0L);
                        long longValue = ((java.lang.Long) entry.getValue()).longValue();
                        long currentTimeMillis = (java.lang.System.currentTimeMillis() - V) - V;
                        if (currentTimeMillis > 0 && currentTimeMillis < 86400000) {
                            ((java.util.HashMap) map).put(java.lang.Long.valueOf(V), java.lang.Long.valueOf(longValue));
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadManager", "parse download task failed: " + e17.toString());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloadManager", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            sharedPreferences.edit().clear();
            for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
                sharedPreferences.edit().putLong(entry2.getKey() + "", ((java.lang.Long) entry2.getValue()).longValue());
            }
            sharedPreferences.edit().commit();
        }
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FileDownloaderType"), 2);
                f97124i = P;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", java.lang.Integer.valueOf(P));
                this.f97131f = new com.tencent.mm.plugin.downloader.model.l0();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
        this.f97131f = new com.tencent.mm.plugin.downloader.model.l0();
    }

    public static com.tencent.mm.plugin.downloader.model.r0 i() {
        if (f97125j == null) {
            f97125j = new com.tencent.mm.plugin.downloader.model.r0();
        }
        return f97125j;
    }

    public static java.lang.String j(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.lang.String a17 = com.tencent.mm.pluginsdk.model.app.n1.a(str);
        return com.tencent.mm.sdk.platformtools.t8.K0(a17) ? com.tencent.mm.pluginsdk.model.app.n1.a(kk.w.a(str, false)) : a17;
    }

    public void a(com.tencent.mm.plugin.downloader.model.g1 g1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "addCallback: " + g1Var);
        this.f97131f.getClass();
        if (g1Var != null) {
            java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
            if (vector.contains(g1Var)) {
                return;
            }
            vector.add(g1Var);
        }
    }

    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "addDownloadTask, filetype:%d, appId = %s", java.lang.Integer.valueOf(t0Var.f97155f), t0Var.f97156g);
        int i17 = t0Var.f97155f;
        if (i17 == 2 || i17 == 4) {
            if (this.f97130e == null) {
                this.f97130e = new com.tencent.mm.plugin.downloader.model.f1(this.f97131f);
            }
            return ((com.tencent.mm.plugin.downloader.model.f1) this.f97130e).b(t0Var);
        }
        v(t0Var.f97156g, t0Var);
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "account ok, getDownloader");
                return h().b(t0Var);
            }
        }
        long b17 = k().b(t0Var);
        if (b17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
            if (this.f97127b == null) {
                this.f97127b = new com.tencent.mm.plugin.downloader.model.a1(this.f97131f);
            }
            ((com.tencent.mm.plugin.downloader.model.a1) this.f97127b).b(t0Var);
            return b17;
        }
        ((java.util.HashMap) f97123h).put(java.lang.Long.valueOf(b17), 0L);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(b17 + "", 0L).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", java.lang.Long.valueOf(b17));
        return b17;
    }

    public long c(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", t0Var.f97156g);
        v(t0Var.f97156g, t0Var);
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                return g().b(t0Var);
            }
        }
        long b17 = k().b(t0Var);
        if (b17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
            if (this.f97127b == null) {
                this.f97127b = new com.tencent.mm.plugin.downloader.model.a1(this.f97131f);
            }
            ((com.tencent.mm.plugin.downloader.model.a1) this.f97127b).b(t0Var);
            return b17;
        }
        ((java.util.HashMap) f97123h).put(java.lang.Long.valueOf(b17), 0L);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(b17 + "", 0L).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", java.lang.Long.valueOf(b17));
        return b17;
    }

    public boolean d(long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || c17.field_downloaderType != 3) {
            i02.h l17 = l();
            l17.getClass();
            h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c18 != null) {
                c18.field_downloadType = 2;
                com.tencent.mm.plugin.downloader.model.m0.l(c18);
            }
            g02.b.e(j17, 13);
            return l17.c(j17);
        }
        com.tencent.mm.plugin.downloader.model.b0 g17 = g();
        g17.getClass();
        h02.a c19 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c19 != null) {
            c19.field_downloadType = 2;
            com.tencent.mm.plugin.downloader.model.m0.l(c19);
        }
        g02.b.e(j17, 13);
        g17.c(j17);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r8.moveToFirst() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        r0 = new h02.a();
        r0.convertFrom(r8);
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (r8.moveToNext() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r8.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList e(java.util.LinkedList r8) {
        /*
            r7 = this;
            h02.b r0 = com.tencent.mm.plugin.downloader.model.m0.g()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L7d
        La:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.L0(r8)
            if (r3 == 0) goto L11
            goto L7d
        L11:
            int r3 = r8.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "("
            r4.<init>(r5)
            r5 = r1
        L1d:
            int r6 = r3 + (-1)
            if (r5 >= r6) goto L29
            java.lang.String r6 = "?,"
            r4.append(r6)
            int r5 = r5 + 1
            goto L1d
        L29:
            java.lang.String r3 = "?)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "FileDownloadInfo"
            java.lang.String r5 = "appId"
            java.lang.String r6 = "rawAppId"
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r5, r3, r6, r3}
            java.lang.String r4 = "select * from %s where %s in %s or %s in %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.addAll(r8)
            r4.addAll(r8)
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.Object[] r8 = r4.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            android.database.Cursor r8 = r0.rawQuery(r3, r8)
            if (r8 != 0) goto L5e
            goto L7d
        L5e:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            boolean r0 = r8.moveToFirst()
            if (r0 == 0) goto L7a
        L69:
            h02.a r0 = new h02.a
            r0.<init>()
            r0.convertFrom(r8)
            r2.add(r0)
            boolean r0 = r8.moveToNext()
            if (r0 != 0) goto L69
        L7a:
            r8.close()
        L7d:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            if (r2 == 0) goto Le3
            int r0 = r2.size()
            if (r0 <= 0) goto Le3
            java.util.Iterator r0 = r2.iterator()
        L8e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le3
            java.lang.Object r2 = r0.next()
            h02.a r2 = (h02.a) r2
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r3 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo
            r3.<init>()
            int r4 = r2.field_status
            r5 = 3
            if (r4 != r5) goto Laf
            java.lang.String r4 = r2.field_filePath
            boolean r4 = com.tencent.mm.vfs.w6.j(r4)
            if (r4 != 0) goto Laf
            r3.f96963f = r1
            goto Lb3
        Laf:
            int r4 = r2.field_status
            r3.f96963f = r4
        Lb3:
            java.lang.String r4 = r2.field_appId
            r3.f96966i = r4
            long r4 = r2.field_downloadId
            r3.f96961d = r4
            java.lang.String r4 = r2.field_downloadUrl
            r3.f96962e = r4
            java.lang.String r4 = r2.field_filePath
            r3.f96964g = r4
            java.lang.String r4 = r2.field_md5
            r3.f96965h = r4
            long r4 = r2.field_downloadedSize
            r3.f96967m = r4
            long r4 = r2.field_totalSize
            r3.f96968n = r4
            boolean r4 = r2.field_autoDownload
            r3.f96969o = r4
            int r4 = r2.field_downloaderType
            r3.f96970p = r4
            boolean r4 = r2.field_downloadInWifi
            r3.f96971q = r4
            boolean r2 = r2.field_reserveInWifi
            r3.f96972r = r2
            r8.add(r3)
            goto L8e
        Le3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader.model.r0.e(java.util.LinkedList):java.util.LinkedList");
    }

    public void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "deleteTempApkFile, url is " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String generateFileNameFromURL = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.generateFileNameFromURL(str, "resource/tm.android.unknown");
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "deleteTempApkFile, path is " + generateFileNameFromURL);
            new com.tencent.tmassistantsdk.storage.TMAssistantFile(generateFileNameFromURL, generateFileNameFromURL).deleteTempFile();
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 94);
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadManager", "exp is " + th6);
        }
    }

    public final com.tencent.mm.plugin.downloader.model.b0 g() {
        uz.m mVar = (uz.m) i95.n0.c(uz.m.class);
        com.tencent.mm.plugin.downloader.model.l0 l0Var = this.f97131f;
        com.tencent.mm.plugin.downloader.model.b0[] b0VarArr = mVar.f432066d;
        if (b0VarArr[0] == null) {
            synchronized (b0VarArr) {
                com.tencent.mm.plugin.downloader.model.b0[] b0VarArr2 = mVar.f432066d;
                if (b0VarArr2[0] == null) {
                    b0VarArr2[0] = new com.tencent.mm.plugin.downloader.model.b0(l0Var);
                }
            }
        }
        return mVar.f432066d[0];
    }

    public final com.tencent.mm.plugin.downloader.model.h1 h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "mDownloaderType = " + f97124i);
        com.tencent.mm.plugin.downloader.model.h1 h1Var = this.f97126a;
        if (h1Var != null) {
            return h1Var;
        }
        if (f97124i == 1) {
            this.f97126a = k();
        } else {
            this.f97126a = l();
        }
        return this.f97126a;
    }

    public final com.tencent.mm.plugin.downloader.model.h1 k() {
        if (this.f97128c == null) {
            this.f97128c = new com.tencent.mm.plugin.downloader.model.y0(this.f97131f);
        }
        return this.f97128c;
    }

    public final i02.h l() {
        if (this.f97129d == null) {
            this.f97129d = new i02.h(this.f97131f);
        }
        return this.f97129d;
    }

    public boolean m(long j17) {
        return ((java.util.HashMap) f97123h).containsKey(java.lang.Long.valueOf(j17));
    }

    public void n(long j17, boolean z17) {
        int i17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (m(j17)) {
            this.f97131f.d(j17, p(j17).f96964g, z17);
            return;
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_packageName)) {
            java.lang.String j18 = j(c17.field_filePath);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
                c17.field_packageName = j18;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", c17.field_filePath, j18);
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
        }
        java.lang.String str = c17.field_filePath;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i17 = 0;
        } else {
            int b17 = com.tencent.mm.pluginsdk.model.app.n1.b(str);
            if (b17 == 0) {
                b17 = com.tencent.mm.pluginsdk.model.app.n1.b(kk.w.a(str, false));
            }
            i17 = b17;
        }
        gm0.j1.e().j(new com.tencent.mm.plugin.downloader.model.p0(this, c17, i17, context, z17));
    }

    public boolean o(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = " + j17);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            this.f97132g = false;
        } else {
            v(c17.field_appId, null);
        }
        if (m(j17)) {
            return k().c(j17);
        }
        h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c18 != null && (c18.field_downloadInWifi || c18.field_reserveInWifi)) {
            c18.field_downloadInWifi = false;
            c18.field_reserveInWifi = false;
            com.tencent.mm.plugin.downloader.model.m0.l(c18);
        }
        if (c18 == null || c18.field_downloaderType != 3) {
            return h().c(j17);
        }
        g().c(j17);
        return true;
    }

    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p(long j17) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17;
        if (m(j17)) {
            return k().d(j17);
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && c17.field_status == 3 && com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
            d17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
            d17.f96961d = j17;
            d17.f96962e = c17.field_downloadUrl;
            d17.f96963f = 3;
            d17.f96964g = c17.field_filePath;
            d17.f96965h = c17.field_md5;
            d17.f96967m = c17.field_downloadedSize;
            d17.f96968n = c17.field_totalSize;
            d17.f96969o = c17.field_autoDownload;
            d17.f96970p = c17.field_downloaderType;
            d17.f96973s = c17.field_userSessionId;
        } else if (c17 == null || c17.field_downloaderType != 3) {
            d17 = h().d(j17);
            if (c17 != null) {
                d17.f96969o = c17.field_autoDownload;
                d17.f96970p = c17.field_downloaderType;
            }
        } else {
            d17 = g().d(j17);
        }
        if (d17 == null) {
            d17 = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        }
        int i17 = d17.f96963f;
        if (i17 == 3 || i17 == 6) {
            if (!com.tencent.mm.vfs.w6.j(d17.f96964g)) {
                d17.f96963f = 0;
            } else if (d17.f96963f == 6) {
                d17.f96963f = 1;
            }
        }
        if (c17 != null) {
            d17.f96971q = c17.field_downloadInWifi;
            d17.f96966i = c17.field_appId;
            d17.f96972r = c17.field_reserveInWifi;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", java.lang.Long.valueOf(d17.f96961d), d17.f96962e, java.lang.Integer.valueOf(d17.f96963f), d17.f96964g, d17.f96965h, java.lang.Long.valueOf(d17.f96968n), java.lang.Boolean.valueOf(d17.f96969o), java.lang.Integer.valueOf(d17.f96970p));
        return d17;
    }

    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q(java.lang.String str) {
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(str);
        return d17 != null ? p(d17.field_downloadId) : new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
    }

    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r(java.lang.String str) {
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        return f17 != null ? p(f17.field_downloadId) : new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
    }

    public void s(com.tencent.mm.plugin.downloader.model.g1 g1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "removeCallback: " + g1Var);
        this.f97131f.getClass();
        if (g1Var != null) {
            com.tencent.mm.plugin.downloader.model.l0.f97078a.remove(g1Var);
        }
    }

    public int t(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = " + j17);
        if (m(j17)) {
            return k().removeDownloadTask(j17);
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && (c17.field_downloadInWifi || c17.field_reserveInWifi)) {
            c17.field_downloadInWifi = false;
            c17.field_reserveInWifi = false;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
        }
        if (c17 == null || c17.field_downloaderType != 3) {
            return h().removeDownloadTask(j17);
        }
        g().removeDownloadTask(j17);
        return 1;
    }

    public void u() {
        m53.w0 w0Var;
        boolean z17;
        java.util.LinkedList linkedList = null;
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            w0Var = com.tencent.mm.plugin.game.commlib.i.f139381a.DownloadStrategy;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            w0Var = null;
        }
        if (w0Var != null && w0Var.f324139d) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_DOWNLOAD_REPORT_LAST_TIME_SEC_LONG;
            if (i17 - c17.t(u3Var, 0L) > 86400) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17));
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "gamelog.download, report, status when restart");
                h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
                if (g17 != null) {
                    java.lang.String format = java.lang.String.format("select * from FileDownloadInfo where LENGTH(appId) > 0 and status <> 5 and fileType = %d", 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getUnfinishedGameTask, sql = " + format);
                    android.database.Cursor rawQuery = g17.rawQuery(format, new java.lang.String[0]);
                    linkedList = new java.util.LinkedList();
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            h02.a aVar = new h02.a();
                            aVar.convertFrom(rawQuery);
                            linkedList.add(aVar);
                        }
                        rawQuery.close();
                    }
                }
                if (linkedList == null || linkedList.size() == 0) {
                    return;
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    h02.a aVar2 = (h02.a) it.next();
                    g02.c cVar = new g02.c();
                    cVar.a(aVar2);
                    int i18 = aVar2.field_status;
                    int i19 = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? 0 : 30 : 29 : 28 : 27;
                    if (i19 != 0) {
                        g02.b.c(i19, cVar);
                    }
                }
            }
        }
    }

    public final void v(java.lang.String str, com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        h02.a d17;
        if (!this.f97132g && (d17 = com.tencent.mm.plugin.downloader.model.m0.d(str)) != null && d17.field_autoDownload) {
            com.tencent.mm.autogen.events.GameSilentDownloadEvent gameSilentDownloadEvent = new com.tencent.mm.autogen.events.GameSilentDownloadEvent();
            gameSilentDownloadEvent.f54370g.f8376a = str;
            gameSilentDownloadEvent.e();
            if (t0Var != null) {
                d17.field_autoInstall = t0Var.f97158i;
                d17.field_showNotification = t0Var.f97159j;
                d17.field_autoDownload = t0Var.f97160k;
            } else {
                d17.field_autoInstall = true;
                d17.field_showNotification = true;
                d17.field_autoDownload = false;
            }
            com.tencent.mm.plugin.downloader.model.m0.l(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "remove silentDownload, appId:%s", str);
        }
        this.f97132g = false;
    }

    public boolean w(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j17);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            this.f97132g = false;
        } else {
            v(c17.field_appId, null);
        }
        if (m(j17)) {
            return k().a(j17);
        }
        h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c18 != null && !c18.field_reserveInWifi && c18.field_downloadInWifi) {
            c18.field_downloadInWifi = false;
            com.tencent.mm.plugin.downloader.model.m0.l(c18);
        }
        return (c18 == null || c18.field_downloaderType != 3) ? h().a(j17) : g().k(j17, true);
    }

    public boolean x(h02.a aVar) {
        return (aVar == null || aVar.field_downloaderType != 3) ? l().k(aVar.field_downloadId, true) : g().k(aVar.field_downloadId, true);
    }

    public final void y(java.lang.String str, java.lang.String str2, java.lang.String str3, android.app.PendingIntent pendingIntent) {
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
            if (j17 == null || com.tencent.mm.sdk.platformtools.t8.K0(j17.field_appName)) {
                k0Var.f("");
            } else {
                k0Var.f(j17.field_appName);
            }
        } else {
            k0Var.f(str2);
        }
        k0Var.e(str3);
        k0Var.D.icon = android.R.drawable.stat_sys_download_done;
        k0Var.d(true);
        if (pendingIntent != null) {
            k0Var.f469463g = pendingIntent;
        } else {
            k0Var.f469463g = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, new android.content.Intent(), fp.g0.a(0));
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(k0Var.b(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "show notification");
    }
}
