package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.z f77721d = new com.tencent.mm.plugin.appbrand.debugger.console.z();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "onClick#realPanel");
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
