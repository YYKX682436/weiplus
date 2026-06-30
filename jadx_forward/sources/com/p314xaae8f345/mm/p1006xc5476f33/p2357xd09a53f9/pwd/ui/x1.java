package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class x1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 f260645b;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70, int i17) {
        this.f260645b = activityC19052xb1f1fd70;
        this.f260644a = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click next");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24835, 2, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70 = this.f260645b;
        activityC19052xb1f1fd70.f260464t.f356642g = false;
        activityC19052xb1f1fd70.C = true;
        activityC19052xb1f1fd70.W6(this.f260644a);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q
    /* renamed from: onCancel */
    public void mo66210x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24835, 2, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70 = this.f260645b;
        activityC19052xb1f1fd70.C = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = activityC19052xb1f1fd70.f260454g;
        c21541x1c1b08fe.O(true ^ c21541x1c1b08fe.N());
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC19052xb1f1fd70.f260451d).notifyDataSetChanged();
    }
}
