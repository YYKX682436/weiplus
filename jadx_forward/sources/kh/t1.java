package kh;

/* loaded from: classes12.dex */
public abstract class t1 extends rh.d3 {

    /* renamed from: i, reason: collision with root package name */
    public static final kh.p1 f389449i = new kh.p1(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f389450d;

    /* renamed from: e, reason: collision with root package name */
    public rh.x2 f389451e = rh.x2.b(0L);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f389452f = rh.x2.b(0);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f389453g = jz5.h.a(jz5.i.f384362d, kh.s1.f389442d);

    /* renamed from: h, reason: collision with root package name */
    public rh.x2 f389454h;

    public t1(int i17) {
        this.f389450d = i17;
        rh.x2.b(0);
        this.f389454h = rh.x2.b(0L);
    }

    public int b() {
        return this.f389450d;
    }

    public final java.util.List c() {
        return (java.util.List) this.f389453g.mo141623x754a37bb();
    }

    public final void d() {
        java.util.Iterator it = c().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((kh.r1) it.next()).f389436e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
            i17 += ((java.lang.Integer) number).intValue();
        }
        rh.x2.b(java.lang.Integer.valueOf(i17));
        java.util.Iterator it6 = c().iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((kh.r1) it6.next()).f389437f.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
            j17 += ((java.lang.Long) number2).longValue();
        }
        this.f389454h = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    public final float e(long j17, long j18) {
        return (((float) (j17 * b())) * 100.0f) / ((float) j18);
    }
}
