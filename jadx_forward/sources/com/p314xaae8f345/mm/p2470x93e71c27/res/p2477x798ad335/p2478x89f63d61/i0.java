package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271126a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f271127b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f271129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f271130e;

    /* renamed from: f, reason: collision with root package name */
    public final int f271131f;

    /* renamed from: g, reason: collision with root package name */
    public final long f271132g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f271133h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f271134i;

    /* renamed from: j, reason: collision with root package name */
    public final int f271135j;

    /* renamed from: k, reason: collision with root package name */
    public final int f271136k;

    /* renamed from: l, reason: collision with root package name */
    public final int f271137l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f271138m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f271139n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f271140o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f271141p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f271142q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f271143r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f271144s = -1;

    /* renamed from: t, reason: collision with root package name */
    public volatile java.lang.String f271145t = null;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f271146u = null;

    public i0(int i17, int i18, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, int i19, boolean z19, boolean z27, byte[] bArr, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, int i27, int i28, int i29) {
        this.f271126a = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, i18);
        this.f271129d = i17;
        this.f271130e = i18;
        this.f271138m = str;
        this.f271139n = z17;
        this.f271140o = z18;
        this.f271141p = str2;
        this.f271131f = i19;
        this.f271142q = bArr;
        this.f271143r = str3;
        this.f271127b = z19;
        this.f271128c = z27;
        this.f271133h = str4;
        this.f271132g = j17;
        this.f271134i = str5;
        this.f271135j = i27;
        this.f271136k = i28;
        this.f271137l = i29;
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.d(m17.f294800b);
        }
        byte[] c17 = kk.y.c(o35.a.i(str));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c17)) {
            return o35.a.k(str2, c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "uncompressed bytes empty");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a r23) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.i0.e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a):java.lang.String");
    }

    public final java.lang.String a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + b(), this.f271126a);
        if (16 == this.f271144s) {
            return this.f271145t;
        }
        java.lang.String str = null;
        if (4 != this.f271144s && 32 != this.f271144s) {
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271145t)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = this.f271126a;
            objArr[1] = b();
            objArr[2] = this.f271143r;
            byte[] bArr = this.f271142q;
            objArr[3] = bArr == null ? "null" : java.lang.String.valueOf(bArr.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271143r)) {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(this.f271145t);
                if (p17 == null) {
                    p17 = "";
                }
                if (p17.equals(this.f271143r)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", this.f271126a, b());
                    if (this.f271144s == 4) {
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 23L);
                    }
                    str = this.f271145t;
                }
            }
            if (this.f271144s == 4) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 24L);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f271142q) && com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46307xf50477bc(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.f271091a, o35.a.i(this.f271145t), this.f271142q) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", this.f271126a, b());
                if (this.f271144s == 4) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 25L);
                }
                str = this.f271145t;
            } else if (this.f271144s == 4) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 26L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", this.f271126a, str);
        if (this.f271144s == 4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !this.f271140o) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 58L);
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(this.f271132g, 45L);
            }
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0 d0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.RETRY_SUCC;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0 d0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.SUCC;
            if (K0) {
                if (this.f271139n) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.d(this.f271129d, this.f271130e, this.f271131f, this.f271127b, true, true, false, this.f271133h);
                } else if (this.f271140o && this.f271128c) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(this.f271129d, this.f271130e, this.f271134i, this.f271137l, this.f271135j > this.f271136k ? d0Var : d0Var2, false, this.f271127b, true, this.f271133h);
                }
            } else if (this.f271139n) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.d(this.f271129d, this.f271130e, this.f271131f, this.f271127b, true, true, true, this.f271133h);
            } else if (this.f271140o && this.f271128c) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(this.f271129d, this.f271130e, this.f271134i, this.f271137l, this.f271135j > this.f271136k ? d0Var : d0Var2, true, this.f271127b, true, this.f271133h);
            }
        }
        return str;
    }

    public final java.lang.String b() {
        int i17 = this.f271144s;
        if (i17 == 1) {
            return "state_decrypt";
        }
        if (i17 == 2) {
            return "state_decompress";
        }
        if (i17 == 4) {
            return "state_check_sum";
        }
        if (i17 == 8) {
            return "state_file_invalid";
        }
        if (i17 == 16) {
            return "state_file_valid";
        }
        if (i17 == 32) {
            return "state_pre_verify_check_sum";
        }
        return this.f271144s + "";
    }

    public final boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
        r6Var2.s().J();
        r6Var2.l();
        byte[] i17 = o35.a.i(str);
        boolean M0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(i17);
        long j17 = this.f271132g;
        if (M0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "read bytes empty");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 56L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 45L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 18L);
            return false;
        }
        byte[] m75978x7824c1be = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75978x7824c1be(i17, str3.getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(m75978x7824c1be)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypted bytes empty");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 55L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 45L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 18L);
            return false;
        }
        boolean k17 = o35.a.k(str2, m75978x7824c1be);
        if (!k17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypt write bytes fail");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 57L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 45L);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(j17, 18L);
        }
        return k17;
    }
}
