package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.b8 f101295e;

    public n8(com.tencent.mm.plugin.fav.ui.y8 y8Var, com.tencent.mm.plugin.fav.ui.b8 b8Var) {
        this.f101294d = y8Var;
        this.f101295e = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f101295e.f100521f;
        int f17 = i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479738dv);
        this.f101294d.getClass();
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) parent;
        view2.post(new com.tencent.mm.plugin.fav.ui.j8(view, f17, view2));
    }
}
