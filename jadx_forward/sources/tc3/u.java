package tc3;

/* loaded from: classes7.dex */
public final class u extends qc3.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f498783d;

    /* renamed from: e, reason: collision with root package name */
    public final qc3.c f498784e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f498785f;

    public u(java.lang.String instanceName, qc3.c client, yz5.p errorCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(client, "client");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCallback, "errorCallback");
        this.f498783d = instanceName;
        this.f498784e = client;
        this.f498785f = errorCallback;
    }

    @Override // qc3.c
    public void B8(int i17, int i18, int i19, int i27, int i28, int i29) {
        e(new tc3.l(this, i17, i18, i19, i27, i28, i29));
    }

    @Override // qc3.c
    public void Bi(int i17, float[] left, float[] top, float[] width, float[] height) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(top, "top");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(width, "width");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(height, "height");
        e(new tc3.k(this, i17, left, top, width, height));
    }

    @Override // qc3.c
    public void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        e(new tc3.h(this, i17, i18, i19, i27, i28, i29));
    }

    @Override // qc3.c
    public void Da(boolean z17) {
        e(new tc3.o(this, z17));
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        e(new tc3.p(this, i17, msg));
    }

    @Override // qc3.c
    public void K3(int i17) {
        e(new tc3.j(this, i17));
    }

    @Override // qc3.c
    public void Ke(java.lang.String logStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logStr, "logStr");
        e(new tc3.r(this, logStr));
    }

    @Override // qc3.c
    public void Oe() {
        try {
            new tc3.t(this).mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498785f.mo149xb9724478(stackTraceString, "heartbeat-onPing");
        }
    }

    @Override // qc3.c
    public void c(int i17, boolean z17) {
        e(new tc3.i(this, i17, z17));
    }

    public final void e(yz5.a aVar) {
        try {
            aVar.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498785f.mo149xb9724478(stackTraceString, "");
        }
    }

    @Override // qc3.c
    public void h(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        e(new tc3.q(this, envId, msg));
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String api, java.lang.String data, java.lang.String str) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        tc3.f fVar = new tc3.f(this, api, data, str);
        tc3.g gVar = new tc3.g(this, api);
        try {
            obj = fVar.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498785f.mo149xb9724478(stackTraceString, gVar.mo152xb9724478());
            obj = "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        }
        return (java.lang.String) obj;
    }

    @Override // qc3.c
    public void j6(java.lang.String api, java.lang.String data, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        tc3.d dVar = new tc3.d(this, api, data, str, i17);
        tc3.e eVar = new tc3.e(this, api);
        try {
            dVar.mo152xb9724478();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            this.f498785f.mo149xb9724478(stackTraceString, eVar.mo152xb9724478());
        }
    }

    @Override // qc3.c
    public void n() {
        e(new tc3.s(this));
    }

    @Override // qc3.c
    /* renamed from: onCreated */
    public void mo159828x8cf48009() {
        e(new tc3.m(this));
    }

    @Override // qc3.c
    /* renamed from: onDestroy */
    public void mo159829xac79a11b() {
        e(new tc3.n(this));
    }
}
