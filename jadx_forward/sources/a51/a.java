package a51;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f83097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f83098b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a f83099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f83100d;

    public a(long j17, java.lang.String traceparent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceparent, "traceparent");
        this.f83097a = j17;
        this.f83098b = traceparent;
        this.f83099c = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a();
    }

    public static a51.a a(a51.a aVar, java.lang.String name, long j17, java.util.List attributes, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = java.lang.System.currentTimeMillis() * 1000;
        }
        if ((i17 & 4) != 0) {
            attributes = kz5.p0.f395529d;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributes, "attributes");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.d dVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.d();
        dVar.f298956d = name;
        boolean[] zArr = dVar.f298959g;
        zArr[1] = true;
        dVar.f298957e = j17;
        zArr[2] = true;
        if (!attributes.isEmpty()) {
            dVar.f298958f.addAll(attributes);
            zArr[3] = true;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a aVar2 = aVar.f83099c;
        aVar2.f298942m.add(dVar);
        aVar2.f298945p[7] = true;
        return aVar;
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() * 1000;
        if (this.f83100d) {
            return;
        }
        long j17 = this.f83097a;
        if (j17 != 0) {
            this.f83100d = true;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a aVar = this.f83099c;
            aVar.f298940h = currentTimeMillis;
            aVar.f298945p[5] = true;
            try {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.h.f298976b.a(j17, aVar);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
