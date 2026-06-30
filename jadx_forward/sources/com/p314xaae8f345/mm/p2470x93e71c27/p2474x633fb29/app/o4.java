package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class o4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 f270545b;

    public o4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var, int i17) {
        this.f270545b = v4Var;
        this.f270544a = i17;
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
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var = this.f270545b;
        objArr[6] = java.lang.Boolean.valueOf(v4Var.f270643d.f270649g == null);
        objArr[7] = java.lang.Boolean.valueOf(v4Var.f270643d.f270654o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload not exist_whencheck call back new errMsg[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = v4Var.f270643d.f270648f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
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
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = v4Var.f270643d.f270648f;
        dVar2.f68111xda9bc3b3 = str4;
        dVar2.f68097xfafba34a = str5;
        dVar2.f68098xbfce865e = str6;
        dVar2.f68103x4a777c2 = c01.id.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = v4Var.f270643d;
        ot0.q qVar = w4Var.f270649g;
        if (qVar != null) {
            qVar.f430243t = str2;
            qVar.T = str3;
            qVar.f430215m = j17;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar3 = w4Var.f270648f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(dVar3.f68107xaaaa6883, dVar3.f68106x315a5445);
            Li2.d1(ot0.q.u(v4Var.f270643d.f270649g, null, null));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li2.m124847x74d37ac6(), Li2, true);
        }
        v4Var.f270643d.f270654o = false;
        boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(v4Var.f270643d.f270648f, new java.lang.String[0]);
        if (mo9952xce0038c9) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n4(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + mo9952xce0038c9);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var2 = v4Var.f270643d;
        fp.k.a();
        w4Var2.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var3 = v4Var.f270643d;
        w4Var3.f270647e.mo815x76e0bfae(3, this.f270544a, "", w4Var3);
    }
}
