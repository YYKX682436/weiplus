package az0;

/* loaded from: classes5.dex */
public final class p6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(java.lang.String str, az0.n7 n7Var) {
        super(1);
        this.f15809d = str;
        this.f15810e = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithMusicID: " + this.f15809d + " try cancel");
        az0.n7 n7Var = this.f15810e;
        n7Var.f15747f = kotlinx.coroutines.l.d(n7Var.f15746e, null, null, new az0.o6(n7Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
