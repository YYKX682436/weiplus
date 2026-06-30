package vz3;

/* loaded from: classes15.dex */
public final class t implements tz3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final vz3.t f523243a = new vz3.t();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f523244b = jz5.h.b(vz3.s.f523242d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f523245c = jz5.h.b(vz3.r.f523241d);

    @Override // tz3.a
    public void a() {
        n().a();
    }

    @Override // tz3.a
    public void b(int i17) {
        n().b(i17);
    }

    @Override // tz3.a
    public void c(int i17) {
        n().c(i17);
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
        n().d(i17, i18, i19, i27);
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 requestInfo, sz3.x0 serverRecognizeResult, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestInfo, "requestInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverRecognizeResult, "serverRecognizeResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsQueueDispatcher", "decodeFullImage localTrackId: " + i17);
        requestInfo.f495496e.f495693a = java.lang.System.currentTimeMillis();
        n().e(i17, requestInfo, serverRecognizeResult, rectF, bArr, i18, i19, cVar);
    }

    @Override // tz3.a
    public void f(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        n().f(data);
    }

    @Override // tz3.a
    public void g(long j17) {
        n().g(j17);
    }

    @Override // tz3.a
    public void h(tz3.c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        n().h(callback);
    }

    @Override // tz3.a
    public void i(byte[] yuvData, tz3.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvData, "yuvData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        n().i(yuvData, callback);
    }

    @Override // tz3.a
    /* renamed from: init */
    public void mo126481x316510() {
        n().mo126481x316510();
    }

    @Override // tz3.a
    public void j() {
        n().j();
    }

    @Override // tz3.a
    public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar, tz3.d dVar) {
        n().k(yVar, dVar);
    }

    @Override // tz3.a
    public void l(long j17) {
        n().l(j17);
    }

    @Override // tz3.a
    public void m() {
        n().m();
    }

    public final tz3.a n() {
        return (tz3.a) ((jz5.n) f523245c).mo141623x754a37bb();
    }

    @Override // tz3.a
    /* renamed from: release */
    public void mo126482x41012807() {
        n().mo126482x41012807();
    }
}
