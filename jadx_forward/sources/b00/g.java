package b00;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.v f98204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e00.v vVar, b00.r rVar) {
        super(1);
        this.f98204d = vVar;
        this.f98205e = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y02.p0 a17;
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.v vVar = this.f98204d;
        vVar.f327357d = null;
        b00.r rVar = this.f98205e;
        if (x7Var != null) {
            ((e00.e) rVar.f98291e).b(x7Var, vVar.mo126544xb5884f29());
        }
        b00.r.wi(rVar, vVar);
        if (x7Var != null && (a17 = y02.r0.f540159d.a()) != null) {
            bw5.m7 b17 = x7Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCgiPreloadInfo(...)");
            ((y02.r0) a17).d(b17);
        }
        return jz5.f0.f384359a;
    }
}
