package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.v1 f103073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f103074g;

    public cl(android.view.View view, in5.s0 s0Var, so2.v1 v1Var, ya2.b2 b2Var) {
        this.f103071d = view;
        this.f103072e = s0Var;
        this.f103073f = v1Var;
        this.f103074g = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f103071d.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract finderFollowListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.f122599a;
            in5.s0 s0Var = this.f103072e;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            finderFollowListContract.a((com.tencent.mm.ui.MMActivity) context, this.f103073f.f410645d, false);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            zy2.cc.a(new com.tencent.mm.plugin.finder.view.er(context2, this.f103074g.D0(), s0Var.getAdapterPosition(), false, 0L, 16, null), false, true, null, 0, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
