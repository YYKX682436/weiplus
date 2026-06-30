package jo5;

/* loaded from: classes14.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.l {

    /* renamed from: f, reason: collision with root package name */
    public static volatile android.content.Context f382483f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f382484a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final kz5.q f382485b = new kz5.q();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f382486c = jz5.h.b(jo5.g.f382476d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f382487d = jz5.h.b(new jo5.f(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f382488e = jz5.h.b(new jo5.e(this));

    public final jo5.c a(long j17) {
        int i17;
        if (!(j17 == 0) && (i17 = (int) (j17 - 1)) >= 0) {
            java.util.ArrayList arrayList = this.f382484a;
            if (i17 < arrayList.size()) {
                return (jo5.c) arrayList.get(i17);
            }
        }
        return null;
    }

    public final android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f382487d).mo141623x754a37bb();
    }

    public final void c(jo5.c cVar) {
        try {
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = cVar.f382470d;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession2 = cVar.f382470d;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.close();
            }
        } catch (java.lang.Exception unused2) {
        }
        cVar.f382470d = null;
    }
}
