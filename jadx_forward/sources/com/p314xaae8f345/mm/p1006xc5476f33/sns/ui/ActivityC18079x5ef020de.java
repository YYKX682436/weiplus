package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll */
/* loaded from: classes4.dex */
public class ActivityC18079x5ef020de extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d {

    /* renamed from: p0, reason: collision with root package name */
    public boolean f248821p0 = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public void d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mm(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public int h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public int k7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574731oj3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public boolean n7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public boolean o7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 25 && i18 == -1) {
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("is_clear_all_msg", false);
            this.f248821p0 = booleanExtra;
            if (booleanExtra) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nm(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUIWithAll", "onBackPressed");
        if (this.B && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
        }
        u7(-1, this.f248821p0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public void r7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lm(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d
    public void t7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        android.widget.ListView listView = this.f248800d;
        if (listView != null) {
            listView.setBackgroundColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    public final void u7(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_clear_all_msg", z17);
        intent.putExtra("sns_cmd_list", this.f248813t);
        intent.putStringArrayListExtra("sns_msg_forbid_access_snsid_list", new java.util.ArrayList<>(i7()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        setResult(i17, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }
}
