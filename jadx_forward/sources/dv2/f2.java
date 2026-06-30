package dv2;

/* loaded from: classes3.dex */
public final class f2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f325385d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f325386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325386e = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(m158354x19263085());
        this.f325385d = f5Var;
        f5Var.f291933e = this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f325385d;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f325385d;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        java.util.Iterator it = new java.util.ArrayList(this.f325386e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.c5) it.next()).w2(i17, z17);
        }
    }
}
