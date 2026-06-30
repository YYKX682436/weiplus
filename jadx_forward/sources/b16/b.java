package b16;

/* loaded from: classes16.dex */
public class b implements b16.d {

    /* renamed from: a, reason: collision with root package name */
    public final e16.g f98666a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f98667b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f98668c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f98669d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f98670e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f98671f;

    public b(e16.g jClass, yz5.l memberFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberFilter, "memberFilter");
        this.f98666a = jClass;
        this.f98667b = memberFilter;
        b16.a aVar = new b16.a(this);
        this.f98668c = aVar;
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
        this.f98669d = linkedHashMap;
        q26.n i18 = q26.h0.i(kz5.n0.J(((u06.x) this.f98666a).c()), this.f98667b);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        q26.h hVar2 = new q26.h((q26.i) i18);
        while (hVar2.hasNext()) {
            java.lang.Object next2 = hVar2.next();
            linkedHashMap2.put(((u06.f0) ((e16.n) next2)).d(), next2);
        }
        this.f98670e = linkedHashMap2;
        java.util.Collection g17 = ((u06.x) this.f98666a).g();
        yz5.l lVar = this.f98667b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : g17) {
            if (((java.lang.Boolean) lVar.mo146xb9724478(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int d18 = kz5.b1.d(kz5.d0.q(arrayList, 10));
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d18 < 16 ? 16 : d18);
        for (java.lang.Object obj3 : arrayList) {
            linkedHashMap3.put(((u06.f0) ((e16.t) obj3)).d(), obj3);
        }
        this.f98671f = linkedHashMap3;
    }

    @Override // b16.d
    public java.util.Set a() {
        q26.n i17 = q26.h0.i(kz5.n0.J(((u06.x) this.f98666a).e()), this.f98668c);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            linkedHashSet.add(((u06.f0) ((e16.q) hVar.next())).d());
        }
        return linkedHashSet;
    }

    @Override // b16.d
    public java.util.Collection b(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) this.f98669d).get(name);
        return list != null ? list : kz5.p0.f395529d;
    }

    @Override // b16.d
    public e16.n c(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return (e16.n) ((java.util.LinkedHashMap) this.f98670e).get(name);
    }

    @Override // b16.d
    public java.util.Set d() {
        return ((java.util.LinkedHashMap) this.f98671f).keySet();
    }

    @Override // b16.d
    public e16.t e(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return (e16.t) ((java.util.LinkedHashMap) this.f98671f).get(name);
    }

    @Override // b16.d
    public java.util.Set f() {
        q26.n i17 = q26.h0.i(kz5.n0.J(((u06.x) this.f98666a).c()), this.f98667b);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            linkedHashSet.add(((u06.f0) ((e16.n) hVar.next())).d());
        }
        return linkedHashSet;
    }
}
