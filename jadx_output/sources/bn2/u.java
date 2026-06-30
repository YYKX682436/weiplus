package bn2;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f22898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bn2.x xVar) {
        super(1);
        this.f22898d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        kotlin.jvm.internal.o.g(item, "item");
        int ordinal = item.f8866b.ordinal();
        bn2.x xVar = this.f22898d;
        if (ordinal == 0) {
            bn2.o oVar = new bn2.o(xVar.f22901a, xVar.f22902b, xVar.f22903c, xVar.f22904d);
            xm2.a aVar = xVar.f22907g;
            if (aVar != null) {
                ((wm2.l) aVar).c(oVar);
            }
        } else if (ordinal == 2) {
            bn2.t tVar = new bn2.t(xVar.f22901a, xVar.f22902b, xVar.f22903c, xVar.f22904d);
            xm2.a aVar2 = xVar.f22907g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(tVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
