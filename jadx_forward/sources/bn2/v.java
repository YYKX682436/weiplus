package bn2;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.x f104432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bn2.x xVar) {
        super(1);
        this.f104432d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lo0.k0 item = (lo0.k0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bn2.x xVar = this.f104432d;
        bn2.d0 d0Var = new bn2.d0(xVar.f104434a, item, xVar.f104435b.f528764e);
        xm2.a aVar = xVar.f104440g;
        if (aVar != null) {
            ((wm2.l) aVar).b(d0Var);
        }
        return jz5.f0.f384359a;
    }
}
