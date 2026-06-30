package bn2;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f22899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bn2.x xVar) {
        super(1);
        this.f22899d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lo0.k0 item = (lo0.k0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        bn2.x xVar = this.f22899d;
        bn2.d0 d0Var = new bn2.d0(xVar.f22901a, item, xVar.f22902b.f447231e);
        xm2.a aVar = xVar.f22907g;
        if (aVar != null) {
            ((wm2.l) aVar).b(d0Var);
        }
        return jz5.f0.f302826a;
    }
}
