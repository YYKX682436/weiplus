package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes4.dex */
public abstract class we {
    public static void a(android.graphics.Canvas canvas, android.view.View view, float f17, float f18) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof android.view.TextureView) {
            android.graphics.Bitmap bitmap = ((android.view.TextureView) view).getBitmap(view.getWidth(), view.getHeight());
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            canvas.drawBitmap(bitmap, f17, f18, (android.graphics.Paint) null);
            return;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            canvas.save();
            canvas.translate(f17, f18);
            view.draw(canvas);
            canvas.restore();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            a(canvas, childAt, childAt.getX() + f17, childAt.getY() + f18);
        }
    }

    public static boolean b(android.view.ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        boolean z17 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.view.TextureView) {
                z17 = true;
            }
            if (childAt instanceof android.view.ViewGroup) {
                z17 = b((android.view.ViewGroup) childAt);
            }
            if (z17) {
                break;
            }
        }
        return z17;
    }
}
