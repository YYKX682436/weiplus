package vm1;

/* loaded from: classes11.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f519576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f519577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f519578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(long j17, long j18, vm1.x0 x0Var, yz5.l lVar) {
        super(0);
        this.f519576d = j17;
        this.f519577e = j18;
        this.f519578f = x0Var;
        this.f519579g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        double d17 = this.f519576d;
        double d18 = this.f519577e;
        gf0.r rVar = (gf0.r) f8Var;
        rVar.f352766f = d17;
        rVar.f352767g = d18;
        gf0.r rVar2 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
        rVar2.f352769i = null;
        rVar2.f352770m = null;
        rVar2.f352771n = null;
        rVar2.f352768h = null;
        rVar2.f352772o = null;
        qk.f8 f8Var2 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.x0 x0Var = this.f519578f;
        vm1.o0 o0Var = new vm1.o0(x0Var);
        gf0.r rVar3 = (gf0.r) f8Var2;
        rVar3.getClass();
        rVar3.f352771n = o0Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.p0 p0Var = new vm1.p0(this.f519579g);
        gf0.r rVar4 = (gf0.r) f8Var3;
        rVar4.getClass();
        rVar4.f352769i = p0Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = x0Var.f519602e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        ((gf0.r) f8Var4).Ai(activity);
        return jz5.f0.f384359a;
    }
}
