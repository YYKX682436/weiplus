package cr0;

/* loaded from: classes12.dex */
public final class p extends cr0.h0 {

    /* renamed from: m, reason: collision with root package name */
    public static final cr0.l f303238m = new cr0.l(null);

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f303239l = jz5.h.a(jz5.i.f384362d, cr0.o.f303228d);

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.p bgn = (cr0.p) d3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgn, "bgn");
        return new cr0.m(bgn, this);
    }

    public final java.util.LinkedHashMap e() {
        return (java.util.LinkedHashMap) this.f303239l.mo141623x754a37bb();
    }

    public final void f() {
        java.util.Collection values = e().values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.lang.Long valueOf = java.lang.Long.valueOf(kz5.n0.J0(values));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.util.LinkedHashMap e17 = e();
            java.util.ArrayList arrayList = new java.util.ArrayList(e17.size());
            java.util.Iterator it = e17.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(new jz5.l(((java.util.Map.Entry) it.next()).getKey(), java.lang.Long.valueOf(a06.d.c((((java.lang.Number) r4.getValue()).floatValue() * 100.0f) / ((float) longValue)))));
            }
            java.util.Map q17 = kz5.c1.q(kz5.n0.F0(arrayList, new cr0.n()));
            e().clear();
            e().putAll(q17);
        }
    }
}
