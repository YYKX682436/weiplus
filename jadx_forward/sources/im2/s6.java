package im2;

/* loaded from: classes2.dex */
public final class s6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374064d;

    /* renamed from: e, reason: collision with root package name */
    public r45.u62 f374065e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f374066f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f374067g;

    /* renamed from: h, reason: collision with root package name */
    public vd2.v2 f374068h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f374069i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f374070m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f374064d = "FinderLiveVisitorLoadDataUIC@" + hashCode() + '}';
        this.f374069i = jz5.h.b(im2.p6.f374034d);
        this.f374070m = jz5.h.b(im2.r6.f374053d);
    }

    public final void O6(db2.q5 netScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        r45.u62 u62Var = this.f374065e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f374066f;
        if (u62Var == null || gVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374064d, "fillRelatedCgi pullType:" + u62Var.m75939xb282bd08(1) + ", liveCookies:" + android.util.Base64.encodeToString(gVar.g(), 0));
        netScene.N().set(25, gVar);
        this.f374065e = null;
        this.f374066f = null;
    }

    public final int P6() {
        return ((java.lang.Number) ((jz5.n) this.f374069i).mo141623x754a37bb()).intValue();
    }
}
