package ud4;

/* loaded from: classes13.dex */
public class b0 implements android.animation.TypeEvaluator {
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
    }

    public int a(int i17, int i18, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        int i19 = (int) (i17 + (f17 * (i18 - i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        return i19;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        android.graphics.Rect rect2 = (android.graphics.Rect) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        android.graphics.Rect rect3 = new android.graphics.Rect(a(rect.left, rect2.left, f17), a(rect.top, rect2.top, f17), a(rect.right, rect2.right, f17), a(rect.bottom, rect2.bottom, f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        return rect3;
    }
}
