package b46;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b46.b f99363a;

    static {
        b46.b bVar = b46.b.DONT_CACHE;
        f99363a = bVar;
        boolean z17 = true;
        if (!(!r46.i.f474040a)) {
            f99363a = bVar;
        } else if (f99363a == bVar) {
            try {
                java.lang.Class.forName("org.brotli.dec.BrotliInputStream");
            } catch (java.lang.Exception | java.lang.NoClassDefFoundError unused) {
                z17 = false;
            }
            f99363a = z17 ? b46.b.CACHED_AVAILABLE : b46.b.CACHED_UNAVAILABLE;
        }
    }
}
