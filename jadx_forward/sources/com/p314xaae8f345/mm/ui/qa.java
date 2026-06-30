package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class qa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f291081d;

    public qa(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.Runnable runnable) {
        this.f291081d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Runnable runnable = this.f291081d;
        if (runnable != null) {
            runnable.run();
        }
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
