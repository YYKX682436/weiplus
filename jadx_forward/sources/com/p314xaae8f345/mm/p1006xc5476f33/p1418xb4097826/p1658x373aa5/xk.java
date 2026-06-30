package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class xk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 f214871d;

    public xk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 c15348xd72dc333) {
        this.f214871d = c15348xd72dc333;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 c15348xd72dc333 = this.f214871d;
        yz5.l lVar = c15348xd72dc333.f213011q;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(c15348xd72dc333.f213010p));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
