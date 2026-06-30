package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273393d;

    public r2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273393d = activityC19730xa7b9756f;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "handleTabSelected: cancel");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273393d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = activityC19730xa7b9756f.f272915v;
        if (c2718xca2902ff != null) {
            int m20353x443e53f0 = c2718xca2902ff.m20353x443e53f0();
            for (int i18 = 0; i18 < m20353x443e53f0; i18++) {
                oa.i k17 = c2718xca2902ff.k(i18);
                java.lang.Object obj = k17 != null ? k17.f425311a : null;
                if (obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7 j7Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7) obj;
                    if (j7Var.f273271c == activityC19730xa7b9756f.f272917x) {
                        j7Var.a(true);
                        k17.b();
                        activityC19730xa7b9756f.j7(activityC19730xa7b9756f.f272917x);
                    }
                }
            }
        }
    }
}
