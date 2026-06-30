package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class m4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.h f270520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 f270521c;

    public m4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var, int i17, dn.h hVar) {
        this.f270521c = v4Var;
        this.f270519a = i17;
        this.f270520b = hVar;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3);
        objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str4);
        objArr[4] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str5);
        objArr[5] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str6);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var = this.f270521c;
        objArr[6] = java.lang.Boolean.valueOf(v4Var.f270643d.f270649g == null);
        objArr[7] = java.lang.Boolean.valueOf(v4Var.f270643d.f270654o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload exist_whencheck call back new errMsg:[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = v4Var.f270643d.f270648f;
            dVar.f68111xda9bc3b3 = str4;
            dVar.f68097xfafba34a = str5;
            dVar.f68098xbfce865e = str6;
            v4Var.a(this.f270519a, this.f270520b);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = v4Var.f270643d.f270648f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445);
        Li.r1(5);
        bu.a.e(Li.m124847x74d37ac6(), bu.a.c(0, 0, str, 727));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.o(v4Var.f270643d.f270650h));
        f9Var.u1(v4Var.f270643d.f270650h);
        f9Var.d1(str);
        f9Var.m124850x7650bebc(10000);
        f9Var.r1(6);
        f9Var.j1(0);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var);
    }
}
