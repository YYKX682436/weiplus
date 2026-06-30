package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class p8 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f267966c;

    public p8(nw4.k kVar, nw4.y2 y2Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f267964a = kVar;
        this.f267965b = y2Var;
        this.f267966c = c0Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp fail");
        nw4.g gVar = this.f267964a.f422396d;
        nw4.y2 y2Var = this.f267965b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ": fail open liteapp", null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp success");
        this.f267964a.f422396d.e(this.f267965b.f422546c, this.f267965b.f422552i + ": success", null);
        if (this.f267966c.f391645d) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o8(this.f267964a));
        }
    }
}
