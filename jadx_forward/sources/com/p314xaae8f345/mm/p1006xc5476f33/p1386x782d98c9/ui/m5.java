package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes3.dex */
public class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e f181102d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e activityC13476xfb15ef0e) {
        this.f181102d = activityC13476xfb15ef0e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e activityC13476xfb15ef0e = this.f181102d;
        activityC13476xfb15ef0e.startActivityForResult(new android.content.Intent(activityC13476xfb15ef0e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1.class), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
