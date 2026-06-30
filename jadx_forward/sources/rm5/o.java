package rm5;

/* loaded from: classes10.dex */
public abstract class o {
    public static final void a(android.graphics.Rect rect, android.graphics.Rect target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        float width = (target.width() * 1.0f) / rect.width();
        float height = (target.height() * 1.0f) / rect.height();
        if (width > height) {
            int height2 = (int) (((rect.height() * width) - target.height()) / 2);
            rect.set(target);
            rect.top -= height2;
            rect.bottom += height2;
            return;
        }
        int width2 = (int) (((rect.width() * height) - target.width()) / 2);
        rect.set(target);
        rect.left -= width2;
        rect.right += width2;
    }

    public static final void b(android.graphics.Rect rect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "<this>");
        rect.bottom = (int) (rect.bottom * f17);
        rect.left = (int) (rect.left * f17);
        rect.right = (int) (rect.right * f17);
        rect.top = (int) (rect.top * f17);
    }
}
