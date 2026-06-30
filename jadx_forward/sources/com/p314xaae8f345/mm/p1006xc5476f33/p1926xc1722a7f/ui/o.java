package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes3.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16722x1ef5bdc6 f233726d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16722x1ef5bdc6 activityC16722x1ef5bdc6) {
        this.f233726d = activityC16722x1ef5bdc6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16722x1ef5bdc6 activityC16722x1ef5bdc6 = this.f233726d;
        android.content.Intent intent = new android.content.Intent(activityC16722x1ef5bdc6, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff.class);
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        activityC16722x1ef5bdc6.startActivityForResult(intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
