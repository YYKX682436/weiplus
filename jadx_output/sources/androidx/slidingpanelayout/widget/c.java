package androidx.slidingpanelayout.widget;

/* loaded from: classes14.dex */
public class c extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout f12352a;

    public c(androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout) {
        this.f12352a = slidingPaneLayout;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View view, int i17, int i18) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12352a;
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) slidingPaneLayout.f12329m.getLayoutParams();
        if (slidingPaneLayout.c()) {
            int width = slidingPaneLayout.getWidth() - ((slidingPaneLayout.getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + slidingPaneLayout.f12329m.getWidth());
            return java.lang.Math.max(java.lang.Math.min(i17, width), width - slidingPaneLayout.f12332p);
        }
        int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        return java.lang.Math.min(java.lang.Math.max(i17, paddingLeft), slidingPaneLayout.f12332p + paddingLeft);
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View view, int i17, int i18) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.k
    public int c(android.view.View view) {
        return this.f12352a.f12332p;
    }

    @Override // androidx.customview.widget.k
    public void e(int i17, int i18) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12352a;
        slidingPaneLayout.f12337u.c(slidingPaneLayout.f12329m, i18);
    }

    @Override // androidx.customview.widget.k
    public void g(android.view.View view, int i17) {
        this.f12352a.e();
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12352a;
        if (slidingPaneLayout.f12337u.f11120a == 0) {
            if (slidingPaneLayout.f12330n != 0.0f) {
                android.view.View view = slidingPaneLayout.f12329m;
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f12338v = true;
            } else {
                slidingPaneLayout.g(slidingPaneLayout.f12329m);
                android.view.View view2 = slidingPaneLayout.f12329m;
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f12338v = false;
            }
        }
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12352a;
        if (slidingPaneLayout.f12329m == null) {
            slidingPaneLayout.f12330n = 0.0f;
        } else {
            boolean c17 = slidingPaneLayout.c();
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) slidingPaneLayout.f12329m.getLayoutParams();
            int width = slidingPaneLayout.f12329m.getWidth();
            if (c17) {
                i17 = (slidingPaneLayout.getWidth() - i17) - width;
            }
            float paddingRight = (i17 - ((c17 ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (c17 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f12332p;
            slidingPaneLayout.f12330n = paddingRight;
            if (slidingPaneLayout.f12334r != 0) {
                slidingPaneLayout.d(paddingRight);
            }
            if (layoutParams.f12345c) {
                slidingPaneLayout.a(slidingPaneLayout.f12329m, slidingPaneLayout.f12330n, slidingPaneLayout.f12323d);
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View view, float f17, float f18) {
        int paddingLeft;
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12352a;
        if (slidingPaneLayout.c()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f17 < 0.0f || (f17 == 0.0f && slidingPaneLayout.f12330n > 0.5f)) {
                paddingRight += slidingPaneLayout.f12332p;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f12329m.getWidth();
        } else {
            paddingLeft = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f17 > 0.0f || (f17 == 0.0f && slidingPaneLayout.f12330n > 0.5f)) {
                paddingLeft += slidingPaneLayout.f12332p;
            }
        }
        slidingPaneLayout.f12337u.s(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View view, int i17) {
        if (this.f12352a.f12333q) {
            return false;
        }
        return ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f12344b;
    }
}
