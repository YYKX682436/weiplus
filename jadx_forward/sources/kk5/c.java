package kk5;

/* loaded from: classes.dex */
public abstract class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f390150d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f390151e;

    /* renamed from: f, reason: collision with root package name */
    public long f390152f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f390153g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f390154h;

    /* renamed from: i, reason: collision with root package name */
    public final int f390155i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f390150d = jz5.h.b(kk5.a.f390143d);
        this.f390151e = jz5.h.b(kk5.b.f390146d);
        this.f390153g = "yuanbao_enter_h5";
        this.f390154h = "yuanbao_h5_page_out";
        this.f390155i = 35480;
    }

    public abstract java.util.Map T6();

    public abstract java.util.Map U6();

    public abstract java.lang.String V6();

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f390152f = java.lang.System.currentTimeMillis();
        dy1.r rVar = (dy1.r) ((jz5.n) this.f390150d).mo141623x754a37bb();
        ((cy1.a) rVar).Ej(this.f390153g, kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) this.f390151e).mo141623x754a37bb())).nj(V6()), T6()), this.f390155i);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        dy1.r rVar = (dy1.r) ((jz5.n) this.f390150d).mo141623x754a37bb();
        jz5.g gVar = this.f390151e;
        ((cy1.a) rVar).Ej(this.f390154h, kz5.c1.m(kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) gVar).mo141623x754a37bb())).nj(V6()), kz5.b1.e(new jz5.l("stay_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f390152f)))), U6()), this.f390155i);
        ((qg5.e3) ((ct.k3) ((jz5.n) gVar).mo141623x754a37bb())).oj(V6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) m158354x19263085 : null;
        java.lang.String G7 = viewOnCreateContextMenuListenerC19337x37f3384d != null ? viewOnCreateContextMenuListenerC19337x37f3384d.G7() : null;
        if (G7 == null) {
            G7 = "";
        }
        ((qg5.e3) ((ct.k3) ((jz5.n) this.f390151e).mo141623x754a37bb())).rj(V6(), kz5.b1.e(new jz5.l("webview_session_id", G7)));
    }
}
