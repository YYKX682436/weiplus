package b26;

/* loaded from: classes16.dex */
public final class u0 implements b26.j {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f17525a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.a f17526b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f17527c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f17528d;

    public u0(i16.r0 proto, k16.g nameResolver, k16.a metadataVersion, yz5.l classSource) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.o.g(classSource, "classSource");
        this.f17525a = nameResolver;
        this.f17526b = metadataVersion;
        this.f17527c = classSource;
        java.util.List list = proto.f287717m;
        kotlin.jvm.internal.o.f(list, "getClass_List(...)");
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(b26.t0.a(this.f17525a, ((i16.o) obj).f287643h), obj);
        }
        this.f17528d = linkedHashMap;
    }

    @Override // b26.j
    public b26.i a(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        i16.o oVar = (i16.o) ((java.util.LinkedHashMap) this.f17528d).get(classId);
        if (oVar == null) {
            return null;
        }
        return new b26.i(this.f17525a, oVar, this.f17526b, (o06.x1) this.f17527c.invoke(classId));
    }
}
