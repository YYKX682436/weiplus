package cj5;

/* loaded from: classes.dex */
public class j extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123680d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123680d = jz5.h.b(new cj5.i(this));
        this.f123681e = jz5.h.b(new cj5.g(this));
    }

    public final android.widget.EditText U6() {
        return (android.widget.EditText) ((jz5.n) this.f123681e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.h(this));
    }
}
