package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class x6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154423a;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154423a = activityC11355x7bcfecda;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154423a;
        activityC11355x7bcfecda.mo48627xce38d9a();
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay success");
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.i7(activityC11355x7bcfecda, activityC11355x7bcfecda.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4e));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.i7(activityC11355x7bcfecda, activityC11355x7bcfecda.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4d));
        return null;
    }
}
