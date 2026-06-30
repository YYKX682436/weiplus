package com.tencent.mm.modelvoiceaddr;

/* loaded from: classes10.dex */
public class SceneVoiceInputAddrProxy extends k55.b implements z21.e {

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy f71747i;

    /* renamed from: f, reason: collision with root package name */
    public z21.e f71748f;

    /* renamed from: g, reason: collision with root package name */
    public z21.b f71749g;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f71750h;

    public SceneVoiceInputAddrProxy(k55.k kVar) {
        super(kVar);
        if (kVar == null) {
            return;
        }
        this.f71750h = kVar;
        kVar.a(new z21.x(this));
    }

    public static void create(k55.k kVar) {
        f71747i = new com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy(kVar);
    }

    public static com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy getInstance() {
        if (f71747i == null) {
            create(new k55.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        return f71747i;
    }

    @Override // z21.e
    @k55.l
    public void cancel(boolean z17) {
        REMOTE_CALL("cancelMM", java.lang.Boolean.valueOf(z17));
    }

    @k55.m
    public void cancelMM(boolean z17) {
        if (getInstance().f71748f != null) {
            ((z21.w) getInstance().f71748f).cancel(z17);
        }
    }

    public void connect(java.lang.Runnable runnable) {
        k55.k kVar = this.f71750h;
        if (kVar == null) {
            return;
        }
        kVar.a(runnable);
    }

    @Override // z21.e
    @k55.l
    public int getMaxAmplitudeRate() {
        java.lang.Integer num = (java.lang.Integer) REMOTE_CALL("getMaxAmplitudeRateMM", new java.lang.Object[0]);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @k55.m
    public int getMaxAmplitudeRateMM() {
        if (getInstance().f71748f != null) {
            return ((z21.w) getInstance().f71748f).getMaxAmplitudeRate();
        }
        return 0;
    }

    @Override // z21.e
    public void init(int i17, int i18, z21.b bVar) {
        getInstance().f71749g = bVar;
        REMOTE_CALL("initMM", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @k55.m
    public void initMM(int i17, int i18) {
        getInstance().f71748f = new z21.w(i17, i18, new z21.y(this));
    }

    public boolean isConnected() {
        k55.k kVar = this.f71750h;
        if (kVar == null) {
            return false;
        }
        return kVar.c();
    }

    @k55.l
    public void onErrorCli(int i17, int i18, int i19, long j17) {
        if (getInstance().f71749g != null) {
            getInstance().f71749g.e(i17, i18, i19, j17);
        }
    }

    @k55.l
    public void onRecognizeFinishCli() {
        if (getInstance().f71749g != null) {
            getInstance().f71749g.d(0);
        }
    }

    @k55.l
    public void onRecordFinCli() {
        if (getInstance().f71749g != null) {
            getInstance().f71749g.g();
        }
    }

    @k55.l
    public void onResCli(java.lang.String[] strArr, java.util.List<java.lang.String> list) {
        if (getInstance().f71749g != null) {
            getInstance().f71749g.a(strArr, list);
        }
    }

    @k55.l
    public void setResultContinue() {
        REMOTE_CALL("setResultContinueMM", new java.lang.Object[0]);
    }

    @k55.m
    public void setResultContinueMM() {
        z21.j0 j0Var;
        if (getInstance().f71748f != null) {
            z21.w wVar = (z21.w) getInstance().f71748f;
            if (!wVar.C || (j0Var = wVar.A) == null) {
                return;
            }
            j0Var.f469640w = true;
        }
    }

    @Override // z21.e
    @k55.l
    public void setVadSAndNRation(float f17) {
        REMOTE_CALL("setVadSAndNRationMM", java.lang.Float.valueOf(f17));
    }

    @k55.m
    public void setVadSAndNRationMM(float f17) {
        if (getInstance().f71748f != null) {
            getInstance().f71748f.getClass();
        }
    }

    public void setupWebsearch(boolean z17, boolean z18, z21.d dVar) {
    }

    @Override // z21.e
    @k55.l
    public void start() {
        REMOTE_CALL("startMM", new java.lang.Object[0]);
    }

    @k55.m
    public void startMM() {
        if (getInstance().f71748f != null) {
            ((z21.w) getInstance().f71748f).start();
        }
    }

    @Override // z21.e
    @k55.l
    public void stop(boolean z17) {
        REMOTE_CALL("stopMM", java.lang.Boolean.valueOf(z17));
    }

    @k55.m
    public void stopMM(boolean z17) {
        if (getInstance().f71748f != null) {
            ((z21.w) getInstance().f71748f).stop(z17);
        }
    }

    @Override // z21.e
    public void start(java.lang.String str) {
        start();
    }

    @Override // z21.e
    public void init(boolean z17, boolean z18, int i17, int i18, z21.b bVar) {
        getInstance().f71749g = bVar;
        REMOTE_CALL("initMM", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
