package az0;

/* loaded from: classes5.dex */
public final class g6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f97032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(int i17, az0.n7 n7Var) {
        super(1);
        this.f97032d = i17;
        this.f97033e = n7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendNext: cancel recommend ");
        int i17 = this.f97032d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasMovieSessionManager", sb6.toString());
        this.f97033e.f97275a.m33376x57446208(i17);
        return jz5.f0.f384359a;
    }
}
