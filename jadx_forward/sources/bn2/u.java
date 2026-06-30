package bn2;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f104431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bn2.x xVar) {
        super(1);
        this.f104431d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int ordinal = item.f90399b.ordinal();
        bn2.x xVar = this.f104431d;
        if (ordinal == 0) {
            bn2.o oVar = new bn2.o(xVar.f104434a, xVar.f104435b, xVar.f104436c, xVar.f104437d);
            xm2.a aVar = xVar.f104440g;
            if (aVar != null) {
                ((wm2.l) aVar).c(oVar);
            }
        } else if (ordinal == 2) {
            bn2.t tVar = new bn2.t(xVar.f104434a, xVar.f104435b, xVar.f104436c, xVar.f104437d);
            xm2.a aVar2 = xVar.f104440g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(tVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
