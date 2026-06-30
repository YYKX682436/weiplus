package com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 f226526d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f8) {
        this.f226526d = activityC16321x7ce778f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f8 = this.f226526d;
        android.content.Intent b17 = y7Var.b(activityC16321x7ce778f8);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f82 = this.f226526d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16321x7ce778f82, arrayList.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16321x7ce778f82.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16321x7ce778f82, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16321x7ce778f8.finish();
        activityC16321x7ce778f8.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.J(1570L, 7L);
    }
}
