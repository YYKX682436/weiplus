package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class vp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a f252241d;

    public vp(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a) {
        this.f252241d = activityC18109x7a461b7a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a = this.f252241d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.a7(activityC18109x7a461b7a).m70377x3172ed()) {
            i64.s1.a(i64.o1.Sight, i64.n1.EnterCompleteVideo, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.a7(activityC18109x7a461b7a), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).f459388d);
        java.lang.String I = ca4.z0.I(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            intent.setClass(activityC18109x7a461b7a, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSightPlayerUI", "use new stream video play UI");
        } else {
            intent.setClass(activityC18109x7a461b7a, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.class);
        }
        intent.putExtra("KFullVideoPath", d17 + I);
        intent.putExtra("KThumbPath", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.c7(activityC18109x7a461b7a));
        intent.putExtra("KFromTimeLine", true);
        intent.putExtra("KStremVideoUrl", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).f459408x);
        intent.putExtra("KThumUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).B) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).f459393i : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).B);
        intent.putExtra("KMediaId", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).f459388d);
        intent.putExtra("KUrl", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).f459391g);
        intent.putExtra("KViewId", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a).f38105xcf532ea0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.a7(activityC18109x7a461b7a).m70371x485d7();
        intent.putExtra("KSta_StremVideoAduxInfo", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a) == null ? "" : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a).f38104xce64ddf1);
        intent.putExtra("KSta_StremVideoPublishId", m70371x485d7.Id);
        intent.putExtra("KSta_SourceType", 1);
        intent.putExtra("KSta_Scene", i64.o1.Sight.f370802d);
        intent.putExtra("KSta_FromUserName", m70371x485d7.f39018xf3f56116);
        intent.putExtra("KSta_SnSId", m70371x485d7.Id);
        intent.putExtra("KSta_SnsStatExtStr", m70371x485d7.f39040xbd345fc4);
        intent.putExtra("KMediaVideoTime", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).A);
        intent.putExtra("KMediaTitle", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).C) ? m70371x485d7.f39013x4c306a8a : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).C);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.a7(activityC18109x7a461b7a).m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.f38226xa243db48 == 0) {
            intent.putExtra("StreamWording", m70354x74235b3e.f38228x16d9e644);
            intent.putExtra("StremWebUrl", m70354x74235b3e.f38227x83e6651b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(activityC18109x7a461b7a));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a) == 0) {
            m21.w.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j4.f34368x366c91de);
        } else {
            m21.w.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j4.f34368x366c91de);
        }
        ca4.z0.T(k17);
        int i17 = k17.f68895x2262335f;
        k17.m70375x338a8cc7();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).A;
        m21.w d18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a) == 0 ? m21.w.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.u.f33397x366c91de) : m21.w.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.u.f33397x366c91de);
        ca4.z0.T(k17);
        k17.m70375x338a8cc7();
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.b7(activityC18109x7a461b7a).A;
        d18.g(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a2 = this.f252241d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18109x7a461b7a2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18109x7a461b7a2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18109x7a461b7a2, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a), 5, k17.f68891x29d1292e, 14, 0));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a) == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627 c6039x7f6ec627 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627();
            c6039x7f6ec627.f136328g.getClass();
            c6039x7f6ec627.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
    }
}
