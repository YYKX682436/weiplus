package du0;

/* loaded from: classes.dex */
public final class i0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f324895d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f324896e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f324897f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f324898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f324898g = new du0.q(this);
    }

    public final void O6(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072 c4113xcb092072, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f324897f = callback;
        if (c4113xcb092072 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", "requestClipPoi: clipMjLocation latitude " + c4113xcb092072.m33841x2605e9e2() + " longitude " + c4113xcb092072.m33842x79d7af9());
            P6(c4113xcb092072.m33841x2605e9e2(), c4113xcb092072.m33842x79d7af9(), new du0.d0(this));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity m80379x76847179 = m80379x76847179();
        ((sb0.f) jVar).getClass();
        if (j35.u.d(m80379x76847179, "android.permission.ACCESS_FINE_LOCATION", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", "requestClipPoi: has Permission");
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new du0.v(this, null), 3, null);
            return;
        }
        this.f324895d = true;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        java.lang.Object l17 = c17.l(274436, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        if (u11.c.f((java.lang.String) l17)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.m(u3Var, bool), bool)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " checkPermissionWithoutRequest gDPRLocationConfirm");
                android.app.Activity m80379x768471792 = m80379x76847179();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", m80379x768471792.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                j45.l.n(m80379x768471792, "webview", ".ui.tools.WebViewUI", intent, 206);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " requestPremiss requestPermission");
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity m80379x768471793 = m80379x76847179();
        ((sb0.f) jVar2).getClass();
        j35.u.i(m80379x768471793, "android.permission.ACCESS_FINE_LOCATION", 64);
    }

    public final void P6(float f17, float f18, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", "requestLocation: lat " + f17 + " lng " + f18);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new du0.c0(new du0.e0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), true, 0, null), lVar), f17, f18, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " onActivityResult requestCode " + i17 + " resultCode " + i18);
        this.f324896e = false;
        if (i17 != 206) {
            return;
        }
        yz5.l lVar = this.f324898g;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " onActivityResult data == null ");
            ((du0.q) lVar).mo146xb9724478(null);
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
        if (bundleExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " onActivityResult bundle == null ");
            ((du0.q) lVar).mo146xb9724478(null);
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundleExtra.getString("go_next", ""), "gdpr_auth_location")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " onActivityResult KNext not NEXT_GDPR_AUTH_LOCATION");
                ((du0.q) lVar).mo146xb9724478(null);
                return;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            ((sb0.f) jVar).getClass();
            j35.u.i(m80379x76847179, "android.permission.ACCESS_FINE_LOCATION", 64);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", " onRequestPermissionsResult requestCode requestCode " + i17 + " permissions " + kz5.z.d0(permissions, null, null, null, 0, null, du0.w.f324986d, 31, null) + " grantResults " + kz5.z.c0(grantResults, null, null, null, 0, null, du0.x.f324987d, 31, null) + " requestClipPoiResult " + this.f324897f);
        if (i17 != 64) {
            return;
        }
        java.lang.Integer S = kz5.z.S(grantResults, 0);
        if (S != null && S.intValue() == 0) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new du0.v(this, null), 3, null);
            return;
        }
        du0.y yVar = new du0.y(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", "showDeniedAlert: ");
        db5.e1.C(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hht), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new du0.g0(this, yVar), new du0.h0(yVar));
    }
}
