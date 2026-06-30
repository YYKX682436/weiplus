package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes.dex */
public final class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268166b;

    public k(nw4.k kVar, nw4.y2 y2Var) {
        this.f268165a = kVar;
        this.f268166b = y2Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMerchantTransfer", "start liteApp fail");
        nw4.g gVar = this.f268165a.f422396d;
        nw4.y2 y2Var = this.f268166b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "start liteApp success");
    }
}
