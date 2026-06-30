package go0;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(go0.f0 f0Var, int i17) {
        super(0);
        this.f355280d = f0Var;
        this.f355281e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f1 f1Var = this.f355280d.f355300p;
        if (f1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMirrorMode mirrorMode:");
            int i17 = this.f355281e;
            sb6.append(i17);
            sb6.append(" mirror:");
            sb6.append(f1Var.f412492o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            f1Var.Q = i17;
        }
        return jz5.f0.f384359a;
    }
}
