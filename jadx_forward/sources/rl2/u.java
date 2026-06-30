package rl2;

/* loaded from: classes8.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f478744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, l75.a1 a1Var) {
        super(0);
        this.f478743d = str;
        this.f478744e = a1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rl2.n nVar = rl2.v.f478745e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyConversationChanged ");
        java.lang.String str = this.f478743d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", sb6.toString());
        l75.a1 a1Var = this.f478744e;
        a1Var.b(3, a1Var, str);
        return jz5.f0.f384359a;
    }
}
