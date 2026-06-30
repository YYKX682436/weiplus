package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class n6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        super(false);
        this.f154282d = activityC11355x7bcfecda;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "click mInstantPayBtn ForCustomize");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154282d;
        android.content.Intent intent = activityC11355x7bcfecda.getIntent();
        intent.putExtra("user_name", activityC11355x7bcfecda.f154077J);
        intent.putExtra("user_real_name", activityC11355x7bcfecda.K);
        intent.putExtra("user_group_solitatire_content", activityC11355x7bcfecda.A);
        j45.l.n(activityC11355x7bcfecda, "aa", ".ui.AARemittanceUI", intent, 234);
    }
}
