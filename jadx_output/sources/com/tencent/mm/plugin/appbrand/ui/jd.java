package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class jd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.kd f89812d;

    public jd(com.tencent.mm.plugin.appbrand.ui.kd kdVar) {
        this.f89812d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f89812d.f89832d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
