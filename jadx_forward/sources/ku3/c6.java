package ku3;

/* loaded from: classes3.dex */
public final class c6 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393716d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f393717e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393718f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393719g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f393720h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393721i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f393722m;

    public c6(zt3.a kitContext, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f393716d = kitContext;
        this.f393717e = parent;
        this.f393718f = jz5.h.b(new ku3.s5(this));
        this.f393719g = jz5.h.b(new ku3.t5(this));
        this.f393720h = jz5.h.b(new ku3.a6(this));
        this.f393721i = jz5.h.b(new ku3.b6(this));
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393718f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.View b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393719g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393721i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        this.f393722m = false;
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.f393722m = true;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.w5 w5Var = new ku3.w5(this);
        zt3.a aVar = this.f393716d;
        aVar.R6(w5Var);
        aVar.Q6(10, new ku3.x5(this));
        a().setOnClickListener(new ku3.y5(this));
        b().setOnClickListener(new ku3.z5(this));
    }
}
