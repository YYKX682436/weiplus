package rf3;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.p f476529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rf3.p pVar) {
        super(1);
        this.f476529d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        rf3.p pVar = this.f476529d;
        em.m1 m1Var = pVar.f476531v;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.m1 m1Var2 = pVar.f476531v;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        return jz5.f0.f384359a;
    }
}
