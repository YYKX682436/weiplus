package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class v6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154389a;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154389a = activityC11355x7bcfecda;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "close pay list success: %s", (java.lang.Boolean) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154389a;
        activityC11355x7bcfecda.mo48627xce38d9a();
        android.app.Dialog dialog = activityC11355x7bcfecda.f154082n;
        if (dialog != null && dialog.isShowing()) {
            activityC11355x7bcfecda.f154082n.dismiss();
        }
        activityC11355x7bcfecda.f154077J = null;
        activityC11355x7bcfecda.k7();
        activityC11355x7bcfecda.m78548x39037dd1();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("close_aa", true);
        intent.putExtra("item_position", activityC11355x7bcfecda.getIntent().getIntExtra("item_position", 0));
        intent.putExtra("item_offset", activityC11355x7bcfecda.getIntent().getIntExtra("item_offset", 0));
        activityC11355x7bcfecda.setResult(-1, intent);
        return null;
    }
}
