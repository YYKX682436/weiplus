package xm2;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f536752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xm2.l lVar) {
        super(1);
        this.f536752d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm2.l lVar = this.f536752d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f536761g, obj)) {
            lVar.f536761g = obj;
            lVar.f536762h.f536738e = obj;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = lVar.f536763i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                xm2.c cVar = k3Var instanceof xm2.c ? (xm2.c) k3Var : null;
                if (cVar != null) {
                    zm2.b bVar = cVar.f536735p;
                    cVar.j(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar != null ? bVar.f555695d : null, obj));
                }
            }
            lVar.a(obj);
            lVar.f536758d.mo146xb9724478(obj);
        }
        return jz5.f0.f384359a;
    }
}
