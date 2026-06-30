package cr0;

/* loaded from: classes12.dex */
public abstract class a3 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f303115d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f303116e = jz5.h.a(jz5.i.f384362d, cr0.z2.f303354d);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f303117f;

    public a3() {
        rh.x2.b(0);
        this.f303117f = rh.x2.b(0L);
    }

    public final java.util.List b() {
        return (java.util.List) this.f303116e.mo141623x754a37bb();
    }

    public final void c() {
        java.util.Iterator it = b().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.w2) it.next()).f303331e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
            i17 += ((java.lang.Integer) number).intValue();
        }
        rh.x2.b(java.lang.Integer.valueOf(i17));
        java.util.Iterator it6 = b().iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.w2) it6.next()).f303332f.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
            j17 += ((java.lang.Long) number2).longValue();
        }
        this.f303117f = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
