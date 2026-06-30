package bp4;

/* loaded from: classes10.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.o9 f104674a;

    /* renamed from: b, reason: collision with root package name */
    public final ym5.x2 f104675b;

    public d2(qk.o9 editor, ym5.x2 drawingView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editor, "editor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingView, "drawingView");
        this.f104674a = editor;
        this.f104675b = drawingView;
    }

    /* renamed from: equals */
    public boolean m10985xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp4.d2)) {
            return false;
        }
        bp4.d2 d2Var = (bp4.d2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104674a, d2Var.f104674a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104675b, d2Var.f104675b);
    }

    /* renamed from: hashCode */
    public int m10986x8cdac1b() {
        return (this.f104674a.hashCode() * 31) + this.f104675b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m10987x9616526c() {
        return "PhotoEditorViewData(editor=" + this.f104674a + ", drawingView=" + this.f104675b + ')';
    }
}
