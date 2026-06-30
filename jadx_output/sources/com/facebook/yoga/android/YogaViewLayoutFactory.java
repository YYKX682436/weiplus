package com.facebook.yoga.android;

/* loaded from: classes15.dex */
public class YogaViewLayoutFactory implements android.view.LayoutInflater.Factory {
    private static com.facebook.yoga.android.YogaViewLayoutFactory sYogaViewLayoutFactory;

    public static com.facebook.yoga.android.YogaViewLayoutFactory getInstance() {
        if (sYogaViewLayoutFactory == null) {
            sYogaViewLayoutFactory = new com.facebook.yoga.android.YogaViewLayoutFactory();
        }
        return sYogaViewLayoutFactory;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if ("YogaLayout".equals(str)) {
            return new com.facebook.yoga.android.YogaLayout(context, attributeSet);
        }
        if ("VirtualYogaLayout".equals(str)) {
            return new com.facebook.yoga.android.VirtualYogaLayout(context, attributeSet);
        }
        return null;
    }
}
