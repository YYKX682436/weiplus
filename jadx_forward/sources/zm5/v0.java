package zm5;

/* loaded from: classes10.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.w0 f555810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(zm5.w0 w0Var) {
        super(2);
        this.f555810d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        zm5.w0 w0Var = this.f555810d;
        fn5.t.a(new zm5.t0(w0Var.m158354x19263085()), w0Var.f555813e, w0Var.f555814f, w0Var.f555815g, new zm5.u0(w0Var), oVar, 4096);
        return jz5.f0.f384359a;
    }
}
