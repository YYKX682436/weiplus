package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f185463d;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar) {
        this.f185463d = ojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f185463d;
        yz5.l lVar = ojVar.f185716e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(ojVar.f185729u));
        }
        ojVar.C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
