package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes4.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233673d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233673d = activityC16724xf2604f0a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233673d;
        activityC16724xf2604f0a.f233622f.removeHeaderView(activityC16724xf2604f0a.f233637x);
        activityC16724xf2604f0a.f233637x = null;
        android.content.Intent intent = new android.content.Intent(activityC16724xf2604f0a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff.class);
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        activityC16724xf2604f0a.startActivityForResult(intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
