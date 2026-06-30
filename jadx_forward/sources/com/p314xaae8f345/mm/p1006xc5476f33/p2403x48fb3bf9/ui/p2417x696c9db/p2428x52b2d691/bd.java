package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class bd implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267519b;

    public bd(nw4.k kVar, nw4.y2 y2Var) {
        this.f267518a = kVar;
        this.f267519b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public final void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowDatePickerView", "date set hasSetResult=" + z17 + ", " + i17 + ", " + i18 + ", " + i19);
        nw4.k kVar = this.f267518a;
        nw4.y2 y2Var = this.f267519b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowDatePickerView", "cancel date set");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%d-%d-%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        hashMap.put("selectTime", format);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
