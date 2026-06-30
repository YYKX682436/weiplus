package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.widget.input.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie.d f47244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f47245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47247f;

    public o(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, com.tencent.mm.plugin.appbrand.e9 e9Var, ie.d dVar, float f17, int i17) {
        this.f47247f = rVar;
        this.f47242a = wAGamePanelInputEditText;
        this.f47243b = e9Var;
        this.f47244c = dVar;
        this.f47245d = f17;
        this.f47246e = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.r3
    public void a(int i17) {
        com.tencent.luggage.game.jsapi.keyboard.r rVar = this.f47247f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f47243b;
        if (2 != i17) {
            int height = this.f47244c.getHeight();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height);
            float f17 = this.f47245d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiShowKeyboard", "onVisibilityChanged state(%d),inputPanelHeight(%d),density(%f).", valueOf, valueOf2, java.lang.Float.valueOf(f17));
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("height", java.lang.Float.valueOf(height / f17));
            e9Var.a(this.f47246e, rVar.p("ok", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.p1 p1Var = new com.tencent.mm.plugin.appbrand.jsapi.p1();
            com.tencent.mm.plugin.appbrand.page.v5 page = e9Var.V0();
            kotlin.jvm.internal.o.g(page, "page");
            p1Var.x(height, e9Var, page, null);
            return;
        }
        com.tencent.luggage.game.jsapi.keyboard.c cVar = rVar.f47252h;
        java.lang.String obj = this.f47242a.getEditableText().toString();
        cVar.getClass();
        if (e9Var.isRunning()) {
            java.util.HashMap hashMap2 = new java.util.HashMap(2);
            hashMap2.put("errMsg", "ok");
            hashMap2.put("value", obj);
            cVar.t(hashMap2);
            cVar.u(e9Var);
            cVar.m();
        }
        com.tencent.mm.plugin.appbrand.jsapi.p1 p1Var2 = new com.tencent.mm.plugin.appbrand.jsapi.p1();
        com.tencent.mm.plugin.appbrand.page.v5 page2 = e9Var.V0();
        kotlin.jvm.internal.o.g(page2, "page");
        p1Var2.x(0, e9Var, page2, null);
    }
}
