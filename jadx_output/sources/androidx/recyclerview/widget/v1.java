package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public final class v1 extends androidx.recyclerview.widget.w1 {
    public v1(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        super(layoutManager, null);
    }

    @Override // androidx.recyclerview.widget.w1
    public int b(android.view.View view) {
        return this.f12259a.getDecoratedBottom(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.w1
    public int c(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f12259a.getDecoratedMeasuredHeight(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.w1
    public int d(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f12259a.getDecoratedMeasuredWidth(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.w1
    public int e(android.view.View view) {
        return this.f12259a.getDecoratedTop(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.w1
    public int f() {
        return this.f12259a.getHeight();
    }

    @Override // androidx.recyclerview.widget.w1
    public int g() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12259a;
        return layoutManager.getHeight() - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.w1
    public int h() {
        return this.f12259a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.w1
    public int i() {
        return this.f12259a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.w1
    public int j() {
        return this.f12259a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.w1
    public int k() {
        return this.f12259a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.w1
    public int l() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12259a;
        return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.w1
    public int n(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12259a;
        android.graphics.Rect rect = this.f12261c;
        layoutManager.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.w1
    public int o(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12259a;
        android.graphics.Rect rect = this.f12261c;
        layoutManager.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.w1
    public void p(int i17) {
        this.f12259a.offsetChildrenVertical(i17);
    }
}
