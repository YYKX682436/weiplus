package yt3;

/* loaded from: classes3.dex */
public final class q2 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f547140d;

    /* renamed from: e, reason: collision with root package name */
    public final yt3.j2 f547141e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f547142f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f547143g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f547144h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f547145i;

    public q2(android.view.ViewGroup container, ju3.d0 status, yt3.j2 actionProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionProxy, "actionProxy");
        this.f547140d = status;
        this.f547141e = actionProxy;
        jz5.g b17 = jz5.h.b(new yt3.p2(container));
        this.f547142f = jz5.h.b(new yt3.k2(container));
        jz5.g b18 = jz5.h.b(new yt3.l2(container));
        this.f547143g = b18;
        jz5.g b19 = jz5.h.b(new yt3.o2(container));
        this.f547144h = b19;
        jz5.g b27 = jz5.h.b(new yt3.m2(container));
        this.f547145i = b27;
        jz5.g b28 = jz5.h.b(new yt3.n2(container));
        a().setVisibility(0);
        java.lang.Object mo141623x754a37bb = ((jz5.n) b18).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) b18).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.ImageView) mo141623x754a37bb).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(((android.widget.ImageView) mo141623x754a37bb2).getContext(), com.p314xaae8f345.mm.R.raw.f79677xc84c9668, -1));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb3).setTextColor(-1);
        a().setOnClickListener(this);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) b19).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.view.View) mo141623x754a37bb4).setOnClickListener(new yt3.g2(this));
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) b27).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        ((android.view.View) mo141623x754a37bb5).setOnClickListener(new yt3.h2(this));
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) b28).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        ((android.view.View) mo141623x754a37bb6).setOnClickListener(new yt3.i2(this));
    }

    public final android.view.ViewGroup a() {
        java.lang.Object mo141623x754a37bb = this.f547142f.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f547140d, ju3.c0.H1, null, 2, null);
        nu3.i iVar = nu3.i.f421751a;
        iVar.b(10);
        nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        android.view.ViewGroup a17 = a();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f547143g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        a17.announceForAccessibility(i65.a.r(((android.widget.ImageView) mo141623x754a37bb).getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571499gv));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        a().setVisibility(i17);
    }
}
