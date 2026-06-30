package ku3;

/* loaded from: classes3.dex */
public final class m4 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393851d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f393852e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393853f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393854g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f393855h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393856i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393857m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393858n;

    /* renamed from: o, reason: collision with root package name */
    public final su3.d f393859o;

    /* renamed from: p, reason: collision with root package name */
    public float f393860p;

    /* renamed from: q, reason: collision with root package name */
    public int f393861q;

    public m4(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f393851d = kitContext;
        this.f393852e = parent;
        this.f393853f = jz5.h.b(new ku3.z3(this));
        this.f393854g = jz5.h.b(new ku3.a4(this));
        this.f393855h = jz5.h.b(new ku3.b4(this));
        this.f393856i = jz5.h.b(new ku3.c4(this));
        this.f393857m = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562620kd);
        this.f393858n = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562621ke);
        this.f393859o = new su3.d();
        ou3.h hVar = ou3.h.f430477e;
        this.f393861q = 0;
    }

    public final android.view.View a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393853f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393854g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.View c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393855h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.h4 h4Var = new ku3.h4(this);
        zt3.a aVar = this.f393851d;
        aVar.Q6(12, h4Var);
        aVar.Q6(10, new ku3.j4(this));
        aVar.R6(new ku3.l4(this));
        a().setOnClickListener(ku3.d4.f393731d);
        c().setBackground(this.f393858n);
        b().s(com.p314xaae8f345.mm.R.raw.f79979x9f7094b3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f393852e.getContext());
        c1162x665295de.Q(0);
        jz5.g gVar = this.f393856i;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb).mo7967x900dcbe1(c1162x665295de);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        su3.d dVar = this.f393859o;
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7960x6cab2c8d(dVar);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb3).N(new tu3.a(dVar.mo1894x7e414b06()));
        dVar.f494310f = new ku3.e4(this);
        c().setOnClickListener(new ku3.g4(this));
    }
}
