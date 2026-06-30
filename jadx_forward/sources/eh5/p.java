package eh5;

/* loaded from: classes13.dex */
public final class p extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        float f17 = -view.getTranslationY();
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        int i17 = (int) f17;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            outline.setEmpty();
            return;
        }
        if (i17 > height) {
            i17 = height;
        }
        outline.setRect(0, i17, width, height);
    }
}
