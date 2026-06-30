package a82;

/* loaded from: classes11.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f83624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, a82.u1 u1Var) {
        super(1);
        this.f83623d = str;
        this.f83624e = u1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download cancelled by caller: ");
        java.lang.String str = this.f83623d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", sb6.toString());
        a82.u1 u1Var = this.f83624e;
        u1Var.f83713g.remove(str);
        u1Var.Ri(str);
        return jz5.f0.f384359a;
    }
}
