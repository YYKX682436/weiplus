package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        try {
            view.getBackground().setCallback(null);
            view.setBackgroundDrawable(null);
        } catch (java.lang.Throwable unused) {
        }
        try {
            view.destroyDrawingCache();
        } catch (java.lang.Throwable unused2) {
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
