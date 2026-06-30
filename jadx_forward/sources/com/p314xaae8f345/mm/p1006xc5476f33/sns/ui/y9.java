package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class y9 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {

    /* renamed from: o, reason: collision with root package name */
    public android.animation.ValueAnimator f253156o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa f253157p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar, java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f253157p = paVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + c17933xe8d1b226 + "]");
        if (c17933xe8d1b226 != null) {
            android.animation.ValueAnimator valueAnimator = this.f253156o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f253156o = ofFloat;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = this.f253157p;
            ofFloat.setStartDelay(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar).f38281x4178699b.f247545b);
            this.f253156o.setDuration(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar).f38281x4178699b.f247544a);
            this.f253156o.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x9(this));
            this.f253156o.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean n(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean z17 = false;
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e().f38157x18416701 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i iVar = c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38281x4178699b;
            if (iVar != null && iVar.f247544a > 0) {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj).m70367x7525eefd(), ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2).m70367x7525eefd());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return m17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = this.f253157p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        try {
            this.f253156o.cancel();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar).setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar).setBackground(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar).getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b1f));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.x();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }
}
