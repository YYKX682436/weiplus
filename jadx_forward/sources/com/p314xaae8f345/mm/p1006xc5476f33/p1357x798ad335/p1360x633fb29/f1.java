package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f178562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f178563d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f178564e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f178565f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f178566g;

    /* renamed from: h, reason: collision with root package name */
    public final dn.k f178567h;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var) {
        super(l0Var);
        this.f178564e = com.p314xaae8f345.mm.vfs.q7.c("HotPatchDownload");
        this.f178565f = new java.lang.Object();
        this.f178566g = true;
        this.f178567h = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.e1(this);
        this.f178562c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f178563d = new java.util.HashMap();
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var, java.lang.String str, int i17, int i18, java.lang.String str2) {
        f1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode= %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, info is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        if (i17 == 3) {
            synchronized (f1Var.f178565f) {
                f1Var.f178566g = false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
            intent.setClass(f1Var.f178562c, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, f17.f68408x32b20428);
            try {
                j45.l.A(intent);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", e17.getMessage());
                return;
            }
        }
        if (i17 != 4) {
            return;
        }
        if (i18 == -21009) {
            synchronized (f1Var.f178565f) {
                f1Var.f178566g = true;
            }
        }
        f17.f68416x1c571ead = java.lang.Math.abs(i18);
        f17.f68441x10a0fed7 = 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
        f1Var.f178745a.c(f17.f68408x32b20428, java.lang.Math.abs(i18), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean a(long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || c17.f68441x10a0fed7 != 2) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.d1(this, c17, j17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        boolean z17;
        long currentTimeMillis;
        java.lang.String str;
        if (t0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t0Var.f178683a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "Invalid Request");
            return -1L;
        }
        java.lang.String str2 = t0Var.f178683a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: %s", str2);
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str2);
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = d(f17.f68408x32b20428);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask, status = " + d17.f178496f);
            if (d17.f178496f == 1) {
                return d17.f178494d;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.j(t0Var.f178689g);
        h02.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.b(t0Var);
        synchronized (this.f178565f) {
            z17 = this.f178566g;
        }
        if (z17 && !h(this.f178564e)) {
            java.lang.String[] strArr = {"HotPatchDownload", "HotPatchDownload2", "HotPatchDownload3", "HotPatchDownload4", "HotPatchDownload5", "HotPatchDownload6", "HotPatchDownload7", "HotPatchDownload8", "HotPatchDownload9"};
            int i17 = 0;
            while (true) {
                if (i17 >= 9) {
                    str = null;
                    break;
                }
                str = com.p314xaae8f345.mm.vfs.q7.c(strArr[i17]);
                if (h(str)) {
                    break;
                }
                i17++;
            }
            if (str != null) {
                this.f178564e = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "found new available dir %s", str);
            }
        }
        try {
            currentTimeMillis = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 & java.nio.ByteBuffer.wrap(java.security.MessageDigest.getInstance("SHA-256").digest(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8))).getLong();
        } catch (java.security.NoSuchAlgorithmException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "Failed to get SHA-256 hash for URL: " + str2);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                currentTimeMillis = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 & ((java.time.Instant.now().getEpochSecond() * 1000000) + (r9.getNano() / 1000));
            } else {
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
        }
        b17.f68408x32b20428 = currentTimeMillis;
        b17.f68414xf4f8adf4 = 4;
        java.lang.String str3 = this.f178564e + "/" + com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0.f(str2);
        b17.f68419xf1e9b966 = str3;
        if (f17 != null) {
            java.lang.String str4 = f17.f68419xf1e9b966;
            if (str3 != null && str4 != null && !str3.equals(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "removeLastFile, new File = %s, oldFile = %s", str3, str4);
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str4));
                if (r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var.l()));
                }
            }
        }
        b17.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FileWebNetDownloader";
        mVar.f323344z = str2;
        mVar.f69601xaca5bdda = str2;
        mVar.f323342y0 = t0Var.C;
        int i18 = t0Var.f178688f;
        if (i18 == 2) {
            mVar.f69592xf1ebe47b = 30003;
            mVar.M = t0Var.B;
            mVar.A = 20;
            if (t0Var.f178707y) {
                mVar.B = 900;
            } else {
                mVar.B = 90;
            }
        } else if (i18 == 4) {
            mVar.f69592xf1ebe47b = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4491xd8033ef6.f18787x93c0a36c;
            mVar.M = t0Var.B;
            mVar.A = 240;
            if (t0Var.f178707y) {
                mVar.B = 900;
            } else {
                mVar.B = 120;
            }
            mVar.f323330p1 = 1;
            mVar.f323340x1 = 7;
        }
        mVar.f69595x6d25b0d9 = b17.f68419xf1e9b966;
        mVar.f323320f = this.f178567h;
        b17.f68441x10a0fed7 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: " + wi6);
        if (wi6) {
            this.f178745a.i(b17.f68408x32b20428, b17.f68419xf1e9b966);
        } else {
            b17.f68441x10a0fed7 = 4;
            b17.f68416x1c571ead = 201;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
            this.f178745a.c(b17.f68408x32b20428, b17.f68416x1c571ead, false);
        }
        return b17.f68408x32b20428;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean c(long j17) {
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.c1(this, j17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d(long j17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnTaskStateInfo m37751x7d770260 = c4446x11b6e6e0 != null ? c4446x11b6e6e0.m37751x7d770260(c17.f68411x238eb002) : null;
            int i18 = c17.f68441x10a0fed7;
            if (i18 != 1 || (m37751x7d770260 != null && ((i17 = m37751x7d770260.f18033xa1f4a0c) == 100 || i17 == 101))) {
                c13222x107de37.f178496f = i18;
            } else {
                c13222x107de37.f178496f = 0;
            }
            c13222x107de37.f178500m = c17.f68413xf432b5ad;
            c13222x107de37.f178501n = c17.f68443x78351860;
            c13222x107de37.f178494d = j17;
            c13222x107de37.f178503p = c17.f68414xf4f8adf4;
            c13222x107de37.f178502o = c17.f68405x56e99a7c;
            c13222x107de37.f178497g = c17.f68419xf1e9b966;
            c13222x107de37.f178495e = c17.f68411x238eb002;
            c13222x107de37.f178498h = c17.f68426x4b6e68b9;
            c13222x107de37.f178506s = c17.f68446x1294bc41;
        }
        return c13222x107de37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long e(h02.a aVar) {
        return 0L;
    }

    public final boolean h(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(s17.o() + java.lang.System.currentTimeMillis());
                if (!r6Var2.J()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "mkdir parent error, %s", s17.o());
                    return false;
                }
                r6Var2.L(s17);
            }
            r6Var.J();
            if (r6Var.m()) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "Make download dir failed");
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(str, java.util.UUID.randomUUID().toString().replace("-", ""));
        java.lang.String o17 = r6Var3.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "ensureDownloadDir, CREATE temp file %s", o17);
        try {
            boolean k17 = r6Var3.k();
            if (k17) {
                if (k17 && r6Var3.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "DELETE temp file %s result: %b", o17, java.lang.Boolean.valueOf(r6Var3.l()));
                }
                return true;
            }
            if (k17 && r6Var3.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "DELETE temp file %s result: %b", o17, java.lang.Boolean.valueOf(r6Var3.l()));
            }
            return false;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "CREATE temp file error, %s %s", o17, e17.getMessage());
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    /* renamed from: removeDownloadTask */
    public int mo54687xdf0c94d1(long j17) {
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b1(this, j17));
        return 1;
    }
}
