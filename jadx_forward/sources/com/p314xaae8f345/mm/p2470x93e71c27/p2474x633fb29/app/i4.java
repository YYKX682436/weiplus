package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class i4 extends qr.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 f270466a;

    public i4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var) {
        this.f270466a = w4Var;
    }

    @Override // qr.j
    public void a(int i17, java.lang.String str, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "EmojiUploadByCdn Success:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270466a;
        if (i17 != 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(w4Var.f270648f.f72763xa3c65b86, bu.a.a(i17));
            w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String o27 = m11.b1.Di().o2(Li, bm5.f0.f104097i, Li.z0());
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_EmojiUploadCDN";
        mVar.f69601xaca5bdda = "emoji_upload_" + w4Var.f270652m + java.lang.System.currentTimeMillis();
        mVar.f69580x454032b6 = 1;
        mVar.f69592xf1ebe47b = 3;
        mVar.f69619xe9ed65f6 = o27;
        mVar.f69584x89a4c0cf = 0;
        mVar.f69594x4b409164 = true;
        mVar.f69618x114ef53e = Li.Q0();
        mVar.f323320f = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h4(w4Var, hVar);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
