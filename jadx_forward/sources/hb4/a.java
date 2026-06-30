package hb4;

/* loaded from: classes.dex */
public class a implements p012xc85e97e9.p114xa324943e.p115xd1075a44.m {
    public void a(android.view.View view, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
        float f18 = 0.0f;
        if (0.0f <= f17 && f17 <= 1.0f) {
            f18 = 1.0f - f17;
        } else if (-1.0f < f17 && f17 < 0.0f) {
            f18 = f17 + 1.0f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationX(view.getWidth() * (-f17));
        view.setTranslationY(f17 * view.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
    }
}
