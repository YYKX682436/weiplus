package kb1;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static volatile kb1.b f387748f = null;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f387749g = true;

    /* renamed from: a, reason: collision with root package name */
    public final int f387750a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f387751b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f387752c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f387753d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f387754e;

    public b(kb1.a aVar) {
        this.f387750a = aVar.f387743a;
        this.f387751b = aVar.f387744b;
        this.f387752c = aVar.f387745c;
        this.f387753d = aVar.f387746d;
        this.f387754e = aVar.f387747e;
    }

    public static synchronized kb1.b a() {
        kb1.b bVar;
        synchronized (kb1.b.class) {
            if (f387748f == null) {
                f387748f = new kb1.b(new kb1.a());
            }
            bVar = f387748f;
        }
        return bVar;
    }

    /* renamed from: toString */
    public java.lang.String m142333x9616526c() {
        return "BleConfig{interval=" + this.f387750a + ", allowDuplicatesKey=" + this.f387751b + ", actionTimeOutTime=33000, debug=false, mainThread=true, serial=true, mode='" + this.f387752c + "', actionDelayTime=10, scanWorkaround=" + this.f387754e + '}';
    }
}
