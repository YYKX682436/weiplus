package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes5.dex */
public final class v3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 f173860d;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var) {
        this.f173860d = w3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.view.View.OnLongClickListener onLongClickListener = this.f173860d.f173864e;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : true;
        yj0.a.i(onLongClick, this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
