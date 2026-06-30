package sf5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final sf5.e f489162a = new sf5.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f489163b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final sf5.b f489164c;

    static {
        jz5.h.b(sf5.a.f489161d);
        f489164c = new sf5.b();
    }

    public static final java.util.ArrayList a(sf5.e eVar) {
        java.util.ArrayList arrayList;
        eVar.getClass();
        java.util.ArrayList arrayList2 = f489163b;
        synchronized (arrayList2) {
            arrayList = arrayList2.isEmpty() ^ true ? new java.util.ArrayList(arrayList2) : null;
        }
        return arrayList;
    }
}
