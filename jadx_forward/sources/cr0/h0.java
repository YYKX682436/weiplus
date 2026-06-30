package cr0;

/* loaded from: classes12.dex */
public abstract class h0 extends rh.d3 {

    /* renamed from: k, reason: collision with root package name */
    public static final cr0.b0 f303166k = new cr0.b0(null);

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f303167d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f303168e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f303169f;

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f303170g;

    /* renamed from: h, reason: collision with root package name */
    public rh.x2 f303171h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f303172i;

    /* renamed from: j, reason: collision with root package name */
    public rh.x2 f303173j;

    public h0() {
        jz5.i iVar = jz5.i.f384362d;
        this.f303168e = jz5.h.a(iVar, cr0.e0.f303152d);
        this.f303169f = jz5.h.a(iVar, cr0.g0.f303162d);
        this.f303170g = rh.x2.b(0L);
        this.f303171h = rh.x2.b(0L);
        this.f303172i = kz5.p0.f395529d;
        this.f303173j = rh.x2.b(0L);
    }

    public final java.util.List b() {
        return (java.util.List) this.f303168e.mo141623x754a37bb();
    }

    public final java.util.List c() {
        return (java.util.List) this.f303169f.mo141623x754a37bb();
    }

    public final void d() {
        java.lang.Long l17;
        java.lang.Object obj;
        java.lang.Object obj2;
        rh.x2 x2Var;
        rh.x2 x2Var2;
        java.lang.Long l18;
        java.util.Iterator it = b().iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.d0) it.next()).f303138e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
            j18 += ((java.lang.Long) number).longValue();
        }
        this.f303170g = rh.x2.b(java.lang.Long.valueOf(j18));
        java.util.Iterator it6 = c().iterator();
        long j19 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.d0) it6.next()).f303138e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
            j19 += ((java.lang.Long) number2).longValue();
        }
        this.f303171h = rh.x2.b(java.lang.Long.valueOf(j19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List[] listArr = new java.util.List[2];
        java.util.List b17 = b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it7 = b17.iterator();
        while (it7.hasNext()) {
            arrayList2.add(((cr0.d0) it7.next()).f303137d);
        }
        listArr[0] = arrayList2;
        java.util.List c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it8 = c17.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((cr0.d0) it8.next()).f303137d);
        }
        listArr[1] = arrayList3;
        for (java.lang.String str : kz5.n0.Q(kz5.d0.r(kz5.c0.i(listArr)))) {
            java.util.Iterator it9 = b().iterator();
            while (true) {
                l17 = null;
                if (it9.hasNext()) {
                    obj = it9.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj).f303137d, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cr0.d0 d0Var = (cr0.d0) obj;
            long longValue = (d0Var == null || (x2Var2 = d0Var.f303138e) == null || (l18 = (java.lang.Long) x2Var2.f477085a) == null) ? 0L : l18.longValue();
            java.util.Iterator it10 = c().iterator();
            while (true) {
                if (it10.hasNext()) {
                    obj2 = it10.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj2).f303137d, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            cr0.d0 d0Var2 = (cr0.d0) obj2;
            if (d0Var2 != null && (x2Var = d0Var2.f303138e) != null) {
                l17 = (java.lang.Long) x2Var.f477085a;
            }
            arrayList.add(new cr0.d0(str, longValue + (l17 == null ? 0L : l17.longValue())));
        }
        java.util.List S0 = kz5.n0.S0(kz5.n0.F0(arrayList, new cr0.f0()));
        this.f303172i = S0;
        java.util.Iterator it11 = S0.iterator();
        while (it11.hasNext()) {
            java.lang.Number number3 = ((cr0.d0) it11.next()).f303138e.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number3, "get(...)");
            j17 += ((java.lang.Long) number3).longValue();
        }
        this.f303173j = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
