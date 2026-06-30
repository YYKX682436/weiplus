package fm3;

/* loaded from: classes2.dex */
public abstract class x {
    public static final fm3.w a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new fm3.w(view instanceof android.widget.ImageView ? ((android.widget.ImageView) view).getDrawable() : null, new android.graphics.Point(iArr[0], iArr[1]), new android.util.Size(view.getWidth(), view.getHeight()));
    }
}
