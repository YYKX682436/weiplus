package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class i implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267774c;

    public i(java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f267772a = str;
        this.f267773b = kVar;
        this.f267774c = y2Var;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        nw4.y2 y2Var = this.f267774c;
        nw4.k kVar = this.f267773b;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAppBindGroup.", "success:" + this.f267772a);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("openId", str2);
                kVar.f422396d.e(y2Var.f422546c, "bindGroup:success", hashMap);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAppBindGroup.", "fail:" + str);
        kVar.f422396d.e(y2Var.f422546c, "bindGroup:fail", null);
    }
}
