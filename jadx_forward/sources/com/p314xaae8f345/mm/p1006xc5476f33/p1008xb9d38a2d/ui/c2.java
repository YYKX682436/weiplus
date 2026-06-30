package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da f155296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f155297e;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da, android.widget.CheckBox checkBox) {
        this.f155296d = activityC11404xb70180da;
        this.f155297e = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GateWayMobileUI$showConfirmSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da = this.f155296d;
        boolean z17 = !activityC11404xb70180da.f154817m;
        activityC11404xb70180da.f154817m = z17;
        this.f155297e.setChecked(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$showConfirmSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
