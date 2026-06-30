package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class qk implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 f251879a;

    public qk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        this.f251879a = activityC18072xf2d2bc10;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "ExpandableListView click groupPosition:%d ,childPosition:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = ae4.a.f85885u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10 = this.f251879a;
        if (i18 == i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.Z6(activityC18072xf2d2bc10, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
            intent.putExtra("snsPostWhoCanSee", true);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b));
            int i27 = activityC18072xf2d2bc10.f248764s;
            if (i27 == 2) {
                if (activityC18072xf2d2bc10.f248758m.f85898m.size() > 0) {
                    intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18072xf2d2bc10.f248758m.f85898m, ","));
                }
            } else if (i27 == 3 && activityC18072xf2d2bc10.f248758m.f85899n.size() > 0) {
                intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18072xf2d2bc10.f248758m.f85899n, ","));
            }
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("without_openim", true);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", activityC18072xf2d2bc10.f248769x);
            j45.l.v(activityC18072xf2d2bc10, ".ui.contact.SelectContactUI", intent, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else if (i18 == ae4.a.f85884t) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.Z6(activityC18072xf2d2bc10, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "goto select group");
            android.content.Intent intent2 = new android.content.Intent(activityC18072xf2d2bc10, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb.class);
            intent2.putExtra("titile", activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbi));
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", activityC18072xf2d2bc10.f248769x);
            int i28 = activityC18072xf2d2bc10.f248764s;
            if (i28 == 2) {
                if (activityC18072xf2d2bc10.f248758m.f85900o.size() > 0) {
                    intent2.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18072xf2d2bc10.f248758m.f85900o, ","));
                }
            } else if (i28 == 3 && activityC18072xf2d2bc10.f248758m.f85901p.size() > 0) {
                intent2.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18072xf2d2bc10.f248758m.f85901p, ","));
            }
            intent2.putExtra("KBlockOpenImFav", true);
            activityC18072xf2d2bc10.startActivityForResult(intent2, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7532x3a129d88);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else {
            java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).getChild(i17, i18 - ae4.a.f85886v);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).d(str);
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.U6(activityC18072xf2d2bc10, 1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85896k, str, view);
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.U6(activityC18072xf2d2bc10, 2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85897l, str, view);
            }
        }
        if (i18 == ae4.a.f85885u) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0 = s0Var.f246492l;
            if (c6969xa989d0b0 != null) {
                int i29 = c6969xa989d0b0.f142785s;
                if (i29 <= 0) {
                    c6969xa989d0b0.f142785s = 1;
                } else {
                    c6969xa989d0b0.f142785s = i29 + 1;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (i18 == ae4.a.f85884t) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b02 = s0Var2.f246492l;
            if (c6969xa989d0b02 != null) {
                int i37 = c6969xa989d0b02.f142781o;
                if (i37 <= 0) {
                    c6969xa989d0b02.f142781o = 1;
                } else {
                    c6969xa989d0b02.f142781o = i37 + 1;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
        return true;
    }
}
