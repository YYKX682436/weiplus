package a6;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f1709b;

    /* renamed from: a, reason: collision with root package name */
    public final a6.g f1710a;

    static {
        f1709b = android.os.Build.VERSION.SDK_INT >= 26 ? new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888, android.graphics.Bitmap.Config.RGBA_F16} : new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888};
    }

    public z(h6.k kVar) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f1710a = (i17 < 26 || a6.f.f1651a) ? new a6.h(false) : (i17 == 26 || i17 == 27) ? a6.m.f1667a : new a6.h(true);
    }

    public final c6.f a(c6.j request, java.lang.Throwable throwable) {
        android.graphics.drawable.Drawable c17;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(throwable, "throwable");
        boolean z17 = throwable instanceof c6.n;
        c6.c cVar = request.H;
        if (z17) {
            c17 = h6.h.c(request, request.F, request.E, cVar.f38781i);
        } else {
            c17 = h6.h.c(request, request.D, request.C, cVar.f38780h);
        }
        return new c6.f(c17, request, throwable);
    }

    public final boolean b(c6.j request, android.graphics.Bitmap.Config requestedConfig) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(requestedConfig, "requestedConfig");
        if (!h6.a.b(requestedConfig)) {
            return true;
        }
        if (!request.f38849u) {
            return false;
        }
        e6.b bVar = request.f38831c;
        if (bVar instanceof e6.c) {
            android.widget.ImageView imageView = ((coil.target.ImageViewTarget) ((e6.c) bVar)).f43914d;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(imageView) && !imageView.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }
}
