package cr0;

/* loaded from: classes12.dex */
public abstract class w extends rh.d3 {

    /* renamed from: h, reason: collision with root package name */
    public static final cr0.u f303319h = new cr0.u(null);

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f303320d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f303321e = jz5.h.a(jz5.i.f384362d, cr0.v.f303309d);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f303322f = rh.x2.b(0);

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f303323g = rh.x2.b(0L);

    public final java.util.List b() {
        return (java.util.List) this.f303321e.mo141623x754a37bb();
    }

    public final void c() {
        java.util.Iterator it = b().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.r) it.next()).f303259e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
            i17 += ((java.lang.Integer) number).intValue();
        }
        this.f303322f = rh.x2.b(java.lang.Integer.valueOf(i17));
        java.util.Iterator it6 = b().iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.r) it6.next()).f303260f.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
            j17 += ((java.lang.Long) number2).longValue();
        }
        this.f303323g = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
