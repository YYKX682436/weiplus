package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class t3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 f155742d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 activityC11408xe972dee3) {
        this.f155742d = activityC11408xe972dee3;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 activityC11408xe972dee3 = this.f155742d;
        int i17 = activityC11408xe972dee3.C;
        if (i17 <= 0) {
            activityC11408xe972dee3.f154845x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hwk);
            activityC11408xe972dee3.f154845x.setEnabled(true);
            return false;
        }
        activityC11408xe972dee3.f154845x.setText(activityC11408xe972dee3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwt, java.lang.Integer.valueOf(i17)));
        int i18 = activityC11408xe972dee3.C - 1;
        activityC11408xe972dee3.C = i18;
        if (i18 % 4 == 0) {
            activityC11408xe972dee3.f154843v++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginByMobileSendSmsUI", "try checkSmsResult, querySmsCount=" + activityC11408xe972dee3.f154843v);
            if (activityC11408xe972dee3.f154843v <= 4 && activityC11408xe972dee3.B) {
                h11.e eVar = new h11.e(activityC11408xe972dee3.f154828d, 17, "", 0, "");
                com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
                ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454030v = 1;
                int i19 = activityC11408xe972dee3.f154843v;
                int i27 = i19 == 4 ? 1 : 0;
                r45.z66 z66Var = new r45.z66();
                z66Var.f473286d = i19;
                z66Var.f473287e = i27;
                ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.A = z66Var;
                java.lang.String str = activityC11408xe972dee3.f154835n;
                if (str != null) {
                    eVar.f359607g = str;
                }
                java.lang.String str2 = activityC11408xe972dee3.f154836o;
                if (str2 != null) {
                    eVar.f359608h = str2;
                }
                gm0.j1.d().g(eVar);
                activityC11408xe972dee3.B = false;
            }
        }
        return true;
    }
}
