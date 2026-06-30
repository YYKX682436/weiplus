package j93;

/* loaded from: classes.dex */
public final class e2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f379909d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f379910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f379909d = jz5.h.b(new j93.d2(this));
        this.f379910e = jz5.h.b(new j93.b2(this));
        this.f379911f = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.mo2273x9d4787cb(i17, i18, intent);
        jz5.g gVar = this.f379909d;
        if (i18 == -1 && i17 == 1 && intent != null && (stringExtra = intent.getStringExtra("Contact_User")) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.s(ri5.j.I.a(stringExtra, ri5.j.Z, 0));
            }
        }
        java.util.ArrayList P1 = b93.r.wi().P1((java.lang.String) ((jz5.n) this.f379910e).mo141623x754a37bb());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1) || P1.contains(this.f379911f)) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(k18);
        if (a18 != null) {
            a18.s(ri5.j.I.a(this.f379911f, ri5.j.Z, 0));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new j93.c2(this));
    }
}
