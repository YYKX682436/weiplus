package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class w6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154409a;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154409a = activityC11355x7bcfecda;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154409a;
        activityC11355x7bcfecda.mo48627xce38d9a();
        if (!(obj instanceof java.lang.String) || obj.toString().equalsIgnoreCase("ok")) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.i7(activityC11355x7bcfecda, activityC11355x7bcfecda.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4d));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.i7(activityC11355x7bcfecda, obj.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
    }
}
