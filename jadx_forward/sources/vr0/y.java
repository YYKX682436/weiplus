package vr0;

/* loaded from: classes14.dex */
public final class y extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f521064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f521065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f521066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f521067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f521068f;

    public y(vr0.z zVar, long j17, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f521063a = zVar;
        this.f521064b = j17;
        this.f521065c = i17;
        this.f521066d = i18;
        this.f521067e = i19;
        this.f521068f = interfaceC29045xdcb5ca57;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onCaptureSuccess */
    public void mo4370x58601d9c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 image) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        as0.a aVar = as0.a.f94958a;
        vr0.z zVar = this.f521063a;
        int i17 = zVar.f492963d;
        int mo4175x755bd410 = image.mo4175x755bd410();
        int mo4171x1c4fb41d = image.mo4171x1c4fb41d();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = aVar.a(i17);
        if (a17 != null) {
            a17.f137109y = mo4175x755bd410;
            a17.f137110z = mo4171x1c4fb41d;
        }
        android.graphics.Rect mo4169xfa2ffe0a = image.mo4169xfa2ffe0a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo4169xfa2ffe0a, "getCropRect(...)");
        android.graphics.Bitmap E = !(zVar.f492974r != 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.E(image.m4645x7879e38a(), mo4169xfa2ffe0a.left, mo4169xfa2ffe0a.top, mo4169xfa2ffe0a.width(), mo4169xfa2ffe0a.height(), false) : image.m4645x7879e38a();
        int mo4209x2a7ffb93 = image.mo4173xcb10cdf3().mo4209x2a7ffb93();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePictureAsync from imageCapture cost:");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f521064b;
        sb6.append(currentTimeMillis - j17);
        sb6.append(" size:[");
        sb6.append(E.getWidth());
        sb6.append(' ');
        sb6.append(E.getHeight());
        sb6.append("] screen rotation:");
        int i18 = this.f521065c;
        sb6.append(i18);
        sb6.append(" imageDegree:");
        sb6.append(mo4209x2a7ffb93);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", sb6.toString());
        int i19 = this.f521066d;
        int i27 = this.f521067e;
        int i28 = mo4209x2a7ffb93 + i18;
        boolean z17 = zVar.f492970n.f537694c;
        zVar.getClass();
        android.graphics.Bitmap y17 = zVar.y(i19, i27, i28, E, !z17);
        image.close();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("takePictureAsync total cost:");
        sb7.append(currentTimeMillis2);
        sb7.append(" size:[");
        sb7.append(y17 != null ? java.lang.Integer.valueOf(y17.getWidth()) : null);
        sb7.append(' ');
        sb7.append(y17 != null ? java.lang.Integer.valueOf(y17.getHeight()) : null);
        sb7.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", sb7.toString());
        int i29 = zVar.f492963d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a18 = aVar.a(i29);
        if (a18 != null) {
            a18.f137105u = currentTimeMillis2;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a19 = aVar.a(i29);
        if (a19 != null) {
            a19.X = 1;
        }
        this.f521068f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(y17));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onError */
    public void mo4371xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        super.mo4371xaf8aa769(exception);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraXImpl", "takePictureAsync from imageCapture happen error:" + exception + " cost:" + (java.lang.System.currentTimeMillis() - this.f521064b));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(this.f521063a.f492963d);
        if (a17 != null) {
            a17.X = 1;
        }
        this.f521068f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
