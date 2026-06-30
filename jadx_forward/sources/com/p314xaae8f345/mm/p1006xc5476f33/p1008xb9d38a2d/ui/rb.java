package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class rb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155699d;

    public rb(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc) {
        this.f155699d = activityC11453xa58e34bc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b()) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155699d;
            intent.putExtra("country_name", activityC11453xa58e34bc.C);
            intent.putExtra("couttry_code", activityC11453xa58e34bc.D);
            intent.putExtra("iso_code", activityC11453xa58e34bc.E);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.o(intent, activityC11453xa58e34bc, 100);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
