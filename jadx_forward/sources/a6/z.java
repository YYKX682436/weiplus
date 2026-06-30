package a6;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f83242b;

    /* renamed from: a, reason: collision with root package name */
    public final a6.g f83243a;

    static {
        f83242b = android.os.Build.VERSION.SDK_INT >= 26 ? new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888, android.graphics.Bitmap.Config.RGBA_F16} : new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888};
    }

    public z(h6.k kVar) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f83243a = (i17 < 26 || a6.f.f83184a) ? new a6.h(false) : (i17 == 26 || i17 == 27) ? a6.m.f83200a : new a6.h(true);
    }

    public final c6.f a(c6.j request, java.lang.Throwable throwable) {
        android.graphics.drawable.Drawable c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        boolean z17 = throwable instanceof c6.n;
        c6.c cVar = request.H;
        if (z17) {
            c17 = h6.h.c(request, request.F, request.E, cVar.f120314i);
        } else {
            c17 = h6.h.c(request, request.D, request.C, cVar.f120313h);
        }
        return new c6.f(c17, request, throwable);
    }

    public final boolean b(c6.j request, android.graphics.Bitmap.Config requestedConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestedConfig, "requestedConfig");
        if (!h6.a.b(requestedConfig)) {
            return true;
        }
        if (!request.f120382u) {
            return false;
        }
        e6.b bVar = request.f120364c;
        if (bVar instanceof e6.c) {
            android.widget.ImageView imageView = ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) ((e6.c) bVar)).f125447d;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(imageView) && !imageView.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }
}
