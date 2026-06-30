package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.v f77644d;

    public a0(com.tencent.mm.plugin.appbrand.debugger.console.v vVar) {
        this.f77644d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "onClick#realPanelContainer");
        this.f77644d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
