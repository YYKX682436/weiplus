package ul1;

/* loaded from: classes7.dex */
public final class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f510111d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f510112e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f510113f;

    public g(android.content.Context context) {
        super(context);
        this.f510111d = new android.graphics.Rect();
        this.f510112e = new int[2];
        this.f510113f = false;
        setWillNotDraw(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) super.generateLayoutParams(layoutParams);
        if (-1 == layoutParams2.gravity) {
            layoutParams2.gravity = 17;
        }
        return layoutParams2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f510113f = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f510113f = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            android.graphics.Rect rect = this.f510111d;
            getWindowVisibleDisplayFrame(rect);
            int[] iArr = this.f510112e;
            getLocationInWindow(iArr);
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                u46.a.c(iArr, "{}");
            }
            for (int i28 = 0; i28 < getChildCount(); i28++) {
                android.view.View childAt = getChildAt(i28);
                int top = ((iArr[1] + childAt.getTop()) + childAt.getHeight()) - rect.bottom;
                if (top > 0) {
                    int max = java.lang.Math.max(0, childAt.getTop() - top);
                    childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getHeight() + max);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        bringToFront();
        bringChildToFront(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (getChildCount() == 0) {
            setVisibility(8);
            if (getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) getParent()).removeView(this);
            }
        }
    }
}
