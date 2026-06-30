package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290999e;

    public oa(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.Runnable runnable) {
        this.f290999e = gaVar;
        this.f290998d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f290999e;
        if (elapsedRealtime - gaVar.f290200r0 < 300) {
            this.f290998d.run();
        }
        gaVar.f290200r0 = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
