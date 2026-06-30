package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class td implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f268083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268085c;

    public td(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f268083a = c0Var;
        this.f268084b = kVar;
        this.f268085c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f268083a;
        c0Var.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowPickerView", "picker set hasSetResult=" + z17 + ", result=" + obj);
        nw4.k kVar = this.f268084b;
        nw4.y2 y2Var = this.f268085c;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowPickerView", "picker set cancel");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        hashMap.put("value", obj);
        hashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(c0Var.b()));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
