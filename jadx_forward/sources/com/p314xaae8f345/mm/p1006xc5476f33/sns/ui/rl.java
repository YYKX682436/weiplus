package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f251958d;

    public rl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f251958d = activityC18078x319f375d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = this.f251958d;
        if (z17) {
            long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) view.getTag()).f251641g.f67469x29d1290e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] info == null, id = " + j17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] info id = " + j17 + ", info isAd() = " + W0.m70377x3172ed());
            }
            if (W0 == null || W0.m70377x3172ed()) {
                str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                str2 = "onClick";
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.Z;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj kjVar = activityC18078x319f375d.f248804h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                kjVar.d(view, -1, 1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) view.getTag();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = ojVar.f251641g;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.Z;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                java.lang.Boolean f76 = activityC18078x319f375d.f7(v1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (!f76.booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access now");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    activityC18078x319f375d.A = view;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    activityC18078x319f375d.q7(v1Var, true, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).w(java.lang.String.valueOf(v1Var.f67469x29d1290e))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: forbid access");
                    ojVar.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    activityC18078x319f375d.l7(v1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                } else {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).v(java.lang.String.valueOf(v1Var.f67469x29d1290e))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: have access");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                        ojVar.f251639e = 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access later on browse");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    ojVar.f251640f = j17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj kjVar2 = activityC18078x319f375d.f248804h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                    str2 = "onClick";
                    kjVar2.e(view, -1, 1, null, 0L, true, 2);
                }
                str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                str2 = "onClick";
            }
        } else {
            str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
            str2 = "onClick";
            if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.b7(activityC18078x319f375d, (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) view.getTag());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsMsgUI", "v.getTag():" + view.getTag());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$2", "android/view/View$OnClickListener", str2, "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
    }
}
