package rk4;

/* loaded from: classes11.dex */
public final class q8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il4.e f478478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f478479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.lang.String str, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f478477d = str;
        this.f478478e = eVar;
        this.f478479f = z8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = jm4.m3.f381931e;
        java.lang.String str = this.f478477d;
        jm4.k3 k3Var = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30437x21b323b2.m168976x21b902b8(new java.lang.String[]{str});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskServiceCpp");
        jm4.m3 m3Var = (jm4.m3) k3Var;
        il4.e eVar = this.f478478e;
        m3Var.e(eVar.f373639c);
        eVar.f373655s.f373668g = str;
        il4.l.q(eVar, false, null, null, 12, null);
        rk4.z8.wi(this.f478479f, m3Var, 0);
        return jz5.f0.f384359a;
    }
}
