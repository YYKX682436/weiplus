package rk4;

/* loaded from: classes11.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(yz5.l lVar) {
        super(1);
        this.f478160d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.sq0 result = (bw5.sq0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        rk4.g4 g4Var = rk4.g4.f478207a;
        boolean[] zArr = result.f114648f;
        byte[] g17 = (zArr[2] ? result.f114647e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
        bw5.tq0 tq0Var = zArr[1] ? result.f114646d : new bw5.tq0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tq0Var, "getImageInfo(...)");
        this.f478160d.mo146xb9724478(rk4.g4.a(g4Var, g17, tq0Var));
        return jz5.f0.f384359a;
    }
}
