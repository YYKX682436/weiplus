package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xl implements db5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f253104a;

    public xl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f253104a = activityC18078x319f375d;
    }

    @Override // db5.e6
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUI", "onItemDel object null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.c7(this.f253104a, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj.toString(), 0));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUI", "onItemDel object not int");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        }
    }
}
