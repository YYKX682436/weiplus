package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class sb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI f90211d;

    public sb(com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f90211d = appBrandVideoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI = this.f90211d;
        com.tencent.mars.xlog.Log.i(appBrandVideoPreviewUI.f89469d, "hy: on click menu");
        com.tencent.mm.autogen.events.RetransmitMsgEvent retransmitMsgEvent = new com.tencent.mm.autogen.events.RetransmitMsgEvent();
        am.zr zrVar = retransmitMsgEvent.f54710g;
        zrVar.f8599a = appBrandVideoPreviewUI;
        zrVar.f8601c = com.tencent.mm.storage.z3.R4(appBrandVideoPreviewUI.f89480r);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str = appBrandVideoPreviewUI.f89480r;
        java.lang.Long l17 = appBrandVideoPreviewUI.f89479q;
        kotlin.jvm.internal.o.d(l17);
        arrayList2.add(e0Var.n(str, l17.longValue()));
        zrVar.f8600b = arrayList2;
        zrVar.f8602d = appBrandVideoPreviewUI.f89480r;
        zrVar.f8603e = appBrandVideoPreviewUI;
        retransmitMsgEvent.e();
        appBrandVideoPreviewUI.T6(3);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
