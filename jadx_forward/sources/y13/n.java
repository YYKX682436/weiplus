package y13;

/* loaded from: classes8.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f540424d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f540425e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f540426f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f540427g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f540428h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f540429i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f540430m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f540424d = jz5.h.b(new y13.g(this));
        this.f540425e = jz5.h.b(new y13.i(this));
        this.f540426f = jz5.h.b(new y13.e(this));
        this.f540427g = jz5.h.b(new y13.h(this));
        this.f540428h = jz5.h.b(new y13.m(this));
        this.f540429i = jz5.h.b(new y13.j(this));
        this.f540430m = jz5.h.b(y13.l.f540422d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
        jz5.g gVar = this.f540425e;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((hn1.s) b0Var).Ai((android.widget.ImageView) mo141623x754a37bb, "wxid_wi_1d142z0zdj03");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f540427g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.LinearLayout) mo141623x754a37bb2).setOnClickListener(new y13.k(this));
        java.lang.String r17 = i65.a.r(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.p0a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        xj.m mVar = new xj.m("", r17, "", "", "", null, null, false);
        java.lang.String str = com.p314xaae8f345.mm.ui.bk.C() ? mVar.f536290e : mVar.f536289d;
        if (!r26.n0.N(str)) {
            int f17 = i65.a.f(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajs);
            gk0.k kVar = new gk0.k(f17, f17);
            kVar.f353966d = 0.5f;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ((h83.g) n0Var).wi((android.widget.ImageView) mo141623x754a37bb3, str, kVar);
        }
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f540428h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb4).setText(mVar.f536287b);
        java.lang.String str2 = mVar.f536288c;
        boolean z17 = !r26.n0.N(str2);
        jz5.g gVar2 = this.f540429i;
        if (z17) {
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb5).setText(str2);
            java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb6).setVisibility(0);
        } else {
            java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb7).setVisibility(8);
        }
        vh0.z0 z0Var = (vh0.z0) i95.n0.c(vh0.z0.class);
        java.lang.Object mo141623x754a37bb8 = ((jz5.n) this.f540426f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
        ((vh0.x1) z0Var).wi((android.view.ViewGroup) mo141623x754a37bb8, mVar, new y13.f(this));
    }
}
