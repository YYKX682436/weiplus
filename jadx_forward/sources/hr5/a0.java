package hr5;

/* loaded from: classes15.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.n f365807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f365808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hr5.a1 a1Var, zq5.n nVar, long j17) {
        super(0);
        this.f365806d = a1Var;
        this.f365807e = nVar;
        this.f365808f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hr5.a1 a1Var = this.f365806d;
        sb6.append(a1Var.f365811b);
        sb6.append(". fling. end. offset=");
        sb6.append(zq5.m.e(a1Var.f365829t.f556629b));
        sb6.append(", bounds=");
        sb6.append(zq5.o.e(this.f365807e));
        sb6.append(", velocity=");
        sb6.append(zq5.m.e(this.f365808f));
        return sb6.toString();
    }
}
