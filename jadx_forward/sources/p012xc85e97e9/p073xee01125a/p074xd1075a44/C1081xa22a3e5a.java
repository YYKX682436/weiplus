package p012xc85e97e9.p073xee01125a.p074xd1075a44;

/* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout */
/* loaded from: classes15.dex */
public class C1081xa22a3e5a extends android.view.ViewGroup implements n3.g0 {
    public static final java.lang.ThreadLocal A;
    public static final java.util.Comparator B;
    public static final m3.e C;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f92518y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.Class[] f92519z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f92520d;

    /* renamed from: e, reason: collision with root package name */
    public final x2.e f92521e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f92522f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f92523g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f92524h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f92525i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92526m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f92527n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f92528o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f92529p;

    /* renamed from: q, reason: collision with root package name */
    public x2.c f92530q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f92531r;

    /* renamed from: s, reason: collision with root package name */
    public n3.g3 f92532s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92533t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f92534u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup.OnHierarchyChangeListener f92535v;

    /* renamed from: w, reason: collision with root package name */
    public n3.k0 f92536w;

    /* renamed from: x, reason: collision with root package name */
    public final n3.j0 f92537x;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior */
    /* loaded from: classes15.dex */
    public static abstract class Behavior<V extends android.view.View> {
        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        }

        public boolean a(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.graphics.Rect rect) {
            return false;
        }

        public boolean b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
            return false;
        }

        public void c(p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar) {
        }

        public boolean d(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
            return false;
        }

        public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
            return false;
        }

        public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
            return false;
        }

        public boolean h(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17, int i18, int i19, int i27) {
            return false;
        }

        public boolean i(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18, boolean z17) {
            return false;
        }

        public boolean j(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18) {
            return false;
        }

        public void k(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr) {
        }

        public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr, int i19) {
            if (i19 == 0) {
                k(c1081xa22a3e5a, view, view2, i17, i18, iArr);
            }
        }

        public void m(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int i19, int i27) {
        }

        public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int i19, int i27, int i28) {
            if (i28 == 0) {
                m(c1081xa22a3e5a, view, view2, i17, i18, i19, i27);
            }
        }

        public void p(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        }

        public boolean q(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.graphics.Rect rect, boolean z17) {
            return false;
        }

        public void r(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.os.Parcelable parcelable) {
        }

        public android.os.Parcelable s(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }

        public boolean t(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
            return false;
        }

        public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
            if (i18 == 0) {
                return t(c1081xa22a3e5a, view, view2, view3, i17);
            }
            return false;
        }

        public void v(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
        }

        public void w(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17) {
            if (i17 == 0) {
                v(c1081xa22a3e5a, view, view2);
            }
        }

        public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState> f2861x681a0c0c = new p012xc85e97e9.p073xee01125a.p074xd1075a44.d();

        /* renamed from: f, reason: collision with root package name */
        public android.util.SparseArray f92538f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f92538f = new android.util.SparseArray(readInt);
            for (int i17 = 0; i17 < readInt; i17++) {
                this.f92538f.append(iArr[i17], readParcelableArray[i17]);
            }
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            android.util.SparseArray sparseArray = this.f92538f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = this.f92538f.keyAt(i18);
                parcelableArr[i18] = (android.os.Parcelable) this.f92538f.valueAt(i18);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i17);
        }
    }

    static {
        java.lang.Package r07 = p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.class.getPackage();
        f92518y = r07 != null ? r07.getName() : null;
        B = new x2.d();
        f92519z = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        A = new java.lang.ThreadLocal();
        C = new m3.g(12);
    }

    public C1081xa22a3e5a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559746dr);
    }

    public static android.graphics.Rect e() {
        android.graphics.Rect rect = (android.graphics.Rect) ((m3.g) C).a();
        return rect == null ? new android.graphics.Rect() : rect;
    }

    public static void x(android.graphics.Rect rect) {
        rect.setEmpty();
        ((m3.g) C).b(rect);
    }

    public final void A(android.view.View view, int i17) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams();
        int i18 = cVar.f92547i;
        if (i18 != i17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            view.offsetLeftAndRight(i17 - i18);
            cVar.f92547i = i17;
        }
    }

    @Override // n3.g0
    public boolean B(android.view.View view, android.view.View view2, int i17, int i18) {
        int childCount = getChildCount();
        boolean z17 = false;
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
                p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = cVar.f92539a;
                if (behavior != null) {
                    boolean u17 = behavior.u(this, childAt, view, view2, i17, i18);
                    z17 |= u17;
                    if (i18 == 0) {
                        cVar.f92552n = u17;
                    } else if (i18 == 1) {
                        cVar.f92553o = u17;
                    }
                } else if (i18 == 0) {
                    cVar.f92552n = false;
                } else if (i18 == 1) {
                    cVar.f92553o = false;
                }
            }
        }
        return z17;
    }

    public final void C(android.view.View view, int i17) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams();
        int i18 = cVar.f92548j;
        if (i18 != i17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            view.offsetTopAndBottom(i17 - i18);
            cVar.f92548j = i17;
        }
    }

    public final void D() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.u0.b(this)) {
            n3.a1.u(this, null);
            return;
        }
        if (this.f92536w == null) {
            this.f92536w = new x2.a(this);
        }
        n3.a1.u(this, this.f92536w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams()).f92539a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f92534u;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | drawable.setState(drawableState);
        }
        if (z17) {
            invalidate();
        }
    }

    public final void f(p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar, android.graphics.Rect rect, int i17, int i18) {
        int width = getWidth();
        int height = getHeight();
        int max = java.lang.Math.max(getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i17) - ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int max2 = java.lang.Math.max(getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i18) - ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(max, max2, i17 + max, i18 + max2);
    }

    public void g(android.view.View view) {
        java.util.List list = (java.util.List) this.f92521e.f533012b.m174751x4aabfc28(view, null);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            android.view.View view2 = (android.view.View) list.get(i17);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view2.getLayoutParams()).f92539a;
            if (behavior != null) {
                behavior.d(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p073xee01125a.p074xd1075a44.c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p073xee01125a.p074xd1075a44.c(getContext(), attributeSet);
    }

    /* renamed from: getDependencySortedChildren */
    public final java.util.List<android.view.View> m7198xbec4d97d() {
        w();
        return java.util.Collections.unmodifiableList(this.f92520d);
    }

    /* renamed from: getLastWindowInsets */
    public final n3.g3 m7199x1d79f432() {
        return this.f92532s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.f92537x;
        return j0Var.f415879b | j0Var.f415878a;
    }

    /* renamed from: getStatusBarBackground */
    public android.graphics.drawable.Drawable m7200xf98c2799() {
        return this.f92534u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // n3.g0
    public void h(android.view.View view, android.view.View view2, int i17, int i18) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        this.f92537x.a(view, view2, i17, i18);
        this.f92529p = view2;
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
            if (cVar.a(i18) && (behavior = cVar.f92539a) != null) {
                behavior.p(this, childAt, view, view2, i17, i18);
            }
        }
    }

    public void i(android.view.View view, boolean z17, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z17) {
            m(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // n3.g0
    public void j(android.view.View view, int i17) {
        this.f92537x.b(view, i17);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
            if (cVar.a(i17)) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = cVar.f92539a;
                if (behavior != null) {
                    behavior.w(this, childAt, view, i17);
                }
                if (i17 == 0) {
                    cVar.f92552n = false;
                } else if (i17 == 1) {
                    cVar.f92553o = false;
                }
                cVar.f92554p = false;
            }
        }
        this.f92529p = null;
    }

    public java.util.List k(android.view.View view) {
        x.n nVar = this.f92521e.f533012b;
        int i17 = nVar.f532379f;
        java.util.ArrayList arrayList = null;
        for (int i18 = 0; i18 < i17; i18++) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) nVar.l(i18);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(nVar.h(i18));
            }
        }
        java.util.List list = this.f92523g;
        ((java.util.ArrayList) list).clear();
        if (arrayList != null) {
            ((java.util.ArrayList) list).addAll(arrayList);
        }
        return list;
    }

    @Override // n3.g0
    public void l(android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        int childCount = getChildCount();
        boolean z17 = false;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
                if (cVar.a(i28) && (behavior = cVar.f92539a) != null) {
                    behavior.o(this, childAt, view, i17, i18, i19, i27, i28);
                    z17 = true;
                }
            }
        }
        if (z17) {
            r(1);
        }
    }

    public void m(android.view.View view, android.graphics.Rect rect) {
        java.lang.ThreadLocal threadLocal = x2.f.f533015a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        java.lang.ThreadLocal threadLocal2 = x2.f.f533015a;
        android.graphics.Matrix matrix = (android.graphics.Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        x2.f.a(this, view, matrix);
        java.lang.ThreadLocal threadLocal3 = x2.f.f533016b;
        android.graphics.RectF rectF = (android.graphics.RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void n(android.view.View view, int i17, android.graphics.Rect rect, android.graphics.Rect rect2, p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar, int i18, int i19) {
        int i27 = cVar.f92541c;
        if (i27 == 0) {
            i27 = 17;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i27, i17);
        int i28 = cVar.f92542d;
        if ((i28 & 7) == 0) {
            i28 |= 8388611;
        }
        if ((i28 & 112) == 0) {
            i28 |= 48;
        }
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(i28, i17);
        int i29 = absoluteGravity & 7;
        int i37 = absoluteGravity & 112;
        int i38 = absoluteGravity2 & 7;
        int i39 = absoluteGravity2 & 112;
        int width = i38 != 1 ? i38 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i39 != 16 ? i39 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i29 == 1) {
            width -= i18 / 2;
        } else if (i29 != 5) {
            width -= i18;
        }
        if (i37 == 16) {
            height -= i19 / 2;
        } else if (i37 != 80) {
            height -= i19;
        }
        rect2.set(width, height, i18 + width, i19 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p012xc85e97e9.p073xee01125a.p074xd1075a44.c o(android.view.View view) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams();
        if (!cVar.f92540b) {
            if (view instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.a) {
                cVar.b(((p012xc85e97e9.p073xee01125a.p074xd1075a44.a) view).mo7205xd5e8efc8());
                cVar.f92540b = true;
            } else {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.b bVar = null;
                for (java.lang.Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.b) cls.getAnnotation(p012xc85e97e9.p073xee01125a.p074xd1075a44.b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        cVar.b((p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior) bVar.m7206x6ac9171().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                    } catch (java.lang.Exception unused) {
                        bVar.m7206x6ac9171().getName();
                    }
                }
                cVar.f92540b = true;
            }
        }
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y(false);
        if (this.f92531r) {
            if (this.f92530q == null) {
                this.f92530q = new x2.c(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f92530q);
        }
        if (this.f92532s == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.u0.b(this)) {
                n3.y0.c(this);
            }
        }
        this.f92526m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y(false);
        if (this.f92531r && this.f92530q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f92530q);
        }
        android.view.View view = this.f92529p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f92526m = false;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f92533t || this.f92534u == null) {
            return;
        }
        n3.g3 g3Var = this.f92532s;
        int e17 = g3Var != null ? g3Var.e() : 0;
        if (e17 > 0) {
            this.f92534u.setBounds(0, 0, getWidth(), e17);
            this.f92534u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y(true);
        }
        boolean v17 = v(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            y(true);
        }
        return v17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.v0.d(this);
        java.util.List list = this.f92520d;
        int size = ((java.util.ArrayList) list).size();
        for (int i28 = 0; i28 < size; i28++) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i28);
            if (view.getVisibility() != 8 && ((behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams()).f92539a) == null || !behavior.g(this, view, d17))) {
                s(view, d17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019e, code lost:
    
        if (r0.h(r32, r20, r25, r21, r26, 0) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f17, float f18, boolean z17) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        int childCount = getChildCount();
        boolean z18 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
                if (cVar.a(0) && (behavior = cVar.f92539a) != null) {
                    z18 |= behavior.i(this, childAt, view, f17, f18, z17);
                }
            }
        }
        if (z18) {
            r(1);
        }
        return z18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f17, float f18) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        int childCount = getChildCount();
        boolean z17 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
                if (cVar.a(0) && (behavior = cVar.f92539a) != null) {
                    z17 |= behavior.j(this, childAt, view, f17, f18);
                }
            }
        }
        return z17;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i17, int i18, int[] iArr) {
        t(view, i17, i18, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
        l(view, i17, i18, i19, i27, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        h(view, view2, i17, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState savedState = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        android.util.SparseArray sparseArray = savedState.f92538f;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            int id6 = childAt.getId();
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = o(childAt).f92539a;
            if (id6 != -1 && behavior != null && (parcelable2 = (android.os.Parcelable) sparseArray.get(id6)) != null) {
                behavior.r(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable s17;
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState savedState = new p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.SavedState(super.onSaveInstanceState());
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            int id6 = childAt.getId();
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams()).f92539a;
            if (id6 != -1 && behavior != null && (s17 = behavior.s(this, childAt)) != null) {
                sparseArray.append(id6, s17);
            }
        }
        savedState.f92538f = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        return B(view, view2, i17, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f92528o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.v(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f92528o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.c r6 = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f92539a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f92528o
            boolean r6 = r6.x(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f92528o
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.y(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q(android.view.View view, int i17, int i18) {
        android.graphics.Rect e17 = e();
        m(view, e17);
        try {
            return e17.contains(i17, i18);
        } finally {
            x(e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r26) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z17) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams()).f92539a;
        if (behavior == null || !behavior.q(this, view, rect, z17)) {
            return super.requestChildRectangleOnScreen(view, rect, z17);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        super.requestDisallowInterceptTouchEvent(z17);
        if (!z17 || this.f92525i) {
            return;
        }
        y(false);
        this.f92525i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.s(android.view.View, int):void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z17) {
        super.setFitsSystemWindows(z17);
        D();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f92535v = onHierarchyChangeListener;
    }

    /* renamed from: setStatusBarBackground */
    public void m7201x47d0e70d(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f92534u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f92534u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f92534u.setState(getDrawableState());
                }
                android.graphics.drawable.Drawable drawable3 = this.f92534u;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                f3.c.b(drawable3, n3.v0.d(this));
                this.f92534u.setVisible(getVisibility() == 0, false);
                this.f92534u.setCallback(this);
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* renamed from: setStatusBarBackgroundColor */
    public void m7202x63bab856(int i17) {
        m7201x47d0e70d(new android.graphics.drawable.ColorDrawable(i17));
    }

    /* renamed from: setStatusBarBackgroundResource */
    public void m7203xaef9b23b(int i17) {
        m7201x47d0e70d(i17 != 0 ? b3.l.m9707x4a96be14(getContext(), i17) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        boolean z17 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f92534u;
        if (drawable == null || drawable.isVisible() == z17) {
            return;
        }
        this.f92534u.setVisible(z17, false);
    }

    @Override // n3.g0
    public void t(android.view.View view, int i17, int i18, int[] iArr, int i19) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior;
        int childCount = getChildCount();
        boolean z17 = false;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams();
                if (cVar.a(i19) && (behavior = cVar.f92539a) != null) {
                    int[] iArr2 = this.f92524h;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    behavior.l(this, childAt, view, i17, i18, iArr2, i19);
                    int[] iArr3 = this.f92524h;
                    i27 = i17 > 0 ? java.lang.Math.max(i27, iArr3[0]) : java.lang.Math.min(i27, iArr3[0]);
                    i28 = i18 > 0 ? java.lang.Math.max(i28, iArr3[1]) : java.lang.Math.min(i28, iArr3[1]);
                    z17 = true;
                }
            }
        }
        iArr[0] = i27;
        iArr[1] = i28;
        if (z17) {
            r(1);
        }
    }

    public void u(android.view.View view, int i17, int i18, int i19, int i27) {
        measureChildWithMargins(view, i17, i18, i19, i27);
    }

    public final boolean v(android.view.MotionEvent motionEvent, int i17) {
        boolean z17;
        int actionMasked = motionEvent.getActionMasked();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f92522f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i18 = childCount - 1; i18 >= 0; i18--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i18) : i18));
        }
        java.util.Comparator comparator = B;
        if (comparator != null) {
            java.util.Collections.sort(arrayList, comparator);
        }
        int size = arrayList.size();
        android.view.MotionEvent motionEvent2 = null;
        boolean z18 = false;
        boolean z19 = false;
        for (int i19 = 0; i19 < size; i19++) {
            android.view.View view = (android.view.View) arrayList.get(i19);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams();
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = cVar.f92539a;
            if (!(z18 || z19) || actionMasked == 0) {
                if (!z18 && behavior != null) {
                    if (i17 == 0) {
                        z18 = behavior.e(this, view, motionEvent);
                    } else if (i17 == 1) {
                        z18 = behavior.x(this, view, motionEvent);
                    }
                    if (z18) {
                        this.f92528o = view;
                    }
                }
                if (cVar.f92539a == null) {
                    cVar.f92551m = false;
                }
                boolean z27 = cVar.f92551m;
                if (z27) {
                    z17 = true;
                } else {
                    z17 = z27 | false;
                    cVar.f92551m = z17;
                }
                z19 = z17 && !z27;
                if (z17 && !z19) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    motionEvent2 = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i17 == 0) {
                    behavior.e(this, view, motionEvent2);
                } else if (i17 == 1) {
                    behavior.x(this, view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z18;
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f92534u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0076, code lost:
    
        if (r6 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.w():void");
    }

    public final void y(boolean z17) {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams()).f92539a;
            if (behavior != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z17) {
                    behavior.e(this, childAt, obtain);
                } else {
                    behavior.x(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) getChildAt(i18).getLayoutParams()).f92551m = false;
        }
        this.f92528o = null;
        this.f92525i = false;
    }

    public C1081xa22a3e5a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes;
        this.f92520d = new java.util.ArrayList();
        this.f92521e = new x2.e();
        this.f92522f = new java.util.ArrayList();
        this.f92523g = new java.util.ArrayList();
        this.f92524h = new int[2];
        this.f92537x = new n3.j0(this);
        int[] iArr = w2.a.f523806a;
        if (i17 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576290vf);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f92527n = intArray;
            float f17 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i18 = 0; i18 < length; i18++) {
                this.f92527n[i18] = (int) (r0[i18] * f17);
            }
        }
        this.f92534u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        D();
        super.setOnHierarchyChangeListener(new x2.b(this));
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c) {
            return new p012xc85e97e9.p073xee01125a.p074xd1075a44.c((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new p012xc85e97e9.p073xee01125a.p074xd1075a44.c((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p012xc85e97e9.p073xee01125a.p074xd1075a44.c(layoutParams);
    }
}
