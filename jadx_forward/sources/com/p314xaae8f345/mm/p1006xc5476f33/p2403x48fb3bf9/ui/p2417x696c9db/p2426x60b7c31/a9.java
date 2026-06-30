package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class a9 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f266466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266467b;

    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var, nw4.y2 y2Var) {
        this.f266466a = e9Var;
        this.f266467b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        nw4.y2 y2Var = this.f266467b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f266466a;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(stringExtra, str)) {
                e9Var.f266617a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("selectedCCNum", str), new jz5.l("selectedCCName", stringExtra)));
                return;
            }
        }
        e9Var.f266617a.i5(y2Var, "pickCountryCode:fail", null);
    }
}
