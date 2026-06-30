package du3;

/* loaded from: classes3.dex */
public final class j0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325164f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325165g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325164f = parent;
        this.f325165g = jz5.h.b(new du3.c0(this));
        this.f325166h = jz5.h.b(new du3.i0(this));
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        android.view.View z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(z17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(z17, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar = this.f325166h;
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(2, new du3.e0(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(3, new du3.f0(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(4, new du3.g0(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).a7(1, new du3.h0(this));
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        z().setOnClickListener(new du3.d0(this));
    }

    public final android.view.View z() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325165g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }
}
