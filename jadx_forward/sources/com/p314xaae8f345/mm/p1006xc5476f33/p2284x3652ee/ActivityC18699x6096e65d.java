package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lal4/a;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.TingFlutterActivity */
/* loaded from: classes11.dex */
public class ActivityC18699x6096e65d extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 implements al4.a {
    public static boolean A = false;

    /* renamed from: z, reason: collision with root package name */
    public static int f256152z = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f256153u = "MicroMsg.TingFlutterActivity#" + hashCode();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f256154v = jz5.h.b(new rk4.e5(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f256155w = jz5.h.b(new rk4.c5(this));

    /* renamed from: x, reason: collision with root package name */
    public boolean f256156x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f256157y;

    public static final void a7(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d, boolean z17) {
        activityC18699x6096e65d.getClass();
        rk4.k5.c("finishUI withFloatBallAnimation: " + z17, activityC18699x6096e65d.getB());
        super.finish();
        if (z17) {
            activityC18699x6096e65d.overridePendingTransition(-1, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950
    public boolean V6() {
        boolean h17 = ep1.m.h(getIntent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (!h17) {
            return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390;
        }
        overridePendingTransition(-1, com.p314xaae8f345.mm.ui.uc.f292612b);
        return true;
    }

    /* renamed from: b7, reason: from getter */
    public java.lang.String getB() {
        return this.f256153u;
    }

    public java.lang.Object c7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.p0) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.p0.class)).f256349s = true;
        return jz5.f0.f384359a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return f256152z;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.p0.class, lm4.i0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "onBusinessPermissionDenied permission: " + str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionGranted */
    public void mo53825x600c4ed(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "onBusinessPermissionGranted permission: " + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        rk4.k5.c("onCreate", getB());
        super.onCreate(bundle);
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        rk4.k5.e("cancelDelayTerminal", "MicroMsg.TingRouter");
        ((if0.k) ((jz5.n) k8Var.f478338q).mo141623x754a37bb()).b();
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0.class)).G((rk4.b5) ((jz5.n) this.f256155w).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0.class)).r0((rk4.d5) ((jz5.n) this.f256154v).mo141623x754a37bb());
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TingFlutterActivity);
        aVar.Rj(this, iy1.a.Ting);
        aVar.Tj(this, 40, 5, false);
        boolean booleanExtra = getIntent().getBooleanExtra("up_down_animation", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
        if (m78735x28280f95 != null) {
            m78735x28280f95.m81459xd474422(booleanExtra);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        rk4.k5.c("onDestroy", getB());
        A = false;
        super.onDestroy();
        java.lang.String stringExtra = getIntent().getStringExtra("session_id");
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        if (stringExtra == null) {
            stringExtra = "";
        }
        rk4.k8 k8Var = (rk4.k8) aj6;
        rk4.k5.e("delayTerminal, sessionId: ".concat(stringExtra), "MicroMsg.TingRouter");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, k8Var.f478329e)) {
            if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai() == null) {
                rk4.k8.f478326w = java.lang.System.currentTimeMillis();
                rk4.k5.e("delayTerminal with empty status destroyWithEmptyStatusTime=" + rk4.k8.f478326w, "MicroMsg.TingRouter");
            }
            rk4.k5.e("clearAppSessionId", "MicroMsg.TingRouter");
            k8Var.f478330f = bw5.ar0.TingScene_UnDefined;
            k8Var.f478329e = "";
            b66.x Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
            if (Zi != null) {
                java.lang.String sessionId = k8Var.f478329e;
                bw5.ar0 enterScene = k8Var.f478330f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
                p3380x6a61f93.p3382xf513feca.C30528x21b2b547.m169607x21b2e7c6(((b66.y) Zi).m105978x2737f10(), sessionId, enterScene.f106955d);
            }
            ((if0.k) ((jz5.n) k8Var.f478338q).mo141623x754a37bb()).c();
        } else {
            rk4.k5.e("delayTerminal, sessionId not match, return", "MicroMsg.TingRouter");
        }
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0.class)).g0((rk4.b5) ((jz5.n) this.f256155w).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0.class)).O5((rk4.d5) ((jz5.n) this.f256154v).mo141623x754a37bb());
        f256152z = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        rk4.k5.c("onPause", getB());
        A = false;
        super.onPause();
        rk4.u6 u6Var = rk4.k8.f478321r;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rk4.k8.f478323t, this)) {
            rk4.k8.f478323t = null;
        }
        W6();
        this.f256156x = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        rk4.k5.c("onResume", getB());
        super.onResume();
        A = true;
        rk4.u6 u6Var = rk4.k8.f478321r;
        rk4.k8.f478323t = this;
        il4.l lVar = il4.l.f373675a;
        ((ku5.t0) ku5.t0.f394148d).g(il4.i.f373671d);
        if (ep1.m.h(getIntent()) && (m78735x28280f95 = m78735x28280f95()) != null) {
            m78735x28280f95.m81454x4335bff3(false);
            m78735x28280f95.d(true);
        }
        if (this.f256156x) {
            Y6();
            this.f256156x = false;
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !com.p314xaae8f345.mm.ui.b4.c(this)) {
            return;
        }
        getWindow().setNavigationBarContrastEnforced(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        rk4.k5.c("onSaveInstanceState", getB());
        this.f256157y = true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        rk4.k5.c("onStop", getB());
        A = false;
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, pi0.o0
    public void pop() {
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.f5(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, pi0.w0
    public void u3(pi0.w0 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        super.u3(host);
        if (this.f256157y) {
            return;
        }
        finish();
    }
}
