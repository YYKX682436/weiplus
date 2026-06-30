package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView */
/* loaded from: classes5.dex */
public class C18148x10c56086 extends android.widget.ImageView {
    public C18148x10c56086(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField(z17 ? "mDrawingCache" : "mUnscaledDrawingCache");
            declaredField.setAccessible(true);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) declaredField.get(this);
            if (bitmap != null) {
                java.lang.String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimelineRefreshImageView", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        getWidth();
        getHeight();
        hashCode();
        super.buildDrawingCache(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        super.destroyDrawingCache();
        getWidth();
        getHeight();
        hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    public C18148x10c56086(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
