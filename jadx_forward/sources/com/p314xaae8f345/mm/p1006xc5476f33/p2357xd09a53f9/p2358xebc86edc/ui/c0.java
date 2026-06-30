package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f259404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        super(false);
        this.f259404d = activityC18999x8e4b0cb;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f259404d;
        activityC18999x8e4b0cb.m83133x1e3567d1();
        java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
        at4.f fVar = vr4.f1.wi().Ai().f95535k;
        if (fVar != null) {
            java.lang.String str3 = fVar.f95374i;
            str = fVar.f95373h;
            str2 = str3;
        } else {
            str = "";
            str2 = str;
        }
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "debit is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb2 = this.f259404d;
        activityC18999x8e4b0cb2.c7(activityC18999x8e4b0cb2.mo55332x76847179(), j17, activityC18999x8e4b0cb.f259316e, str, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p(this, j17), true);
    }
}
