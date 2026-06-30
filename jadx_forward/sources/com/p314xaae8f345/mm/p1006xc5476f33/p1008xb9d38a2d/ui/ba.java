package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f155279d;

    public ba(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa faVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f155279d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f155279d;
        android.content.Intent b17 = y7Var.b(abstractActivityC21394xb3d2c0cf);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f155279d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.finish();
    }
}
