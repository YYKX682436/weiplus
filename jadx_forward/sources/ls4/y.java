package ls4;

/* loaded from: classes8.dex */
public final class y implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f402645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ic5 f402646b;

    public y(ls4.e0 e0Var, r45.ic5 ic5Var) {
        this.f402645a = e0Var;
        this.f402646b = ic5Var;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        ls4.e0 e0Var = this.f402645a;
        if (ma5Var != null && ma5Var.f461840e == 3) {
            e0Var.c(this.f402646b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "click intercept");
            e0Var.f402580a.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
        }
    }
}
