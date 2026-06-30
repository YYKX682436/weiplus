package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class np implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp f185649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dm.pd f185652g;

    public np(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp rpVar, android.view.View view, in5.s0 s0Var, dm.pd pdVar) {
        this.f185649d = rpVar;
        this.f185650e = view;
        this.f185651f = s0Var;
        this.f185652g = pdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgConvert$refreshFollowBtnLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View followBtnLayout = this.f185650e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(followBtnLayout, "$followBtnLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp.p(this.f185649d, followBtnLayout, this.f185651f, this.f185652g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert$refreshFollowBtnLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
