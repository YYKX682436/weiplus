package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f251720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q9 f251721e;

    public p9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q9 q9Var, zy2.dc dcVar) {
        this.f251721e = q9Var;
        this.f251720d = dcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10$1");
        zy2.dc dcVar = this.f251720d;
        if (dcVar != null) {
            int i17 = ((ya2.b2) dcVar).f69313xcad4ef95;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q9 q9Var = this.f251721e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = q9Var.f251865a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.A = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, followFlg=" + i17 + ", userName=" + ((ya2.b2) dcVar).D0());
            q9Var.f251865a.A(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, iLocalFinderContact==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10$1");
    }
}
