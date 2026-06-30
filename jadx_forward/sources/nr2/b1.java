package nr2;

/* loaded from: classes2.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f420699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(nr2.i1 i1Var) {
        super(0);
        this.f420699d = i1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nr2.i1 i1Var = this.f420699d;
        nr2.l1 l1Var = i1Var.f420745c;
        if (l1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l1Var.f();
        i1Var.c();
        return jz5.f0.f384359a;
    }
}
