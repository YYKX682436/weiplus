package gp2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f355860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gp2.l0 l0Var, int i17, zy2.g5 g5Var) {
        super(1);
        this.f355858d = l0Var;
        this.f355859e = i17;
        this.f355860f = g5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f355858d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "switchCompleteCallback: result=" + intValue);
        if (intValue == -1) {
            l0Var.L(this.f355859e);
        }
        ((zy2.p7) this.f355860f).mo61224x6e59aab0(null);
        return jz5.f0.f384359a;
    }
}
