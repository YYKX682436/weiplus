package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes5.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 f173857d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var) {
        this.f173857d = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var = this.f173857d;
        if (w3Var.f173869m) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.View.OnClickListener onClickListener = w3Var.f173863d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
