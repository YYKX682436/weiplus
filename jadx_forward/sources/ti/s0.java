package ti;

/* loaded from: classes16.dex */
public class s0 implements ti.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f501039a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f501040b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f501041c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f501042d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public ti.t0 f501043e;

    public ti.s0 a() {
        this.f501043e.f501045b = true;
        return this;
    }

    public ti.s0 b(java.lang.String str) {
        vi.b.a(str, "mClassName");
        ti.t0 t0Var = new ti.t0("any subclass of ".concat(str));
        this.f501043e = t0Var;
        this.f501042d.put(str, t0Var);
        return this;
    }

    public ti.s0 c(java.lang.String str, java.lang.String str2) {
        vi.b.a(str, "mClassName");
        vi.b.a(str2, "fieldName");
        java.util.Map map = this.f501039a;
        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            map.put(str, map2);
        }
        ti.t0 t0Var = new ti.t0("field " + str + "#" + str2);
        this.f501043e = t0Var;
        map2.put(str2, t0Var);
        return this;
    }

    public ti.s0 d(java.lang.String str, java.lang.String str2) {
        vi.b.a(str, "mClassName");
        vi.b.a(str2, "fieldName");
        java.util.Map map = this.f501040b;
        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            map.put(str, map2);
        }
        ti.t0 t0Var = new ti.t0("static field " + str + "#" + str2);
        this.f501043e = t0Var;
        map2.put(str2, t0Var);
        return this;
    }
}
