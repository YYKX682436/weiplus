package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC13067x4704c595 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public boolean f176747f;

    /* renamed from: d, reason: collision with root package name */
    public float f176745d = -85.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f176746e = -1000.0f;

    /* renamed from: g, reason: collision with root package name */
    public final i11.c f176748g = new iu1.s0(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f176749h = new iu1.u0(this);

    public static /* synthetic */ void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 abstractActivityC13067x4704c595, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFinishLocationThings");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        abstractActivityC13067x4704c595.T6(i17, z17);
    }

    public abstract void T6(int i17, boolean z17);

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewBaseUI", "request location: %s", java.lang.Boolean.valueOf(this.f176747f));
        if (this.f176747f) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(this.f176748g, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f176749h, 4000L);
        }
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewBaseUI", "stop location");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.f176748g);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f176749h);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewBaseUI", "requestCode: %s, resultCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 563) {
            V6();
            return;
        }
        if (i17 != 564) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((sb0.f) jVar).getClass();
        this.f176747f = j35.u.d(mo55332x76847179, "android.permission.ACCESS_FINE_LOCATION", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        if ((mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1) || (mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e) || (mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76) || (mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025)) {
            this.f176747f = false;
            return;
        }
        java.lang.String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(this, strArr)) {
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("had_show_rationale_dlg_" + str + "_69", 0L);
                long f17 = j35.u.f(str, 69);
                if (java.lang.System.currentTimeMillis() - j17 < 172800000 || !(f17 == 0 || z2.h.b(this, str))) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17) {
            U6(this, -2, false, 2, null);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.aw8) : null);
        this.f176747f = Di;
        if (Di) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308708z, new iu1.r0(this))) {
                return;
            }
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f176749h);
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 != 69) {
            super.onRequestPermissionsResult(i17, permissions, grantResults);
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            this.f176747f = true;
            V6();
        } else {
            this.f176747f = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.at7), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new iu1.t0(this), null);
            U6(this, -2, false, 2, null);
        }
    }
}
