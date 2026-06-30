package gk0;

/* loaded from: classes10.dex */
public abstract class x {
    public static final java.lang.String a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return "null";
        }
        return "[" + np0.a.a(bitmap) + ';' + bitmap.getWidth() + ';' + bitmap.getHeight() + ']';
    }
}
