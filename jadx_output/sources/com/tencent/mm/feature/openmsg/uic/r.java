package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.v f67366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f67368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f67369g;

    public r(com.tencent.mm.feature.openmsg.uic.v vVar, int i17, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, java.util.ArrayList arrayList) {
        this.f67366d = vVar;
        this.f67367e = i17;
        this.f67368f = wxRecyclerAdapter;
        this.f67369g = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgByAppBrandUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.openmsg.uic.v vVar = this.f67366d;
        vVar.U6().a().setVisibility(8);
        com.tencent.mm.feature.openmsg.uic.v.T6(vVar, this.f67367e);
        java.util.ArrayList arrayList2 = this.f67369g;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f67368f;
        wxRecyclerAdapter.E0(arrayList2);
        wxRecyclerAdapter.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgByAppBrandUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
