package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class r4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u4 f270588a;

    public r4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u4 u4Var) {
        this.f270588a = u4Var;
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
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u4 u4Var = this.f270588a;
        objArr[6] = java.lang.Boolean.valueOf(u4Var.f270625b.f270643d.f270649g == null);
        objArr[7] = java.lang.Boolean.valueOf(u4Var.f270625b.f270643d.f270654o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload2 exist_whencheck call back new errMsg:[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = u4Var.f270625b.f270643d.f270648f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
            Li.r1(5);
            bu.a.e(Li.m124847x74d37ac6(), bu.a.c(0, 0, str, 727));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "NetSceneCheckBigFileUpload2 get signature fail");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = u4Var.f270625b.f270643d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = w4Var.f270648f;
        dVar2.f68111xda9bc3b3 = str4;
        dVar2.f68097xfafba34a = str5;
        dVar2.f68098xbfce865e = str6;
        ot0.q qVar = w4Var.f270649g;
        if (qVar != null) {
            qVar.T = str3;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445);
            Li2.d1(ot0.q.u(u4Var.f270625b.f270643d.f270649g, null, null));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li2.m124847x74d37ac6(), Li2, true);
        }
        gm0.j1.e().j(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.q4(this));
    }
}
