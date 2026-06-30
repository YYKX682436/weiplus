package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167436f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.lang.String str, android.content.Context context) {
        this.f167434d = n7Var;
        this.f167435e = str;
        this.f167436f = context;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571567j3);
        g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571564j0);
        g4Var.a(7, com.p314xaae8f345.mm.R.C30867xcad56011.f571566j2);
        g4Var.a(9, com.p314xaae8f345.mm.R.C30867xcad56011.f571562iy);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appID: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167434d;
        sb6.append(n7Var.mo48798x74292566());
        g4Var.f(3, sb6.toString());
        g4Var.f(8, "username: " + n7Var.mo32091x9a3f0ba2().u0().f128811x);
        java.lang.String str = this.f167435e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "UNKNOWN PROCESS NAME";
        }
        g4Var.f(5, str);
        g4Var.f(6, this.f167436f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571563iz) + java.lang.String.format("(cur:%b)", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.a())));
        g4Var.f(10, "JAVA ASSERT");
        g4Var.f(11, "JNI ASSERT");
        g4Var.f(13, "ANR ASSERT");
        g4Var.f(12, "Watch Dog Memory Report");
    }
}
