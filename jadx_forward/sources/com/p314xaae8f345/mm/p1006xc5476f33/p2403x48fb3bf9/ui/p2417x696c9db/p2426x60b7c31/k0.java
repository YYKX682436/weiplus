package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class k0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266753e;

    public k0(nw4.k kVar, nw4.y2 y2Var) {
        this.f266752d = kVar;
        this.f266753e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRedPacketDone", "on select envelope result: " + i18);
        if (i17 == 207) {
            nw4.k kVar = this.f266752d;
            nw4.y2 y2Var = this.f266753e;
            if (i18 == -1) {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok confirm", null);
                return;
            }
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok cancel", null);
        }
    }
}
