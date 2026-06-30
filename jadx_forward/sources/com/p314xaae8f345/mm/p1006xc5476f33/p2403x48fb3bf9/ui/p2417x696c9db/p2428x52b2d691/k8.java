package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class k8 implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267849b;

    public k8(nw4.k kVar, nw4.y2 y2Var) {
        this.f267848a = kVar;
        this.f267849b = y2Var;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        nw4.g gVar = this.f267848a.f422396d;
        nw4.y2 y2Var = this.f267849b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ": success", null);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        nw4.g gVar = this.f267848a.f422396d;
        nw4.y2 y2Var = this.f267849b;
        java.lang.String str = y2Var.f422546c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f422552i);
        sb6.append(": fail ");
        sb6.append(map != null ? map.get("error") : null);
        gVar.e(str, sb6.toString(), null);
    }
}
