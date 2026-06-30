package fb3;

/* loaded from: classes.dex */
public final class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342400d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342401e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f342402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342400d = "";
        this.f342401e = "";
        this.f342402f = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
        m158354x19263085().setResult(-1, intent);
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        ot5.g.c("MicroMsg.SendRedCoverAppMsgUIC", "onCreate");
        this.f342400d = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KSendRedCoverAppMsgRequestUrl"));
        m158359x1e885992().getIntExtra("KSendRedCoverAppMsgRequestCode", 217);
        this.f342401e = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KSendRedCoverAppMsgSessionId"));
        this.f342402f = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KSendRedCoverAppMsgCoverId"));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29977, 1, this.f342402f, "", this.f342401e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new fb3.i(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }
}
