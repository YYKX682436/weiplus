package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class h4 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f181008a;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f181008a = activityC13474xf9906714;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p32.j jVar = (p32.j) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f181008a;
        if (activityC13474xf9906714.isFinishing() || activityC13474xf9906714.f180854y) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.M;
            activityC13474xf9906714.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v4(activityC13474xf9906714));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI has been destroyed.");
            return;
        }
        if (i17 == 0 && i18 == 0 && jVar != null) {
            activityC13474xf9906714.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v3(this, jVar));
            activityC13474xf9906714.f180842m = jVar.f433011p;
            activityC13474xf9906714.f180850u = jVar.f433010o;
            activityC13474xf9906714.f180851v = jVar.f433013r;
            activityC13474xf9906714.f180853x = jVar.f433014s;
            activityC13474xf9906714.A = jVar.f433015t;
            activityC13474xf9906714.B = jVar.f433007i;
            activityC13474xf9906714.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.w3(this));
            if (!activityC13474xf9906714.f180852w) {
                activityC13474xf9906714.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.y3(activityC13474xf9906714));
            }
            activityC13474xf9906714.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v4(activityC13474xf9906714));
        }
    }
}
