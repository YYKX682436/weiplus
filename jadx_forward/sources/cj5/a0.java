package cj5;

/* loaded from: classes.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f123594d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f123595e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123594d = "";
        this.f123596f = jz5.h.b(new cj5.z(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        m158359x1e885992().getStringExtra("msgQuoteName");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f123594d = stringExtra;
        this.f123595e = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f123594d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.L2(m158354x19263085(), new cj5.x(this, h0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), new cj5.y(this));
    }
}
