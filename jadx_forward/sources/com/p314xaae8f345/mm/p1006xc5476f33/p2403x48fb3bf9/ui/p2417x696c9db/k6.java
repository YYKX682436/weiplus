package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class k6 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f267139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f267140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f267141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f267142d;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, java.util.List list, int i17, int i18) {
        this.f267142d = c6Var;
        this.f267139a = list;
        this.f267140b = i17;
        this.f267141c = i18;
    }

    @Override // db5.v4
    public void a(android.view.MenuItem menuItem, android.view.View view) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(menuItem.getItemId());
        java.util.List list = this.f267139a;
        if (list.contains(valueOf)) {
            return;
        }
        int i17 = this.f267140b + 1;
        this.f267142d.a0(menuItem.getItemId(), this.f267141c, i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s5.EXPOSE);
        list.add(java.lang.Integer.valueOf(menuItem.getItemId()));
    }
}
