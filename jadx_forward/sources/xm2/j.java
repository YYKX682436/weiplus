package xm2;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f536753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xm2.l lVar) {
        super(1);
        this.f536753d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zm2.b bVar;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        xm2.l lVar = this.f536753d;
        lVar.f536757c.mo149xb9724478(lVar.f536761g, java.lang.Double.valueOf(doubleValue));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = lVar.f536763i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1163xf1deaba4, "access$getRecyclerView$p(...)");
        java.util.Iterator it = oj5.x.b(c1163xf1deaba4).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            xm2.c cVar = k3Var instanceof xm2.c ? (xm2.c) k3Var : null;
            if (cVar != null) {
                zm2.b bVar2 = cVar.f536735p;
                xm2.c cVar2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2 != null ? bVar2.f555695d : null, lVar.f536761g) ? cVar : null;
                if (cVar2 != null && (bVar = cVar2.f536735p) != null) {
                    cVar2.i(bVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
