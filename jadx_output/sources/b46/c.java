package b46;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b46.b f17830a;

    static {
        b46.b bVar = b46.b.DONT_CACHE;
        f17830a = bVar;
        boolean z17 = true;
        if (!(!r46.i.f392507a)) {
            f17830a = bVar;
        } else if (f17830a == bVar) {
            try {
                java.lang.Class.forName("org.brotli.dec.BrotliInputStream");
            } catch (java.lang.Exception | java.lang.NoClassDefFoundError unused) {
                z17 = false;
            }
            f17830a = z17 ? b46.b.CACHED_AVAILABLE : b46.b.CACHED_UNAVAILABLE;
        }
    }
}
