package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde f260330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        super(false);
        this.f260330e = activityC19033x1e329dde;
        this.f260329d = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.String str = this.f260329d.f69225xed6d60f6;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde.f260205w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde = this.f260330e;
        activityC19033x1e329dde.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard " + str);
        android.content.Intent intent = new android.content.Intent(activityC19033x1e329dde, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19032x13870b5c.class);
        intent.putExtra("bindSerial", str);
        activityC19033x1e329dde.startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = activityC19033x1e329dde.f260213n;
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }
}
