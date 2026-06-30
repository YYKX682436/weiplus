package d26;

/* loaded from: classes16.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d26.x xVar) {
        super(0);
        this.f307582d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d26.x xVar = this.f307582d;
        java.util.List list = xVar.f307586h.f369187v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getConstructorList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.Boolean c17 = k16.f.f384979n.c(((i16.r) obj).f369238g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
            if (c17.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b26.t tVar = xVar.f307593r;
            if (!hasNext) {
                return kz5.n0.t0(kz5.n0.t0(arrayList2, kz5.c0.j(xVar.s())), tVar.f99048a.f99029n.b(xVar));
            }
            i16.r rVar = (i16.r) it.next();
            b26.s0 s0Var = tVar.f99056i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar);
            arrayList2.add(s0Var.d(rVar, false));
        }
    }
}
