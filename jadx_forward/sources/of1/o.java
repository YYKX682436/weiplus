package of1;

/* loaded from: classes7.dex */
public final class o implements cw4.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f426513a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o f426514b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 webViewController, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewController, "webViewController");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f426513a = webViewController;
        this.f426514b = view;
    }

    @Override // cw4.n
    public void a(cw4.c0 c0Var, cw4.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.HTMLViewUIStyleDelegate", "switchTransHelpEntry btnAction:" + c0Var + " btnStatus:" + d0Var);
    }

    @Override // cw4.n
    public void b(java.lang.String str, java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.HTMLViewUIStyleDelegate", "dispatchEvent event:" + str);
        this.f426513a.g0().o(str, values);
    }

    @Override // cw4.n
    public java.lang.Boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f426513a;
        return java.lang.Boolean.valueOf(e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f263476n0)));
    }

    @Override // cw4.n
    public void d(cw4.q0 q0Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.HTMLViewUIStyleDelegate", "setTransTipsBarText status:" + q0Var + " brandWord:" + str);
    }

    @Override // cw4.n
    public void e(cw4.n0 action, cw4.o0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.HTMLViewUIStyleDelegate", "report action:" + action + " scene:" + scene);
    }

    @Override // cw4.n
    public java.lang.Boolean f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.HTMLViewUIStyleDelegate", "isOptionMenuShow menuID:" + i17);
        return java.lang.Boolean.TRUE;
    }

    @Override // cw4.n
    /* renamed from: getContext */
    public android.content.Context mo122967x76847179() {
        return ((of1.w1) this.f426514b).m151218x3af91936();
    }

    @Override // cw4.n
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo122968x95c7fa5f() {
        return ((of1.w1) this.f426514b).m151229x95c7fa5f();
    }

    @Override // cw4.n
    /* renamed from: getWebView */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 mo122969x86b9ebe3() {
        return ((of1.w1) this.f426514b).mo51534x86b9ebe3();
    }
}
