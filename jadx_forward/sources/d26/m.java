package d26;

/* loaded from: classes16.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.n f307558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d26.n nVar) {
        super(0);
        this.f307558d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b26.t tVar;
        d26.n nVar = this.f307558d;
        nVar.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        d26.x xVar = nVar.f307565d;
        java.util.Iterator it = xVar.f307595t.a().iterator();
        while (it.hasNext()) {
            for (o06.m mVar : y16.v.a(((f26.o0) it.next()).V(), null, null, 3, null)) {
                if ((mVar instanceof o06.v1) || (mVar instanceof o06.o1)) {
                    hashSet.add(mVar.mo132800xfb82e301());
                }
            }
        }
        i16.o oVar = xVar.f307586h;
        java.util.List list = oVar.f369188w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getFunctionList(...)");
        java.util.Iterator it6 = list.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            tVar = xVar.f307593r;
            if (!hasNext) {
                break;
            }
            hashSet.add(b26.t0.b(tVar.f99049b, ((i16.j0) it6.next()).f369062i));
        }
        java.util.List list2 = oVar.f369189x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getPropertyList(...)");
        java.util.Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            hashSet.add(b26.t0.b(tVar.f99049b, ((i16.u0) it7.next()).f369298i));
        }
        return kz5.q1.i(hashSet, hashSet);
    }
}
