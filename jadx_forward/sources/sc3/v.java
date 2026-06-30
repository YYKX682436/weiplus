package sc3;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f488076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(sc3.k1 k1Var, long j17) {
        super(0);
        this.f488075d = k1Var;
        this.f488076e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f488075d.S) {
            sc3.k1 k1Var = this.f488075d;
            if (!k1Var.f488007J) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "heartbeat tick#" + this.f488076e + " onPing localStatus:" + this.f488075d.G + " instanceName:" + this.f488075d.f488009e);
                    this.f488075d.H0().Oe();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f488075d.Q, "heartbeat tick#" + this.f488076e + " throwable: " + th6);
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f488075d.Q, "heartbeat tick#" + this.f488076e + " aborted before IPC: started=" + this.f488075d.S + ", destroying=" + this.f488075d.f488007J);
        return jz5.f0.f384359a;
    }
}
