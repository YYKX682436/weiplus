package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class et implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.r0 f249795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ft f249796e;

    public et(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ft ftVar, ca4.r0 r0Var) {
        this.f249796e = ftVar;
        this.f249795d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iv ivVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iv) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.c(this.f249796e.f249892d);
        ivVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        ca4.r0 r0Var = this.f249795d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = ivVar.f250981a;
        activityC18141xfedff17.H = r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        ca4.r0 r0Var2 = activityC18141xfedff17.H;
        boolean z17 = (r0Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r0Var2.f121542a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC18141xfedff17.H.f121543b)) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserUI", "username:%s, datePickerEnable:%s", activityC18141xfedff17.f249132h, java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC18141xfedff17.f249133i, activityC18141xfedff17.f249132h) && z17) {
            activityC18141xfedff17.f249145x.setVisibility(0);
            activityC18141xfedff17.f249143v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vu(activityC18141xfedff17));
        } else {
            activityC18141xfedff17.f249145x.setVisibility(8);
            activityC18141xfedff17.f249143v.setOnClickListener(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
    }
}
