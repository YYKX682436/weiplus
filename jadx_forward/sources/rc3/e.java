package rc3;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rc3.w0 w0Var) {
        super(0);
        this.f475505d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475505d;
        if (w0Var.A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f475638z, "destroy when server is not initialized");
            rc3.w0.e(w0Var);
        } else {
            w0Var.M(new rc3.d(w0Var));
        }
        return jz5.f0.f384359a;
    }
}
