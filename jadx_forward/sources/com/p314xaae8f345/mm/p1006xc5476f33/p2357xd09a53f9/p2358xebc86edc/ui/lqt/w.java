package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class w extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 f259948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4) {
        super(false);
        this.f259948d = activityC19009xdf81ddb4;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4.f259465t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4 = this.f259948d;
        activityC19009xdf81ddb4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show time panel");
        r45.ra5 ra5Var = activityC19009xdf81ddb4.f259476q;
        if (ra5Var == null) {
            return;
        }
        int size = ra5Var.f466229f.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i18 = 0; i18 < size; i18++) {
            strArr[i18] = activityC19009xdf81ddb4.V6((r45.dm6) activityC19009xdf81ddb4.f259476q.f466229f.get(i18), com.p314xaae8f345.mm.R.C30867xcad56011.kop);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activityC19009xdf81ddb4.mo55332x76847179(), strArr);
        c0Var.i(activityC19009xdf81ddb4.f259474o);
        c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z(activityC19009xdf81ddb4, c0Var);
        c0Var.l();
    }
}
