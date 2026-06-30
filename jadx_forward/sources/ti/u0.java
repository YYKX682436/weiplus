package ti;

/* loaded from: classes16.dex */
public class u0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f501047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f501048e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f501049f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f501050g;

    public u0(ti.s0 s0Var) {
        this.f501047d = b(s0Var.f501039a);
        this.f501048e = b(s0Var.f501040b);
        this.f501049f = a(s0Var.f501041c);
        this.f501050g = a(s0Var.f501042d);
    }

    public final java.util.Map a(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ti.v0((ti.t0) entry.getValue()));
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public final java.util.Map b(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a((java.util.Map) entry.getValue()));
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: toString */
    public java.lang.String m166622x9616526c() {
        java.lang.String str = "";
        for (java.util.Map.Entry entry : this.f501047d.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            for (java.util.Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                str = str + "| Field: " + str2 + "." + ((java.lang.String) entry2.getKey()) + (((ti.v0) entry2.getValue()).f501051d ? " (always)" : "") + "\n";
            }
        }
        for (java.util.Map.Entry entry3 : this.f501048e.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry3.getKey();
            for (java.util.Map.Entry entry4 : ((java.util.Map) entry3.getValue()).entrySet()) {
                str = str + "| Static field: " + str3 + "." + ((java.lang.String) entry4.getKey()) + (((ti.v0) entry4.getValue()).f501051d ? " (always)" : "") + "\n";
            }
        }
        for (java.util.Map.Entry entry5 : this.f501049f.entrySet()) {
            str = str + "| Thread:" + ((java.lang.String) entry5.getKey()) + (((ti.v0) entry5.getValue()).f501051d ? " (always)" : "") + "\n";
        }
        for (java.util.Map.Entry entry6 : this.f501050g.entrySet()) {
            str = str + "| Class:" + ((java.lang.String) entry6.getKey()) + (((ti.v0) entry6.getValue()).f501051d ? " (always)" : "") + "\n";
        }
        return str;
    }
}
