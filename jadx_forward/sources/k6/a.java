package k6;

/* loaded from: classes15.dex */
public class a implements p6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f386009b = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final p6.f f386010a;

    public a(android.content.Context context, int i17) {
        if (i17 == 0) {
            this.f386010a = new p6.d(context);
        } else if (i17 == 1) {
            this.f386010a = new p6.j(context);
        } else {
            if (i17 != 2) {
                return;
            }
            this.f386010a = new p6.h(context);
        }
    }

    public static k6.a b(android.content.Context context) {
        return p6.e.a(2) ? c(context, 2) : p6.e.a(1) ? c(context, 1) : c(context, 0);
    }

    public static k6.a c(android.content.Context context, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 26 && context != null && p6.e.a(i17)) {
            return new k6.a(context, i17);
        }
        return null;
    }
}
