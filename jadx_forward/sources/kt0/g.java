package kt0;

/* loaded from: classes14.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile kt0.g f393445c;

    /* renamed from: d, reason: collision with root package name */
    public static final lt0.a f393446d;

    /* renamed from: a, reason: collision with root package name */
    public kt0.f f393447a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f393448b = new java.util.concurrent.ConcurrentHashMap();

    static {
        lt0.a aVar = lt0.a.f402695c;
        f393446d = aVar;
        kt0.g b17 = b();
        kt0.e eVar = new kt0.e(aVar);
        b17.f393448b.put(aVar.f402697b, eVar);
        if (aVar.m146309xb2c87fbf(aVar)) {
            b17.f393447a = eVar;
        }
    }

    public static lt0.c a(lt0.a aVar) {
        if (aVar == null || aVar.m146309xb2c87fbf("")) {
            return null;
        }
        if (f393446d.m146309xb2c87fbf(aVar)) {
            return ((kt0.e) b().f393447a).f393442a;
        }
        b().getClass();
        return ((kt0.e) ((kt0.f) b().f393448b.get(aVar.f402697b))).f393442a;
    }

    public static kt0.g b() {
        if (f393445c == null) {
            synchronized (kt0.g.class) {
                if (f393445c == null) {
                    f393445c = new kt0.g();
                }
            }
        }
        return f393445c;
    }
}
