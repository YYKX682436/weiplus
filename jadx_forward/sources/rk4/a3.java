package rk4;

/* loaded from: classes11.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f478071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f478072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e f478075h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(long j17, long j18, rk4.l3 l3Var, yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e c24979xd5d6633e) {
        super(0);
        this.f478071d = j17;
        this.f478072e = j18;
        this.f478073f = l3Var;
        this.f478074g = lVar;
        this.f478075h = c24979xd5d6633e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        double d17 = this.f478071d;
        double d18 = this.f478072e;
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
        rk4.l3 l3Var = this.f478073f;
        rk4.w2 w2Var = new rk4.w2(l3Var);
        gf0.r rVar3 = (gf0.r) f8Var2;
        rVar3.getClass();
        rVar3.f352771n = w2Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.x2 x2Var = new rk4.x2(this.f478074g);
        gf0.r rVar4 = (gf0.r) f8Var3;
        rVar4.getClass();
        rVar4.f352769i = x2Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.z2 z2Var = new rk4.z2(this.f478075h);
        gf0.r rVar5 = (gf0.r) f8Var4;
        rVar5.getClass();
        rVar5.f352772o = z2Var;
        qk.f8 f8Var5 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = l3Var.f478350e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        ((gf0.r) f8Var5).Ai(activity);
        return jz5.f0.f384359a;
    }
}
