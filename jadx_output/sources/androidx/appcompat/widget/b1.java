package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class b1 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f9520d;

    /* renamed from: e, reason: collision with root package name */
    public int f9521e;

    /* renamed from: f, reason: collision with root package name */
    public int f9522f;

    /* renamed from: g, reason: collision with root package name */
    public int f9523g;

    /* renamed from: h, reason: collision with root package name */
    public int f9524h;

    /* renamed from: i, reason: collision with root package name */
    public int f9525i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Field f9526m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.z0 f9527n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9528o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9529p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9530q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.core.widget.k f9531r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.appcompat.widget.a1 f9532s;

    public b1(android.content.Context context, boolean z17) {
        super(context, null, com.tencent.mm.R.attr.f478231e8);
        this.f9520d = new android.graphics.Rect();
        this.f9521e = 0;
        this.f9522f = 0;
        this.f9523g = 0;
        this.f9524h = 0;
        this.f9529p = z17;
        setCacheColorHint(0);
        try {
            java.lang.reflect.Field declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f9526m = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException unused) {
        }
    }

    public int b(int i17, int i18, int i19, int i27, int i28) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i29 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        android.view.View view = null;
        while (i37 < count) {
            int itemViewType = adapter.getItemViewType(i37);
            if (itemViewType != i38) {
                view = null;
                i38 = itemViewType;
            }
            view = adapter.getView(i37, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i47 = layoutParams.height;
            view.measure(i17, i47 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i47, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i37 > 0) {
                i29 += dividerHeight;
            }
            i29 += view.getMeasuredHeight();
            if (i29 >= i27) {
                return (i28 < 0 || i37 <= i28 || i39 <= 0 || i29 == i27) ? i27 : i39;
            }
            if (i28 >= 0 && i37 >= i28) {
                i39 = i29;
            }
            i37++;
        }
        return i29;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b1.c(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.f9520d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f9532s != null) {
            return;
        }
        super.drawableStateChanged();
        androidx.appcompat.widget.z0 z0Var = this.f9527n;
        if (z0Var != null) {
            z0Var.f9745e = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.f9530q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f9529p || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f9529p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f9529p || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f9529p && this.f9528o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f9532s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9532s == null) {
            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this);
            this.f9532s = a1Var;
            post(a1Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                android.graphics.drawable.Drawable selector = getSelector();
                if (selector != null && this.f9530q && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9525i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.appcompat.widget.a1 a1Var = this.f9532s;
        if (a1Var != null) {
            androidx.appcompat.widget.b1 b1Var = a1Var.f9509d;
            b1Var.f9532s = null;
            b1Var.removeCallbacks(a1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z17) {
        this.f9528o = z17;
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.z0 z0Var = drawable != null ? new androidx.appcompat.widget.z0(drawable) : null;
        this.f9527n = z0Var;
        super.setSelector(z0Var);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9521e = rect.left;
        this.f9522f = rect.top;
        this.f9523g = rect.right;
        this.f9524h = rect.bottom;
    }
}
