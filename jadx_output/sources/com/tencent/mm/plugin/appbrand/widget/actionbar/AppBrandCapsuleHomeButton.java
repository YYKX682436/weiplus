package com.tencent.mm.plugin.appbrand.widget.actionbar;

/* loaded from: classes7.dex */
public final class AppBrandCapsuleHomeButton extends com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton {
    public AppBrandCapsuleHomeButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton
    public java.lang.String getDefaultAccessibilityLabel() {
        return getContext().getString(com.tencent.mm.R.string.f490018im);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton
    public android.graphics.drawable.Drawable getDefaultImageDrawable() {
        return b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.f480771bv5);
    }

    public AppBrandCapsuleHomeButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
