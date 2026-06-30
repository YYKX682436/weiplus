package ku3;

/* loaded from: classes10.dex */
public final class i0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393784d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f393785e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393786f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393787g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f393788h;

    public i0(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        this.f393784d = kitContext;
        this.f393785e = jz5.h.b(new ku3.h0(parent));
        this.f393786f = jz5.h.b(new ku3.g0(parent));
        this.f393787g = jz5.h.b(new ku3.f0(parent));
        this.f393788h = parent.getContext();
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393785e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public final void b() {
        int i17 = this.f393784d.N6(10) == 0 ? com.p314xaae8f345.mm.R.raw.f79814x41d49f65 : com.p314xaae8f345.mm.R.raw.f80194x8f1a8525;
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393786f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).s(i17, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393787g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f393786f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb2).setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        b();
        a().setAlpha(0.0f);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393786f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).setOnClickListener(new ku3.u(this));
        a().mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(this.f393788h, 0, false));
        a().mo7960x6cab2c8d(new ku3.x(this));
        ku3.y yVar = new ku3.y(this);
        zt3.a aVar = this.f393784d;
        aVar.Q6(10, yVar);
        aVar.Q6(16, new ku3.z(this));
        aVar.R6(new ku3.e0(this));
    }
}
