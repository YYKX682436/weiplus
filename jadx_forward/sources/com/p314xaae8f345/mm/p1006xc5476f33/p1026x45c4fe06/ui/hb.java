package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class hb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12692xa9d207a5 f171294a;

    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12692xa9d207a5 activityC12692xa9d207a5) {
        this.f171294a = activityC12692xa9d207a5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l
    public void a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f171294a.f170998m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l
    /* renamed from: onStart */
    public void mo50612xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12692xa9d207a5 activityC12692xa9d207a5 = this.f171294a;
        if (activityC12692xa9d207a5.f170998m == null) {
            activityC12692xa9d207a5.f170998m = db5.e1.P(activityC12692xa9d207a5.mo55332x76847179(), activityC12692xa9d207a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), 3, activityC12692xa9d207a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4p), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gb.f171275d);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12692xa9d207a5.f170998m;
        if (u3Var != null) {
            u3Var.show();
        }
    }
}
