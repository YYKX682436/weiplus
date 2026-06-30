package d26;

/* loaded from: classes16.dex */
public final class i0 implements d26.b0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f307535j = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d26.i0.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d26.i0.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f307536a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f307537b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f307538c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.v f307539d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.v f307540e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.w f307541f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f307542g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f307543h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d26.l0 f307544i;

    public i0(d26.l0 l0Var, java.util.List functionList, java.util.List propertyList, java.util.List typeAliasList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionList, "functionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(propertyList, "propertyList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAliasList, "typeAliasList");
        this.f307544i = l0Var;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : functionList) {
            n16.g b17 = b26.t0.b(l0Var.f307554b.f99049b, ((i16.j0) ((p16.h0) obj)).f369062i);
            java.lang.Object obj2 = linkedHashMap.get(b17);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(b17, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        this.f307536a = c(linkedHashMap);
        d26.l0 l0Var2 = this.f307544i;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj3 : propertyList) {
            n16.g b18 = b26.t0.b(l0Var2.f307554b.f99049b, ((i16.u0) ((p16.h0) obj3)).f369298i);
            java.lang.Object obj4 = linkedHashMap2.get(b18);
            if (obj4 == null) {
                obj4 = new java.util.ArrayList();
                linkedHashMap2.put(b18, obj4);
            }
            ((java.util.List) obj4).add(obj3);
        }
        this.f307537b = c(linkedHashMap2);
        this.f307544i.f307554b.f99048a.f99018c.getClass();
        d26.l0 l0Var3 = this.f307544i;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.lang.Object obj5 : typeAliasList) {
            n16.g b19 = b26.t0.b(l0Var3.f307554b.f99049b, ((i16.o1) ((p16.h0) obj5)).f369208h);
            java.lang.Object obj6 = linkedHashMap3.get(b19);
            if (obj6 == null) {
                obj6 = new java.util.ArrayList();
                linkedHashMap3.put(b19, obj6);
            }
            ((java.util.List) obj6).add(obj5);
        }
        this.f307538c = c(linkedHashMap3);
        this.f307539d = ((e26.u) this.f307544i.f307554b.f99048a.f99016a).c(new d26.e0(this));
        this.f307540e = ((e26.u) this.f307544i.f307554b.f99048a.f99016a).c(new d26.f0(this));
        this.f307541f = ((e26.u) this.f307544i.f307554b.f99048a.f99016a).d(new d26.g0(this));
        d26.l0 l0Var4 = this.f307544i;
        this.f307542g = ((e26.u) l0Var4.f307554b.f99048a.f99016a).b(new d26.d0(this, l0Var4));
        d26.l0 l0Var5 = this.f307544i;
        this.f307543h = ((e26.u) l0Var5.f307554b.f99048a.f99016a).b(new d26.h0(this, l0Var5));
    }

    public java.util.Collection a(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return !((java.util.Set) e26.b0.a(this.f307542g, this, f307535j[0])).contains(name) ? kz5.p0.f395529d : (java.util.Collection) ((e26.r) this.f307539d).mo146xb9724478(name);
    }

    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return !((java.util.Set) e26.b0.a(this.f307543h, this, f307535j[1])).contains(name) ? kz5.p0.f395529d : (java.util.Collection) ((e26.r) this.f307540e).mo146xb9724478(name);
    }

    public final java.util.Map c(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.lang.Iterable<p16.c> iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            for (p16.c cVar : iterable) {
                int mo134562x9d9c349b = cVar.mo134562x9d9c349b();
                int f17 = p16.j.f(mo134562x9d9c349b) + mo134562x9d9c349b;
                if (f17 > 4096) {
                    f17 = 4096;
                }
                p16.j j17 = p16.j.j(byteArrayOutputStream, f17);
                j17.v(mo134562x9d9c349b);
                cVar.a(j17);
                j17.i();
                arrayList.add(jz5.f0.f384359a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
