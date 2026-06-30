package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class cd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b f249653d;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b) {
        this.f249653d = activityC18008xe14e452b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b = this.f249653d;
        if (!"".equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.T6(activityC18008xe14e452b).mo69272x4edea88a()) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.T6(activityC18008xe14e452b).mo69272x4edea88a() != null) {
            if (activityC18008xe14e452b.f248301e.getVisibility() == 0) {
                activityC18008xe14e452b.f248301e.setVisibility(4);
            } else {
                activityC18008xe14e452b.f248301e.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
    }
}
