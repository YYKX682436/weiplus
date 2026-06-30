package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class k1 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f171640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l1 f171641b;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l1 l1Var, android.app.Activity activity) {
        this.f171641b = l1Var;
        this.f171640a = activity;
    }

    @Override // d85.l0
    public void a(d85.h0 h0Var) {
        d85.h0 h0Var2 = d85.h0.SYSTEM_REFUSE;
        android.app.Activity activity = this.f171640a;
        if (h0Var != h0Var2) {
            if (h0Var == d85.h0.GRANTED) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l1 l1Var = this.f171641b;
                l1Var.f171649q = l1Var.p();
                l1Var.q(activity);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.f171640a;
        android.content.Intent putExtra = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12647x330d98bc.class).putExtra("extra_enter_reason", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(3);
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader$1", "onResult", "(Lcom/tencent/mm/sensitive/IPluginSensitive$PERMISSION_RESULT;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
