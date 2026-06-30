package az0;

/* loaded from: classes5.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(int i17, az0.n7 n7Var) {
        super(1);
        this.f15499d = i17;
        this.f15500e = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendNext: cancel recommend ");
        int i17 = this.f15499d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.w("MicroMsg.MaasMovieSessionManager", sb6.toString());
        this.f15500e.f15742a.cancelTemplateRecommend(i17);
        return jz5.f0.f302826a;
    }
}
