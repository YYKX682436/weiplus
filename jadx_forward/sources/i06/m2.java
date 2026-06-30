package i06;

/* loaded from: classes15.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n2 f368228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(i06.n2 n2Var) {
        super(0);
        this.f368228d = n2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ?? c17;
        i06.n2 n2Var = this.f368228d;
        t06.g a17 = i06.n2.a(n2Var);
        if (a17 == null) {
            return y16.r.f540506b;
        }
        f06.v vVar = i06.o1.f368244b[0];
        java.lang.Object mo152xb9724478 = n2Var.f368245a.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        t06.a aVar = ((t06.k) mo152xb9724478).f496076b;
        aVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = aVar.f496064c;
        n16.b a18 = a17.a();
        java.lang.Object obj = concurrentHashMap.get(a18);
        if (obj == null) {
            n16.c h17 = a17.a().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
            h16.c cVar = a17.f496070b;
            h16.b bVar = cVar.f359762a;
            h16.b bVar2 = h16.b.f359758n;
            g16.x xVar = aVar.f496062a;
            if (bVar == bVar2) {
                java.lang.String[] strArr = bVar == bVar2 ? cVar.f359764c : null;
                java.util.List f17 = strArr != null ? kz5.v.f(strArr) : null;
                if (f17 == null) {
                    f17 = kz5.p0.f395529d;
                }
                c17 = new java.util.ArrayList();
                java.util.Iterator it = f17.iterator();
                while (it.hasNext()) {
                    n16.b l17 = n16.b.l(new n16.c(w16.d.d((java.lang.String) it.next()).f523785a.replace('/', '.')));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xVar.c().f99018c, "<this>");
                    g16.q0 a19 = g16.l0.a(aVar.f496063b, l17, m16.g.f404425g);
                    if (a19 != null) {
                        c17.add(a19);
                    }
                }
            } else {
                c17 = kz5.b0.c(a17);
            }
            r06.y yVar = new r06.y(xVar.c().f99017b, h17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = c17.iterator();
            while (it6.hasNext()) {
                y16.s a27 = xVar.a(yVar, (g16.q0) it6.next());
                if (a27 != null) {
                    arrayList.add(a27);
                }
            }
            java.util.List S0 = kz5.n0.S0(arrayList);
            obj = y16.c.f540459d.a("package " + h17 + " (" + a17 + ')', S0);
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(a18, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getOrPut(...)");
        return (y16.s) obj;
    }
}
