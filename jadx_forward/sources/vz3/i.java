package vz3;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f523217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.q f523218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar, vz3.q qVar) {
        super(0);
        this.f523217d = lVar;
        this.f523218e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean bool;
        boolean z17;
        vz3.h hVar = new vz3.h(this.f523217d, this.f523218e);
        java.lang.Boolean bool2 = et5.a.f338204b;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanSoLoader", "loadFFESo loaded success already");
            hVar.mo146xb9724478(bool3);
        } else {
            try {
                ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
                fp.d0.n("XNet");
                fp.d0.n("opencv_world");
                fp.d0.n("QBar");
                boolean wi6 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("ffengine");
                boolean wi7 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("focusEngineJni");
                if (wi6 && wi7) {
                    hVar.mo146xb9724478(bool3);
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffScanSoLoader", "loadFFESoSync failed, loadFFE: " + wi6 + ", loadJNI: " + wi7);
                    hVar.mo146xb9724478(java.lang.Boolean.FALSE);
                    z17 = false;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AffScanSoLoader", th6, "loadFFESo exception", new java.lang.Object[0]);
                java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                hVar.mo146xb9724478(bool4);
                bool = bool4;
            }
            et5.a.f338204b = bool;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanSoLoader", "loadFFESo ffeSoLoaded: " + et5.a.f338204b);
        }
        return jz5.f0.f384359a;
    }
}
