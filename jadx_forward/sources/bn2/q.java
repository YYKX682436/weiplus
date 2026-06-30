package bn2;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.t f104420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bn2.t tVar) {
        super(1);
        this.f104420d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int ordinal = item.f90399b.ordinal();
        bn2.t tVar = this.f104420d;
        if (ordinal == 0) {
            bn2.o oVar = new bn2.o(tVar.f104423a, tVar.f104424b, tVar.f104425c, tVar.f104426d);
            xm2.a aVar = tVar.f104429g;
            if (aVar != null) {
                ((wm2.l) aVar).c(oVar);
            }
        } else if (ordinal == 1) {
            bn2.x xVar = new bn2.x(tVar.f104423a, tVar.f104424b, tVar.f104425c, tVar.f104426d);
            xm2.a aVar2 = tVar.f104429g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(xVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
