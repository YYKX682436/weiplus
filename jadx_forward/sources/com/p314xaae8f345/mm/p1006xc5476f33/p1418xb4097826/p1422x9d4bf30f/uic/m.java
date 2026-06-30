package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o f183440d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar) {
        this.f183440d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y9.i iVar = this.f183440d.M;
        if (iVar != null) {
            iVar.hide();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
