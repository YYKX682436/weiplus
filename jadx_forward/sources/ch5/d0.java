package ch5;

/* loaded from: classes14.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f123079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123080b;

    /* renamed from: c, reason: collision with root package name */
    public int f123081c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f123082d;

    /* renamed from: e, reason: collision with root package name */
    public float f123083e;

    /* renamed from: f, reason: collision with root package name */
    public float f123084f;

    /* renamed from: g, reason: collision with root package name */
    public float f123085g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f123086h;

    /* renamed from: i, reason: collision with root package name */
    public final float f123087i;

    /* renamed from: j, reason: collision with root package name */
    public final float f123088j;

    /* renamed from: k, reason: collision with root package name */
    public final ch5.c0 f123089k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f123090l;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f123091m;

    public d0(android.content.Context context, android.view.ViewGroup viewGroup, ch5.c0 c0Var) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (c0Var == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f123091m = viewGroup;
        this.f123089k = c0Var;
        this.f123080b = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f123087i = r2.getScaledMaximumFlingVelocity();
        this.f123088j = r2.getScaledMinimumFlingVelocity();
    }

    public void a() {
        this.f123081c = -1;
        android.view.VelocityTracker velocityTracker = this.f123086h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f123086h = null;
        }
    }

    public final boolean b(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        ch5.c0 c0Var = this.f123089k;
        c0Var.getClass();
        return (((ch5.e1) c0Var).f123095a.m80705x58bb39e6() > 0) && java.lang.Math.abs(f18) > ((float) this.f123080b);
    }

    public final void c(float f17, float f18) {
        float m80706xc0319601;
        android.view.View releasedChild = this.f123090l;
        ch5.e1 e1Var = (ch5.e1) this.f123089k;
        e1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        int translationY = (int) releasedChild.getTranslationY();
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = e1Var.f123095a;
        float f19 = translationY - c22426x8efb1b1c.f290375d;
        m80706xc0319601 = c22426x8efb1b1c.m80706xc0319601();
        boolean z17 = f19 <= m80706xc0319601;
        if (c22426x8efb1b1c.f290384p && translationY <= (c22426x8efb1b1c.f290383o - c22426x8efb1b1c.f290376e) / 2) {
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.e(c22426x8efb1b1c, translationY, 0, 0L, null, null, new ch5.b1(c22426x8efb1b1c), 28, null);
        } else if (z17) {
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.e(c22426x8efb1b1c, translationY, c22426x8efb1b1c.f290375d, 0L, null, null, ch5.c1.f123076d, 28, null);
        } else {
            e1Var.a();
        }
        c22426x8efb1b1c.invalidate();
        if (this.f123079a == 1) {
            e(0);
        }
    }

    public android.view.View d(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f123091m;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            int left = childAt.getLeft() + ((int) childAt.getTranslationX());
            int top = childAt.getTop() + ((int) childAt.getTranslationY());
            if (i17 >= left && i17 < left + childAt.getWidth() && i18 >= top && i18 < top + childAt.getHeight()) {
                return childAt;
            }
        }
    }

    public void e(int i17) {
        if (this.f123079a != i17) {
            this.f123079a = i17;
            ch5.e1 e1Var = (ch5.e1) this.f123089k;
            if (i17 == 1) {
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = e1Var.f123095a;
                yz5.p dragStatusBlock = c22426x8efb1b1c.getDragStatusBlock();
                if (dragStatusBlock != null) {
                    dragStatusBlock.mo149xb9724478("onHalfScreenHeightWillChange", com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.a(c22426x8efb1b1c));
                }
            } else {
                e1Var.getClass();
            }
            if (this.f123079a == 0) {
                this.f123090l = null;
            }
        }
    }

    public boolean f(android.view.View view, int i17) {
        if (view == this.f123090l && this.f123081c == i17) {
            return true;
        }
        if (view == null) {
            return false;
        }
        ch5.c0 c0Var = this.f123089k;
        ch5.e1 e1Var = (ch5.e1) c0Var;
        e1Var.getClass();
        if (!e1Var.f123095a.f290384p) {
            return false;
        }
        this.f123081c = i17;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = this.f123091m;
        if (parent != viewGroup) {
            throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the CustomViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f123090l = view;
        this.f123081c = i17;
        c0Var.getClass();
        e(1);
        return true;
    }
}
