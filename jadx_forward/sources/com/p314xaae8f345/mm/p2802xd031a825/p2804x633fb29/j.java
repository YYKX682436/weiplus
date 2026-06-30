package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j f295450c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f295451d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f295452a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener f295453b = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h(this);

    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j b() {
        if (f295450c == null) {
            f295450c = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j();
        }
        return f295450c;
    }

    public java.lang.String a(java.lang.String str, byte[] bArr) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        gm0.j1.i();
        int ordinal = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        if (ordinal != 1 && ordinal != 2) {
            return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121778xc5c0ef96(str, bArr);
        }
        byte[] m121908xd3fc2a01 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121908xd3fc2a01(str, bArr, "1234567812345678".getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(m121908xd3fc2a01)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "signData is nil");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 4, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()), 1);
            return "";
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(m121908xd3fc2a01, 2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(encodeToString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "genUserSig is nil");
        }
        return encodeToString;
    }

    public int c() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        gm0.j1.i();
        int ordinal = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        return (ordinal == 1 || ordinal == 2) ? com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c() : com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121781x75feee5c();
    }

    public boolean d(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar) {
        boolean m121924x7ea51769;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iVar.ordinal());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s certType %d stack %s", str, str2, valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        synchronized (this) {
            this.f295452a = false;
            int ordinal = iVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                m121924x7ea51769 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121924x7ea51769(str, str2, false);
                if (!m121924x7ea51769) {
                    int m121916x75feee5c = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert error %d", java.lang.Integer.valueOf(m121916x75feee5c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 1, java.lang.Integer.valueOf(m121916x75feee5c), 1);
                }
            } else {
                m121924x7ea51769 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121784x7ea51769(str, str2);
                if (!m121924x7ea51769) {
                    int m121781x75feee5c = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121781x75feee5c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert error %d", java.lang.Integer.valueOf(m121781x75feee5c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 1, java.lang.Integer.valueOf(m121781x75feee5c), 2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert %s", java.lang.Boolean.valueOf(m121924x7ea51769));
        return m121924x7ea51769;
    }

    public void e(android.content.Context context) {
        if (f295451d) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121785x316510(context, this.f295453b);
        java.lang.String str = context.getFilesDir().getParentFile().getAbsolutePath() + "/smcertnew";
        com.p3249xcbb51f6b.ndk.C28021x955d8ea1 m121904x9cf0d20b = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b();
        java.lang.String g17 = wo.w0.g(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            g17 = wo.w0.k();
        }
        if (!m121904x9cf0d20b.m121925x316510(str, g17, "", "1234567812345678")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 3, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()), 1);
        }
        f295451d = true;
    }

    public boolean f(java.lang.String str) {
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "cid length is 0");
            return false;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(414L, 5L, 1L, true);
        if (com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121786xf107e929(str)) {
            g0Var.mo68477x336bdfd8(414L, 6L, 1L, true);
            return true;
        }
        if (!com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121922x2982b3de(str)) {
            return false;
        }
        g0Var.mo68477x336bdfd8(414L, 6L, 1L, true);
        return true;
    }

    public java.lang.String g(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "makeCSR lock %s %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), java.lang.Integer.valueOf(i17));
        synchronized (this) {
            if (this.f295452a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "isCert_Wating");
                return "";
            }
            this.f295452a = true;
            int ordinal = iVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                java.lang.String m121926x31a01534 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121926x31a01534(str, str2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m121926x31a01534)) {
                    int m121916x75feee5c = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "csr nil.%d", java.lang.Integer.valueOf(m121916x75feee5c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 2, java.lang.Integer.valueOf(m121916x75feee5c), 1);
                }
                return m121926x31a01534;
            }
            java.lang.String m121780x5ac5c06e = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121780x5ac5c06e(str2, i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m121780x5ac5c06e)) {
                int m121781x75feee5c = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121781x75feee5c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "csr nil.%d", java.lang.Integer.valueOf(m121781x75feee5c));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37113, 2, java.lang.Integer.valueOf(m121781x75feee5c), 2);
            }
            return m121780x5ac5c06e;
        }
    }
}
