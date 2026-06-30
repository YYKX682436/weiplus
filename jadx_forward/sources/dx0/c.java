package dx0;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dx0.g f325956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f325957b;

    public c(dx0.g gVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        this.f325956a = gVar;
        this.f325957b = c3971x241f78;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.l0
    public final void a(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var, int i17, com.p314xaae8f345.p457x3304c6.p479x4179489f.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m0Var, "<anonymous parameter 0>");
        android.graphics.Bitmap bitmap2 = n0Var != null ? n0Var.f130047a : null;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f325957b;
        dx0.g gVar = this.f325956a;
        if (bitmap2 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = gVar.f325971e;
            android.graphics.Bitmap bitmap3 = n0Var.f130047a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap3, "bitmap");
            int width = bitmap3.getWidth();
            int height = bitmap3.getHeight();
            if (height != 0 && width != 0) {
                android.util.Size size = gVar.f325968b;
                float f17 = width;
                float f18 = height;
                float max = java.lang.Math.max(size.getWidth() / f17, size.getHeight() / f18);
                if (max == 1.0f) {
                    bitmap = gVar.c(bitmap3);
                } else {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap3, (int) (f17 * max), (int) (f18 * max), false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
                    try {
                        bitmap = gVar.c(createScaledBitmap);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCoverThumbnailProvider", "getScaledCenterCropBitmap: ", e17);
                    }
                }
                concurrentHashMap.put(segmentID, new dx0.p(bitmap, n0Var.f130049c));
            }
            bitmap = null;
            concurrentHashMap.put(segmentID, new dx0.p(bitmap, n0Var.f130049c));
        }
        ex0.y yVar = (ex0.y) gVar.f325969c;
        yVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = yVar.f338718a;
        p3325xe03a0797.p3326xc267989b.l.d(a0Var.f338626c, a0Var.f338627d, null, new ex0.x(a0Var, segmentID, null), 2, null);
    }
}
