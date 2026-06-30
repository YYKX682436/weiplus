package nr2;

/* loaded from: classes3.dex */
public final class u extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ym5.x.a(view.getContext(), 8.0f));
    }
}
