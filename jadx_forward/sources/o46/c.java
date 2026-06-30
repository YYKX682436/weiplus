package o46;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f424586a = {40, -75, 47, -3};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f424587b = {42, 77, 24};

    /* renamed from: c, reason: collision with root package name */
    public static volatile o46.b f424588c;

    static {
        o46.b bVar = o46.b.DONT_CACHE;
        f424588c = bVar;
        boolean z17 = true;
        if (!(!r46.i.f474040a)) {
            f424588c = bVar;
        } else if (f424588c == bVar) {
            try {
                java.lang.Class.forName("com.github.luben.zstd.ZstdInputStream");
            } catch (java.lang.Exception | java.lang.NoClassDefFoundError unused) {
                z17 = false;
            }
            f424588c = z17 ? o46.b.CACHED_AVAILABLE : o46.b.CACHED_UNAVAILABLE;
        }
    }
}
