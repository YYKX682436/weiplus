package kg3;

/* loaded from: classes8.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final float a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return 0.0f;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, iArr[1], view.getWidth() + i17, iArr[1] + view.getHeight());
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (!rect3.setIntersect(rect2, rect)) {
            return 0.0f;
        }
        int width = rect3.width() * rect3.height();
        int width2 = view.getWidth() * view.getHeight();
        if (width2 <= 0) {
            return 0.0f;
        }
        return width / width2;
    }
}
