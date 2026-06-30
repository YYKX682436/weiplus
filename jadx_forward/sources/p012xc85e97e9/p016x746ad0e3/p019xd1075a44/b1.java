package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class b1 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f91053d;

    /* renamed from: e, reason: collision with root package name */
    public int f91054e;

    /* renamed from: f, reason: collision with root package name */
    public int f91055f;

    /* renamed from: g, reason: collision with root package name */
    public int f91056g;

    /* renamed from: h, reason: collision with root package name */
    public int f91057h;

    /* renamed from: i, reason: collision with root package name */
    public int f91058i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Field f91059m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z0 f91060n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91061o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f91062p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f91063q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p079xd1075a44.k f91064r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a1 f91065s;

    public b1(android.content.Context context, boolean z17) {
        super(context, null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559764e8);
        this.f91053d = new android.graphics.Rect();
        this.f91054e = 0;
        this.f91055f = 0;
        this.f91056g = 0;
        this.f91057h = 0;
        this.f91062p = z17;
        setCacheColorHint(0);
        try {
            java.lang.reflect.Field declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f91059m = declaredField;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1.c(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.f91053d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f91065s != null) {
            return;
        }
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z0 z0Var = this.f91060n;
        if (z0Var != null) {
            z0Var.f91278e = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.f91063q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f91062p || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f91062p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f91062p || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f91062p && this.f91061o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f91065s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f91065s == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a1 a1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a1(this);
            this.f91065s = a1Var;
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
                if (selector != null && this.f91063q && isPressed()) {
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
            this.f91058i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a1 a1Var = this.f91065s;
        if (a1Var != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = a1Var.f91042d;
            b1Var.f91065s = null;
            b1Var.removeCallbacks(a1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setListSelectionHidden */
    public void m2863xbfc13616(boolean z17) {
        this.f91061o = z17;
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z0 z0Var = drawable != null ? new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z0(drawable) : null;
        this.f91060n = z0Var;
        super.setSelector(z0Var);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f91054e = rect.left;
        this.f91055f = rect.top;
        this.f91056g = rect.right;
        this.f91057h = rect.bottom;
    }
}
