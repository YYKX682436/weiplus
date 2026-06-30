package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class co implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f213322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f213324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f213325h;

    public co(android.view.View view, long j17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        this.f213321d = view;
        this.f213322e = j17;
        this.f213323f = str;
        this.f213324g = g0Var;
        this.f213325h = c1073x7e08a787;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f213321d;
        java.lang.String string = view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bo boVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bo(this.f213321d, this.f213322e, this.f213323f, this.f213324g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f213325h.getContext(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.eo(view2, string);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fo(boVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
