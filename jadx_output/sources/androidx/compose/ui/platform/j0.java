package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.j0 f10610a = new androidx.compose.ui.platform.j0();

    public final void a(android.view.View view, p1.p pVar) {
        android.view.PointerIcon systemIcon;
        kotlin.jvm.internal.o.g(view, "view");
        if (pVar instanceof p1.a) {
            android.content.Context context = view.getContext();
            ((p1.a) pVar).getClass();
            systemIcon = android.view.PointerIcon.getSystemIcon(context, 0);
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (kotlin.jvm.internal.o.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
