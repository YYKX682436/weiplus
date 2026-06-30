package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class k1 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f90107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.l1 f90108b;

    public k1(com.tencent.mm.plugin.appbrand.ui.recents.l1 l1Var, android.app.Activity activity) {
        this.f90108b = l1Var;
        this.f90107a = activity;
    }

    @Override // d85.l0
    public void a(d85.h0 h0Var) {
        d85.h0 h0Var2 = d85.h0.SYSTEM_REFUSE;
        android.app.Activity activity = this.f90107a;
        if (h0Var != h0Var2) {
            if (h0Var == d85.h0.GRANTED) {
                com.tencent.mm.plugin.appbrand.ui.recents.l1 l1Var = this.f90108b;
                l1Var.f90116q = l1Var.p();
                l1Var.q(activity);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.f90107a;
        android.content.Intent putExtra = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI.class).putExtra("extra_enter_reason", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(3);
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader$1", "onResult", "(Lcom/tencent/mm/sensitive/IPluginSensitive$PERMISSION_RESULT;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
