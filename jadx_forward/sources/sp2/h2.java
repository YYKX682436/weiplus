package sp2;

/* loaded from: classes2.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f492578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f492578d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!it.isEmpty()) {
            sp2.z3.f492833a.c(it);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f492578d;
            int size = f0Var.f391649d - it.size();
            if (size < 0) {
                size = 0;
            }
            f0Var.f391649d = size;
        }
        return jz5.f0.f384359a;
    }
}
