package fb3;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342389d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342390e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f342391f;

    /* renamed from: g, reason: collision with root package name */
    public int f342392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342389d = "";
        this.f342390e = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == this.f342392g && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                ot5.g.c("MicroMsg.QuickSendRedPacketUIC", "unknown finish activity reason, do nothing");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS");
            m158354x19263085().setResult(-1, intent2);
            m158354x19263085().finish();
        }
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
        ot5.g.c("MicroMsg.QuickSendRedPacketUIC", "onCreate");
        this.f342389d = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KQuickSendRedPacketMaterialId"));
        this.f342390e = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KQuickSendRedPacketSessionId"));
        this.f342391f = m158359x1e885992().getBooleanExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", false);
        this.f342392g = m158359x1e885992().getIntExtra("KQuickSendRedPacketRequestCode", 215);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new fb3.d(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }
}
