package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class bc extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f191236a;

    public bc(java.lang.ref.WeakReference rLicenseUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rLicenseUI, "rLicenseUI");
        this.f191236a = rLicenseUI;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e;
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "load web progress:" + i17);
        }
        if (i17 != 100 || (activityC14025xcad1379e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e) this.f191236a.get()) == null) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC14025xcad1379e.B, "TYPE_STANDARD") && activityC14025xcad1379e.E) {
            activityC14025xcad1379e.D = 0;
            activityC14025xcad1379e.f7();
            android.widget.Button button = activityC14025xcad1379e.f190938x;
            if (button != null) {
                button.setEnabled(true);
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC14025xcad1379e.H;
            b4Var.d();
            activityC14025xcad1379e.D = 5;
            b4Var.c(1000L, 1000L);
            android.widget.Button button2 = activityC14025xcad1379e.f190938x;
            if (button2 != null) {
                button2.setEnabled(false);
            }
        }
        az2.f fVar = activityC14025xcad1379e.f190939y;
        if (fVar != null) {
            fVar.b();
        }
        activityC14025xcad1379e.f190939y = null;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e) this.f191236a.get();
        if (activityC14025xcad1379e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "licenseUI is null!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "onReceivedTitle title:" + str);
        if ((str == null || str.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC14025xcad1379e.C, str)) {
            return;
        }
        ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.d(str) || r26.i0.y(str, "about:blank", false)) {
            return;
        }
        activityC14025xcad1379e.mo54450xbf7c1df6(str);
    }
}
