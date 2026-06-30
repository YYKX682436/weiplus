package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class r5 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.g f268014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s5 f268015b;

    public r5(nw4.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s5 s5Var) {
        this.f268014a = gVar;
        this.f268015b = s5Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s5 s5Var = this.f268015b;
        nw4.g gVar = this.f268014a;
        if (z17 || z18) {
            java.lang.String str = s5Var.f268049b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("err_desc", "");
            gVar.e(str, "launchAppByScheme:ok", linkedHashMap);
            return;
        }
        java.lang.String str2 = s5Var.f268049b;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("err_desc", "open url fail");
        gVar.e(str2, "launchAppByScheme:fail", linkedHashMap2);
    }
}
