package gm0;

/* loaded from: classes12.dex */
public class e0 implements l75.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f354714d;

    public e0(gm0.b0 b0Var) {
        this.f354714d = b0Var;
    }

    @Override // l75.i0
    public void d() {
        this.f354714d.f354682b.d();
    }

    @Override // l75.i0
    public void p() {
        gm0.b0 b0Var = this.f354714d;
        if (b0Var.f354687g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "summer preCloseCallback userConfigStg: " + b0Var.f354687g);
            b0Var.f354687g.i(true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = b0Var.f354687g.f276688k;
            if (n3Var != null) {
                n3Var.mo50299x35224f();
            }
        }
        b0Var.f354682b.p();
    }

    @Override // l75.i0
    public void u() {
        this.f354714d.f354682b.u();
    }
}
