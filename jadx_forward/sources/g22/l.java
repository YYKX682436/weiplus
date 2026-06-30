package g22;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final g22.l f349378d = new g22.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j22.k it = (j22.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        for (java.util.Map.Entry entry : it.f378795a.entrySet()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
            b17.f137609j = ((java.lang.Number) entry.getKey()).intValue();
            b17.f137605f = 1;
            b17.f137604e = 1;
            b17.f137603d = j22.a.f378782a;
            j22.j.f378790e.a(b17, (java.util.List) entry.getValue());
            b17.k();
        }
        return jz5.f0.f384359a;
    }
}
