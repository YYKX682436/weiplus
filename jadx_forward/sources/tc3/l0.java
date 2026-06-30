package tc3;

/* loaded from: classes7.dex */
public final class l0 implements qc3.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f498764d;

    /* renamed from: e, reason: collision with root package name */
    public final qc3.f f498765e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f498766f;

    public l0(java.lang.String instanceName, qc3.f service, yz5.p errorCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCallback, "errorCallback");
        this.f498764d = instanceName;
        this.f498765e = service;
        this.f498766f = errorCallback;
    }

    @Override // qc3.f
    public void D1() {
        d(new tc3.k0(this));
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        d(new tc3.y(this, i17, result));
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerIds, "pointerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "y");
        d(new tc3.b0(this, i17, i18, i19, j17, pointerIds, x17, y17));
    }

    @Override // qc3.f
    public void Oc(int i17) {
        d(new tc3.x(this, i17));
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f498765e.asBinder();
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        d(new tc3.h0(this, i17, i18, i19));
    }

    public final void d(yz5.a aVar) {
        try {
            aVar.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498766f.mo149xb9724478(stackTraceString, "");
        }
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        d(new tc3.z(this, i17, result));
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        d(new tc3.f0(this, i17, surface, i18, i19));
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        tc3.d0 d0Var = new tc3.d0(this, event, data);
        tc3.e0 e0Var = new tc3.e0(this, event, data);
        try {
            d0Var.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498766f.mo149xb9724478(stackTraceString, e0Var.mo152xb9724478());
        }
    }

    @Override // qc3.f
    /* renamed from: setMute */
    public void mo159830x764d819b(boolean z17) {
        d(new tc3.j0(this, z17));
    }

    @Override // qc3.f
    public void uc() {
        d(new tc3.i0(this));
    }

    @Override // qc3.f
    public void w3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        d(new tc3.c0(this, config));
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        tc3.v vVar = new tc3.v(this, script, i17);
        tc3.w wVar = new tc3.w(this, script);
        try {
            vVar.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498766f.mo149xb9724478(stackTraceString, wVar.mo152xb9724478());
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        d(new tc3.g0(this, i17));
    }

    @Override // qc3.f
    public void z3() {
        d(new tc3.a0(this));
    }
}
