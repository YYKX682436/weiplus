package xm2;

/* loaded from: classes14.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.t f536790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xm2.t tVar) {
        super(1);
        this.f536790d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm2.t tVar = this.f536790d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f536794d, obj)) {
            tVar.f536794d = obj;
            tVar.f536795e.f536778e = obj;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = tVar.f536796f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                xm2.o oVar = k3Var instanceof xm2.o ? (xm2.o) k3Var : null;
                if (oVar != null) {
                    zm2.c cVar = oVar.f536776q;
                    oVar.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar != null ? cVar.f555695d : null, obj));
                }
            }
        }
        tVar.f536792b.mo146xb9724478(obj);
        return jz5.f0.f384359a;
    }
}
