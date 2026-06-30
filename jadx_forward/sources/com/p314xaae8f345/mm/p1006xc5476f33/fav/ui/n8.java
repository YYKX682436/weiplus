package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes5.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8 f182828e;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b8 b8Var) {
        this.f182827d = y8Var;
        this.f182828e = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f182828e.f182054f;
        int f17 = i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f182827d.getClass();
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) parent;
        view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j8(view, f17, view2));
    }
}
