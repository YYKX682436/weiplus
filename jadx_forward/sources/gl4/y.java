package gl4;

/* loaded from: classes11.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f354427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4990x83627a9 f354428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f354431h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9, gl4.z zVar, android.content.Context context, qk.y8 y8Var) {
        super(1);
        this.f354427d = u3Var;
        this.f354428e = c4990x83627a9;
        this.f354429f = zVar;
        this.f354430g = context;
        this.f354431h = y8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.w80 w80Var = (bw5.w80) obj;
        this.f354427d.dismiss();
        qk.y8 y8Var = this.f354431h;
        if (w80Var != null) {
            com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9 = this.f354428e;
            c4990x83627a9.f134745e = w80Var;
            this.f354429f.e((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) this.f354430g, c4990x83627a9, w80Var, y8Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe fetchJoinInfo failed");
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f445669f, null));
            }
        }
        return jz5.f0.f384359a;
    }
}
