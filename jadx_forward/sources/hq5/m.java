package hq5;

/* loaded from: classes5.dex */
public class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364779f;

    /* renamed from: g, reason: collision with root package name */
    public int f364780g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f364781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364777d = "MicroMsg.WeDrop.WeDropNotificationPushUIC";
        this.f364778e = 539361808;
        this.f364781h = jz5.h.b(new hq5.k(this));
    }

    public final android.app.NotificationManager T6(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.l(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f364779f = m158359x1e885992().getBooleanExtra("isSender", false);
        ((com.p314xaae8f345.mm.app.s2) ((jz5.n) this.f364781h).mo141623x754a37bb()).m43071x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.app.s2) ((jz5.n) this.f364781h).mo141623x754a37bb()).m43072x2efc64();
    }
}
