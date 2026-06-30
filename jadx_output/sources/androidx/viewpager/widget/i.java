package androidx.viewpager.widget;

/* loaded from: classes14.dex */
public class i implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f12438a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.ViewPager f12439b;

    public i(androidx.viewpager.widget.ViewPager viewPager) {
        this.f12439b = viewPager;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        n3.g3 i17 = n3.l1.i(view, g3Var);
        if (i17.f334338a.n()) {
            return i17;
        }
        int c17 = i17.c();
        android.graphics.Rect rect = this.f12438a;
        rect.left = c17;
        rect.top = i17.e();
        rect.right = i17.d();
        rect.bottom = i17.b();
        androidx.viewpager.widget.ViewPager viewPager = this.f12439b;
        int childCount = viewPager.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            n3.g3 b17 = n3.l1.b(viewPager.getChildAt(i18), i17);
            rect.left = java.lang.Math.min(b17.c(), rect.left);
            rect.top = java.lang.Math.min(b17.e(), rect.top);
            rect.right = java.lang.Math.min(b17.d(), rect.right);
            rect.bottom = java.lang.Math.min(b17.b(), rect.bottom);
        }
        return i17.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
