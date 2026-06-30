package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 f234828d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 activityC16814x951f14f1) {
        this.f234828d = activityC16814x951f14f1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 activityC16814x951f14f1 = this.f234828d;
        wq3.k kVar = activityC16814x951f14f1.f234736e;
        ((java.util.ArrayList) kVar.f530101a).clear();
        kVar.a();
        activityC16814x951f14f1.f234739h.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
