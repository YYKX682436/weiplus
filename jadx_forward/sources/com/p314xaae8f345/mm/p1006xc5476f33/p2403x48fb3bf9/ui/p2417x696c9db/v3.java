package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class v3 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 f268494b;

    public v3(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var) {
        this.f268493a = list;
        this.f268494b = x3Var;
    }

    @Override // db5.v4
    public final void a(android.view.MenuItem menuItem, android.view.View view) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(menuItem.getItemId());
        java.util.List list = this.f268493a;
        if (list.contains(valueOf)) {
            return;
        }
        list.add(java.lang.Integer.valueOf(menuItem.getItemId()));
        this.f268494b.c("expose", menuItem);
    }
}
