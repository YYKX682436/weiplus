package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@db5.a(m123858x6ac9171 = 19)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSearchUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSearchUI */
/* loaded from: classes15.dex */
public final class ActivityC16946x48bce742 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f236525h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f236526e = jz5.h.a(jz5.i.f384364f, new qs3.c1(this, com.p314xaae8f345.mm.R.id.lhe));

    /* renamed from: f, reason: collision with root package name */
    public boolean f236527f = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f236528g = 30764;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 O6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) this.f236526e.mo141623x754a37bb();
    }

    public final void P6() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308693h, new qs3.u(this))) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6156x9c8a2ad5 c6156x9c8a2ad5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6156x9c8a2ad5();
        c6156x9c8a2ad5.f136419g.getClass();
        c6156x9c8a2ad5.e();
        ps3.n.f439646e = 0;
        ps3.n.f439645d = 0L;
        ps3.n.f439645d = java.lang.System.currentTimeMillis();
        ps3.n.f439647f = 0;
        ps3.n.f439644c = 0L;
        ps3.n.f439642a = 0;
        ps3.n.f439643b = 0L;
        ps3.n.f439644c = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(759L, 0L, 1L, false);
        if (O6().getRadarStatus() == ps3.r.f439653d || O6().getRadarStatus() == ps3.r.f439654e) {
            ps3.w wVar = O6().f236576o;
            if (wVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
                throw null;
            }
            i11.e eVar = wVar.f439665e;
            if (eVar != null) {
                ((i11.h) eVar).k(wVar.f439678u, true);
            }
            ps3.w wVar2 = O6().f236576o;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
                throw null;
            }
            wVar2.f();
            O6().p();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(3, 10);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        return (systemService == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("layout_inflater", name)) ? systemService : com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f236528g) {
            if (intent == null) {
                this.f236527f = true;
                finish();
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                this.f236527f = true;
                finish();
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                this.f236527f = false;
            }
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | mc1.c.f72820x366c91de);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.cbw);
        getWindow().getDecorView().setBackgroundColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        getWindow().setStatusBarColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        if (i17 >= 26 && !com.p314xaae8f345.mm.ui.ga.q()) {
            getWindow().setNavigationBarColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        O6().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 O6 = O6();
        ps3.m mVar = O6.f236577p;
        mVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(mVar);
        mVar.f439639h.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.b("addcontact", mVar.f439640i, true);
        ps3.w wVar = O6.f236576o;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
            throw null;
        }
        gm0.j1.d().a(425, wVar);
        gm0.j1.d().a(602, wVar);
        java.lang.Object l17 = gm0.j1.u().c().l(229377, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        gm0.j1.u().c().w(229377, java.lang.Integer.valueOf(((java.lang.Integer) l17).intValue() + 1));
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        O6().h();
        super.onDestroy();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean onKeyDown = O6().onKeyDown(i17, event);
        return onKeyDown ? onKeyDown : super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6156x9c8a2ad5 c6156x9c8a2ad5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6156x9c8a2ad5();
        c6156x9c8a2ad5.f136419g.getClass();
        c6156x9c8a2ad5.e();
        if (ps3.n.f439645d != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - ps3.n.f439645d;
            if (!(currentTimeMillis <= ((long) 500))) {
                int i17 = ps3.n.f439646e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String format = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                g0Var.mo68478xbd3cda5f(10679, format);
                ps3.n.f439642a++;
                ps3.n.f439643b += currentTimeMillis;
                ps3.n.f439645d = 0L;
            }
        }
        if (ps3.n.f439644c != 0) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - ps3.n.f439644c;
            int i18 = ps3.n.f439642a;
            float f17 = 1000;
            float f18 = (((float) ps3.n.f439643b) * 1.0f) / f17;
            int i19 = ps3.n.f439647f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String format2 = java.lang.String.format("%d,%d,%s,%d,%s", java.util.Arrays.copyOf(new java.lang.Object[]{1, java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf((((float) currentTimeMillis2) * 1.0f) / f17)}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            g0Var2.mo68478xbd3cda5f(10676, format2);
        }
        if (O6().getRadarStatus() == ps3.r.f439653d || O6().getRadarStatus() == ps3.r.f439654e) {
            ps3.w wVar = O6().f236576o;
            if (wVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
                throw null;
            }
            wVar.h();
            ps3.w wVar2 = O6().f236576o;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
                throw null;
            }
            i11.e eVar = wVar2.f439665e;
            if (eVar != null) {
                ((i11.h) eVar).m(wVar2.f439678u);
            }
            O6().q();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (grantResults.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 64) {
            if (grantResults[0] == 0) {
                P6();
            } else {
                this.f236527f = false;
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new qs3.s(this), new qs3.t(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f236527f) {
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((java.lang.Boolean) m17).booleanValue()) {
                        c71.b.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()), this.f236528g, true);
                        return;
                    } else {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                        return;
                    }
                }
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqv);
                ((sb0.f) jVar).getClass();
                boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, string);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarSearchUI", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    return;
                }
            }
            P6();
        }
    }
}
