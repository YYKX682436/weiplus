package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267469d = activity;
        this.f267470e = kVar;
        this.f267471f = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float b17 = oe1.x1.b(this.f267469d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Float.valueOf(b17));
        nw4.g gVar = this.f267470e.f422396d;
        nw4.y2 y2Var = this.f267471f;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getScreenBrightness, currentBrightness=");
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleDeviceInfo", sb6.toString());
        return jz5.f0.f384359a;
    }
}
