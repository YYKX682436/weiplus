package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class y5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267101h;

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, android.content.Intent intent, java.lang.String str2, nw4.y2 y2Var) {
        this.f267101h = c1Var;
        this.f267097d = str;
        this.f267098e = intent;
        this.f267099f = str2;
        this.f267100g = y2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267101h;
        android.content.Intent intent = this.f267098e;
        if (itemId == 1) {
            c1Var.m5(this.f267097d, intent, 47, this.f267099f);
            return;
        }
        if (itemId != 2) {
            return;
        }
        java.lang.String str = (java.lang.String) this.f267100g.f422323a.get("liteAppUuid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("liteAppUuid", str);
        c1Var.l5(intent, 47);
    }
}
