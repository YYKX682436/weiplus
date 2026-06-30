package az0;

/* loaded from: classes5.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f15861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(java.lang.String str, az0.n7 n7Var, java.lang.Integer num) {
        super(1);
        this.f15859d = str;
        this.f15860e = n7Var;
        this.f15861f = num;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildTemplate: ");
        java.lang.String str = this.f15859d;
        sb6.append(str);
        sb6.append(" try cancel");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        az0.n7 n7Var = this.f15860e;
        kotlinx.coroutines.l.d(n7Var.f15746e, null, null, new az0.q5(str, n7Var, this.f15861f, null), 3, null);
        return jz5.f0.f302826a;
    }
}
