package rc3;

/* loaded from: classes7.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(rc3.w0 w0Var, int i17, int i18, int i19) {
        super(0);
        this.f475551d = w0Var;
        this.f475552e = i17;
        this.f475553f = i18;
        this.f475554g = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475551d;
        java.lang.String str = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f475552e;
        sb6.append(i17);
        sb6.append(" post update, size = (");
        int i18 = this.f475553f;
        sb6.append(i18);
        sb6.append(", ");
        int i19 = this.f475554g;
        sb6.append(i19);
        sb6.append("), has service?");
        sb6.append(w0Var.A != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.cj(i17, i18, i19);
        }
        return jz5.f0.f384359a;
    }
}
