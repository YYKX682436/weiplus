package ky1;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f395026a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f395027b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f395028c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f395029d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395030e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f395031f;

    public c(long j17, java.lang.Object obj, java.lang.String str, java.util.Map map, java.util.List list, boolean z17, ky1.a aVar) {
        this.f395026a = j17;
        this.f395027b = obj;
        this.f395028c = str;
        if (map != null) {
            for (java.lang.String str2 : map.keySet()) {
                java.lang.Object obj2 = map.get(str2);
                if (obj2 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) this.f395029d).put(str2, obj2);
                }
            }
        }
        this.f395030e = list;
        this.f395031f = z17;
    }

    public static ky1.b a() {
        return new ky1.b(null);
    }

    /* renamed from: toString */
    public java.lang.String m144608x9616526c() {
        return "EventData{mTarget=" + this.f395027b + ", mTime='" + this.f395026a + "', mEventId='" + this.f395028c + "', mRouteRules='" + this.f395030e + "', mIsBringPageInfo='" + this.f395031f + "', mParams=" + this.f395029d + '}';
    }
}
