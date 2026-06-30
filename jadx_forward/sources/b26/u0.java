package b26;

/* loaded from: classes16.dex */
public final class u0 implements b26.j {

    /* renamed from: a, reason: collision with root package name */
    public final k16.g f99058a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.a f99059b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f99060c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f99061d;

    public u0(i16.r0 proto, k16.g nameResolver, k16.a metadataVersion, yz5.l classSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classSource, "classSource");
        this.f99058a = nameResolver;
        this.f99059b = metadataVersion;
        this.f99060c = classSource;
        java.util.List list = proto.f369250m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getClass_List(...)");
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(b26.t0.a(this.f99058a, ((i16.o) obj).f369176h), obj);
        }
        this.f99061d = linkedHashMap;
    }

    @Override // b26.j
    public b26.i a(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        i16.o oVar = (i16.o) ((java.util.LinkedHashMap) this.f99061d).get(classId);
        if (oVar == null) {
            return null;
        }
        return new b26.i(this.f99058a, oVar, this.f99059b, (o06.x1) this.f99060c.mo146xb9724478(classId));
    }
}
