package f2;

/* loaded from: classes13.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.e0 f340330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.c0 f340331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f2.e0 e0Var, f2.c0 c0Var) {
        super(1);
        this.f340330d = e0Var;
        this.f340331e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f2.g0 finalResult = (f2.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalResult, "finalResult");
        f2.e0 e0Var = this.f340330d;
        i2.h hVar = e0Var.f340332a;
        f2.c0 c0Var = this.f340331e;
        synchronized (hVar) {
            if (finalResult.a()) {
                e0Var.f340333b.b(c0Var, finalResult);
            } else {
                e0Var.f340333b.c(c0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
