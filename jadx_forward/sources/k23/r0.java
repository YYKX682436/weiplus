package k23;

/* loaded from: classes12.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f385210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f385212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f385213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385214h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i17, int i18, int i19, long j17, k23.v0 v0Var) {
        super(0);
        this.f385210d = i17;
        this.f385211e = i18;
        this.f385212f = i19;
        this.f385213g = j17;
        this.f385214h = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voiceAddr.onError(localCode=");
        int i17 = this.f385210d;
        sb6.append(i17);
        sb6.append(", errType=");
        sb6.append(this.f385211e);
        sb6.append(", errCode=");
        int i18 = this.f385212f;
        sb6.append(i18);
        sb6.append(", voiceid=");
        sb6.append(this.f385213g);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        k23.v0 v0Var = this.f385214h;
        v0Var.f385251m = false;
        k23.v0.x(this.f385214h, 7, "{\"errorCode\":" + i18 + ";\"errMsg\":\"error\";\"voiceId\":\"" + v0Var.f385243e + "\"}", null, 4, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = v0Var.f385239a;
        if (i17 == 12) {
            v0Var.D(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fh9));
        } else {
            v0Var.D(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fh_));
        }
        v0Var.s();
        return jz5.f0.f384359a;
    }
}
