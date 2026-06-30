package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class j4 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 f270480a;

    public j4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var) {
        this.f270480a = w4Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270480a;
        long j17 = w4Var.f270648f.f72763xa3c65b86;
        java.util.Map map = bu.a.f106006a;
        bu.b bVar = new bu.b();
        bVar.f106007a = 4;
        java.lang.String jSONObject = new org.json.JSONObject().put("errCode", i17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        bVar.f106008b = jSONObject;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(j17, bVar);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(w4Var.f270651i, w4Var.f270648f);
        w4Var.f270648f.f68111xda9bc3b3 = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", -1, java.lang.Long.valueOf(w4Var.f270651i), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0])));
        w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.H(w4Var, null);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e wi6 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270480a;
        wi6.get(w4Var.f270651i, w4Var.f270648f);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
        long j18 = dVar.f68112x10a0fed7;
        if (j18 == 105 || j18 == 199) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig parallelUpload onUploadProgress, upload has paused, status:%s", java.lang.Long.valueOf(j18));
            z25.d dVar2 = w4Var.f270656q;
            if (dVar2 != null) {
                dVar2.f();
            }
            if (w4Var.f270657r) {
                return;
            }
            w4Var.f270657r = true;
            w4Var.f270647e.mo815x76e0bfae(3, 0, "attach  has paused, status" + w4Var.f270648f.f68112x10a0fed7, w4Var);
            return;
        }
        dVar.f68103x4a777c2 = c01.id.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar3 = w4Var.f270648f;
        if (dVar3.f68109x90a9378 < j17) {
            dVar3.f68109x90a9378 = j17;
        }
        boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0]);
        if (mo9952xce0038c9) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + mo9952xce0038c9);
        fp.k.a();
        w4Var.getClass();
        w4Var.f270647e.mo815x76e0bfae(3, -1, "", w4Var);
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f551357b, jVar.f551356a, java.lang.Long.valueOf(jVar.f551359d));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270480a;
        long j17 = w4Var.f270658s;
        dn.h hVar = new dn.h();
        hVar.f69502xf11df5f5 = jVar.f551357b;
        hVar.f69522xf9dbbe9c = jVar.f551356a;
        hVar.f69526x419c9c3d = jVar.f551358c;
        hVar.f69523x17c343e7 = jVar.f551359d;
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        java.lang.String str = w4Var.f270648f.f68099xfeae815;
        cj6.getClass();
        hVar.f69525x419c7893 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37737x974f0042(com.p314xaae8f345.mm.vfs.w6.i(str, false));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.H(w4Var, jVar.f551358c);
        w4Var.f270648f.f68112x10a0fed7 = 199L;
        boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0]);
        if (mo9952xce0038c9) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.y(dVar.f68106x315a5445, dVar.f68107xaaaa6883, dVar.f68105x2c1f0acb, hVar, true);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = w4Var.f270648f;
            c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e4(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445, true, hVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l4(w4Var), w4Var.f270655p, dVar2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + mo9952xce0038c9);
        fp.k.a();
        w4Var.getClass();
        w4Var.f270647e.mo815x76e0bfae(3, 0, "", w4Var);
    }
}
