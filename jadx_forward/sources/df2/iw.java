package df2;

/* loaded from: classes3.dex */
public final class iw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.kw f311965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gw1 f311966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(df2.kw kwVar, r45.gw1 gw1Var) {
        super(0);
        this.f311965d = kwVar;
        this.f311966e = gw1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f311965d.f312136m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("guideInfoItem:");
        r45.gw1 gw1Var = this.f311966e;
        sb6.append(gw1Var.m75945x2fec8307(2));
        sb6.append(", id:");
        sb6.append(gw1Var.m75945x2fec8307(0));
        sb6.append(" showed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
