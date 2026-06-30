package ib2;

/* loaded from: classes2.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f371631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ib2.i0 i0Var) {
        super(0);
        this.f371631d = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ib2.i0 i0Var = this.f371631d;
        ib2.l0 l0Var = i0Var.f371654c;
        if (l0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l0Var.f();
        i0Var.c();
        return jz5.f0.f384359a;
    }
}
