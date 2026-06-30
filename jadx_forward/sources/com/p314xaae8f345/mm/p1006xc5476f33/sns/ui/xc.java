package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes9.dex */
public class xc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b f253038d;

    public xc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b) {
        this.f253038d = activityC18008xe14e452b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
        intent.putExtra("select_is_ret", true);
        j45.l.w(this.f253038d, ".ui.transmit.SelectConversationUI", intent, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vc(this));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1");
    }
}
