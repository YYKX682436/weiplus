package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class l8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 f214079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f214080e;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 h8Var, gx2.q qVar) {
        this.f214079d = h8Var;
        this.f214080e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 h8Var = this.f214079d;
        if (!((java.lang.Boolean) h8Var.f213753f.mo146xb9724478(h8Var)).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(this.f214080e, false, null, false, null, 15, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
