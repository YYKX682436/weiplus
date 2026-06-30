package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class g implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267631e;

    public g(nw4.k kVar, nw4.y2 y2Var) {
        this.f267630d = kVar;
        this.f267631e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h.f267745e == i17) {
            nw4.k kVar = this.f267630d;
            nw4.y2 y2Var = this.f267631e;
            if (i18 != -1) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.JSApiRequestHKCashier", "check pay jspi fail");
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                return;
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.JSApiRequestHKCashier", "request hk cashier finish");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            android.content.Context context = kVar.f422393a;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
