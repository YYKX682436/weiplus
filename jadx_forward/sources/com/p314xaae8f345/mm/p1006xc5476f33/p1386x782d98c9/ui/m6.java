package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class m6 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181103a;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f181103a = activityC13477xb2a3ecd7;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p32.l lVar = (p32.l) m1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onNetSceneEndCallback, errType(%s), errCode(%s), errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f181103a;
        if (activityC13477xb2a3ecd7.isFinishing() || activityC13477xb2a3ecd7.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "ExdeviceRankInfoUI has been destroyed.");
            return;
        }
        activityC13477xb2a3ecd7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c6(this));
        if (i17 != 0 || i18 != 0) {
            java.util.List list = activityC13477xb2a3ecd7.B;
            if (list == null || list.size() == 0) {
                activityC13477xb2a3ecd7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d6(this));
                return;
            }
            return;
        }
        activityC13477xb2a3ecd7.G = lVar.f433027s;
        activityC13477xb2a3ecd7.H = lVar.f433028t;
        activityC13477xb2a3ecd7.f180865J = lVar.f433031w;
        activityC13477xb2a3ecd7.I = lVar.f433030v;
        activityC13477xb2a3ecd7.P = lVar.f433032x;
        activityC13477xb2a3ecd7.Q = ((r45.tq3) lVar.H()).f468233w;
        activityC13477xb2a3ecd7.R = ((r45.tq3) lVar.H()).f468234x;
        activityC13477xb2a3ecd7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f6(this));
    }
}
