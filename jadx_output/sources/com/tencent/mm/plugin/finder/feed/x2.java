package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111030d;

    public x2(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f111030d = a7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) c17;
        yw2.a0 a0Var = this.f111030d.f106216o;
        android.content.Context l17 = a0Var != null ? a0Var.l() : null;
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type android.app.Activity");
        i0Var.bl((android.app.Activity) l17, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
