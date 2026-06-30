package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes.dex */
public class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181247d;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f181247d = activityC13477xb2a3ecd7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ve4.g.a(24);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Talker_Name", "gh_43f2581f6fd6");
        intent.putExtra("Select_block_List", "gh_43f2581f6fd6");
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("Select_Send_Card", true);
        j45.l.v(this.f181247d, ".ui.transmit.SelectConversationUI", intent, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
