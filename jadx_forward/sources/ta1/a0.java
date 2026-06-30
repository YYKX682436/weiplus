package ta1;

/* loaded from: classes7.dex */
public class a0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.s0 f498133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.l0 f498134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f498135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498136h;

    public a0(ta1.q0 q0Var, ta1.t0 t0Var, ta1.s0 s0Var, ta1.l0 l0Var, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2) {
        this.f498136h = q0Var;
        this.f498132d = t0Var;
        this.f498133e = s0Var;
        this.f498134f = l0Var;
        this.f498135g = c4216x654bedf2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f498136h.f498198a.m77784x795fa299(new ta1.y(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: switch failed!");
            this.f498132d.a(1, -1, "view switch failed", null);
            this.f498135g.e(true, 0, new ta1.z(this));
        }
        return null;
    }
}
