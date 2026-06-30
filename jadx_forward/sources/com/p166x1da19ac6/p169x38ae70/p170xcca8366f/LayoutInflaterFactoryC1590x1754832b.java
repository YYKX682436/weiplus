package com.p166x1da19ac6.p169x38ae70.p170xcca8366f;

/* renamed from: com.facebook.yoga.android.YogaViewLayoutFactory */
/* loaded from: classes15.dex */
public class LayoutInflaterFactoryC1590x1754832b implements android.view.LayoutInflater.Factory {

    /* renamed from: sYogaViewLayoutFactory */
    private static com.p166x1da19ac6.p169x38ae70.p170xcca8366f.LayoutInflaterFactoryC1590x1754832b f5266x85675898;

    /* renamed from: getInstance */
    public static com.p166x1da19ac6.p169x38ae70.p170xcca8366f.LayoutInflaterFactoryC1590x1754832b m17092x9cf0d20b() {
        if (f5266x85675898 == null) {
            f5266x85675898 = new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.LayoutInflaterFactoryC1590x1754832b();
        }
        return f5266x85675898;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if ("YogaLayout".equals(str)) {
            return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda(context, attributeSet);
        }
        if ("VirtualYogaLayout".equals(str)) {
            return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05(context, attributeSet);
        }
        return null;
    }
}
