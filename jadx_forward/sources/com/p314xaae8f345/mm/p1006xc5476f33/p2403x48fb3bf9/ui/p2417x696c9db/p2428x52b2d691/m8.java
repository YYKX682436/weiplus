package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class m8 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267896e;

    public m8(nw4.k kVar, nw4.y2 y2Var) {
        this.f267895d = kVar;
        this.f267896e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n8.f267910e == i17) {
            nw4.k kVar = this.f267895d;
            nw4.y2 y2Var = this.f267896e;
            if (i18 == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n8 n8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n8.f267909d;
                rk0.c.c("MicroMsg.JsApiOpenHKOfflinePayView", "goto hkoffline pay finish", new java.lang.Object[0]);
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n8 n8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n8.f267909d;
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePayView", "check pay jspi fail", new java.lang.Object[0]);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
    }
}
