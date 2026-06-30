package qe;

/* loaded from: classes7.dex */
public class d1 {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2 f443468h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener f443469i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener f443470j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f443461a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f443462b = -1;

    /* renamed from: c, reason: collision with root package name */
    public uh1.a f443463c = null;

    /* renamed from: d, reason: collision with root package name */
    public javax.net.ssl.X509TrustManager f443464d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443465e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443466f = true;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f443467g = null;

    /* renamed from: k, reason: collision with root package name */
    public final qe.b1 f443471k = new qe.b1(this, new qe.x0(this));

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        java.lang.Boolean bool;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding");
        qe.c1 c1Var = (qe.c1) i95.n0.c(qe.c1.class);
        if (c1Var != null) {
            ((yc1.i0) c1Var).getClass();
            boolean z17 = true;
            if (1 < com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) {
                bool = java.lang.Boolean.FALSE;
            } else {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i().getString("appbrandgame_open_nativewss", "");
                bool = (string == null || !string.equalsIgnoreCase("close")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WcWssNativeSwitchDelegateImpl", "createWcWssBinding Command close");
                z17 = false;
            }
            this.f443465e = z17;
        }
        if (!this.f443465e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xSwitch false");
            return;
        }
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsruntime is null");
            return;
        }
        this.f443467g = java.lang.String.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsThreadHandler is null");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(f0Var);
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(lVar);
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f443466f = wi6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        qe.t0 t0Var = new qe.t0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y lifecycleOwner = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f443469i = new qe.g1(t0Var, lifecycleOwner);
        qe.v0 v0Var = new qe.v0(this, weakReference, weakReference2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y lifecycleOwner2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner2, "lifecycleOwner");
        this.f443470j = new qe.j1(v0Var, lifecycleOwner2);
        f0Var.k0(new qe.w0(this, tVar));
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding mContextId:%s", this.f443461a);
        if (!this.f443465e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding xSwitch false");
        } else if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding jsruntime is null");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f443471k);
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mContextId:%s", this.f443461a);
        if (!this.f443465e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss xSwitch false");
            return;
        }
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsruntime is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsThreadHandler is null");
            return;
        }
        com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener iWcWssReportListener = this.f443469i;
        if (iWcWssReportListener instanceof qe.g1) {
            qe.g1 g1Var = (qe.g1) iWcWssReportListener;
            p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = d0Var.mo50358x95c7fa5f();
            g1Var.getClass();
            if (mo50358x95c7fa5f != null) {
                d75.b.g(new qe.f1(mo50358x95c7fa5f, g1Var));
            }
        }
        com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener iWcWssWebSocketListener = this.f443470j;
        if (iWcWssWebSocketListener instanceof qe.j1) {
            qe.j1 j1Var = (qe.j1) iWcWssWebSocketListener;
            p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f2 = d0Var.mo50358x95c7fa5f();
            j1Var.getClass();
            if (mo50358x95c7fa5f2 != null) {
                d75.b.g(new qe.i1(mo50358x95c7fa5f2, j1Var));
            }
        }
        qe.c1 c1Var = (qe.c1) i95.n0.c(qe.c1.class);
        boolean z17 = false;
        if (c1Var != null) {
            ((yc1.i0) c1Var).getClass();
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wcwss_binding_close_when_suspend, 1) > 0) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss appId:%s, closeWcWssSocketsWhenSuspend:%b", d0Var.mo48798x74292566(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            d0Var.t3().N.a(new qe.z0(this, f0Var));
        }
        f0Var.k0(new qe.a1(this, d0Var));
    }
}
