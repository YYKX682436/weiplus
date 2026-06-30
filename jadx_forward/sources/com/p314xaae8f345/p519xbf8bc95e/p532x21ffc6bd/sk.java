package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sk extends android.widget.ImageView {
    public sk(android.content.Context context) {
        super(context);
        setClickable(true);
    }

    public final void a(android.content.Context context, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        stateListDrawable.addState(android.view.View.PRESSED_ENABLED_STATE_SET, new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap2));
        stateListDrawable.addState(android.view.View.ENABLED_STATE_SET, bitmapDrawable);
        setBackgroundDrawable(stateListDrawable);
    }

    private void a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        android.graphics.drawable.NinePatchDrawable ninePatchDrawable = new android.graphics.drawable.NinePatchDrawable(getResources(), bitmap, bitmap.getNinePatchChunk(), new android.graphics.Rect(), null);
        android.graphics.drawable.NinePatchDrawable ninePatchDrawable2 = new android.graphics.drawable.NinePatchDrawable(getResources(), bitmap2, bitmap2.getNinePatchChunk(), new android.graphics.Rect(), null);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(android.view.View.PRESSED_ENABLED_STATE_SET, ninePatchDrawable2);
        stateListDrawable.addState(android.view.View.ENABLED_STATE_SET, ninePatchDrawable);
        setBackgroundDrawable(stateListDrawable);
    }

    private void a() {
        setClickable(false);
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            background.setCallback(null);
        }
        setBackgroundDrawable(null);
    }
}
