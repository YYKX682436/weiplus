package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class j extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268867c;

    /* renamed from: d, reason: collision with root package name */
    public int f268868d;

    /* renamed from: e, reason: collision with root package name */
    public final zg0.o3 f268869e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f268870f;

    public j(java.lang.ref.WeakReference activityWeakRef, java.lang.ref.WeakReference controllerWeakRef, java.lang.ref.WeakReference commWebViewWeakRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityWeakRef, "activityWeakRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controllerWeakRef, "controllerWeakRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commWebViewWeakRef, "commWebViewWeakRef");
        this.f268865a = activityWeakRef;
        this.f268866b = controllerWeakRef;
        this.f268867c = commWebViewWeakRef;
        ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
        this.f268869e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        cf.o.a(message, "MicroMsg.CommWebChromeClient", false);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        zg0.o3 o3Var = this.f268869e;
        android.app.Activity s17 = s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        java.lang.ref.WeakReference weakReference = this.f268866b;
        java.lang.Object obj = weakReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        java.lang.String Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) obj).Z();
        java.lang.Object obj2 = weakReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        java.lang.String i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) obj2).i();
        java.lang.Object obj3 = weakReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
        int Q = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) obj3).Q();
        android.app.Activity s18 = s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s18);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0) o3Var).g(s17, Z, i17, Q, s18.getIntent().getStringExtra("geta8key_username"), origin, callback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 view, java.lang.String url, java.lang.String message, com.p314xaae8f345.p3210x3857dc.z result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        c19762x487075a.f38859x6ac9171 = false;
        android.app.Activity s17 = s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        if (s17.isFinishing()) {
            result.a();
            return true;
        }
        int i17 = this.f268868d + 1;
        this.f268868d = i17;
        if (i17 > 2) {
            android.app.Activity s18 = s();
            android.app.Activity s19 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s19);
            java.lang.String string = s19.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao);
            android.app.Activity s27 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s27);
            this.f268870f = db5.e1.B(s18, message, "", string, s27.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a(url, this, result), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.b(c19762x487075a, result), com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
        } else {
            android.app.Activity s28 = s();
            android.app.Activity s29 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s29);
            this.f268870f = db5.e1.y(s28, message, "", s29.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c(c19762x487075a, result));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f268870f;
        if (j0Var == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        j0Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d(c19762x487075a, result));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = this.f268870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var2);
        j0Var2.setCanceledOnTouchOutside(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = this.f268870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var3);
        j0Var3.o(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 view, java.lang.String url, java.lang.String message, com.p314xaae8f345.p3210x3857dc.z result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        c19762x487075a.f38859x6ac9171 = false;
        android.app.Activity s17 = s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        if (s17.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm finish");
            result.a();
            return true;
        }
        int i17 = this.f268868d + 1;
        this.f268868d = i17;
        if (i17 > 2) {
            android.app.Activity s18 = s();
            android.app.Activity s19 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s19);
            java.lang.String string = s19.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao);
            android.app.Activity s27 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s27);
            this.f268870f = db5.e1.B(s18, message, "", string, s27.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e(url, this, result), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f(c19762x487075a, result, this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560282g4);
        } else {
            android.app.Activity s28 = s();
            android.app.Activity s29 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s29);
            java.lang.String string2 = s29.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            android.app.Activity s37 = s();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s37);
            this.f268870f = db5.e1.K(s28, false, message, "", string2, s37.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.g(c19762x487075a, result, this), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h(result, this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f268870f;
        if (j0Var == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        j0Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.i(this, c19762x487075a, result));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = this.f268870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var2);
        j0Var2.setCancelable(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = this.f268870f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var3);
        j0Var3.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 view, java.lang.String url, java.lang.String message, java.lang.String defaultValue, com.p314xaae8f345.p3210x3857dc.y result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        zg0.o3 o3Var = this.f268869e;
        android.app.Activity s17 = s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        java.lang.Object obj = this.f268866b.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0) o3Var).h(request, s17, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) obj).Z());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f268867c;
        if (weakReference != null && (o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1) weakReference.get()) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) o1Var).r(c27816xac2547f9, str);
        }
        java.lang.ref.WeakReference weakReference2 = this.f268866b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) weakReference2.get() : null;
        if (r0Var == null) {
            return;
        }
        r0Var.f263479p = str;
    }

    public final android.app.Activity s() {
        return (android.app.Activity) this.f268865a.get();
    }
}
