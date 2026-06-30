package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f251628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td f251629e;

    public od(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar, long j17) {
        this.f251629e = tdVar;
        this.f251628d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f251629e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = tdVar.f252043d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            boolean g17 = g9Var.f249950g.g();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar).f247691a;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar).f247692b;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar).f247698h;
            long j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar).f247691a;
            long j18 = this.f251628d;
            if (j18 < j17 || j18 > com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar).f247692b || !g17) {
                tdVar.d();
            } else {
                tdVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", "checkLongPressGesture, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
    }
}
