package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h f148862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h hVar) {
        super(1);
        this.f148862d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h hVar = this.f148862d;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.a)) {
            eb0.a aVar = (eb0.a) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = aVar.f332230b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = aVar.f332231c;
            hVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, appId: " + c12474x8b872a21.f167788d.f167795d + ", versionType: " + c12474x8b872a21.f167788d.f167796e + ", enterPath: " + c12474x8b872a21.f167788d.f167797f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            if (h6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, appBrandLauncher is null");
            } else {
                com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.g gVar = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.g(h6Var, hVar, c12474x8b872a21, c12473xe2bfc4b5);
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    gVar.run();
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(gVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
