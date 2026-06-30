package hr3;

/* loaded from: classes9.dex */
public class i6 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365182d;

    public i6(hr3.t6 t6Var) {
        this.f365182d = t6Var;
    }

    @Override // c01.da
    public boolean a() {
        return this.f365182d.I;
    }

    @Override // c01.da
    public void c() {
        hr3.t6 t6Var = this.f365182d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = t6Var.H;
        if (u3Var != null) {
            u3Var.dismiss();
            t6Var.H = null;
        }
    }
}
