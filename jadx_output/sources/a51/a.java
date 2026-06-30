package a51;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1565b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wechat.aff.otel.a f1566c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1567d;

    public a(long j17, java.lang.String traceparent) {
        kotlin.jvm.internal.o.g(traceparent, "traceparent");
        this.f1564a = j17;
        this.f1565b = traceparent;
        this.f1566c = new com.tencent.wechat.aff.otel.a();
    }

    public static a51.a a(a51.a aVar, java.lang.String name, long j17, java.util.List attributes, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = java.lang.System.currentTimeMillis() * 1000;
        }
        if ((i17 & 4) != 0) {
            attributes = kz5.p0.f313996d;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(attributes, "attributes");
        com.tencent.wechat.aff.otel.d dVar = new com.tencent.wechat.aff.otel.d();
        dVar.f217423d = name;
        boolean[] zArr = dVar.f217426g;
        zArr[1] = true;
        dVar.f217424e = j17;
        zArr[2] = true;
        if (!attributes.isEmpty()) {
            dVar.f217425f.addAll(attributes);
            zArr[3] = true;
        }
        com.tencent.wechat.aff.otel.a aVar2 = aVar.f1566c;
        aVar2.f217409m.add(dVar);
        aVar2.f217412p[7] = true;
        return aVar;
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() * 1000;
        if (this.f1567d) {
            return;
        }
        long j17 = this.f1564a;
        if (j17 != 0) {
            this.f1567d = true;
            com.tencent.wechat.aff.otel.a aVar = this.f1566c;
            aVar.f217407h = currentTimeMillis;
            aVar.f217412p[5] = true;
            try {
                com.tencent.wechat.aff.otel.h.f217443b.a(j17, aVar);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
