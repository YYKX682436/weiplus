package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class j3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230884a;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230884a = activityC16554x70dcab5d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void a() {
        di3.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230884a;
        if (activityC16554x70dcab5d.f230764g == 0 || (nVar = activityC16554x70dcab5d.f230766i) == null || !nVar.f314275i) {
            return;
        }
        android.widget.TextView textView = activityC16554x70dcab5d.E;
        if (textView != null && activityC16554x70dcab5d.f230763f) {
            textView.animate().alpha(0.0f).setDuration(100L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n2(activityC16554x70dcab5d)).start();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPress %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        ei3.m mVar = activityC16554x70dcab5d.f230768m;
        if (mVar == null) {
            return;
        }
        mVar.t();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        activityC16554x70dcab5d.i7(6);
        if (activityC16554x70dcab5d.f230768m.t() == ei3.l.Stop) {
            int e76 = activityC16554x70dcab5d.e7();
            activityC16554x70dcab5d.f230773p1 = e76;
            if (e76 < 0) {
                activityC16554x70dcab5d.b7();
                return;
            }
        } else if (activityC16554x70dcab5d.f230773p1 < 0) {
            activityC16554x70dcab5d.b7();
            return;
        }
        activityC16554x70dcab5d.i7(2);
        di3.n nVar2 = activityC16554x70dcab5d.f230766i;
        if (nVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode");
            wo.d1 d1Var = nVar2.f314274h;
            if (d1Var != null && nVar2.f314275i) {
                try {
                    android.hardware.Camera.Parameters c17 = d1Var.c();
                    java.util.List<java.lang.String> supportedFocusModes = c17.getSupportedFocusModes();
                    if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraSetting", "support continuous video");
                        c17.setFocusMode("continuous-video");
                    }
                    nVar2.f314274h.f(c17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode error: %s", e17.getMessage());
                }
            }
        }
        if (activityC16554x70dcab5d.V.f230362s) {
            activityC16554x70dcab5d.f230760J.c(activityC16554x70dcab5d.f230765h.f152728h);
        }
        activityC16554x70dcab5d.f230770o.i(0, 100, (activityC16554x70dcab5d.f230765h.f152728h * 1000) - 500, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p2(activityC16554x70dcab5d));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void b() {
        di3.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230884a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "onPressDown, currentStatus: %s", java.lang.Integer.valueOf(activityC16554x70dcab5d.f230764g));
        if (activityC16554x70dcab5d.f230764g == 0 || (nVar = activityC16554x70dcab5d.f230766i) == null || !nVar.f314275i) {
            return;
        }
        int[] iArr = new int[2];
        activityC16554x70dcab5d.f230770o.getLocationOnScreen(iArr);
        di3.n nVar2 = activityC16554x70dcab5d.f230766i;
        int i17 = iArr[1];
        if (nVar2.f314271e <= 0) {
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = h17.y;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCamera", "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", java.lang.Integer.valueOf(i17), h17);
            if (i18 / 2 < i17) {
                try {
                    wo.d1 d1Var = nVar2.f314274h;
                    if (d1Var != null) {
                        int maxZoom = d1Var.c().getMaxZoom();
                        int i19 = ((int) (maxZoom / ((i17 / 3.0d) / 10))) + 1;
                        nVar2.f314271e = i19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCamera", "scrollSmallZoomStep: %s, maxZoom: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(maxZoom));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCamera", "calcScrollZoomStep error: %s", e17.getMessage());
                }
            }
        }
        if (activityC16554x70dcab5d.f230761d == 0) {
            activityC16554x70dcab5d.f230773p1 = activityC16554x70dcab5d.e7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void c() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230884a;
        ei3.m mVar = activityC16554x70dcab5d.f230768m;
        objArr[1] = mVar;
        objArr[2] = java.lang.Long.valueOf(mVar != null ? mVar.n() : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish %s, recorder: %s, recordTime: %s", objArr);
        int i17 = activityC16554x70dcab5d.f230761d;
        if (i17 == 0) {
            ei3.m mVar2 = activityC16554x70dcab5d.f230768m;
            if (mVar2 == null || mVar2.n() > 1000 || activityC16554x70dcab5d.f230768m.t() != ei3.l.Start) {
                activityC16554x70dcab5d.f7();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "video record too short, cancel and convert to takepicture");
            activityC16554x70dcab5d.f230768m.mo127742xae7a2e7a();
            if (activityC16554x70dcab5d.f230761d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.T6(activityC16554x70dcab5d);
                return;
            }
            return;
        }
        if (i17 == 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            ei3.m mVar3 = activityC16554x70dcab5d.f230768m;
            objArr2[0] = mVar3 == null ? "null" : mVar3.getClass().getSimpleName();
            ei3.m mVar4 = activityC16554x70dcab5d.f230768m;
            objArr2[1] = java.lang.Long.valueOf(mVar4 == null ? -1L : mVar4.n());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish, MODE_SIGHT, recorder=%s, recordTime=%d", objArr2);
            ei3.m mVar5 = activityC16554x70dcab5d.f230768m;
            if ((mVar5 == null || mVar5.n() > 1000) && activityC16554x70dcab5d.f230768m != null) {
                activityC16554x70dcab5d.f7();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "video record too short");
            dp.a.m125853x26a183b(activityC16554x70dcab5d, com.p314xaae8f345.mm.R.C30867xcad56011.gw8, 1).show();
            activityC16554x70dcab5d.c7();
        }
    }
}
