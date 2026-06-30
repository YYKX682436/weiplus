package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class uf implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186237e;

    public uf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, in5.s0 s0Var) {
        this.f186236d = zfVar;
        this.f186237e = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f186237e;
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.lang.Object obj = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        this.f186236d.u0(s0Var, itemView, (so2.h1) obj, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
