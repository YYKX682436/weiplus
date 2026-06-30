package com.p314xaae8f345.mm.p964x2822171a;

/* renamed from: com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy */
/* loaded from: classes10.dex */
public class BinderC11153x6a3b619 extends k55.b implements z21.e {

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619 f153280i;

    /* renamed from: f, reason: collision with root package name */
    public z21.e f153281f;

    /* renamed from: g, reason: collision with root package name */
    public z21.b f153282g;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f153283h;

    public BinderC11153x6a3b619(k55.k kVar) {
        super(kVar);
        if (kVar == null) {
            return;
        }
        this.f153283h = kVar;
        kVar.a(new z21.x(this));
    }

    /* renamed from: create */
    public static void m48276xaf65a0fc(k55.k kVar) {
        f153280i = new com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619(kVar);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619 m48277x9cf0d20b() {
        if (f153280i == null) {
            m48276xaf65a0fc(new k55.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        }
        return f153280i;
    }

    @Override // z21.e
    @k55.l
    /* renamed from: cancel */
    public void mo48278xae7a2e7a(boolean z17) {
        m142014x6c2fab7("cancelMM", java.lang.Boolean.valueOf(z17));
    }

    @k55.m
    /* renamed from: cancelMM */
    public void m48279xf8a8819a(boolean z17) {
        if (m48277x9cf0d20b().f153281f != null) {
            ((z21.w) m48277x9cf0d20b().f153281f).mo48278xae7a2e7a(z17);
        }
    }

    /* renamed from: connect */
    public void m48280x38b478ea(java.lang.Runnable runnable) {
        k55.k kVar = this.f153283h;
        if (kVar == null) {
            return;
        }
        kVar.a(runnable);
    }

    @Override // z21.e
    @k55.l
    /* renamed from: getMaxAmplitudeRate */
    public int mo48281x67ad3875() {
        java.lang.Integer num = (java.lang.Integer) m142014x6c2fab7("getMaxAmplitudeRateMM", new java.lang.Object[0]);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @k55.m
    /* renamed from: getMaxAmplitudeRateMM */
    public int m48282x3140f8d5() {
        if (m48277x9cf0d20b().f153281f != null) {
            return ((z21.w) m48277x9cf0d20b().f153281f).mo48281x67ad3875();
        }
        return 0;
    }

    @Override // z21.e
    /* renamed from: init */
    public void mo48283x316510(int i17, int i18, z21.b bVar) {
        m48277x9cf0d20b().f153282g = bVar;
        m142014x6c2fab7("initMM", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @k55.m
    /* renamed from: initMM */
    public void m48285xb96c6ab0(int i17, int i18) {
        m48277x9cf0d20b().f153281f = new z21.w(i17, i18, new z21.y(this));
    }

    /* renamed from: isConnected */
    public boolean m48286x23b734ff() {
        k55.k kVar = this.f153283h;
        if (kVar == null) {
            return false;
        }
        return kVar.c();
    }

    @k55.l
    /* renamed from: onErrorCli */
    public void m48287xf850bcf7(int i17, int i18, int i19, long j17) {
        if (m48277x9cf0d20b().f153282g != null) {
            m48277x9cf0d20b().f153282g.e(i17, i18, i19, j17);
        }
    }

    @k55.l
    /* renamed from: onRecognizeFinishCli */
    public void m48288x3eba56de() {
        if (m48277x9cf0d20b().f153282g != null) {
            m48277x9cf0d20b().f153282g.d(0);
        }
    }

    @k55.l
    /* renamed from: onRecordFinCli */
    public void m48289xcc4ea045() {
        if (m48277x9cf0d20b().f153282g != null) {
            m48277x9cf0d20b().f153282g.g();
        }
    }

    @k55.l
    /* renamed from: onResCli */
    public void m48290x5741e31f(java.lang.String[] strArr, java.util.List<java.lang.String> list) {
        if (m48277x9cf0d20b().f153282g != null) {
            m48277x9cf0d20b().f153282g.a(strArr, list);
        }
    }

    @k55.l
    /* renamed from: setResultContinue */
    public void m48291x66020e6() {
        m142014x6c2fab7("setResultContinueMM", new java.lang.Object[0]);
    }

    @k55.m
    /* renamed from: setResultContinueMM */
    public void m48292xeedb8906() {
        z21.j0 j0Var;
        if (m48277x9cf0d20b().f153281f != null) {
            z21.w wVar = (z21.w) m48277x9cf0d20b().f153281f;
            if (!wVar.C || (j0Var = wVar.A) == null) {
                return;
            }
            j0Var.f551173w = true;
        }
    }

    @Override // z21.e
    @k55.l
    /* renamed from: setVadSAndNRation */
    public void mo48293x799cc6f6(float f17) {
        m142014x6c2fab7("setVadSAndNRationMM", java.lang.Float.valueOf(f17));
    }

    @k55.m
    /* renamed from: setVadSAndNRationMM */
    public void m48294x8586eb16(float f17) {
        if (m48277x9cf0d20b().f153281f != null) {
            m48277x9cf0d20b().f153281f.getClass();
        }
    }

    /* renamed from: setupWebsearch */
    public void m48295x62aec3ff(boolean z17, boolean z18, z21.d dVar) {
    }

    @Override // z21.e
    @k55.l
    /* renamed from: start */
    public void mo48296x68ac462() {
        m142014x6c2fab7("startMM", new java.lang.Object[0]);
    }

    @k55.m
    /* renamed from: startMM */
    public void m48298x8eeb3d82() {
        if (m48277x9cf0d20b().f153281f != null) {
            ((z21.w) m48277x9cf0d20b().f153281f).mo48296x68ac462();
        }
    }

    @Override // z21.e
    @k55.l
    /* renamed from: stop */
    public void mo48299x360802(boolean z17) {
        m142014x6c2fab7("stopMM", java.lang.Boolean.valueOf(z17));
    }

    @k55.m
    /* renamed from: stopMM */
    public void m48300xcad41922(boolean z17) {
        if (m48277x9cf0d20b().f153281f != null) {
            ((z21.w) m48277x9cf0d20b().f153281f).mo48299x360802(z17);
        }
    }

    @Override // z21.e
    /* renamed from: start */
    public void mo48297x68ac462(java.lang.String str) {
        mo48296x68ac462();
    }

    @Override // z21.e
    /* renamed from: init */
    public void mo48284x316510(boolean z17, boolean z18, int i17, int i18, z21.b bVar) {
        m48277x9cf0d20b().f153282g = bVar;
        m142014x6c2fab7("initMM", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
