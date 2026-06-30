package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class np implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.rp f104116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104119g;

    public np(com.tencent.mm.plugin.finder.convert.rp rpVar, android.view.View view, in5.s0 s0Var, dm.pd pdVar) {
        this.f104116d = rpVar;
        this.f104117e = view;
        this.f104118f = s0Var;
        this.f104119g = pdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgConvert$refreshFollowBtnLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View followBtnLayout = this.f104117e;
        kotlin.jvm.internal.o.f(followBtnLayout, "$followBtnLayout");
        com.tencent.mm.plugin.finder.convert.rp.p(this.f104116d, followBtnLayout, this.f104118f, this.f104119g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert$refreshFollowBtnLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
