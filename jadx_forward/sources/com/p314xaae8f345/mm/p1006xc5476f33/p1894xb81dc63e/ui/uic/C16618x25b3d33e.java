package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic;

/* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC */
/* loaded from: classes11.dex */
public class C16618x25b3d33e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements rk3.b {

    /* renamed from: d, reason: collision with root package name */
    public int f232116d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f232117e;

    /* renamed from: f, reason: collision with root package name */
    public pi0.l1 f232118f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f232119g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f232120h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16619x69c65d25 f232121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC$homeTabChangedListener$1] */
    public C16618x25b3d33e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if ((4095 & 1) != 0) {
            i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if ((4095 & 2) != 0) {
            int i17 = rk3.e.P;
            int i18 = rk3.e.P;
        }
        if ((4095 & 64) != 0) {
            int i19 = rk3.e.P;
            int i27 = rk3.e.P;
        }
        this.f232117e = p3325xe03a0797.p3326xc267989b.z0.b();
        zk3.g gVar = new zk3.g(this);
        this.f232119g = gVar;
        this.f232120h = new p012xc85e97e9.p093xedfae76a.b0(gVar, true);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f232121i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC$homeTabChangedListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.nh nhVar = event.f135971g;
                if (nhVar != null) {
                    int i28 = nhVar.f88958a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16618x25b3d33e c16618x25b3d33e = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16618x25b3d33e.this;
                    c16618x25b3d33e.getClass();
                    c16618x25b3d33e.O6(i28 == 0);
                }
                return false;
            }
        };
    }

    @Override // rk3.b
    public void E1(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPanelSizeChanged, width: " + i17 + ", height: " + i18);
    }

    @Override // rk3.b
    public void E3() {
    }

    @Override // rk3.b
    public void H() {
    }

    @Override // rk3.b
    public void J5(android.view.View view, float f17) {
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "enableSlide: " + z17);
    }

    @Override // rk3.b
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onActivityResult");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onBeforeFinish");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onConfigurationChanged, orientation: " + newConfig.orientation);
        if (newConfig.orientation == 2) {
            O6(false);
        } else {
            O6(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onCreate");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onCreateBefore");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "UIC onCreate");
        if (this.f232118f == null) {
            this.f232118f = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "chatbot", null, false, null, 28, null);
            p3325xe03a0797.p3326xc267989b.l.d(this.f232117e, null, null, new zk3.f(currentTimeMillis, this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onDestroy");
        mo48814x2efc64();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f232117e, null, 1, null);
        this.f232120h.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPause, isPanelExpanded: false");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onRequestPermissionsResult");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onRestoreInstanceState");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onResume, isPanelExpanded: false");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onSaveInstanceState");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStart, isPanelExpanded: false");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStartActivityForResult");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStop, isPanelExpanded: false");
    }

    @Override // rk3.b
    public void p(android.view.View view, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPanelItemSelected, position: " + i17);
    }

    @Override // rk3.b
    public boolean q0() {
        return false;
    }

    @Override // rk3.b
    public void t1(android.view.View view, rk3.c previousState, rk3.c newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previousState, "previousState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        previousState.toString();
        newState.toString();
        int ordinal = newState.ordinal();
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f232120h;
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_RESUME");
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
            this.f232116d = m158354x19263085().getWindow().getStatusBarColor();
            m158354x19263085().getWindow().setStatusBarColor(0);
            return;
        }
        if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_STOP");
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
            m158354x19263085().getWindow().setStatusBarColor(this.f232116d);
        } else {
            if (ordinal != 4) {
                return;
            }
            if (previousState == rk3.c.f478021d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_PAUSE");
                b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
            } else if (previousState == rk3.c.f478022e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_START");
                b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
            }
        }
    }

    @Override // rk3.b
    public void y0(float f17) {
    }
}
