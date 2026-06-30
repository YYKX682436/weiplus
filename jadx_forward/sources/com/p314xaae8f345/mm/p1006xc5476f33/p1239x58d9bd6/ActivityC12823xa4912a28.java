package com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/audio/BizAudioFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lum1/a;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.audio.BizAudioFlutterActivity */
/* loaded from: classes11.dex */
public final class ActivityC12823xa4912a28 extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 implements um1.a {

    /* renamed from: x, reason: collision with root package name */
    public static int f173998x = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f173999u = "MicroMsg.BizAudioFlutterActivity#" + hashCode();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f174000v = jz5.h.b(new mm1.k(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f174001w = jz5.h.b(new mm1.i(this));

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950
    public boolean V6() {
        boolean h17 = ep1.m.h(((zm1.h) pf5.z.f435481a.a(this).a(zm1.h.class)).m158354x19263085().getIntent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f173999u, "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (!h17) {
            return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390;
        }
        overridePendingTransition(-1, com.p314xaae8f345.mm.ui.uc.f292612b);
        return true;
    }

    public java.lang.Object a7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ((zm1.h) pf5.z.f435481a.a(this).a(zm1.h.class)).f555677o = true;
        return jz5.f0.f384359a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return f173998x;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{zm1.m.class, zm1.h.class, bn1.c0.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f173999u, "onBusinessPermissionDenied permission: " + str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionGranted */
    public void mo53825x600c4ed(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f173999u, "onBusinessPermissionGranted permission: " + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mm1.b0 b0Var = (mm1.b0) ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "cancelDelayTerminal");
        ((fv.k) ((jz5.n) b0Var.f410175h).mo141623x754a37bb()).b();
        pf5.z zVar = pf5.z.f435481a;
        ((zm1.m) zVar.a(this).a(zm1.m.class)).R((mm1.h) ((jz5.n) this.f174001w).mo141623x754a37bb());
        ((zm1.m) zVar.a(this).a(zm1.m.class)).k5((mm1.j) ((jz5.n) this.f174000v).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String stringExtra = getIntent().getStringExtra("session_id");
        rv.j2 Bi = ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        if (stringExtra == null) {
            stringExtra = "";
        }
        mm1.b0 b0Var = (mm1.b0) Bi;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "delayTerminal, sessionId: ".concat(stringExtra));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, b0Var.f410172e)) {
            if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "delayTerminal with empty status");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "clearAppSessionId");
            b0Var.f410172e = "";
            ((fv.k) ((jz5.n) b0Var.f410175h).mo141623x754a37bb()).c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "delayTerminal, sessionId not match, return");
        }
        pf5.z zVar = pf5.z.f435481a;
        ((zm1.m) zVar.a(this).a(zm1.m.class)).m0((mm1.h) ((jz5.n) this.f174001w).mo141623x754a37bb());
        ((zm1.m) zVar.a(this).a(zm1.m.class)).m2((mm1.j) ((jz5.n) this.f174000v).mo141623x754a37bb());
        f173998x = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        um1.a aVar = mm1.b0.f410168i;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mm1.b0.f410168i, this)) {
            mm1.b0.f410168i = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        super.onResume();
        um1.a aVar = mm1.b0.f410168i;
        mm1.b0.f410168i = this;
        if (!ep1.m.h(getIntent()) || (m78735x28280f95 = m78735x28280f95()) == null) {
            return;
        }
        m78735x28280f95.m81454x4335bff3(false);
        m78735x28280f95.d(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, pi0.o0
    public void pop() {
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new mm1.l(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, pi0.w0
    public void u3(pi0.w0 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        super.u3(host);
        finish();
    }
}
