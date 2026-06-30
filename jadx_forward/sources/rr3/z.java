package rr3;

/* loaded from: classes3.dex */
public final class z extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f480754d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f480755e;

    /* renamed from: f, reason: collision with root package name */
    public int f480756f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f480757g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f480758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f480754d = jz5.h.b(new rr3.s(activity));
        this.f480755e = jz5.h.b(new rr3.w(activity));
        this.f480756f = 1;
        this.f480758h = jz5.h.b(new rr3.v(activity));
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f480754d).mo141623x754a37bb();
    }

    public final android.widget.Button P6() {
        return (android.widget.Button) ((jz5.n) this.f480755e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (qr3.o.f447635m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoAuthScopeUIC", "staticResp == null");
            m158354x19263085().finish();
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179());
            c1162x665295de.Q(1);
            O6().mo7967x900dcbe1(c1162x665295de);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6 = O6();
            r45.n14 n14Var = qr3.o.f447635m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n14Var);
            java.util.LinkedList privacy_scope_item_list = n14Var.f462525f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(privacy_scope_item_list, "privacy_scope_item_list");
            O6.mo7960x6cab2c8d(new rr3.r(privacy_scope_item_list, this));
        }
        P6().post(new rr3.u(this));
        P6().setOnClickListener(new rr3.t(this));
    }
}
