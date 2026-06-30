package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class l3 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267865b;

    public l3(nw4.k kVar, nw4.y2 y2Var) {
        this.f267864a = kVar;
        this.f267865b = y2Var;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "dismiss is null");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", 0);
        hashMap.put("dialogShowed", 1);
        nw4.g gVar = this.f267864a.f422396d;
        nw4.y2 y2Var = this.f267865b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).wi(2L, 1L, 1L);
    }

    @Override // tg0.h1
    public void b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", 1);
        hashMap.put("dialogShowed", 1);
        nw4.g gVar = this.f267864a.f422396d;
        nw4.y2 y2Var = this.f267865b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).wi(1L, 1L, 1L);
    }
}
