package p05;

/* loaded from: classes14.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f432264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(p05.l4 l4Var) {
        super(1);
        this.f432264d = l4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p05.l4 l4Var = this.f432264d;
        os0.a aVar = l4Var.f432138r;
        l4Var.p(it, aVar.f429548x, aVar.f429549y);
        return jz5.f0.f384359a;
    }
}
