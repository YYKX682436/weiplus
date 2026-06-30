package hr3;

/* loaded from: classes9.dex */
public class z6 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a7 f365766d;

    public z6(hr3.a7 a7Var) {
        this.f365766d = a7Var;
    }

    @Override // c01.da
    public boolean a() {
        return this.f365766d.f364918n;
    }

    @Override // c01.da
    public void c() {
        hr3.a7 a7Var = this.f365766d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = a7Var.f364917m;
        if (u3Var != null) {
            u3Var.dismiss();
            a7Var.f364917m = null;
        }
    }
}
