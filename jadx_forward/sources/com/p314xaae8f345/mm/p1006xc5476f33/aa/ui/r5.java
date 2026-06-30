package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154322d;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154322d = activityC11351x975a7907;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f154322d.f154043p.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
