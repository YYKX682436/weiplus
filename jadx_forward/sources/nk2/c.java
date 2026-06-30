package nk2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nk2.c f419493a = new nk2.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f419494b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f419495c;

    static {
        android.content.Context applicationContext;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null || (applicationContext = context.getApplicationContext()) == null || !(applicationContext instanceof android.app.Application)) {
            return;
        }
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new nk2.b());
    }

    public final void a() {
        f419495c = false;
        f419494b = new java.util.ArrayList();
    }
}
