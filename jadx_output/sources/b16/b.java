package b16;

/* loaded from: classes16.dex */
public class b implements b16.d {

    /* renamed from: a, reason: collision with root package name */
    public final e16.g f17133a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f17134b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f17135c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f17136d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f17137e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f17138f;

    public b(e16.g jClass, yz5.l memberFilter) {
        kotlin.jvm.internal.o.g(jClass, "jClass");
        kotlin.jvm.internal.o.g(memberFilter, "memberFilter");
        this.f17133a = jClass;
        this.f17134b = memberFilter;
        b16.a aVar = new b16.a(this);
        this.f17135c = aVar;
        q26.n i17 = q26.h0.i(kz5.n0.J(((u06.x) jClass).e()), aVar);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            java.lang.Object next = hVar.next();
            n16.g d17 = ((u06.f0) ((e16.q) next)).d();
            java.lang.Object obj = linkedHashMap.get(d17);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(d17, obj);
            }
            ((java.util.List) obj).add(next);
        }
        this.f17136d = linkedHashMap;
        q26.n i18 = q26.h0.i(kz5.n0.J(((u06.x) this.f17133a).c()), this.f17134b);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        q26.h hVar2 = new q26.h((q26.i) i18);
        while (hVar2.hasNext()) {
            java.lang.Object next2 = hVar2.next();
            linkedHashMap2.put(((u06.f0) ((e16.n) next2)).d(), next2);
        }
        this.f17137e = linkedHashMap2;
        java.util.Collection g17 = ((u06.x) this.f17133a).g();
        yz5.l lVar = this.f17134b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : g17) {
            if (((java.lang.Boolean) lVar.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int d18 = kz5.b1.d(kz5.d0.q(arrayList, 10));
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d18 < 16 ? 16 : d18);
        for (java.lang.Object obj3 : arrayList) {
            linkedHashMap3.put(((u06.f0) ((e16.t) obj3)).d(), obj3);
        }
        this.f17138f = linkedHashMap3;
    }

    @Override // b16.d
    public java.util.Set a() {
        q26.n i17 = q26.h0.i(kz5.n0.J(((u06.x) this.f17133a).e()), this.f17135c);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            linkedHashSet.add(((u06.f0) ((e16.q) hVar.next())).d());
        }
        return linkedHashSet;
    }

    @Override // b16.d
    public java.util.Collection b(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) this.f17136d).get(name);
        return list != null ? list : kz5.p0.f313996d;
    }

    @Override // b16.d
    public e16.n c(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return (e16.n) ((java.util.LinkedHashMap) this.f17137e).get(name);
    }

    @Override // b16.d
    public java.util.Set d() {
        return ((java.util.LinkedHashMap) this.f17138f).keySet();
    }

    @Override // b16.d
    public e16.t e(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return (e16.t) ((java.util.LinkedHashMap) this.f17138f).get(name);
    }

    @Override // b16.d
    public java.util.Set f() {
        q26.n i17 = q26.h0.i(kz5.n0.J(((u06.x) this.f17133a).c()), this.f17134b);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            linkedHashSet.add(((u06.f0) ((e16.n) hVar.next())).d());
        }
        return linkedHashSet;
    }
}
