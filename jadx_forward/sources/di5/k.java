package di5;

/* loaded from: classes12.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.m f314336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(di5.m mVar) {
        super(1);
        this.f314336d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        di5.m mVar = this.f314336d;
        em.j1 j1Var = mVar.f314338v;
        if (j1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = j1Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.j1 j1Var2 = mVar.f314338v;
        if (j1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = j1Var2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        em.j1 j1Var3 = mVar.f314338v;
        if (j1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.LinearLayout d17 = j1Var3.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getGalleryFinderPostBtn(...)");
        visibility.c(d17);
        return jz5.f0.f384359a;
    }
}
