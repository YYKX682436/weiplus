package bn2;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f22875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bn2.o oVar) {
        super(1);
        this.f22875d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lo0.a0 suite = (lo0.a0) obj;
        kotlin.jvm.internal.o.g(suite, "suite");
        bn2.o oVar = this.f22875d;
        bn2.i iVar = new bn2.i(oVar.f22877a, suite, oVar.f22879c, oVar.f22884h);
        xm2.a aVar = oVar.f22883g;
        if (aVar != null) {
            ((wm2.l) aVar).b(iVar);
        }
        oVar.i(bn2.j.f22869f);
        return jz5.f0.f302826a;
    }
}
