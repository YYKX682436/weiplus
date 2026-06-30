package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g f295429c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f295430d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f295431a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener f295432b = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f(this);

    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g c() {
        if (f295429c == null) {
            f295429c = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g();
        }
        return f295429c;
    }

    public void a(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121772xd3b4fbac(str);
    }

    public java.lang.String b(java.lang.String str, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), java.lang.Integer.valueOf(i17));
        synchronized (this) {
            if (this.f295431a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "isCert_Wating");
                return "";
            }
            this.f295431a = true;
            return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121780x5ac5c06e(str, i17);
        }
    }

    public int d() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121781x75feee5c();
    }

    public boolean e(java.lang.String str, java.lang.String str2) {
        boolean m121784x7ea51769;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", str, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        synchronized (this) {
            this.f295431a = false;
            m121784x7ea51769 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121784x7ea51769(str, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "importCert %s", java.lang.Boolean.valueOf(m121784x7ea51769));
        return m121784x7ea51769;
    }

    public void f(android.content.Context context) {
        if (f295430d) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121785x316510(context, this.f295432b);
        f295430d = true;
    }

    public boolean g(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(414L, 5L, 1L, true);
        boolean m121786xf107e929 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121786xf107e929(str);
        g0Var.mo68477x336bdfd8(414L, 6L, 1L, true);
        return m121786xf107e929;
    }

    public boolean h(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        if (z17) {
            com.p3249xcbb51f6b.ndk.C28020x74fa7f2d c28020x74fa7f2d = new com.p3249xcbb51f6b.ndk.C28020x74fa7f2d();
            gm0.j1.i();
            byte[] bArr = new byte[16];
            byte[] bytes = c28020x74fa7f2d.m121902x984bccbe((kk.v.a(gm0.j1.b().h()) + "_pUI6cNqzLt2Z3mQSrYuF09XSGsBtTIcUgp9jcWZ7F7BBs8/DFVFMKiwbtaRPOiLE").getBytes()).getBytes();
            for (int i17 = 0; i17 < 16 && i17 < bytes.length; i17++) {
                bArr[i17] = bytes[i17];
            }
            str3 = new java.lang.String(bArr);
        } else {
            str3 = "";
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121788x248cdc9c(str, str2, z17, str3);
    }
}
