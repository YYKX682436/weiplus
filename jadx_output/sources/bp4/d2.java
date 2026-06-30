package bp4;

/* loaded from: classes10.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.o9 f23141a;

    /* renamed from: b, reason: collision with root package name */
    public final ym5.x2 f23142b;

    public d2(qk.o9 editor, ym5.x2 drawingView) {
        kotlin.jvm.internal.o.g(editor, "editor");
        kotlin.jvm.internal.o.g(drawingView, "drawingView");
        this.f23141a = editor;
        this.f23142b = drawingView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp4.d2)) {
            return false;
        }
        bp4.d2 d2Var = (bp4.d2) obj;
        return kotlin.jvm.internal.o.b(this.f23141a, d2Var.f23141a) && kotlin.jvm.internal.o.b(this.f23142b, d2Var.f23142b);
    }

    public int hashCode() {
        return (this.f23141a.hashCode() * 31) + this.f23142b.hashCode();
    }

    public java.lang.String toString() {
        return "PhotoEditorViewData(editor=" + this.f23141a + ", drawingView=" + this.f23142b + ')';
    }
}
