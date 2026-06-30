package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes5.dex */
public class u1 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13463xb23ee7a9 f181220a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13463xb23ee7a9 activityC13463xb23ee7a9) {
        this.f181220a = activityC13463xb23ee7a9;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13463xb23ee7a9 activityC13463xb23ee7a9 = this.f181220a;
        try {
            if (activityC13463xb23ee7a9.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectedRouterActivateStateUi", "ExdeviceConnectedRouter destroyed.");
            } else {
                activityC13463xb23ee7a9.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t1(this, i18, i17));
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }
}
