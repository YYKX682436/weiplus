package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class v implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f266985c;

    public v(nw4.k kVar, nw4.y2 y2Var, int i17) {
        this.f266983a = kVar;
        this.f266984b = y2Var;
        this.f266985c = i17;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRequestPermissionsResult: requestCode=");
        sb6.append(i17);
        sb6.append(", grantResults=");
        java.lang.String arrays = java.util.Arrays.toString(grantResults);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", sb6.toString());
        if (i17 != 151) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChoosePassport", "Unexpected requestCode: " + i17);
            return;
        }
        boolean z17 = !(grantResults.length == 0);
        nw4.y2 y2Var = this.f266984b;
        nw4.k kVar = this.f266983a;
        if (z17 && grantResults[0] == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "Storage permission granted, proceeding with image selection");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266472d.i(kVar, y2Var, this.f266985c);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "Storage permission denied");
            kVar.f422396d.e(y2Var.f422546c, "choosePassport:fail", null);
        }
    }
}
