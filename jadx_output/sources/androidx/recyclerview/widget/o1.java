package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class o1 extends androidx.recyclerview.widget.g3 {

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.PointF f12177j;

    /* renamed from: k, reason: collision with root package name */
    public final float f12178k;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.LinearInterpolator f12175h = new android.view.animation.LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f12176i = new android.view.animation.DecelerateInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public int f12179l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f12180m = 0;

    public o1(android.content.Context context) {
        this.f12178k = j(context.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.g3
    public void c() {
    }

    @Override // androidx.recyclerview.widget.g3
    public void d() {
        this.f12180m = 0;
        this.f12179l = 0;
        this.f12177j = null;
    }

    @Override // androidx.recyclerview.widget.g3
    public void e(android.view.View view, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.e3 e3Var) {
        int h17 = h(view, m());
        int i17 = i(view, n());
        int k17 = k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17)));
        if (k17 > 0) {
            e3Var.b(-h17, -i17, k17, this.f12176i);
        }
    }

    public int g(int i17, int i18, int i19, int i27, int i28) {
        if (i28 == -1) {
            return i19 - i17;
        }
        if (i28 != 0) {
            if (i28 == 1) {
                return i27 - i18;
            }
            throw new java.lang.IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i29 = i19 - i17;
        if (i29 > 0) {
            return i29;
        }
        int i37 = i27 - i18;
        if (i37 < 0) {
            return i37;
        }
        return 0;
    }

    public int h(android.view.View view, int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return g(layoutManager.getDecoratedLeft(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.getDecoratedRight(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i17);
    }

    public int i(android.view.View view, int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return g(layoutManager.getDecoratedTop(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManager.getDecoratedBottom(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i17);
    }

    public float j(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i17) {
        return (int) java.lang.Math.ceil(l(i17) / 0.3356d);
    }

    public int l(int i17) {
        return (int) java.lang.Math.ceil(java.lang.Math.abs(i17) * this.f12178k);
    }

    public int m() {
        android.graphics.PointF pointF = this.f12177j;
        if (pointF != null) {
            float f17 = pointF.x;
            if (f17 != 0.0f) {
                return f17 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int n() {
        android.graphics.PointF pointF = this.f12177j;
        if (pointF != null) {
            float f17 = pointF.y;
            if (f17 != 0.0f) {
                return f17 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
