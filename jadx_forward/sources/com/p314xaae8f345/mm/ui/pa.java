package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f291030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f291031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f291032f;

    public pa(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f291032f = gaVar;
        this.f291030d = runnable;
        this.f291031e = runnable2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f291032f;
        if (elapsedRealtime - gaVar.f290200r0 < 300) {
            java.lang.Runnable runnable = this.f291030d;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f291031e;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        gaVar.f290200r0 = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
