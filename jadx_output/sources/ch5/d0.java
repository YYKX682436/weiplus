package ch5;

/* loaded from: classes14.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f41546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41547b;

    /* renamed from: c, reason: collision with root package name */
    public int f41548c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f41549d;

    /* renamed from: e, reason: collision with root package name */
    public float f41550e;

    /* renamed from: f, reason: collision with root package name */
    public float f41551f;

    /* renamed from: g, reason: collision with root package name */
    public float f41552g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f41553h;

    /* renamed from: i, reason: collision with root package name */
    public final float f41554i;

    /* renamed from: j, reason: collision with root package name */
    public final float f41555j;

    /* renamed from: k, reason: collision with root package name */
    public final ch5.c0 f41556k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f41557l;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f41558m;

    public d0(android.content.Context context, android.view.ViewGroup viewGroup, ch5.c0 c0Var) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (c0Var == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f41558m = viewGroup;
        this.f41556k = c0Var;
        this.f41547b = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f41554i = r2.getScaledMaximumFlingVelocity();
        this.f41555j = r2.getScaledMinimumFlingVelocity();
    }

    public void a() {
        this.f41548c = -1;
        android.view.VelocityTracker velocityTracker = this.f41553h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f41553h = null;
        }
    }

    public final boolean b(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        ch5.c0 c0Var = this.f41556k;
        c0Var.getClass();
        return (((ch5.e1) c0Var).f41562a.getMDialogHeight() > 0) && java.lang.Math.abs(f18) > ((float) this.f41547b);
    }

    public final void c(float f17, float f18) {
        float mSlideHeight;
        android.view.View releasedChild = this.f41557l;
        ch5.e1 e1Var = (ch5.e1) this.f41556k;
        e1Var.getClass();
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        int translationY = (int) releasedChild.getTranslationY();
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = e1Var.f41562a;
        float f19 = translationY - wSHalfScreenDraggableLayout.f208842d;
        mSlideHeight = wSHalfScreenDraggableLayout.getMSlideHeight();
        boolean z17 = f19 <= mSlideHeight;
        if (wSHalfScreenDraggableLayout.f208851p && translationY <= (wSHalfScreenDraggableLayout.f208850o - wSHalfScreenDraggableLayout.f208843e) / 2) {
            com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.e(wSHalfScreenDraggableLayout, translationY, 0, 0L, null, null, new ch5.b1(wSHalfScreenDraggableLayout), 28, null);
        } else if (z17) {
            com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.e(wSHalfScreenDraggableLayout, translationY, wSHalfScreenDraggableLayout.f208842d, 0L, null, null, ch5.c1.f41543d, 28, null);
        } else {
            e1Var.a();
        }
        wSHalfScreenDraggableLayout.invalidate();
        if (this.f41546a == 1) {
            e(0);
        }
    }

    public android.view.View d(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f41558m;
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
        if (this.f41546a != i17) {
            this.f41546a = i17;
            ch5.e1 e1Var = (ch5.e1) this.f41556k;
            if (i17 == 1) {
                com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = e1Var.f41562a;
                yz5.p dragStatusBlock = wSHalfScreenDraggableLayout.getDragStatusBlock();
                if (dragStatusBlock != null) {
                    dragStatusBlock.invoke("onHalfScreenHeightWillChange", com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.a(wSHalfScreenDraggableLayout));
                }
            } else {
                e1Var.getClass();
            }
            if (this.f41546a == 0) {
                this.f41557l = null;
            }
        }
    }

    public boolean f(android.view.View view, int i17) {
        if (view == this.f41557l && this.f41548c == i17) {
            return true;
        }
        if (view == null) {
            return false;
        }
        ch5.c0 c0Var = this.f41556k;
        ch5.e1 e1Var = (ch5.e1) c0Var;
        e1Var.getClass();
        if (!e1Var.f41562a.f208851p) {
            return false;
        }
        this.f41548c = i17;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = this.f41558m;
        if (parent != viewGroup) {
            throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the CustomViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f41557l = view;
        this.f41548c = i17;
        c0Var.getClass();
        e(1);
        return true;
    }
}
