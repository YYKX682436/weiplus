package rc3;

/* loaded from: classes7.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f475542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(rc3.w0 w0Var, int i17, int i18, int i19, android.view.Surface surface) {
        super(0);
        this.f475538d = w0Var;
        this.f475539e = i17;
        this.f475540f = i18;
        this.f475541g = i19;
        this.f475542h = surface;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475538d;
        java.lang.String str = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f475539e;
        sb6.append(i17);
        sb6.append(" post create, size = (");
        int i18 = this.f475540f;
        sb6.append(i18);
        sb6.append(", ");
        int i19 = this.f475541g;
        sb6.append(i19);
        sb6.append("), has service?");
        sb6.append(w0Var.A != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.pg(i17, this.f475542h, i18, i19);
        }
        w0Var.S(new rc3.h0(w0Var, i17));
        return jz5.f0.f384359a;
    }
}
