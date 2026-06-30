package bn2;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.t f22887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bn2.t tVar) {
        super(1);
        this.f22887d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        kotlin.jvm.internal.o.g(item, "item");
        int ordinal = item.f8866b.ordinal();
        bn2.t tVar = this.f22887d;
        if (ordinal == 0) {
            bn2.o oVar = new bn2.o(tVar.f22890a, tVar.f22891b, tVar.f22892c, tVar.f22893d);
            xm2.a aVar = tVar.f22896g;
            if (aVar != null) {
                ((wm2.l) aVar).c(oVar);
            }
        } else if (ordinal == 1) {
            bn2.x xVar = new bn2.x(tVar.f22890a, tVar.f22891b, tVar.f22892c, tVar.f22893d);
            xm2.a aVar2 = tVar.f22896g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(xVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
