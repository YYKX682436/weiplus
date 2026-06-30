package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class u6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154369a;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154369a = activityC11355x7bcfecda;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "close pay list failed: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154369a;
        activityC11355x7bcfecda.mo48627xce38d9a();
        android.app.Dialog dialog = activityC11355x7bcfecda.f154082n;
        if (dialog != null && dialog.isShowing()) {
            activityC11355x7bcfecda.f154082n.dismiss();
        }
        if (obj instanceof java.lang.String) {
            dp.a.m125854x26a183b(activityC11355x7bcfecda, obj.toString(), 1).show();
        } else {
            dp.a.m125853x26a183b(activityC11355x7bcfecda, com.p314xaae8f345.mm.R.C30867xcad56011.b9b, 1).show();
        }
    }
}
