package rx4;

/* loaded from: classes3.dex */
public final class n2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f482774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482774d = jz5.h.b(new rx4.j2(activity));
    }

    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 T6() {
        return (com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f482774d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        S6(rx4.k2.f482750d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        T6().f291933e = new rx4.l2(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        T6().d();
        T6().f291933e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        T6().d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        m80380x71e92c1d().post(new rx4.m2(this));
    }
}
