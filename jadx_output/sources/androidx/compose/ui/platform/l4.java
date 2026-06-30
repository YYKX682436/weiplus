package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class l4 extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        android.graphics.Outline b17 = ((androidx.compose.ui.platform.p4) view).f10693h.b();
        kotlin.jvm.internal.o.d(b17);
        outline.set(b17);
    }
}
