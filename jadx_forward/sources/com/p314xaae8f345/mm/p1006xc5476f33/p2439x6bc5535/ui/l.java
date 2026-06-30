package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes3.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f269574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269575e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5, android.widget.CheckBox checkBox) {
        this.f269575e = activityC19503x99c967c5;
        this.f269574d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f269575e.f269502o.setEnabled(this.f269574d.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
