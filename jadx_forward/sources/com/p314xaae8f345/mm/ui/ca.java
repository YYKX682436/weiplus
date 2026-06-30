package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f279621d;

    public ca(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f279621d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f279621d;
        android.content.Intent intent = abstractActivityC21394xb3d2c0cf.getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
