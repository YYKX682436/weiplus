package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class w5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268137e;

    public w5(nw4.k kVar, nw4.y2 y2Var) {
        this.f268136d = kVar;
        this.f268137e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "navigateBackToSourceAppForWXPay:fail");
        java.lang.String string2 = bundle.getString("err_desc", "");
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        if (string2.length() > 0) {
            hashMap.put("err_desc", string2);
        }
        this.f268136d.f422396d.e(this.f268137e.f422546c, string, hashMap);
    }
}
