package fg3;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.g f343965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fg3.g gVar) {
        super(1);
        this.f343965d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        fg3.g gVar = this.f343965d;
        em.m1 m1Var = gVar.f343966v;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        em.m1 m1Var2 = gVar.f343966v;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.m1 m1Var3 = gVar.f343966v;
        if (m1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var3.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnShare(...)");
        visibility.c(c17);
        return jz5.f0.f384359a;
    }
}
