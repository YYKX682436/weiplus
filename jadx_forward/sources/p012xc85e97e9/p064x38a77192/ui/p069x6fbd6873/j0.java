package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j0 f92143a = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j0();

    public final void a(android.view.View view, p1.p pVar) {
        android.view.PointerIcon systemIcon;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (pVar instanceof p1.a) {
            android.content.Context context = view.getContext();
            ((p1.a) pVar).getClass();
            systemIcon = android.view.PointerIcon.getSystemIcon(context, 0);
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
