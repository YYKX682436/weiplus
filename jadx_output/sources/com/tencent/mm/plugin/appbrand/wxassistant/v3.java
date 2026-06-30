package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class v3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.w3 f92327d;

    public v3(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        this.f92327d = w3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.view.View.OnLongClickListener onLongClickListener = this.f92327d.f92331e;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : true;
        yj0.a.i(onLongClick, this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
