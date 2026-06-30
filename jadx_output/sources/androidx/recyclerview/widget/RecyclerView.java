package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class RecyclerView extends android.view.ViewGroup implements n3.o0, n3.d0 {
    public static final int[] X1 = {android.R.attr.nestedScrollingEnabled};
    public static final int[] Y1 = {android.R.attr.clipToPadding};
    public static final java.lang.Class[] Z1;

    /* renamed from: a2, reason: collision with root package name */
    public static final android.view.animation.Interpolator f11885a2;
    public int A;
    public final float A1;
    public boolean B;
    public boolean B1;
    public boolean C;
    public final androidx.recyclerview.widget.j3 C1;
    public boolean D;
    public androidx.recyclerview.widget.r0 D1;
    public int E;
    public final androidx.recyclerview.widget.p0 E1;
    public boolean F;
    public final androidx.recyclerview.widget.h3 F1;
    public final android.view.accessibility.AccessibilityManager G;
    public androidx.recyclerview.widget.w2 G1;
    public java.util.List H;
    public java.util.List H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11886J;
    public boolean J1;
    public int K;
    public final androidx.recyclerview.widget.l2 K1;
    public int L;
    public boolean L1;
    public androidx.recyclerview.widget.j2 M;
    public androidx.recyclerview.widget.m3 M1;
    public android.widget.EdgeEffect N;
    public androidx.recyclerview.widget.i2 N1;
    public final int[] O1;
    public android.widget.EdgeEffect P;
    public n3.f0 P1;
    public android.widget.EdgeEffect Q;
    public final int[] Q1;
    public android.widget.EdgeEffect R;
    public final int[] R1;
    public androidx.recyclerview.widget.n2 S;
    public final int[] S1;
    public int T;
    public final int[] T1;
    public int U;
    public final java.util.List U1;
    public android.view.VelocityTracker V;
    public final java.lang.Runnable V1;
    public int W;
    public final androidx.recyclerview.widget.c4 W1;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.b3 f11887d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.z2 f11888e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.SavedState f11889f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.c f11890g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.o f11891h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.d4 f11892i;

    /* renamed from: l1, reason: collision with root package name */
    public int f11893l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11894m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f11895n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f11896o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f11897p;

    /* renamed from: p0, reason: collision with root package name */
    public int f11898p0;

    /* renamed from: p1, reason: collision with root package name */
    public androidx.recyclerview.widget.u2 f11899p1;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.RectF f11900q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f11901r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f11902s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.a3 f11903t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f11904u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f11905v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.recyclerview.widget.v2 f11906w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11907x;

    /* renamed from: x0, reason: collision with root package name */
    public int f11908x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int f11909x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11910y;

    /* renamed from: y0, reason: collision with root package name */
    public int f11911y0;

    /* renamed from: y1, reason: collision with root package name */
    public final int f11912y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11913z;

    /* renamed from: z1, reason: collision with root package name */
    public final float f11914z1;

    /* loaded from: classes15.dex */
    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.o mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.a4 mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.z3 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        androidx.recyclerview.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        androidx.recyclerview.widget.g3 mSmoothScroller;
        androidx.recyclerview.widget.a4 mVerticalBoundCheck;
        private final androidx.recyclerview.widget.z3 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public LayoutManager() {
            androidx.recyclerview.widget.q2 q2Var = new androidx.recyclerview.widget.q2(this);
            this.mHorizontalBoundCheckCallback = q2Var;
            androidx.recyclerview.widget.r2 r2Var = new androidx.recyclerview.widget.r2(this);
            this.mVerticalBoundCheckCallback = r2Var;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.a4(q2Var);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.a4(r2Var);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(android.view.View view, int i17, boolean z17) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            if (z17 || x07.isRemoved()) {
                x.b bVar = this.mRecyclerView.f11892i.f12000a;
                androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) bVar.getOrDefault(x07, null);
                if (b4Var == null) {
                    b4Var = androidx.recyclerview.widget.b4.a();
                    bVar.put(x07, b4Var);
                }
                b4Var.f11967a |= 1;
            } else {
                this.mRecyclerView.f11892i.c(x07);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            if (x07.wasReturnedFromScrap() || x07.isScrap()) {
                if (x07.isScrap()) {
                    x07.unScrap();
                } else {
                    x07.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i17, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int j17 = this.mChildHelper.j(view);
                if (i17 == -1) {
                    i17 = this.mChildHelper.e();
                }
                if (j17 == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.i0());
                }
                if (j17 != i17) {
                    this.mRecyclerView.f11902s.moveView(j17, i17);
                }
            } else {
                this.mChildHelper.a(view, i17, false);
                layoutParams.f11917f = true;
                androidx.recyclerview.widget.g3 g3Var = this.mSmoothScroller;
                if (g3Var != null && g3Var.f12053e && g3Var.f12050b.v0(view) == g3Var.f12049a) {
                    g3Var.f12054f = view;
                }
            }
            if (layoutParams.f11918g) {
                x07.itemView.invalidate();
                layoutParams.f11918g = false;
            }
        }

        public static int chooseSize(int i17, int i18, int i19) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            int size = android.view.View.MeasureSpec.getSize(i17);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i18, i19) : size : java.lang.Math.min(size, java.lang.Math.max(i18, i19));
        }

        private void detachViewInternal(int i17, android.view.View view) {
            this.mChildHelper.c(i17);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z17) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i17 = left - paddingLeft;
            int min = java.lang.Math.min(0, i17);
            int i18 = top - paddingTop;
            int min2 = java.lang.Math.min(0, i18);
            int i19 = width2 - width;
            int max = java.lang.Math.max(0, i19);
            int max2 = java.lang.Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = java.lang.Math.min(i17, max);
                }
                max = min;
            } else if (max == 0) {
                max = java.lang.Math.max(min, i19);
            }
            if (min2 == 0) {
                min2 = java.lang.Math.min(i18, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static androidx.recyclerview.widget.t2 getProperties(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
            androidx.recyclerview.widget.t2 t2Var = new androidx.recyclerview.widget.t2();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k4.a.f303960a, i17, i18);
            t2Var.f12227a = obtainStyledAttributes.getInt(0, 1);
            t2Var.f12228b = obtainStyledAttributes.getInt(9, 1);
            t2Var.f12229c = obtainStyledAttributes.getBoolean(8, false);
            t2Var.f12230d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return t2Var;
        }

        private boolean isFocusedChildVisibleAfterScrolling(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            android.graphics.Rect rect = this.mRecyclerView.f11896o;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i17 < width && rect.right - i17 > paddingLeft && rect.top - i18 < height && rect.bottom - i18 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i17, int i18, int i19) {
            int mode = android.view.View.MeasureSpec.getMode(i18);
            int size = android.view.View.MeasureSpec.getSize(i18);
            if (i19 > 0 && i17 != i19) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i17;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i17;
            }
            return true;
        }

        private void scrapOrRecycleView(androidx.recyclerview.widget.z2 z2Var, int i17, android.view.View view) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            if (x07.shouldIgnore()) {
                return;
            }
            if (x07.isInvalid() && !x07.isRemoved() && !this.mRecyclerView.f11901r.hasStableIds()) {
                removeViewAt(i17);
                z2Var.j(x07);
            } else {
                detachViewAt(i17);
                z2Var.k(view);
                this.mRecyclerView.f11892i.c(x07);
            }
        }

        public void addDisappearingView(android.view.View view) {
            addDisappearingView(view, -1);
        }

        public void addView(android.view.View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.E0()) {
                return;
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + recyclerView.i0());
            }
            throw new java.lang.IllegalStateException(str + recyclerView.i0());
        }

        public void assertNotInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.Q(str);
            }
        }

        public void attachView(android.view.View view, int i17, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            if (x07.isRemoved()) {
                x.b bVar = this.mRecyclerView.f11892i.f12000a;
                androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) bVar.getOrDefault(x07, null);
                if (b4Var == null) {
                    b4Var = androidx.recyclerview.widget.b4.a();
                    bVar.put(x07, b4Var);
                }
                b4Var.f11967a |= 1;
            } else {
                this.mRecyclerView.f11892i.c(x07);
            }
            this.mChildHelper.b(view, i17, layoutParams, x07.isRemoved());
        }

        public void calculateItemDecorationsForChild(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.A0(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        /* renamed from: canScrollVertically */
        public boolean getF123307r() {
            return false;
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i17, int i18, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.s2 s2Var) {
        }

        public void collectInitialPrefetchPositions(int i17, androidx.recyclerview.widget.s2 s2Var) {
        }

        public int computeHorizontalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int computeVerticalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(androidx.recyclerview.widget.z2 z2Var) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(z2Var, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(android.view.View view, androidx.recyclerview.widget.z2 z2Var) {
            scrapOrRecycleView(z2Var, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i17, androidx.recyclerview.widget.z2 z2Var) {
            scrapOrRecycleView(z2Var, i17, getChildAt(i17));
        }

        public void detachView(android.view.View view) {
            int j17 = this.mChildHelper.j(view);
            if (j17 >= 0) {
                detachViewInternal(j17, view);
            }
        }

        public void detachViewAt(int i17) {
            detachViewInternal(i17, getChildAt(i17));
        }

        public void dispatchAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, z2Var);
        }

        public void endAnimation(android.view.View view) {
            androidx.recyclerview.widget.n2 n2Var = this.mRecyclerView.S;
            if (n2Var != null) {
                n2Var.j(androidx.recyclerview.widget.RecyclerView.x0(view));
            }
        }

        public android.view.View findContainingItemView(android.view.View view) {
            android.view.View l07;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (l07 = recyclerView.l0(view)) == null || this.mChildHelper.k(l07)) {
                return null;
            }
            return l07;
        }

        public android.view.View findViewByPosition(int i17) {
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = getChildAt(i18);
                androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(childAt);
                if (x07 != null && x07.getLayoutPosition() == i17 && !x07.shouldIgnore() && (this.mRecyclerView.F1.f12065g || !x07.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e.bottom;
        }

        public android.view.View getChildAt(int i17) {
            androidx.recyclerview.widget.o oVar = this.mChildHelper;
            if (oVar != null) {
                return oVar.d(i17);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.o oVar = this.mChildHelper;
            if (oVar != null) {
                return oVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f11894m;
        }

        public int getColumnCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f11901r == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.f11901r.getItemCount();
        }

        public int getDecoratedBottom(android.view.View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView.z0(view, rect);
        }

        public int getDecoratedLeft(android.view.View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(android.view.View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(android.view.View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public android.view.View getFocusedChild() {
            android.view.View focusedChild;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(android.view.View view) {
            return androidx.recyclerview.widget.RecyclerView.x0(view).getItemViewType();
        }

        public int getLayoutDirection() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.v0.d(recyclerView);
        }

        public int getLeftDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e.left;
        }

        public int getMinimumHeight() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.u0.d(recyclerView);
        }

        public int getMinimumWidth() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.u0.e(recyclerView);
        }

        public int getPaddingBottom() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.v0.e(recyclerView);
        }

        public int getPaddingLeft() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.v0.f(recyclerView);
        }

        public int getPaddingTop() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).b();
        }

        public int getRightDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e.right;
        }

        public int getRowCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f11901r == null || !getF123307r()) {
                return 1;
            }
            return this.mRecyclerView.f11901r.getItemCount();
        }

        public int getSelectionModeForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public int getTopDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e.top;
        }

        public void getTransformedBoundingBox(android.view.View view, boolean z17, android.graphics.Rect rect) {
            android.graphics.Matrix matrix;
            if (z17) {
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.mRecyclerView.f11900q;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.ViewGroup.LayoutParams layoutParams = getChildAt(i17).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(android.view.View view) {
            android.view.ViewParent parent = view.getParent();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new java.lang.IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.i0());
            }
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            x07.addFlags(128);
            this.mRecyclerView.f11892i.d(x07);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            androidx.recyclerview.widget.g3 g3Var = this.mSmoothScroller;
            return g3Var != null && g3Var.f12053e;
        }

        public boolean isViewPartiallyVisible(android.view.View view, boolean z17, boolean z18) {
            boolean z19 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z17 ? z19 : !z19;
        }

        public void layoutDecorated(android.view.View view, int i17, int i18, int i19, int i27) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11916e;
            view.layout(i17 + rect.left, i18 + rect.top, i19 - rect.right, i27 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect rect = layoutParams.f11916e;
            view.layout(i17 + rect.left + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18 + rect.top + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i19 - rect.right) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i27 - rect.bottom) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(android.view.View view, int i17, int i18) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect A0 = this.mRecyclerView.A0(view);
            int i19 = i17 + A0.left + A0.right;
            int i27 = i18 + A0.top + A0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i19, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, getF123307r());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(android.view.View view, int i17, int i18) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect A0 = this.mRecyclerView.A0(view);
            int i19 = i17 + A0.left + A0.right;
            int i27 = i18 + A0.top + A0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i19, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, getF123307r());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i17, int i18) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                detachViewAt(i17);
                attachView(childAt, i18);
            } else {
                throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + i17 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e17 = recyclerView.f11891h.e();
                for (int i18 = 0; i18 < e17; i18++) {
                    recyclerView.f11891h.d(i18).offsetLeftAndRight(i17);
                }
            }
        }

        public void offsetChildrenVertical(int i17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e17 = recyclerView.f11891h.e();
                for (int i18 = 0; i18 < e17; i18++) {
                    recyclerView.f11891h.d(i18).offsetTopAndBottom(i17);
                }
            }
        }

        public void onAdapterChanged(androidx.recyclerview.widget.f2 f2Var, androidx.recyclerview.widget.f2 f2Var2) {
        }

        public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList<android.view.View> arrayList, int i17, int i18) {
            return false;
        }

        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public android.view.View onFocusSearchFailed(android.view.View view, int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f11888e, recyclerView.F1, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(o3.l lVar) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f11888e, recyclerView.F1, lVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(android.view.View view, o3.l lVar) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            if (x07 == null || x07.isRemoved() || this.mChildHelper.k(x07.itemView)) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f11888e, recyclerView.F1, view, lVar);
        }

        public android.view.View onInterceptFocusSearch(android.view.View view, int i17) {
            return null;
        }

        public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        }

        public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        }

        public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        }

        public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        }

        public void onMeasure(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, int i18) {
            this.mRecyclerView.V(i17, i18);
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2) {
            return isSmoothScrolling() || recyclerView.E0();
        }

        public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        }

        public android.os.Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i17) {
        }

        public void onSmoothScrollerStopped(androidx.recyclerview.widget.g3 g3Var) {
            if (this.mSmoothScroller == g3Var) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f11888e, recyclerView.F1, i17, bundle);
        }

        public boolean performAccessibilityActionForItem(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, android.view.View view, int i17, android.os.Bundle bundle) {
            return false;
        }

        public void postOnAnimation(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(androidx.recyclerview.widget.z2 z2Var) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!androidx.recyclerview.widget.RecyclerView.x0(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, z2Var);
                }
            }
        }

        public void removeAndRecycleScrapInt(androidx.recyclerview.widget.z2 z2Var) {
            int size = z2Var.f12309a.size();
            for (int i17 = size - 1; i17 >= 0; i17--) {
                android.view.View view = ((androidx.recyclerview.widget.k3) z2Var.f12309a.get(i17)).itemView;
                androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
                if (!x07.shouldIgnore()) {
                    x07.setIsRecyclable(false);
                    if (x07.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    androidx.recyclerview.widget.n2 n2Var = this.mRecyclerView.S;
                    if (n2Var != null) {
                        n2Var.j(x07);
                    }
                    x07.setIsRecyclable(true);
                    androidx.recyclerview.widget.k3 x08 = androidx.recyclerview.widget.RecyclerView.x0(view);
                    x08.mScrapContainer = null;
                    x08.mInChangeScrap = false;
                    x08.clearReturnedFromScrapFlag();
                    z2Var.j(x08);
                }
            }
            z2Var.f12309a.clear();
            java.util.ArrayList arrayList = z2Var.f12310b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(android.view.View view, androidx.recyclerview.widget.z2 z2Var) {
            removeView(view);
            z2Var.i(view);
        }

        public void removeAndRecycleViewAt(int i17, androidx.recyclerview.widget.z2 z2Var) {
            android.view.View childAt = getChildAt(i17);
            removeViewAt(i17);
            z2Var.i(childAt);
        }

        public boolean removeCallbacks(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(android.view.View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(android.view.View view) {
            androidx.recyclerview.widget.o oVar = this.mChildHelper;
            androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) oVar.f12172a;
            int indexOfChild = d2Var.f11999a.indexOfChild(view);
            if (indexOfChild < 0) {
                return;
            }
            if (oVar.f12173b.f(indexOfChild)) {
                oVar.m(view);
            }
            d2Var.b(indexOfChild);
        }

        public void removeViewAt(int i17) {
            if (getChildAt(i17) != null) {
                this.mChildHelper.l(i17);
            }
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z17) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z17, false);
        }

        public void requestLayout() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        public void scrollToPosition(int i17) {
        }

        public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            return 0;
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean z17) {
            this.mAutoMeasure = z17;
        }

        public void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView recyclerView) {
            setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z17) {
            if (z17 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z17;
                this.mPrefetchMaxCountObserved = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f11888e.o();
                }
            }
        }

        public void setMeasureSpecs(int i17, int i18) {
            this.mWidth = android.view.View.MeasureSpec.getSize(i17);
            int mode = android.view.View.MeasureSpec.getMode(i17);
            this.mWidthMode = mode;
            if (mode == 0) {
                int[] iArr = androidx.recyclerview.widget.RecyclerView.X1;
            }
            this.mHeight = android.view.View.MeasureSpec.getSize(i18);
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            this.mHeightMode = mode2;
            if (mode2 == 0) {
                int[] iArr2 = androidx.recyclerview.widget.RecyclerView.X1;
            }
        }

        public void setMeasuredDimension(android.graphics.Rect rect, int i17, int i18) {
            setMeasuredDimension(chooseSize(i17, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i18, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i17, int i18) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.V(i17, i18);
                return;
            }
            int i19 = Integer.MIN_VALUE;
            int i27 = Integer.MAX_VALUE;
            int i28 = Integer.MIN_VALUE;
            int i29 = Integer.MAX_VALUE;
            for (int i37 = 0; i37 < childCount; i37++) {
                android.view.View childAt = getChildAt(i37);
                android.graphics.Rect rect = this.mRecyclerView.f11896o;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i38 = rect.left;
                if (i38 < i29) {
                    i29 = i38;
                }
                int i39 = rect.right;
                if (i39 > i19) {
                    i19 = i39;
                }
                int i47 = rect.top;
                if (i47 < i27) {
                    i27 = i47;
                }
                int i48 = rect.bottom;
                if (i48 > i28) {
                    i28 = i48;
                }
            }
            this.mRecyclerView.f11896o.set(i29, i27, i19, i28);
            setMeasuredDimension(this.mRecyclerView.f11896o, i17, i18);
        }

        public void setMeasurementCacheEnabled(boolean z17) {
            this.mMeasurementCacheEnabled = z17;
        }

        public void setRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f11891h;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(android.view.View view, int i17, int i18, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(android.view.View view, int i17, int i18, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        }

        public void startSmoothScroll(androidx.recyclerview.widget.g3 g3Var) {
            androidx.recyclerview.widget.g3 g3Var2 = this.mSmoothScroller;
            if (g3Var2 != null && g3Var != g3Var2 && g3Var2.f12053e) {
                g3Var2.f();
            }
            this.mSmoothScroller = g3Var;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            g3Var.f12050b = recyclerView;
            g3Var.f12051c = this;
            int i17 = g3Var.f12049a;
            if (i17 == -1) {
                throw new java.lang.IllegalArgumentException("Invalid target position");
            }
            recyclerView.F1.f12059a = i17;
            g3Var.f12053e = true;
            g3Var.f12052d = true;
            g3Var.f12054f = recyclerView.f11902s.findViewByPosition(i17);
            g3Var.c();
            g3Var.f12050b.C1.b();
        }

        public void stopIgnoringView(android.view.View view) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
            x07.stopIgnoring();
            x07.resetInternal();
            x07.addFlags(4);
        }

        public void stopSmoothScroller() {
            androidx.recyclerview.widget.g3 g3Var = this.mSmoothScroller;
            if (g3Var != null) {
                g3Var.f();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(android.view.View view, int i17) {
            addViewInt(view, i17, true);
        }

        public void addView(android.view.View view, int i17) {
            addViewInt(view, i17, false);
        }

        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z17 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z17 = false;
            }
            accessibilityEvent.setScrollable(z17);
            androidx.recyclerview.widget.f2 f2Var = this.mRecyclerView.f11901r;
            if (f2Var != null) {
                accessibilityEvent.setItemCount(f2Var.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, o3.l lVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                lVar.a(8192);
                lVar.t(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                lVar.a(4096);
                lVar.t(true);
            }
            android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(z2Var, h3Var), getColumnCountForAccessibility(z2Var, h3Var), isLayoutHierarchical(z2Var, h3Var), getSelectionModeForAccessibility(z2Var, h3Var));
            lVar.getClass();
            lVar.f342642a.setCollectionInfo(obtain);
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.Object obj) {
            onItemsUpdated(recyclerView, i17, i18);
        }

        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, android.view.View view, android.view.View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, android.os.Bundle bundle) {
            int height;
            int width;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i17 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                }
                width = 0;
            } else if (i17 != 8192) {
                height = 0;
                width = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                }
                width = 0;
            }
            if (height == 0 && width == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(width, height);
            return true;
        }

        public boolean performAccessibilityActionForItem(android.view.View view, int i17, android.os.Bundle bundle) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f11888e, recyclerView.F1, view, i17, bundle);
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z17, boolean z18) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(recyclerView, view, rect, z17);
            int i17 = childRectangleOnScreenScrollAmount[0];
            int i18 = childRectangleOnScreenScrollAmount[1];
            if ((z18 && !isFocusedChildVisibleAfterScrolling(recyclerView, i17, i18)) || (i17 == 0 && i18 == 0)) {
                return false;
            }
            if (z17) {
                recyclerView.scrollBy(i17, i18);
            } else {
                recyclerView.smoothScrollBy(i17, i18);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, android.view.View view, o3.l lVar) {
            lVar.o(o3.k.a(getF123307r() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i17, int i18) {
            this.mRecyclerView.setMeasuredDimension(i17, i18);
        }

        public void attachView(android.view.View view, int i17) {
            attachView(view, i17, (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams());
        }

        public void attachView(android.view.View view) {
            attachView(view, -1);
        }
    }

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.SavedState> CREATOR = new androidx.recyclerview.widget.c3();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Parcelable f11919f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11919f = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.RecyclerView.LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeParcelable(this.f11919f, 0);
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void R3(android.view.View view);

        void p3(android.view.View view);
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        Z1 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f11885a2 = new androidx.recyclerview.widget.b2();
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void R(androidx.recyclerview.widget.k3 k3Var) {
        java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> weakReference = k3Var.mNestedRecyclerView;
        if (weakReference != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == k3Var.itemView) {
                    return;
                }
                java.lang.Object parent = recyclerView.getParent();
                recyclerView = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            k3Var.mNestedRecyclerView = null;
        }
    }

    private void X0() {
        android.view.VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z17 = false;
        p(0);
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    private n3.f0 getScrollingChildHelper() {
        if (this.P1 == null) {
            this.P1 = new n3.f0(this);
        }
        return this.P1;
    }

    public static androidx.recyclerview.widget.RecyclerView o0(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            return (androidx.recyclerview.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            androidx.recyclerview.widget.RecyclerView o07 = o0(viewGroup.getChildAt(i17));
            if (o07 != null) {
                return o07;
            }
        }
        return null;
    }

    public static androidx.recyclerview.widget.k3 x0(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f11915d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z0(android.view.View view, android.graphics.Rect rect) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect2 = layoutParams.f11916e;
        rect.set((view.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    android.graphics.Rect A0(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        boolean z17 = layoutParams.f11917f;
        android.graphics.Rect rect = layoutParams.f11916e;
        if (!z17) {
            return rect;
        }
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        if (h3Var.f12065g && (layoutParams.c() || layoutParams.f11915d.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        java.util.ArrayList arrayList = this.f11904u;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.graphics.Rect rect2 = this.f11896o;
            rect2.set(0, 0, 0, 0);
            ((androidx.recyclerview.widget.p2) arrayList.get(i17)).getItemOffsets(rect2, view, this, h3Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f11917f = false;
        return rect;
    }

    public androidx.recyclerview.widget.p2 B0(int i17) {
        int itemDecorationCount = getItemDecorationCount();
        if (i17 >= 0 && i17 < itemDecorationCount) {
            return (androidx.recyclerview.widget.p2) this.f11904u.get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException(i17 + " is an invalid index for size " + itemDecorationCount);
    }

    public boolean C0(int i17) {
        return getScrollingChildHelper().h(i17);
    }

    public void D0() {
        if (this.f11904u.size() == 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        G0();
        requestLayout();
    }

    public boolean E0() {
        return this.K > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0(int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    void G0() {
        int h17 = this.f11891h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.f11891h.g(i17).getLayoutParams()).f11917f = true;
        }
        java.util.ArrayList arrayList = this.f11888e.f12311c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) ((androidx.recyclerview.widget.k3) arrayList.get(i18)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f11917f = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(int i17, int i18, boolean z17) {
        int i19 = i17 + i18;
        int h17 = this.f11891h.h();
        for (int i27 = 0; i27 < h17; i27++) {
            androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.g(i27));
            if (x07 != null && !x07.shouldIgnore()) {
                int i28 = x07.mPosition;
                androidx.recyclerview.widget.h3 h3Var = this.F1;
                if (i28 >= i19) {
                    x07.offsetPosition(-i18, z17);
                    h3Var.f12064f = true;
                } else if (i28 >= i17) {
                    x07.flagRemovedAndOffsetPosition(i17 - 1, -i18, z17);
                    h3Var.f12064f = true;
                }
            }
        }
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        java.util.ArrayList arrayList = z2Var.f12311c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(size);
            if (k3Var != null) {
                int i29 = k3Var.mPosition;
                if (i29 >= i19) {
                    k3Var.offsetPosition(-i18, z17);
                } else if (i29 >= i17) {
                    k3Var.addFlags(8);
                    z2Var.h(size);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0() {
        this.K++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(boolean z17) {
        int i17;
        int i18 = this.K - 1;
        this.K = i18;
        if (i18 < 1) {
            this.K = 0;
            if (z17) {
                int i19 = this.E;
                this.E = 0;
                if (i19 != 0) {
                    android.view.accessibility.AccessibilityManager accessibilityManager = this.G;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        o3.b.b(obtain, i19);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) this.U1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(size);
                    if (k3Var.itemView.getParent() == this && !k3Var.shouldIgnore() && (i17 = k3Var.mPendingAccessibilityState) != -1) {
                        android.view.View view = k3Var.itemView;
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.s(view, i17);
                        k3Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void K0(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.U = motionEvent.getPointerId(i17);
            int x17 = (int) (motionEvent.getX(i17) + 0.5f);
            this.f11908x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY(i17) + 0.5f);
            this.f11911y0 = y17;
            this.f11898p0 = y17;
        }
    }

    public void L0(int i17) {
    }

    public final void M(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view = k3Var.itemView;
        boolean z17 = view.getParent() == this;
        this.f11888e.n(w0(view));
        if (k3Var.isTmpDetached()) {
            this.f11891h.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z17) {
            this.f11891h.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.o oVar = this.f11891h;
        int indexOfChild = ((androidx.recyclerview.widget.d2) oVar.f12172a).f11999a.indexOfChild(view);
        if (indexOfChild >= 0) {
            oVar.f12173b.h(indexOfChild);
            oVar.i(view);
        } else {
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void M0(int i17, int i18) {
    }

    public void N(androidx.recyclerview.widget.p2 p2Var) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.f11904u;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(p2Var);
        G0();
        requestLayout();
    }

    void N0() {
        if (this.L1 || !this.f11907x) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(this, this.V1);
        this.L1 = true;
    }

    public void O(androidx.recyclerview.widget.RecyclerView.a aVar) {
        if (this.H == null) {
            this.H = new java.util.ArrayList();
        }
        this.H.add(aVar);
    }

    public final void O0() {
        boolean z17;
        boolean z18 = false;
        if (this.I) {
            androidx.recyclerview.widget.c cVar = this.f11890g;
            cVar.l(cVar.f11971b);
            cVar.l(cVar.f11972c);
            cVar.f11975f = 0;
            if (this.f11886J) {
                this.f11902s.onItemsChanged(this);
            }
        }
        if (this.S != null && this.f11902s.supportsPredictiveItemAnimations()) {
            this.f11890g.j();
        } else {
            this.f11890g.c();
        }
        boolean z19 = this.I1 || this.J1;
        boolean z27 = this.f11913z && this.S != null && ((z17 = this.I) || z19 || this.f11902s.mRequestedSimpleAnimations) && (!z17 || this.f11901r.hasStableIds());
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        h3Var.f12068j = z27;
        if (z27 && z19 && !this.I) {
            if (this.S != null && this.f11902s.supportsPredictiveItemAnimations()) {
                z18 = true;
            }
        }
        h3Var.f12069k = z18;
    }

    public void P(androidx.recyclerview.widget.v2 v2Var) {
        this.f11905v.add(v2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(boolean z17) {
        this.f11886J = z17 | this.f11886J;
        this.I = true;
        int h17 = this.f11891h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.g(i17));
            if (x07 != null && !x07.shouldIgnore()) {
                x07.addFlags(6);
            }
        }
        G0();
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        java.util.ArrayList arrayList = z2Var.f12311c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(i18);
            if (k3Var != null) {
                k3Var.addFlags(6);
                k3Var.addChangePayload(null);
            }
        }
        androidx.recyclerview.widget.f2 f2Var = z2Var.f12317i.f11901r;
        if (f2Var == null || !f2Var.hasStableIds()) {
            z2Var.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(java.lang.String str) {
        if (E0()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + i0());
        }
        if (this.L > 0) {
            new java.lang.IllegalStateException("" + i0());
        }
    }

    public void Q0(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var) {
        k3Var.setFlags(0, 8192);
        boolean z17 = this.F1.f12066h;
        androidx.recyclerview.widget.d4 d4Var = this.f11892i;
        if (z17 && k3Var.isUpdated() && !k3Var.isRemoved() && !k3Var.shouldIgnore()) {
            d4Var.f12001b.d(t0(k3Var), k3Var);
        }
        x.b bVar = d4Var.f12000a;
        androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) bVar.getOrDefault(k3Var, null);
        if (b4Var == null) {
            b4Var = androidx.recyclerview.widget.b4.a();
            bVar.put(k3Var, b4Var);
        }
        b4Var.f11968b = m2Var;
        b4Var.f11967a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0() {
        androidx.recyclerview.widget.n2 n2Var = this.S;
        if (n2Var != null) {
            n2Var.k();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.f11888e);
            this.f11902s.removeAndRecycleScrapInt(this.f11888e);
        }
        this.f11888e.c();
    }

    void S() {
        int h17 = this.f11891h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.g(i17));
            if (!x07.shouldIgnore()) {
                x07.clearOldPosition();
            }
        }
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        java.util.ArrayList arrayList = z2Var.f12311c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((androidx.recyclerview.widget.k3) arrayList.get(i18)).clearOldPosition();
        }
        int size2 = z2Var.f12309a.size();
        for (int i19 = 0; i19 < size2; i19++) {
            ((androidx.recyclerview.widget.k3) z2Var.f12309a.get(i19)).clearOldPosition();
        }
        java.util.ArrayList arrayList2 = z2Var.f12310b;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i27 = 0; i27 < size3; i27++) {
                ((androidx.recyclerview.widget.k3) z2Var.f12310b.get(i27)).clearOldPosition();
            }
        }
    }

    public void S0(androidx.recyclerview.widget.p2 p2Var) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.f11904u;
        arrayList.remove(p2Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        G0();
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i17, int i18) {
        boolean z17;
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i17 <= 0) {
            z17 = false;
        } else {
            this.N.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i17 < 0) {
            this.Q.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i18 > 0) {
            this.P.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i18 < 0) {
            this.R.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void T0(int i17) {
        int itemDecorationCount = getItemDecorationCount();
        if (i17 >= 0 && i17 < itemDecorationCount) {
            S0(B0(i17));
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(i17 + " is an invalid index for size " + itemDecorationCount);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        if (!this.f11913z || this.I) {
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a("RV FullInvalidate");
            X();
            j3.t.b();
            return;
        }
        if (this.f11890g.g()) {
            androidx.recyclerview.widget.c cVar = this.f11890g;
            int i17 = cVar.f11975f;
            boolean z17 = false;
            if ((4 & i17) != 0) {
                if (!((i17 & 11) != 0)) {
                    java.lang.reflect.Method method2 = j3.v.f297343b;
                    j3.t.a("RV PartialInvalidate");
                    d1();
                    I0();
                    this.f11890g.j();
                    if (!this.B) {
                        int e17 = this.f11891h.e();
                        int i18 = 0;
                        while (true) {
                            if (i18 < e17) {
                                androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.d(i18));
                                if (x07 != null && !x07.shouldIgnore() && x07.isUpdated()) {
                                    z17 = true;
                                    break;
                                }
                                i18++;
                            } else {
                                break;
                            }
                        }
                        if (z17) {
                            X();
                        } else {
                            this.f11890g.b();
                        }
                    }
                    e1(true);
                    J0(true);
                    j3.t.b();
                    return;
                }
            }
            if (cVar.g()) {
                java.lang.reflect.Method method3 = j3.v.f297343b;
                j3.t.a("RV FullInvalidate");
                X();
                j3.t.b();
            }
        }
    }

    public void U0(androidx.recyclerview.widget.v2 v2Var) {
        this.f11905v.remove(v2Var);
        if (this.f11906w == v2Var) {
            this.f11906w = null;
        }
    }

    void V(int i17, int i18) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        setMeasuredDimension(androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i17, paddingLeft, n3.u0.e(this)), androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i18, getPaddingTop() + getPaddingBottom(), n3.u0.d(this)));
    }

    public void V0(androidx.recyclerview.widget.w2 w2Var) {
        java.util.List list = this.H1;
        if (list != null) {
            ((java.util.ArrayList) list).remove(w2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(android.view.View view) {
        androidx.recyclerview.widget.k3 x07 = x0(view);
        androidx.recyclerview.widget.f2 f2Var = this.f11901r;
        if (f2Var != null && x07 != null) {
            f2Var.onViewDetachedFromWindow(x07);
        }
        java.util.List list = this.H;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.a) ((java.util.ArrayList) this.H).get(size)).p3(view);
            }
        }
    }

    public final void W0(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        android.graphics.Rect rect = this.f11896o;
        rect.set(0, 0, width, height);
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            if (!layoutParams2.f11917f) {
                int i17 = rect.left;
                android.graphics.Rect rect2 = layoutParams2.f11916e;
                rect.left = i17 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f11902s.requestChildRectangleOnScreen(this, view, this.f11896o, !this.f11913z, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0333, code lost:
    
        if (r18.f11891h.k(getFocusedChild()) == false) goto L218;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void X() {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.X():void");
    }

    public final void Y() {
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        h3Var.a(1);
        j0(h3Var);
        h3Var.f12067i = false;
        d1();
        androidx.recyclerview.widget.d4 d4Var = this.f11892i;
        d4Var.f12000a.clear();
        d4Var.f12001b.clear();
        I0();
        O0();
        android.view.View focusedChild = (this.B1 && hasFocus() && this.f11901r != null) ? getFocusedChild() : null;
        androidx.recyclerview.widget.k3 m07 = focusedChild == null ? null : m0(focusedChild);
        if (m07 == null) {
            h3Var.f12071m = -1L;
            h3Var.f12070l = -1;
            h3Var.f12072n = -1;
        } else {
            h3Var.f12071m = this.f11901r.hasStableIds() ? m07.getItemId() : -1L;
            h3Var.f12070l = this.I ? -1 : m07.isRemoved() ? m07.mOldPosition : m07.getAdapterPosition();
            android.view.View view = m07.itemView;
            int id6 = view.getId();
            while (!view.isFocused() && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
                view = ((android.view.ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id6 = view.getId();
                }
            }
            h3Var.f12072n = id6;
        }
        h3Var.f12066h = h3Var.f12068j && this.J1;
        this.J1 = false;
        this.I1 = false;
        h3Var.f12065g = h3Var.f12069k;
        h3Var.f12063e = this.f11901r.getItemCount();
        n0(this.O1);
        boolean z17 = h3Var.f12068j;
        x.b bVar = d4Var.f12000a;
        if (z17) {
            int e17 = this.f11891h.e();
            for (int i17 = 0; i17 < e17; i17++) {
                androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.d(i17));
                if (!x07.shouldIgnore() && (!x07.isInvalid() || this.f11901r.hasStableIds())) {
                    androidx.recyclerview.widget.m2 r17 = this.S.r(h3Var, x07, androidx.recyclerview.widget.n2.e(x07), x07.getUnmodifiedPayloads());
                    androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) bVar.getOrDefault(x07, null);
                    if (b4Var == null) {
                        b4Var = androidx.recyclerview.widget.b4.a();
                        bVar.put(x07, b4Var);
                    }
                    b4Var.f11968b = r17;
                    b4Var.f11967a |= 4;
                    if (h3Var.f12066h && x07.isUpdated() && !x07.isRemoved() && !x07.shouldIgnore() && !x07.isInvalid()) {
                        d4Var.f12001b.d(t0(x07), x07);
                    }
                }
            }
        }
        if (h3Var.f12069k) {
            int h17 = this.f11891h.h();
            for (int i18 = 0; i18 < h17; i18++) {
                androidx.recyclerview.widget.k3 x08 = x0(this.f11891h.g(i18));
                if (!x08.shouldIgnore()) {
                    x08.saveOldPosition();
                }
            }
            boolean z18 = h3Var.f12064f;
            h3Var.f12064f = false;
            this.f11902s.onLayoutChildren(this.f11888e, h3Var);
            h3Var.f12064f = z18;
            for (int i19 = 0; i19 < this.f11891h.e(); i19++) {
                androidx.recyclerview.widget.k3 x09 = x0(this.f11891h.d(i19));
                if (!x09.shouldIgnore()) {
                    androidx.recyclerview.widget.b4 b4Var2 = (androidx.recyclerview.widget.b4) bVar.getOrDefault(x09, null);
                    if (!((b4Var2 == null || (b4Var2.f11967a & 4) == 0) ? false : true)) {
                        int e18 = androidx.recyclerview.widget.n2.e(x09);
                        boolean hasAnyOfTheFlags = x09.hasAnyOfTheFlags(8192);
                        if (!hasAnyOfTheFlags) {
                            e18 |= 4096;
                        }
                        androidx.recyclerview.widget.m2 r18 = this.S.r(h3Var, x09, e18, x09.getUnmodifiedPayloads());
                        if (hasAnyOfTheFlags) {
                            Q0(x09, r18);
                        } else {
                            androidx.recyclerview.widget.b4 b4Var3 = (androidx.recyclerview.widget.b4) bVar.getOrDefault(x09, null);
                            if (b4Var3 == null) {
                                b4Var3 = androidx.recyclerview.widget.b4.a();
                                bVar.put(x09, b4Var3);
                            }
                            b4Var3.f11967a |= 2;
                            b4Var3.f11968b = r18;
                        }
                    }
                }
            }
            S();
        } else {
            S();
        }
        J0(true);
        e1(false);
        h3Var.f12062d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Y0(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y0(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z() {
        d1();
        I0();
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        h3Var.a(6);
        this.f11890g.c();
        h3Var.f12063e = this.f11901r.getItemCount();
        h3Var.f12061c = 0;
        h3Var.f12065g = false;
        this.f11902s.onLayoutChildren(this.f11888e, h3Var);
        h3Var.f12064f = false;
        this.f11889f = null;
        h3Var.f12068j = h3Var.f12068j && this.S != null;
        h3Var.f12062d = 4;
        J0(true);
        e1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(int i17, int i18, int[] iArr) {
        androidx.recyclerview.widget.k3 k3Var;
        d1();
        I0();
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a("RV Scroll");
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        j0(h3Var);
        int scrollHorizontallyBy = i17 != 0 ? this.f11902s.scrollHorizontallyBy(i17, this.f11888e, h3Var) : 0;
        int scrollVerticallyBy = i18 != 0 ? this.f11902s.scrollVerticallyBy(i18, this.f11888e, h3Var) : 0;
        j3.t.b();
        int e17 = this.f11891h.e();
        for (int i19 = 0; i19 < e17; i19++) {
            android.view.View d17 = this.f11891h.d(i19);
            androidx.recyclerview.widget.k3 w07 = w0(d17);
            if (w07 != null && (k3Var = w07.mShadowingHolder) != null) {
                android.view.View view = k3Var.itemView;
                int left = d17.getLeft();
                int top = d17.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        J0(true);
        e1(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public boolean a0(int i17, int i18, int[] iArr, int[] iArr2, int i19) {
        return getScrollingChildHelper().d(i17, i18, iArr, iArr2, i19);
    }

    public void a1(int i17) {
        if (this.C) {
            return;
        }
        f1();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i17, i18)) {
            super.addFocusables(arrayList, i17, i18);
        }
    }

    public boolean b0(int i17, int i18, int i19, int i27, int[] iArr, int i28) {
        return getScrollingChildHelper().f(i17, i18, i19, i27, iArr, i28, null);
    }

    public void b1(int i17, int i18, android.view.animation.Interpolator interpolator) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null || this.C) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i17 = 0;
        }
        if (!this.f11902s.getF123307r()) {
            i18 = 0;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        androidx.recyclerview.widget.j3 j3Var = this.C1;
        int a17 = j3Var.a(i17, i18, 0, 0);
        if (interpolator == null) {
            interpolator = f11885a2;
        }
        j3Var.c(i17, i18, a17, interpolator);
    }

    public void c1(int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        if (this.C || (layoutManager = this.f11902s) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.F1, i17);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) && this.f11902s.checkLayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f11902s.computeHorizontalScrollExtent(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f11902s.computeHorizontalScrollOffset(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f11902s.computeHorizontalScrollRange(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.getF123307r()) {
            return this.f11902s.computeVerticalScrollExtent(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.getF123307r()) {
            return this.f11902s.computeVerticalScrollOffset(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null && layoutManager.getF123307r()) {
            return this.f11902s.computeVerticalScrollRange(this.F1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(int i17, int i18) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        M0(i17, i18);
        androidx.recyclerview.widget.w2 w2Var = this.G1;
        if (w2Var != null) {
            w2Var.onScrolled(this, i17, i18);
        }
        java.util.List list = this.H1;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.w2) ((java.util.ArrayList) this.H1).get(size)).onScrolled(this, i17, i18);
            }
        }
        this.L--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        int i17 = this.A + 1;
        this.A = i17;
        if (i17 != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return getScrollingChildHelper().a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return getScrollingChildHelper().b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return getScrollingChildHelper().e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z17;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.f11904u;
        int size = arrayList.size();
        boolean z18 = false;
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.recyclerview.widget.p2) arrayList.get(i17)).onDrawOver(canvas, this, this.F1);
        }
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z17 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f11894m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.N;
            z17 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f11894m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.P;
            z17 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f11894m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.Q;
            z17 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f11894m) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z18 = true;
            }
            z17 |= z18;
            canvas.restoreToCount(save4);
        }
        if ((z17 || this.S == null || arrayList.size() <= 0 || !this.S.o()) ? z17 : true) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        return super.drawChild(canvas, view, j17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        if (this.R != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.R = edgeEffect;
        if (this.f11894m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(boolean z17) {
        if (this.A < 1) {
            this.A = 1;
        }
        if (!z17 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z17 && this.B && !this.C && this.f11902s != null && this.f11901r != null) {
                X();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        if (this.N != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f11894m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void f1() {
        setScrollState(0);
        androidx.recyclerview.widget.j3 j3Var = this.C1;
        j3Var.f12099m.removeCallbacks(j3Var);
        j3Var.f12095f.abortAnimation();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0184, code lost:
    
        if (r5 > 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0187, code lost:
    
        if (r7 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
    
        if (r5 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0192, code lost:
    
        if ((r5 * r6) < 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019a, code lost:
    
        if ((r5 * r6) > 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        if (r7 > 0) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0() {
        if (this.Q != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.f11894m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }

    public androidx.recyclerview.widget.f2 getAdapter() {
        return this.f11901r;
    }

    @Override // android.view.View
    public int getBaseline() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        androidx.recyclerview.widget.i2 i2Var = this.N1;
        return i2Var == null ? super.getChildDrawingOrder(i17, i18) : ((pp1.q) i2Var).f357436a.f357454o ? i18 : (i17 - 1) - i18;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f11894m;
    }

    public androidx.recyclerview.widget.m3 getCompatAccessibilityDelegate() {
        return this.M1;
    }

    public androidx.recyclerview.widget.j2 getEdgeEffectFactory() {
        return this.M;
    }

    public androidx.recyclerview.widget.n2 getItemAnimator() {
        return this.S;
    }

    public int getItemDecorationCount() {
        return this.f11904u.size();
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
        return this.f11902s;
    }

    public int getMaxFlingVelocity() {
        return this.f11912y1;
    }

    public int getMinFlingVelocity() {
        return this.f11909x1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        return java.lang.System.nanoTime();
    }

    public androidx.recyclerview.widget.u2 getOnFlingListener() {
        return this.f11899p1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.B1;
    }

    public androidx.recyclerview.widget.y2 getRecycledViewPool() {
        return this.f11888e.e();
    }

    public int getScrollState() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0() {
        if (this.P != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.f11894m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(androidx.recyclerview.widget.w2 w2Var) {
        if (this.H1 == null) {
            this.H1 = new java.util.ArrayList();
        }
        this.H1.add(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public java.lang.String i0() {
        return " " + super.toString() + ", adapter:" + this.f11901r + ", layout:" + this.f11902s + ", context:" + getContext();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f11907x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f334334d;
    }

    public final void j0(androidx.recyclerview.widget.h3 h3Var) {
        if (getScrollState() != 2) {
            h3Var.getClass();
            return;
        }
        android.widget.OverScroller overScroller = this.C1.f12095f;
        overScroller.getFinalX();
        overScroller.getCurrX();
        h3Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public android.view.View k0(float f17, float f18) {
        for (int e17 = this.f11891h.e() - 1; e17 >= 0; e17--) {
            android.view.View d17 = this.f11891h.d(e17);
            float translationX = d17.getTranslationX();
            float translationY = d17.getTranslationY();
            if (f17 >= d17.getLeft() + translationX && f17 <= d17.getRight() + translationX && f18 >= d17.getTop() + translationY && f18 <= d17.getBottom() + translationY) {
                return d17;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View l0(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l0(android.view.View):android.view.View");
    }

    public androidx.recyclerview.widget.k3 m0(android.view.View view) {
        android.view.View l07 = l0(view);
        if (l07 == null) {
            return null;
        }
        return w0(l07);
    }

    public final void n0(int[] iArr) {
        int e17 = this.f11891h.e();
        if (e17 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        for (int i19 = 0; i19 < e17; i19++) {
            androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.d(i19));
            if (!x07.shouldIgnore()) {
                int layoutPosition = x07.getLayoutPosition();
                if (layoutPosition < i17) {
                    i17 = layoutPosition;
                }
                if (layoutPosition > i18) {
                    i18 = layoutPosition;
                }
            }
        }
        iArr[0] = i17;
        iArr[1] = i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.K = r0
            r1 = 1
            r5.f11907x = r1
            boolean r2 = r5.f11913z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f11913z = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.f11902s
            if (r1 == 0) goto L1e
            r1.dispatchAttachedToWindow(r5)
        L1e:
            r5.L1 = r0
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.r0.f12205h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.r0 r1 = (androidx.recyclerview.widget.r0) r1
            r5.D1 = r1
            if (r1 != 0) goto L5a
            androidx.recyclerview.widget.r0 r1 = new androidx.recyclerview.widget.r0
            r1.<init>()
            r5.D1 = r1
            java.util.WeakHashMap r1 = n3.l1.f334362a
            android.view.Display r1 = n3.v0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4c
            if (r1 == 0) goto L4c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4c
            goto L4e
        L4c:
            r1 = 1114636288(0x42700000, float:60.0)
        L4e:
            androidx.recyclerview.widget.r0 r2 = r5.D1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f12209f = r3
            r0.set(r2)
        L5a:
            androidx.recyclerview.widget.r0 r0 = r5.D1
            java.util.ArrayList r0 = r0.f12207d
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.recyclerview.widget.n2 n2Var = this.S;
        if (n2Var != null) {
            n2Var.k();
        }
        f1();
        this.f11907x = false;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.f11888e);
        }
        ((java.util.ArrayList) this.U1).clear();
        removeCallbacks(this.V1);
        this.f11892i.getClass();
        do {
        } while (((m3.f) androidx.recyclerview.widget.b4.f11966d).a() != null);
        androidx.recyclerview.widget.r0 r0Var = this.D1;
        if (r0Var != null) {
            r0Var.f12207d.remove(this);
            this.D1 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f11904u;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.recyclerview.widget.p2) arrayList.get(i17)).onDraw(canvas, this, this.F1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f11902s
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.C
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f11902s
            boolean r0 = r0.getF123307r()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f11902s
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f11902s
            boolean r3 = r3.getF123307r()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f11902s
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f11914z1
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.A1
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        boolean z18;
        if (this.C) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f11906w = null;
        }
        java.util.ArrayList arrayList = this.f11905v;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = false;
                break;
            }
            androidx.recyclerview.widget.v2 v2Var = (androidx.recyclerview.widget.v2) arrayList.get(i17);
            if (v2Var.b(this, motionEvent) && action != 3) {
                this.f11906w = v2Var;
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            X0();
            setScrollState(0);
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean f123307r = this.f11902s.getF123307r();
        if (this.V == null) {
            this.V = android.view.VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.D) {
                this.D = false;
            }
            this.U = motionEvent.getPointerId(0);
            int x17 = (int) (motionEvent.getX() + 0.5f);
            this.f11908x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY() + 0.5f);
            this.f11911y0 = y17;
            this.f11898p0 = y17;
            if (this.T == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.S1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i18 = canScrollHorizontally;
            if (f123307r) {
                i18 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            getScrollingChildHelper().j(i18, 0);
        } else if (actionMasked == 1) {
            this.V.clear();
            p(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.U);
            if (findPointerIndex < 0) {
                return false;
            }
            int x18 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y18 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.T != 1) {
                int i19 = x18 - this.W;
                int i27 = y18 - this.f11898p0;
                if (canScrollHorizontally == 0 || java.lang.Math.abs(i19) <= this.f11893l1) {
                    z18 = false;
                } else {
                    this.f11908x0 = x18;
                    z18 = true;
                }
                if (f123307r && java.lang.Math.abs(i27) > this.f11893l1) {
                    this.f11911y0 = y18;
                    z18 = true;
                }
                if (z18) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.U = motionEvent.getPointerId(actionIndex);
            int x19 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f11908x0 = x19;
            this.W = x19;
            int y19 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f11911y0 = y19;
            this.f11898p0 = y19;
        } else if (actionMasked == 6) {
            K0(motionEvent);
        }
        return this.T == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a("RV OnLayout");
        X();
        j3.t.b();
        this.f11913z = true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null) {
            V(i17, i18);
            return;
        }
        boolean isAutoMeasureEnabled = layoutManager.isAutoMeasureEnabled();
        boolean z17 = false;
        androidx.recyclerview.widget.h3 h3Var = this.F1;
        if (isAutoMeasureEnabled) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            this.f11902s.onMeasure(this.f11888e, h3Var, i17, i18);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z17 = true;
            }
            if (z17 || this.f11901r == null) {
                return;
            }
            if (h3Var.f12062d == 1) {
                Y();
            }
            this.f11902s.setMeasureSpecs(i17, i18);
            h3Var.f12067i = true;
            Z();
            this.f11902s.setMeasuredDimensionFromChildren(i17, i18);
            if (this.f11902s.shouldMeasureTwice()) {
                this.f11902s.setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                h3Var.f12067i = true;
                Z();
                this.f11902s.setMeasuredDimensionFromChildren(i17, i18);
                return;
            }
            return;
        }
        if (this.f11910y) {
            this.f11902s.onMeasure(this.f11888e, h3Var, i17, i18);
            return;
        }
        if (this.F) {
            d1();
            I0();
            O0();
            J0(true);
            if (h3Var.f12069k) {
                h3Var.f12065g = true;
            } else {
                this.f11890g.c();
                h3Var.f12065g = false;
            }
            this.F = false;
            e1(false);
        } else if (h3Var.f12069k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        androidx.recyclerview.widget.f2 f2Var = this.f11901r;
        if (f2Var != null) {
            h3Var.f12063e = f2Var.getItemCount();
        } else {
            h3Var.f12063e = 0;
        }
        d1();
        this.f11902s.onMeasure(this.f11888e, h3Var, i17, i18);
        e1(false);
        h3Var.f12065g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i17, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.recyclerview.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = (androidx.recyclerview.widget.RecyclerView.SavedState) parcelable;
        this.f11889f = savedState;
        super.onRestoreInstanceState(savedState.f11112d);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null || (parcelable2 = this.f11889f.f11919f) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = new androidx.recyclerview.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        androidx.recyclerview.widget.RecyclerView.SavedState savedState2 = this.f11889f;
        if (savedState2 != null) {
            savedState.f11919f = savedState2.f11919f;
        } else {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
            if (layoutManager != null) {
                savedState.f11919f = layoutManager.onSaveInstanceState();
            } else {
                savedState.f11919f = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 && i18 == i27) {
            return;
        }
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // n3.d0
    public void p(int i17) {
        getScrollingChildHelper().k(i17);
    }

    public androidx.recyclerview.widget.k3 p0(int i17) {
        androidx.recyclerview.widget.k3 k3Var = null;
        if (this.I) {
            return null;
        }
        int h17 = this.f11891h.h();
        for (int i18 = 0; i18 < h17; i18++) {
            androidx.recyclerview.widget.k3 x07 = x0(this.f11891h.g(i18));
            if (x07 != null && !x07.isRemoved() && s0(x07) == i17) {
                if (!this.f11891h.k(x07.itemView)) {
                    return x07;
                }
                k3Var = x07;
            }
        }
        return k3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.k3 q0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.o r0 = r5.f11891h
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.o r3 = r5.f11891h
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.k3 r3 = x0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.o r1 = r5.f11891h
            android.view.View r4 = r3.itemView
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q0(int, boolean):androidx.recyclerview.widget.k3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public boolean r0(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null || this.C) {
            return false;
        }
        int canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean f123307r = this.f11902s.getF123307r();
        int i19 = this.f11909x1;
        int i27 = (canScrollHorizontally == 0 || java.lang.Math.abs(i17) < i19) ? 0 : i17;
        int i28 = (!f123307r || java.lang.Math.abs(i18) < i19) ? 0 : i18;
        if (i27 == 0 && i28 == 0) {
            return false;
        }
        float f17 = i27;
        float f18 = i28;
        if (!dispatchNestedPreFling(f17, f18)) {
            boolean z17 = canScrollHorizontally != 0 || f123307r;
            dispatchNestedFling(f17, f18, z17);
            androidx.recyclerview.widget.u2 u2Var = this.f11899p1;
            if (u2Var != null && u2Var.a(i27, i28)) {
                return true;
            }
            if (z17) {
                if (f123307r) {
                    canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                }
                getScrollingChildHelper().j(canScrollHorizontally, 1);
                int i29 = this.f11912y1;
                int i37 = -i29;
                int max = java.lang.Math.max(i37, java.lang.Math.min(i27, i29));
                int max2 = java.lang.Math.max(i37, java.lang.Math.min(i28, i29));
                androidx.recyclerview.widget.j3 j3Var = this.C1;
                j3Var.f12099m.setScrollState(2);
                j3Var.f12094e = 0;
                j3Var.f12093d = 0;
                j3Var.f12095f.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                j3Var.b();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View view, boolean z17) {
        androidx.recyclerview.widget.k3 x07 = x0(view);
        if (x07 != null) {
            if (x07.isTmpDetached()) {
                x07.clearTmpDetachFlag();
            } else if (!x07.shouldIgnore()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + x07 + i0());
            }
        }
        view.clearAnimation();
        W(view);
        super.removeDetachedView(view, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.f11902s.onRequestChildFocus(this, this.F1, view, view2) && view2 != null) {
            W0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z17) {
        return this.f11902s.requestChildRectangleOnScreen(this, view, rect, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        java.util.ArrayList arrayList = this.f11905v;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.recyclerview.widget.v2) arrayList.get(i17)).c(z17);
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    public int s0(androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var.hasAnyOfTheFlags(524) || !k3Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.c cVar = this.f11890g;
        int i17 = k3Var.mPosition;
        java.util.ArrayList arrayList = cVar.f11971b;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) arrayList.get(i18);
            int i19 = bVar.f11959a;
            if (i19 != 1) {
                if (i19 == 2) {
                    int i27 = bVar.f11960b;
                    if (i27 <= i17) {
                        int i28 = bVar.f11962d;
                        if (i27 + i28 > i17) {
                            return -1;
                        }
                        i17 -= i28;
                    } else {
                        continue;
                    }
                } else if (i19 == 8) {
                    int i29 = bVar.f11960b;
                    if (i29 == i17) {
                        i17 = bVar.f11962d;
                    } else {
                        if (i29 < i17) {
                            i17--;
                        }
                        if (bVar.f11962d <= i17) {
                            i17++;
                        }
                    }
                }
            } else if (bVar.f11960b <= i17) {
                i17 += bVar.f11962d;
            }
        }
        return i17;
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager == null || this.C) {
            return;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean f123307r = this.f11902s.getF123307r();
        if (canScrollHorizontally || f123307r) {
            if (!canScrollHorizontally) {
                i17 = 0;
            }
            if (!f123307r) {
                i18 = 0;
            }
            Y0(i17, i18, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (E0()) {
            int a17 = accessibilityEvent != null ? o3.b.a(accessibilityEvent) : 0;
            this.E |= a17 != 0 ? a17 : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.m3 m3Var) {
        this.M1 = m3Var;
        n3.l1.l(this, m3Var);
    }

    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        setLayoutFrozen(false);
        androidx.recyclerview.widget.f2 f2Var2 = this.f11901r;
        androidx.recyclerview.widget.b3 b3Var = this.f11887d;
        if (f2Var2 != null) {
            f2Var2.unregisterAdapterDataObserver(b3Var);
            this.f11901r.onDetachedFromRecyclerView(this);
        }
        R0();
        androidx.recyclerview.widget.c cVar = this.f11890g;
        cVar.l(cVar.f11971b);
        cVar.l(cVar.f11972c);
        cVar.f11975f = 0;
        androidx.recyclerview.widget.f2 f2Var3 = this.f11901r;
        this.f11901r = f2Var;
        if (f2Var != null) {
            f2Var.registerAdapterDataObserver(b3Var);
            f2Var.onAttachedToRecyclerView(this);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(f2Var3, this.f11901r);
        }
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        androidx.recyclerview.widget.f2 f2Var4 = this.f11901r;
        z2Var.c();
        androidx.recyclerview.widget.y2 e17 = z2Var.e();
        if (f2Var3 != null) {
            e17.f12290b--;
        }
        if (e17.f12290b == 0) {
            e17.a();
        }
        if (f2Var4 != null) {
            e17.f12290b++;
        }
        this.F1.f12064f = true;
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.i2 i2Var) {
        if (i2Var == this.N1) {
            return;
        }
        this.N1 = i2Var;
        setChildrenDrawingOrderEnabled(i2Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z17) {
        if (z17 != this.f11894m) {
            this.R = null;
            this.P = null;
            this.Q = null;
            this.N = null;
        }
        this.f11894m = z17;
        super.setClipToPadding(z17);
        if (this.f11913z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.j2 j2Var) {
        j2Var.getClass();
        this.M = j2Var;
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    public void setHasFixedSize(boolean z17) {
        this.f11910y = z17;
    }

    public void setItemAnimator(androidx.recyclerview.widget.n2 n2Var) {
        androidx.recyclerview.widget.n2 n2Var2 = this.S;
        if (n2Var2 != null) {
            n2Var2.k();
            this.S.f12166a = null;
        }
        this.S = n2Var;
        if (n2Var != null) {
            n2Var.f12166a = this.K1;
        }
    }

    public void setItemViewCacheSize(int i17) {
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        z2Var.f12313e = i17;
        z2Var.o();
    }

    public void setLayoutFrozen(boolean z17) {
        if (z17 != this.C) {
            Q("Do not setLayoutFrozen in layout or scroll");
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                f1();
                return;
            }
            this.C = false;
            if (this.B && this.f11902s != null && this.f11901r != null) {
                requestLayout();
            }
            this.B = false;
        }
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.n nVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (layoutManager == this.f11902s) {
            return;
        }
        f1();
        if (this.f11902s != null) {
            androidx.recyclerview.widget.n2 n2Var = this.S;
            if (n2Var != null) {
                n2Var.k();
            }
            this.f11902s.removeAndRecycleAllViews(this.f11888e);
            this.f11902s.removeAndRecycleScrapInt(this.f11888e);
            this.f11888e.c();
            if (this.f11907x) {
                this.f11902s.dispatchDetachedFromWindow(this, this.f11888e);
            }
            this.f11902s.setRecyclerView(null);
            this.f11902s = null;
        } else {
            this.f11888e.c();
        }
        androidx.recyclerview.widget.o oVar = this.f11891h;
        oVar.f12173b.g();
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f12174c;
        int size = arrayList.size();
        while (true) {
            size--;
            nVar = oVar.f12172a;
            if (size < 0) {
                break;
            }
            android.view.View view = (android.view.View) arrayList.get(size);
            androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) nVar;
            d2Var.getClass();
            androidx.recyclerview.widget.k3 x07 = x0(view);
            if (x07 != null) {
                x07.onLeftHiddenState(d2Var.f11999a);
            }
            arrayList.remove(size);
        }
        androidx.recyclerview.widget.d2 d2Var2 = (androidx.recyclerview.widget.d2) nVar;
        int a17 = d2Var2.a();
        int i17 = 0;
        while (true) {
            recyclerView = d2Var2.f11999a;
            if (i17 >= a17) {
                break;
            }
            android.view.View childAt = recyclerView.getChildAt(i17);
            recyclerView.W(childAt);
            childAt.clearAnimation();
            i17++;
        }
        recyclerView.removeAllViews();
        this.f11902s = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.i0());
            }
            layoutManager.setRecyclerView(this);
            if (this.f11907x) {
                this.f11902s.dispatchAttachedToWindow(this);
            }
        }
        this.f11888e.o();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        getScrollingChildHelper().i(z17);
    }

    public void setOnFlingListener(androidx.recyclerview.widget.u2 u2Var) {
        this.f11899p1 = u2Var;
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.w2 w2Var) {
        this.G1 = w2Var;
    }

    public void setPreserveFocusAfterLayout(boolean z17) {
        this.B1 = z17;
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.y2 y2Var) {
        androidx.recyclerview.widget.z2 z2Var = this.f11888e;
        if (z2Var.f12315g != null) {
            r1.f12290b--;
        }
        z2Var.f12315g = y2Var;
        if (y2Var == null || z2Var.f12317i.getAdapter() == null) {
            return;
        }
        z2Var.f12315g.f12290b++;
    }

    public void setRecyclerListener(androidx.recyclerview.widget.a3 a3Var) {
        this.f11903t = a3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrollState(int i17) {
        if (i17 == this.T) {
            return;
        }
        this.T = i17;
        if (i17 != 2) {
            androidx.recyclerview.widget.j3 j3Var = this.C1;
            j3Var.f12099m.removeCallbacks(j3Var);
            j3Var.f12095f.abortAnimation();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
            if (layoutManager != null) {
                layoutManager.stopSmoothScroller();
            }
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = this.f11902s;
        if (layoutManager2 != null) {
            layoutManager2.onScrollStateChanged(i17);
        }
        L0(i17);
        androidx.recyclerview.widget.w2 w2Var = this.G1;
        if (w2Var != null) {
            w2Var.onScrollStateChanged(this, i17);
        }
        java.util.List list = this.H1;
        if (list == null) {
            return;
        }
        int size = ((java.util.ArrayList) list).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((androidx.recyclerview.widget.w2) ((java.util.ArrayList) this.H1).get(size)).onScrollStateChanged(this, i17);
            }
        }
    }

    public void setScrollingTouchSlop(int i17) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i17 != 1) {
            this.f11893l1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f11893l1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.i3 i3Var) {
        this.f11888e.f12316h = i3Var;
    }

    public void smoothScrollBy(int i17, int i18) {
        b1(i17, i18, null);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return getScrollingChildHelper().j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    public long t0(androidx.recyclerview.widget.k3 k3Var) {
        return this.f11901r.hasStableIds() ? k3Var.getItemId() : k3Var.mPosition;
    }

    public int u0(android.view.View view) {
        androidx.recyclerview.widget.k3 x07 = x0(view);
        if (x07 != null) {
            return x07.getAdapterPosition();
        }
        return -1;
    }

    public int v0(android.view.View view) {
        androidx.recyclerview.widget.k3 x07 = x0(view);
        if (x07 != null) {
            return x07.getLayoutPosition();
        }
        return -1;
    }

    public androidx.recyclerview.widget.k3 w0(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return x0(view);
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void y0(android.view.View view, android.graphics.Rect rect) {
        z0(view, rect);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        float a17;
        float a18;
        char c17;
        int i18;
        android.content.res.TypedArray typedArray;
        char c18;
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        this.f11887d = new androidx.recyclerview.widget.b3(this);
        this.f11888e = new androidx.recyclerview.widget.z2(this);
        this.f11892i = new androidx.recyclerview.widget.d4();
        this.f11895n = new androidx.recyclerview.widget.z1(this);
        this.f11896o = new android.graphics.Rect();
        this.f11897p = new android.graphics.Rect();
        this.f11900q = new android.graphics.RectF();
        this.f11904u = new java.util.ArrayList();
        this.f11905v = new java.util.ArrayList();
        this.A = 0;
        this.I = false;
        this.f11886J = false;
        this.K = 0;
        this.L = 0;
        this.M = new androidx.recyclerview.widget.j2();
        this.S = new androidx.recyclerview.widget.z();
        this.T = 0;
        this.U = -1;
        this.f11914z1 = Float.MIN_VALUE;
        this.A1 = Float.MIN_VALUE;
        boolean z17 = true;
        this.B1 = true;
        this.C1 = new androidx.recyclerview.widget.j3(this);
        this.E1 = new androidx.recyclerview.widget.p0();
        this.F1 = new androidx.recyclerview.widget.h3();
        this.I1 = false;
        this.J1 = false;
        androidx.recyclerview.widget.o2 o2Var = new androidx.recyclerview.widget.o2(this);
        this.K1 = o2Var;
        this.L1 = false;
        this.O1 = new int[2];
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.T1 = new int[2];
        this.U1 = new java.util.ArrayList();
        this.V1 = new androidx.recyclerview.widget.a2(this);
        this.W1 = new androidx.recyclerview.widget.c2(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y1, i17, 0);
            this.f11894m = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f11894m = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f11893l1 = viewConfiguration.getScaledTouchSlop();
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            java.lang.reflect.Method method = n3.o1.f334378a;
            a17 = n3.m1.a(viewConfiguration);
        } else {
            a17 = n3.o1.a(viewConfiguration, context);
        }
        this.f11914z1 = a17;
        if (i19 >= 26) {
            a18 = n3.m1.b(viewConfiguration);
        } else {
            a18 = n3.o1.a(viewConfiguration, context);
        }
        this.A1 = a18;
        this.f11909x1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11912y1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.S.f12166a = o2Var;
        this.f11890g = new androidx.recyclerview.widget.c(new androidx.recyclerview.widget.e2(this));
        this.f11891h = new androidx.recyclerview.widget.o(new androidx.recyclerview.widget.d2(this));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if ((i19 >= 26 ? n3.d1.c(this) : 0) == 0 && i19 >= 26) {
            n3.d1.m(this, 8);
        }
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
        this.G = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.m3(this));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k4.a.f303960a, i17, 0);
            java.lang.String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    android.content.res.Resources resources = getContext().getResources();
                    c17 = 3;
                    i18 = 4;
                    typedArray = obtainStyledAttributes2;
                    c18 = 2;
                    new androidx.recyclerview.widget.n0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480407x2), resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480409x4), resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480408x3));
                } else {
                    throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + i0());
                }
            } else {
                c17 = 3;
                i18 = 4;
                typedArray = obtainStyledAttributes2;
                c18 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                java.lang.String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = androidx.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        java.lang.Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(androidx.recyclerview.widget.RecyclerView.LayoutManager.class);
                        try {
                            constructor = asSubclass.getConstructor(Z1);
                            objArr = new java.lang.Object[i18];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c18] = java.lang.Integer.valueOf(i17);
                            objArr[c17] = 0;
                        } catch (java.lang.NoSuchMethodException e17) {
                            try {
                                constructor = asSubclass.getConstructor(new java.lang.Class[0]);
                                objArr = null;
                            } catch (java.lang.NoSuchMethodException e18) {
                                e18.initCause(e17);
                                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e18);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) constructor.newInstance(objArr));
                    } catch (java.lang.ClassCastException e19) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e19);
                    } catch (java.lang.ClassNotFoundException e27) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e27);
                    } catch (java.lang.IllegalAccessException e28) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e28);
                    } catch (java.lang.InstantiationException e29) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e29);
                    } catch (java.lang.reflect.InvocationTargetException e37) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e37);
                    }
                }
            }
            android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, X1, i17, 0);
            z17 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z17);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public androidx.recyclerview.widget.k3 f11915d;

        /* renamed from: e, reason: collision with root package name */
        public final android.graphics.Rect f11916e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11917f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f11918g;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11916e = new android.graphics.Rect();
            this.f11917f = true;
            this.f11918g = false;
        }

        public int a() {
            return this.f11915d.getAdapterPosition();
        }

        public int b() {
            return this.f11915d.getLayoutPosition();
        }

        public boolean c() {
            return this.f11915d.isUpdated();
        }

        public boolean d() {
            return this.f11915d.isRemoved();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f11916e = new android.graphics.Rect();
            this.f11917f = true;
            this.f11918g = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11916e = new android.graphics.Rect();
            this.f11917f = true;
            this.f11918g = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11916e = new android.graphics.Rect();
            this.f11917f = true;
            this.f11918g = false;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.f11916e = new android.graphics.Rect();
            this.f11917f = true;
            this.f11918g = false;
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f11902s;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }
}
