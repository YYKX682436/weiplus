package go0;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(go0.f0 f0Var, boolean z17) {
        super(0);
        this.f355332d = f0Var;
        this.f355333e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f1 f1Var = this.f355332d.f355300p;
        if (f1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("renderBlendToScreen from ");
            sb6.append(f1Var.f355310z);
            sb6.append(" to ");
            boolean z17 = this.f355333e;
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            f1Var.f355310z = z17;
        }
        return jz5.f0.f384359a;
    }
}
