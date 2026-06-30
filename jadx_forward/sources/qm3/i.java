package qm3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final kp4.s0 f446317a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f446318b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f446319c;

    /* renamed from: d, reason: collision with root package name */
    public final qm3.c f446320d;

    public i(kp4.s0 thumbFetcherFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFetcherFactory, "thumbFetcherFactory");
        this.f446317a = thumbFetcherFactory;
        this.f446318b = new java.util.HashMap();
        this.f446319c = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f446320d = new qm3.c(this);
    }

    public final qm3.a a(kp4.a aVar) {
        java.util.HashMap hashMap = this.f446318b;
        java.lang.Object obj = hashMap.get(aVar);
        if (obj == null) {
            obj = new qm3.a(null, null, null, null, null, null, 63, null);
            hashMap.put(aVar, obj);
        }
        return (qm3.a) obj;
    }
}
