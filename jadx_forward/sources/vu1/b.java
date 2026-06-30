package vu1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f521710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521711b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.ImageReader f521712c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f521713d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f521714e;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f521716g;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f521715f = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f521717h = new android.graphics.Paint();

    public b(int i17, int i18) {
        this.f521710a = i17;
        this.f521711b = i18;
    }

    public final void a() {
        android.graphics.Bitmap bitmap;
        synchronized (this.f521715f) {
            android.view.Surface surface = this.f521714e;
            if (surface != null && (bitmap = this.f521716g) != null) {
                try {
                    if (surface.isValid() && this.f521712c != null) {
                        android.graphics.Canvas lockCanvas = surface.lockCanvas(null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lockCanvas, "lockCanvas(...)");
                        lockCanvas.drawColor(-16777216);
                        lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f521717h);
                        surface.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastImageReader", "error happened " + e17.fillInStackTrace());
                }
            }
        }
    }
}
