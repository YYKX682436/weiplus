package bn2;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.o f104408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bn2.o oVar) {
        super(1);
        this.f104408d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lo0.a0 suite = (lo0.a0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suite, "suite");
        bn2.o oVar = this.f104408d;
        bn2.i iVar = new bn2.i(oVar.f104410a, suite, oVar.f104412c, oVar.f104417h);
        xm2.a aVar = oVar.f104416g;
        if (aVar != null) {
            ((wm2.l) aVar).b(iVar);
        }
        oVar.i(bn2.j.f104402f);
        return jz5.f0.f384359a;
    }
}
