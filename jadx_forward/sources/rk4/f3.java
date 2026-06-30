package rk4;

/* loaded from: classes11.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24982xdc19259d f478177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e f478180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24982xdc19259d c24982xdc19259d, rk4.l3 l3Var, yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e c24979xd5d6633e) {
        super(0);
        this.f478177d = c24982xdc19259d;
        this.f478178e = l3Var;
        this.f478179f = lVar;
        this.f478180g = c24979xd5d6633e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24982xdc19259d c24982xdc19259d = this.f478177d;
        double m92654x4ef28922 = c24982xdc19259d.m92654x4ef28922();
        double m92653x91227d34 = c24982xdc19259d.m92653x91227d34();
        gf0.r rVar = (gf0.r) f8Var;
        rVar.f352766f = m92654x4ef28922;
        rVar.f352767g = m92653x91227d34;
        gf0.r rVar2 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
        rVar2.f352769i = null;
        rVar2.f352770m = null;
        rVar2.f352771n = null;
        rVar2.f352768h = null;
        rVar2.f352772o = null;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 m92652x19771aed = c24982xdc19259d.m92652x19771aed();
        if (m92652x19771aed != null) {
            gf0.r rVar3 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
            rVar3.getClass();
            rVar3.f352768h = m92652x19771aed;
        }
        qk.f8 f8Var2 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.l3 l3Var = this.f478178e;
        rk4.b3 b3Var = new rk4.b3(l3Var);
        gf0.r rVar4 = (gf0.r) f8Var2;
        rVar4.getClass();
        rVar4.f352771n = b3Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.c3 c3Var = new rk4.c3(this.f478179f);
        gf0.r rVar5 = (gf0.r) f8Var3;
        rVar5.getClass();
        rVar5.f352769i = c3Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.e3 e3Var = new rk4.e3(this.f478180g);
        gf0.r rVar6 = (gf0.r) f8Var4;
        rVar6.getClass();
        rVar6.f352772o = e3Var;
        qk.f8 f8Var5 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = l3Var.f478350e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        ((gf0.r) f8Var5).Ai(activity);
        return jz5.f0.f384359a;
    }
}
