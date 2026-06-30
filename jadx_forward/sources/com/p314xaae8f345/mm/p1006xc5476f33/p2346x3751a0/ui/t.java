package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v f258519d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v vVar) {
        this.f258519d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f258519d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
