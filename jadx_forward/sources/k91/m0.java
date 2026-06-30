package k91;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f387205a;

    /* renamed from: b, reason: collision with root package name */
    public float f387206b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f387207c;

    public m0(boolean z17, float f17, java.util.Map hitOptimizations, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        hitOptimizations = (i17 & 4) != 0 ? new java.util.LinkedHashMap() : hitOptimizations;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitOptimizations, "hitOptimizations");
        this.f387205a = z17;
        this.f387206b = f17;
        this.f387207c = hitOptimizations;
    }

    public final java.util.Map a() {
        java.util.Map map = this.f387207c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue()), entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            k91.q0 q0Var = (k91.q0) entry2.getValue();
            linkedHashMap2.put(key, kz5.c1.k(new jz5.l("needDownload", java.lang.Boolean.valueOf(q0Var.f387262a)), new jz5.l("startTime", java.lang.Long.valueOf(q0Var.f387263b))));
        }
        return kz5.c1.k(new jz5.l("loaded", java.lang.Boolean.valueOf(this.f387205a)), new jz5.l("progress", java.lang.Float.valueOf(this.f387206b)), new jz5.l("hitOptimizations", linkedHashMap2));
    }

    /* renamed from: equals */
    public boolean m142184xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k91.m0)) {
            return false;
        }
        k91.m0 m0Var = (k91.m0) obj;
        return this.f387205a == m0Var.f387205a && java.lang.Float.compare(this.f387206b, m0Var.f387206b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387207c, m0Var.f387207c);
    }

    /* renamed from: hashCode */
    public int m142185x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f387205a) * 31) + java.lang.Float.hashCode(this.f387206b)) * 31) + this.f387207c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m142186x9616526c() {
        return "AppBrandLoadInfo(loaded=" + this.f387205a + ", progress=" + this.f387206b + ", hitOptimizations=" + this.f387207c + ')';
    }
}
