package t03;

/* loaded from: classes11.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f496035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f496036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t03.k0 k0Var, long j17) {
        super(0);
        this.f496035d = k0Var;
        this.f496036e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t03.k0 k0Var = this.f496035d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "setOnBufferingEndListener");
        pm0.v.X(new t03.q(this.f496036e, k0Var));
        return jz5.f0.f384359a;
    }
}
