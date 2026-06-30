package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 f250135f;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var, android.view.View view, android.view.View view2) {
        this.f250135f = m7Var;
        this.f250133d = view;
        this.f250134e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
        android.view.View view = this.f250134e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var = this.f250135f;
        m7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m7Var.f251428g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j7 j7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j7(m7Var);
        android.view.animation.Animation animation = m7Var.f251426e;
        animation.setAnimationListener(j7Var);
        view.startAnimation(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
    }
}
