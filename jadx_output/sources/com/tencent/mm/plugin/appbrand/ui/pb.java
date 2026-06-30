package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public final class pb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI f89924d;

    public pb(com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f89924d = appBrandVideoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI = this.f89924d;
        com.tencent.mars.xlog.Log.i(appBrandVideoPreviewUI.f89469d, "hy: request start to appid " + appBrandVideoPreviewUI.f89478p);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str = appBrandVideoPreviewUI.f89480r;
        java.lang.Long l17 = appBrandVideoPreviewUI.f89479q;
        kotlin.jvm.internal.o.d(l17);
        com.tencent.mm.storage.f9 n17 = e0Var.n(str, l17.longValue());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 11);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(n17.I0()));
        bundle.putString("stat_chat_talker_username", appBrandVideoPreviewUI.f89480r);
        bundle.putString("stat_send_msg_user", appBrandVideoPreviewUI.f89481s);
        java.lang.String str2 = appBrandVideoPreviewUI.f89480r;
        kotlin.jvm.internal.o.d(str2);
        java.lang.String str3 = appBrandVideoPreviewUI.f89481s;
        kotlin.jvm.internal.o.d(str3);
        k01.f.i(str2, str3, 1136, null, ot0.q.v(n17.j()), bundle);
        appBrandVideoPreviewUI.T6(5);
        appBrandVideoPreviewUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
