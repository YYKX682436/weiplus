package rk4;

/* loaded from: classes14.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(yz5.l lVar) {
        super(1);
        this.f478142d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.kp0 result = (bw5.kp0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        rk4.g4 g4Var = rk4.g4.f478207a;
        boolean[] zArr = result.f111000n;
        bw5.rq0 rq0Var = zArr[4] ? result.f110996g : new bw5.rq0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var, "getPlayerBackgroundColor(...)");
        int b17 = rk4.g4.b(g4Var, rq0Var);
        bw5.rq0 rq0Var2 = zArr[5] ? result.f110997h : new bw5.rq0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var2, "getMinibarColor(...)");
        int b18 = rk4.g4.b(g4Var, rq0Var2);
        bw5.rq0 rq0Var3 = zArr[6] ? result.f110998i : new bw5.rq0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var3, "getLinkColor(...)");
        this.f478142d.mo146xb9724478(new ff0.z(b17, b18, rk4.g4.b(g4Var, rq0Var3)));
        return jz5.f0.f384359a;
    }
}
