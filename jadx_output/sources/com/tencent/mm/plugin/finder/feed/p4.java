package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class p4 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f108699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f108700c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f108701d;

    public p4(com.tencent.mm.plugin.finder.feed.a7 a7Var, boolean z17, so2.y0 y0Var, android.view.View view) {
        this.f108698a = a7Var;
        this.f108699b = z17;
        this.f108700c = y0Var;
        this.f108701d = view;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.a7 a7Var;
        yw2.a0 a0Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "privacy result " + bool);
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue() || (a0Var = (a7Var = this.f108698a).f106216o) == null) {
            return;
        }
        a0Var.n().postDelayed(new com.tencent.mm.plugin.finder.feed.o4(a7Var, this.f108700c, this.f108701d), this.f108699b ? 0L : 300L);
    }
}
