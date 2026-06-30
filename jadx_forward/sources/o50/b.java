package o50;

/* loaded from: classes.dex */
public final class b extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f424592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Select_Conv_User");
        this.f424592d = r26.n0.f0(stringExtra == null ? "" : stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new o50.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans AfterForwardEnterChattingUIC onCreateAfter ".concat(m158354x19263085().getClass().getSimpleName()));
    }
}
