package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f266931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f266933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f266934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266935h;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.Boolean bool, java.lang.String str, android.content.Intent intent, int i17) {
        this.f266935h = c1Var;
        this.f266931d = bool;
        this.f266932e = str;
        this.f266933f = intent;
        this.f266934g = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.Boolean bool = this.f266931d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j.f266736a;
        android.content.Intent intent = this.f266933f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266935h;
        if (itemId == 1) {
            if (gm0.j1.a()) {
                c1Var.m5(this.f266932e, intent, 14, "image");
                return;
            } else {
                jVar.b(this.f266935h, 14, false, true, bool.booleanValue());
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        if (gm0.j1.a()) {
            c1Var.l5(intent, 14);
        } else {
            jVar.a(this.f266935h, 14, false, true, this.f266934g, bool.booleanValue());
        }
    }
}
