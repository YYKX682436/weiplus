package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public final class r0 implements vz.s1 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f178656h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static int f178657i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 f178658j;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 f178659a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 f178660b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 f178661c;

    /* renamed from: d, reason: collision with root package name */
    public i02.h f178662d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 f178663e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f178665g = false;

    public r0() {
        java.util.Map<java.lang.String, ?> all;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("off_line_download_ids", 0);
        if (sharedPreferences != null && (all = sharedPreferences.getAll()) != null && all.size() != 0) {
            java.util.Map map = f178656h;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.clear();
            for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                if (entry != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(entry.getKey())) {
                    try {
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(entry.getKey(), 0L);
                        long longValue = ((java.lang.Long) entry.getValue()).longValue();
                        long currentTimeMillis = (java.lang.System.currentTimeMillis() - V) - V;
                        if (currentTimeMillis > 0 && currentTimeMillis < 86400000) {
                            ((java.util.HashMap) map).put(java.lang.Long.valueOf(V), java.lang.Long.valueOf(longValue));
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadManager", "parse download task failed: " + e17.toString());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloadManager", e17, "", new java.lang.Object[0]);
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
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FileDownloaderType"), 2);
                f178657i = P;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", java.lang.Integer.valueOf(P));
                this.f178664f = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
        this.f178664f = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i() {
        if (f178658j == null) {
            f178658j = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0();
        }
        return f178658j;
    }

    public static java.lang.String j(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.a(str);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.a(kk.w.a(str, false)) : a17;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "addCallback: " + g1Var);
        this.f178664f.getClass();
        if (g1Var != null) {
            java.util.Vector vector = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.f178611a;
            if (vector.contains(g1Var)) {
                return;
            }
            vector.add(g1Var);
        }
    }

    public long b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "addDownloadTask, filetype:%d, appId = %s", java.lang.Integer.valueOf(t0Var.f178688f), t0Var.f178689g);
        int i17 = t0Var.f178688f;
        if (i17 == 2 || i17 == 4) {
            if (this.f178663e == null) {
                this.f178663e = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1(this.f178664f);
            }
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1) this.f178663e).b(t0Var);
        }
        v(t0Var.f178689g, t0Var);
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "account ok, getDownloader");
                return h().b(t0Var);
            }
        }
        long b17 = k().b(t0Var);
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
            if (this.f178660b == null) {
                this.f178660b = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a1(this.f178664f);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a1) this.f178660b).b(t0Var);
            return b17;
        }
        ((java.util.HashMap) f178656h).put(java.lang.Long.valueOf(b17), 0L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(b17 + "", 0L).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", java.lang.Long.valueOf(b17));
        return b17;
    }

    public long c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", t0Var.f178689g);
        v(t0Var.f178689g, t0Var);
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                return g().b(t0Var);
            }
        }
        long b17 = k().b(t0Var);
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
            if (this.f178660b == null) {
                this.f178660b = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a1(this.f178664f);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a1) this.f178660b).b(t0Var);
            return b17;
        }
        ((java.util.HashMap) f178656h).put(java.lang.Long.valueOf(b17), 0L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(b17 + "", 0L).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", java.lang.Long.valueOf(b17));
        return b17;
    }

    public boolean d(long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || c17.f68414xf4f8adf4 != 3) {
            i02.h l17 = l();
            l17.getClass();
            h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c18 != null) {
                c18.f68410x4e46f707 = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c18);
            }
            g02.b.e(j17, 13);
            return l17.c(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 g17 = g();
        g17.getClass();
        h02.a c19 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c19 != null) {
            c19.f68410x4e46f707 = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c19);
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
        r0.mo9015xbf5d97fd(r8);
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
            h02.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L7d
        La:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r8)
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
            android.database.Cursor r8 = r0.m145256x1d3f4980(r3, r8)
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
            r0.mo9015xbf5d97fd(r8)
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
            int r4 = r2.f68441x10a0fed7
            r5 = 3
            if (r4 != r5) goto Laf
            java.lang.String r4 = r2.f68419xf1e9b966
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r4 != 0) goto Laf
            r3.f178496f = r1
            goto Lb3
        Laf:
            int r4 = r2.f68441x10a0fed7
            r3.f178496f = r4
        Lb3:
            java.lang.String r4 = r2.f68404x28d45f97
            r3.f178499i = r4
            long r4 = r2.f68408x32b20428
            r3.f178494d = r4
            java.lang.String r4 = r2.f68411x238eb002
            r3.f178495e = r4
            java.lang.String r4 = r2.f68419xf1e9b966
            r3.f178497g = r4
            java.lang.String r4 = r2.f68426x4b6e68b9
            r3.f178498h = r4
            long r4 = r2.f68413xf432b5ad
            r3.f178500m = r4
            long r4 = r2.f68443x78351860
            r3.f178501n = r4
            boolean r4 = r2.f68405x56e99a7c
            r3.f178502o = r4
            int r4 = r2.f68414xf4f8adf4
            r3.f178503p = r4
            boolean r4 = r2.f68409xc4f9be67
            r3.f178504q = r4
            boolean r2 = r2.f68431x4651c731
            r3.f178505r = r2
            r8.add(r3)
            goto L8e
        Le3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.e(java.util.LinkedList):java.util.LinkedList");
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "deleteTempApkFile, url is " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String m104884x7e916b09 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104884x7e916b09(str, "resource/tm.android.unknown");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "deleteTempApkFile, path is " + m104884x7e916b09);
            new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81(m104884x7e916b09, m104884x7e916b09).m105411x36cbb23b();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 94);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadManager", "exp is " + th6);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 g() {
        uz.m mVar = (uz.m) i95.n0.c(uz.m.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var = this.f178664f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0[] b0VarArr = mVar.f513599d;
        if (b0VarArr[0] == null) {
            synchronized (b0VarArr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0[] b0VarArr2 = mVar.f513599d;
                if (b0VarArr2[0] == null) {
                    b0VarArr2[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0(l0Var);
                }
            }
        }
        return mVar.f513599d[0];
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "mDownloaderType = " + f178657i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 h1Var = this.f178659a;
        if (h1Var != null) {
            return h1Var;
        }
        if (f178657i == 1) {
            this.f178659a = k();
        } else {
            this.f178659a = l();
        }
        return this.f178659a;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1 k() {
        if (this.f178661c == null) {
            this.f178661c = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0(this.f178664f);
        }
        return this.f178661c;
    }

    public final i02.h l() {
        if (this.f178662d == null) {
            this.f178662d = new i02.h(this.f178664f);
        }
        return this.f178662d;
    }

    public boolean m(long j17) {
        return ((java.util.HashMap) f178656h).containsKey(java.lang.Long.valueOf(j17));
    }

    public void n(long j17, boolean z17) {
        int i17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (m(j17)) {
            this.f178664f.d(j17, p(j17).f178497g, z17);
            return;
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68429xa1e9e82c)) {
            java.lang.String j18 = j(c17.f68419xf1e9b966);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
                c17.f68429xa1e9e82c = j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", c17.f68419xf1e9b966, j18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            }
        }
        java.lang.String str = c17.f68419xf1e9b966;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            i17 = 0;
        } else {
            int b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.b(str);
            if (b17 == 0) {
                b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.b(kk.w.a(str, false));
            }
            i17 = b17;
        }
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.p0(this, c17, i17, context, z17));
    }

    public boolean o(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = " + j17);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            this.f178665g = false;
        } else {
            v(c17.f68404x28d45f97, null);
        }
        if (m(j17)) {
            return k().c(j17);
        }
        h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c18 != null && (c18.f68409xc4f9be67 || c18.f68431x4651c731)) {
            c18.f68409xc4f9be67 = false;
            c18.f68431x4651c731 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c18);
        }
        if (c18 == null || c18.f68414xf4f8adf4 != 3) {
            return h().c(j17);
        }
        g().c(j17);
        return true;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17;
        if (m(j17)) {
            return k().d(j17);
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && c17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
            d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
            d17.f178494d = j17;
            d17.f178495e = c17.f68411x238eb002;
            d17.f178496f = 3;
            d17.f178497g = c17.f68419xf1e9b966;
            d17.f178498h = c17.f68426x4b6e68b9;
            d17.f178500m = c17.f68413xf432b5ad;
            d17.f178501n = c17.f68443x78351860;
            d17.f178502o = c17.f68405x56e99a7c;
            d17.f178503p = c17.f68414xf4f8adf4;
            d17.f178506s = c17.f68446x1294bc41;
        } else if (c17 == null || c17.f68414xf4f8adf4 != 3) {
            d17 = h().d(j17);
            if (c17 != null) {
                d17.f178502o = c17.f68405x56e99a7c;
                d17.f178503p = c17.f68414xf4f8adf4;
            }
        } else {
            d17 = g().d(j17);
        }
        if (d17 == null) {
            d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        }
        int i17 = d17.f178496f;
        if (i17 == 3 || i17 == 6) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(d17.f178497g)) {
                d17.f178496f = 0;
            } else if (d17.f178496f == 6) {
                d17.f178496f = 1;
            }
        }
        if (c17 != null) {
            d17.f178504q = c17.f68409xc4f9be67;
            d17.f178499i = c17.f68404x28d45f97;
            d17.f178505r = c17.f68431x4651c731;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", java.lang.Long.valueOf(d17.f178494d), d17.f178495e, java.lang.Integer.valueOf(d17.f178496f), d17.f178497g, d17.f178498h, java.lang.Long.valueOf(d17.f178501n), java.lang.Boolean.valueOf(d17.f178502o), java.lang.Integer.valueOf(d17.f178503p));
        return d17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q(java.lang.String str) {
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str);
        return d17 != null ? p(d17.f68408x32b20428) : new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 r(java.lang.String str) {
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        return f17 != null ? p(f17.f68408x32b20428) : new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
    }

    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "removeCallback: " + g1Var);
        this.f178664f.getClass();
        if (g1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.f178611a.remove(g1Var);
        }
    }

    public int t(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = " + j17);
        if (m(j17)) {
            return k().mo54687xdf0c94d1(j17);
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && (c17.f68409xc4f9be67 || c17.f68431x4651c731)) {
            c17.f68409xc4f9be67 = false;
            c17.f68431x4651c731 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
        if (c17 == null || c17.f68414xf4f8adf4 != 3) {
            return h().mo54687xdf0c94d1(j17);
        }
        g().mo54687xdf0c94d1(j17);
        return 1;
    }

    public void u() {
        m53.w0 w0Var;
        boolean z17;
        java.util.LinkedList linkedList = null;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36946x125c0c3b;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            w0Var = null;
        }
        if (w0Var != null && w0Var.f405672d) {
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_DOWNLOAD_REPORT_LAST_TIME_SEC_LONG;
            if (i17 - c17.t(u3Var, 0L) > 86400) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17));
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "gamelog.download, report, status when restart");
                h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
                if (g17 != null) {
                    java.lang.String format = java.lang.String.format("select * from FileDownloadInfo where LENGTH(appId) > 0 and status <> 5 and fileType = %d", 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getUnfinishedGameTask, sql = " + format);
                    android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980(format, new java.lang.String[0]);
                    linkedList = new java.util.LinkedList();
                    if (m145256x1d3f4980 != null) {
                        while (m145256x1d3f4980.moveToNext()) {
                            h02.a aVar = new h02.a();
                            aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                            linkedList.add(aVar);
                        }
                        m145256x1d3f4980.close();
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
                    int i18 = aVar2.f68441x10a0fed7;
                    int i19 = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? 0 : 30 : 29 : 28 : 27;
                    if (i19 != 0) {
                        g02.b.c(i19, cVar);
                    }
                }
            }
        }
    }

    public final void v(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        h02.a d17;
        if (!this.f178665g && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str)) != null && d17.f68405x56e99a7c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b c5581xc58ff72b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b();
            c5581xc58ff72b.f135903g.f89909a = str;
            c5581xc58ff72b.e();
            if (t0Var != null) {
                d17.f68406x8d834527 = t0Var.f178691i;
                d17.f68435x73c7b92d = t0Var.f178692j;
                d17.f68405x56e99a7c = t0Var.f178693k;
            } else {
                d17.f68406x8d834527 = true;
                d17.f68435x73c7b92d = true;
                d17.f68405x56e99a7c = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "remove silentDownload, appId:%s", str);
        }
        this.f178665g = false;
    }

    public boolean w(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j17);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            this.f178665g = false;
        } else {
            v(c17.f68404x28d45f97, null);
        }
        if (m(j17)) {
            return k().a(j17);
        }
        h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c18 != null && !c18.f68431x4651c731 && c18.f68409xc4f9be67) {
            c18.f68409xc4f9be67 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c18);
        }
        return (c18 == null || c18.f68414xf4f8adf4 != 3) ? h().a(j17) : g().k(j17, true);
    }

    public boolean x(h02.a aVar) {
        return (aVar == null || aVar.f68414xf4f8adf4 != 3) ? l().k(aVar.f68408x32b20428, true) : g().k(aVar.f68408x32b20428, true);
    }

    public final void y(java.lang.String str, java.lang.String str2, java.lang.String str3, android.app.PendingIntent pendingIntent) {
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
            if (j17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67372x453d1e07)) {
                k0Var.f("");
            } else {
                k0Var.f(j17.f67372x453d1e07);
            }
        } else {
            k0Var.f(str2);
        }
        k0Var.e(str3);
        k0Var.D.icon = android.R.drawable.stat_sys_download_done;
        k0Var.d(true);
        if (pendingIntent != null) {
            k0Var.f550996g = pendingIntent;
        } else {
            k0Var.f550996g = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, new android.content.Intent(), fp.g0.a(0));
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(k0Var.b(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "show notification");
    }
}
