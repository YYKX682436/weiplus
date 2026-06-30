package ep5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f337306a = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337307b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337308c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f337309d;

    public final void a(java.lang.String tag, boolean z17) {
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f337307b;
        java.lang.Object obj = concurrentHashMap.get(tag);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new ep5.a(tag)))) != null) {
            obj = putIfAbsent;
        }
        ep5.a aVar = (ep5.a) obj;
        if (aVar.f337301e == 0) {
            aVar.f337301e = java.lang.System.currentTimeMillis();
        }
        if (!z17) {
            aVar.f337299c++;
        } else {
            aVar.f337298b++;
            aVar.f337300d = java.lang.System.currentTimeMillis();
        }
    }
}
