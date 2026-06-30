package hu0;

/* loaded from: classes3.dex */
public final class k extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getResources().getDisplayMetrics().density * 12.0f);
    }
}
