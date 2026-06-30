package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.mc f290609d;

    public lc(com.p314xaae8f345.mm.ui.mc mcVar) {
        this.f290609d = mcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (i95.n0.c(mi3.f.class) != null) {
            mi3.f fVar = (mi3.f) i95.n0.c(mi3.f.class);
            android.content.Context context = this.f290609d.f290654f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) fVar).getClass();
            int i17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.f273855o;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
