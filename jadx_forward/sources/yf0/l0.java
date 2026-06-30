package yf0;

/* loaded from: classes12.dex */
public final class l0 extends qi3.e0 {

    /* renamed from: i, reason: collision with root package name */
    public qi3.i0 f543118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(qi3.g0 status, qi3.b0 sendTask) {
        super(status, sendTask);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendTask, "sendTask");
    }

    @Override // qi3.e0
    public int a() {
        qi3.d0 d0Var = this.f445228e;
        if (d0Var != null) {
            return d0Var.f445216a;
        }
        qi3.i0 i0Var = this.f445227d;
        if (i0Var != null) {
            return i0Var.f445258a;
        }
        qi3.i0 i0Var2 = this.f543118i;
        if (i0Var2 != null) {
            return i0Var2.f445258a;
        }
        qi3.f0 f0Var = this.f445226c;
        if (f0Var != null) {
            return f0Var.f445233a;
        }
        return 0;
    }
}
