package q16;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q16.a0 f441317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q16.a0 a0Var) {
        super(1);
        this.f441317d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f26.l2 it = (f26.l2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.b()) {
            return "*";
        }
        f26.o0 mo128949xfb85f7b0 = it.mo128949xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
        java.lang.String v17 = this.f441317d.v(mo128949xfb85f7b0);
        if (it.c() == f26.d3.f340676f) {
            return v17;
        }
        return it.c() + ' ' + v17;
    }
}
