package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class o1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f168470f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f168471g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 f168472h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d1(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f168473a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f168474b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a f168475c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f168476d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f168477e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f168473a = c11510xdd90c2f2;
        if (c11510xdd90c2f2 == null) {
            return;
        }
        c11510xdd90c2f2.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e1(this, c11510xdd90c2f2));
    }

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "initDeveloperServiceInfo appId:%s", str);
        java.util.HashMap hashMap = f168471g;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "init dsInfo ready done", str);
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f1(str));
        }
    }

    public java.lang.String b() {
        return this.f168473a.E0().f387374d;
    }

    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(this.f168473a.E0().f387385r.f156932d);
    }

    public java.lang.Runnable d(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f168473a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) c11510xdd90c2f2.E0();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11510xdd90c2f2.u0();
        return (c3899xf952a052 == null || c3897xbc286aa1 == null) ? g1Var : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h1(this, c3897xbc286aa1, bVar, c3899xf952a052);
    }

    public java.lang.String e() {
        return this.f168473a.E0().f387376f;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n1 f(int i17) {
        if (i17 == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n1();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 == 1) {
            n1Var.f168428c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2y);
            n1Var.f168427b = com.p314xaae8f345.mm.R.raw.f78513x7751abb2;
            n1Var.f168426a = com.p314xaae8f345.mm.R.C30861xcebc809e.f562330ct;
        } else if (i17 == 3) {
            n1Var.f168428c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m4m);
            n1Var.f168427b = com.p314xaae8f345.mm.R.raw.f78512xfeef9c3a;
            n1Var.f168426a = com.p314xaae8f345.mm.R.C30861xcebc809e.f562331cu;
        } else {
            if (i17 != 2) {
                return null;
            }
            n1Var.f168428c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2z);
            n1Var.f168427b = com.p314xaae8f345.mm.R.raw.f78514xa460c96f;
            n1Var.f168426a = com.p314xaae8f345.mm.R.C30861xcebc809e.f562331cu;
        }
        return n1Var;
    }
}
