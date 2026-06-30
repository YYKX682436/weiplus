package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class tf implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 f155760d;

    public tf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918) {
        this.f155760d = activityC11462xec7fb918;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918 = this.f155760d;
        int i17 = activityC11462xec7fb918.f155130t;
        if (i17 <= 0) {
            activityC11462xec7fb918.f155127q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hwk);
            activityC11462xec7fb918.f155127q.setEnabled(true);
            return false;
        }
        activityC11462xec7fb918.f155127q.setText(activityC11462xec7fb918.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwt, java.lang.Integer.valueOf(i17)));
        int i18 = activityC11462xec7fb918.f155130t - 1;
        activityC11462xec7fb918.f155130t = i18;
        if (i18 % 4 == 0) {
            int i19 = activityC11462xec7fb918.f155125o + 1;
            activityC11462xec7fb918.f155125o = i19;
            if (i19 <= 4 && activityC11462xec7fb918.f155129s) {
                h11.e eVar = new h11.e(activityC11462xec7fb918.f155117d, 15, "", 0, "");
                java.lang.String stringExtra = activityC11462xec7fb918.getIntent().getStringExtra("KForceMobileMsgId");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                eVar.f359606f = stringExtra;
                com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
                ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454030v = 1;
                eVar.S(activityC11462xec7fb918.f155120g);
                int i27 = activityC11462xec7fb918.f155125o;
                int i28 = i27 == 4 ? 1 : 0;
                r45.z66 z66Var = new r45.z66();
                z66Var.f473286d = i27;
                z66Var.f473287e = i28;
                ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.A = z66Var;
                gm0.j1.d().g(eVar);
                activityC11462xec7fb918.f155129s = false;
            }
        }
        return true;
    }
}
