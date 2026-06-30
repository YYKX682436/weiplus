package b00;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.v f16671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e00.v vVar, b00.r rVar) {
        super(1);
        this.f16671d = vVar;
        this.f16672e = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y02.p0 a17;
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.v vVar = this.f16671d;
        vVar.f245824d = null;
        b00.r rVar = this.f16672e;
        if (x7Var != null) {
            ((e00.e) rVar.f16758e).b(x7Var, vVar.getKey());
        }
        b00.r.wi(rVar, vVar);
        if (x7Var != null && (a17 = y02.r0.f458626d.a()) != null) {
            bw5.m7 b17 = x7Var.b();
            kotlin.jvm.internal.o.f(b17, "getCgiPreloadInfo(...)");
            ((y02.r0) a17).d(b17);
        }
        return jz5.f0.f302826a;
    }
}
