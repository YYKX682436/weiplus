package qt5;

/* loaded from: classes12.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static qt5.f0 f448218c;

    /* renamed from: a, reason: collision with root package name */
    public final rt5.a f448219a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f448220b;

    public f0() {
        rt5.a aVar = rt5.c.f481079a;
        this.f448219a = aVar == null ? new rt5.b() : aVar;
        this.f448220b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static qt5.f0 a() {
        if (f448218c == null) {
            synchronized (qt5.f0.class) {
                if (f448218c == null) {
                    f448218c = new qt5.f0();
                }
            }
        }
        return f448218c;
    }
}
