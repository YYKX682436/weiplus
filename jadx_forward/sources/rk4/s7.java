package rk4;

/* loaded from: classes11.dex */
public final class s7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f478503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f478504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(bw5.ar0 ar0Var, java.util.Map map) {
        super(1);
        this.f478503d = ar0Var;
        this.f478504e = map;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.k20 result = (bw5.k20) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String b17 = result.b();
        km4.s a17 = km4.s.f390851f.a(this.f478503d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        bw5.j20 j20Var = a17.f524991d;
        j20Var.f110304d = b17;
        j20Var.f110308h[1] = true;
        a17.e("only_refresh");
        a17.d(bw5.f20.HybridRouterBizTypeTing);
        a17.a(this.f478504e);
        w71.o0 a18 = w71.q0.f524969d.a();
        if (a18 != null) {
            ((w71.q0) a18).a(a17, rk4.r7.f478489d);
        }
        return jz5.f0.f384359a;
    }
}
