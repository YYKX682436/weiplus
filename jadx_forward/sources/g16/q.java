package g16;

/* loaded from: classes15.dex */
public final class q implements g16.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f349182a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g16.t f349183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n16.g f349184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g16.r f349185d;

    public q(g16.t tVar, n16.g gVar, g16.r rVar) {
        this.f349183b = tVar;
        this.f349184c = gVar;
        this.f349185d = rVar;
    }

    @Override // g16.n0
    public void a() {
        java.util.ArrayList elements = this.f349182a;
        g16.s sVar = (g16.s) this.f349185d;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        n16.g gVar = this.f349184c;
        if (gVar == null) {
            return;
        }
        o06.p b17 = y06.c.b(gVar, sVar.f349190d);
        if (b17 != null) {
            java.util.HashMap hashMap = sVar.f349188b;
            java.util.List b18 = o26.a.b(elements);
            f26.o0 mo132802xfb85f7b0 = ((r06.t1) b17).mo132802xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
            hashMap.put(gVar, new t16.d0(b18, mo132802xfb85f7b0));
            return;
        }
        if (sVar.f349189c.p(sVar.f349191e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.h(), "value")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = elements.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof t16.a) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sVar.f349192f.add((p06.c) ((t16.a) it6.next()).f496146a);
            }
        }
    }

    @Override // g16.n0
    public void b(java.lang.Object obj) {
        this.f349182a.add(g16.t.u(this.f349183b, this.f349184c, obj));
    }

    @Override // g16.n0
    public void c(t16.f value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f349182a.add(new t16.x(value));
    }

    @Override // g16.n0
    public g16.m0 d(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        return new g16.p(this.f349183b.q(classId, o06.x1.f423537a, arrayList), this, arrayList);
    }

    @Override // g16.n0
    public void e(n16.b enumClassId, n16.g enumEntryName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumClassId, "enumClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumEntryName, "enumEntryName");
        this.f349182a.add(new t16.k(enumClassId, enumEntryName));
    }
}
