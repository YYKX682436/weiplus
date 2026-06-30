package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f263827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 f263828f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 g0Var, java.lang.String str, android.content.Intent intent) {
        this.f263828f = g0Var;
        this.f263826d = str;
        this.f263827e = intent;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Intent intent = this.f263827e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g0 g0Var = this.f263828f;
        if (itemId == 1) {
            g0Var.g(this.f263826d, intent);
        } else {
            if (itemId != 2) {
                return;
            }
            g0Var.f(intent);
        }
    }
}
