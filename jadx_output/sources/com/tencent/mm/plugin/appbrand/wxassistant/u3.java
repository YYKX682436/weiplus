package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.w3 f92324d;

    public u3(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        this.f92324d = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = this.f92324d;
        if (w3Var.f92336m) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.View.OnClickListener onClickListener = w3Var.f92330d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
