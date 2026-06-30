package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class r extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f218451a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f218452b;

    /* renamed from: c, reason: collision with root package name */
    public final zg0.o3 f218453c;

    public r(java.lang.ref.WeakReference activity, java.lang.ref.WeakReference control) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(control, "control");
        this.f218451a = activity;
        this.f218452b = control;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        this.f218453c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();
        android.app.Activity activity2 = (android.app.Activity) activity.get();
        if (activity2 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0 qa0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0.class);
            if (qa0Var == null || qa0Var.f217212d != null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWebClientUIC", "create chooser");
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            qa0Var.f217212d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        cf.o.a(message, "Finder.FinderWebChromeClient", false);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
        zg0.q2 q2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = (android.app.Activity) this.f218451a.get();
        if (activity == null || (q2Var = (zg0.q2) this.f218452b.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0) this.f218453c).g(activity, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z(), q2Var.i(), ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) q2Var).Q(), c01.z1.r(), origin, callback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        android.app.Activity activity = (android.app.Activity) this.f218451a.get();
        if (activity != null) {
            zg0.o3 o3Var = this.f218453c;
            zg0.q2 q2Var = (zg0.q2) this.f218452b.get();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0) o3Var).h(permissionRequest, activity, q2Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z() : null);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, android.webkit.ValueCallback valueCallback, com.p314xaae8f345.p3210x3857dc.r0 r0Var) {
        zg0.s2 s2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWebChromeClient", "showChooser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var);
        if (r0Var.c() != 0 && r0Var.c() != 1) {
            return false;
        }
        if (r0Var.b() != null) {
            java.lang.String[] b17 = r0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getAcceptTypes(...)");
            if (!(b17.length == 0)) {
                java.lang.String[] b18 = r0Var.b();
                java.lang.String str = r0Var.d() ? "true" : "false";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
                android.app.Activity activity = (android.app.Activity) this.f218451a.get();
                if (activity != null) {
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0 qa0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0.class);
                    if (qa0Var != null && (s2Var = qa0Var.f217212d) != null) {
                        zg0.q2 q2Var = (zg0.q2) this.f218452b.get();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n) s2Var).c(activity, q2Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).R : null, valueCallback, b18, str, r0Var.a(), r0Var.c());
                    }
                }
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        return true;
    }
}
