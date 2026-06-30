package a82;

/* loaded from: classes11.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f2091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, a82.u1 u1Var) {
        super(1);
        this.f2090d = str;
        this.f2091e = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download cancelled by caller: ");
        java.lang.String str = this.f2090d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", sb6.toString());
        a82.u1 u1Var = this.f2091e;
        u1Var.f2180g.remove(str);
        u1Var.Ri(str);
        return jz5.f0.f302826a;
    }
}
