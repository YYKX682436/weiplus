package bn2;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f104406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bn2.o oVar) {
        super(1);
        this.f104406d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int ordinal = item.f90399b.ordinal();
        bn2.o oVar = this.f104406d;
        if (ordinal == 1) {
            bn2.x xVar = new bn2.x(oVar.f104410a, oVar.f104411b, oVar.f104412c, oVar.f104413d);
            xm2.a aVar = oVar.f104416g;
            if (aVar != null) {
                ((wm2.l) aVar).c(xVar);
            }
        } else if (ordinal == 2) {
            bn2.t tVar = new bn2.t(oVar.f104410a, oVar.f104411b, oVar.f104412c, oVar.f104413d);
            xm2.a aVar2 = oVar.f104416g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(tVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
