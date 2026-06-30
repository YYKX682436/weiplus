package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72778d;

    public q5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72778d = launchAAUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f72778d.D.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
