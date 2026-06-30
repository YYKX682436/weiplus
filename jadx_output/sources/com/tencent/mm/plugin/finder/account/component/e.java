package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class e extends h92.d {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101704g;

    public e(boolean z17) {
        this.f101704g = z17;
    }

    @Override // h92.d, h92.a
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.adk, headerLayout);
        kotlin.jvm.internal.o.d(inflate);
        this.f279690e = inflate;
    }

    @Override // h92.d, h92.a
    public void h(android.content.Context context, com.tencent.mm.view.RefreshLoadMoreLayout rlLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        kotlin.jvm.internal.o.g(rlLayout.getRecyclerView(), "<set-?>");
        java.lang.Object parent = rlLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479670c7);
                view.setLayoutParams(layoutParams2);
                view.requestLayout();
            }
        }
    }

    @Override // h92.d, h92.a
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.account.component.f(context, null, this.f101704g, 2, null);
    }

    @Override // h92.d, h92.a
    public void l(android.content.Context context, android.widget.FrameLayout footerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.adi, footerLayout);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f279691f = inflate;
        inflate.findViewById(com.tencent.mm.R.id.b0n).setOnClickListener(new com.tencent.mm.plugin.finder.account.component.d(this));
    }
}
