package bn2;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f22873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bn2.o oVar) {
        super(1);
        this.f22873d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        an2.k item = (an2.k) obj;
        kotlin.jvm.internal.o.g(item, "item");
        int ordinal = item.f8866b.ordinal();
        bn2.o oVar = this.f22873d;
        if (ordinal == 1) {
            bn2.x xVar = new bn2.x(oVar.f22877a, oVar.f22878b, oVar.f22879c, oVar.f22880d);
            xm2.a aVar = oVar.f22883g;
            if (aVar != null) {
                ((wm2.l) aVar).c(xVar);
            }
        } else if (ordinal == 2) {
            bn2.t tVar = new bn2.t(oVar.f22877a, oVar.f22878b, oVar.f22879c, oVar.f22880d);
            xm2.a aVar2 = oVar.f22883g;
            if (aVar2 != null) {
                ((wm2.l) aVar2).c(tVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
