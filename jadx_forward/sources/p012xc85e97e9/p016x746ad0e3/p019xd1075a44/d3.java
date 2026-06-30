package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes14.dex */
public class d3 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: p, reason: collision with root package name */
    public static p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 f91082p;

    /* renamed from: q, reason: collision with root package name */
    public static p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 f91083q;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f91084d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f91085e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91086f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f91087g = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b3(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f91088h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c3(this);

    /* renamed from: i, reason: collision with root package name */
    public int f91089i;

    /* renamed from: m, reason: collision with root package name */
    public int f91090m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e3 f91091n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91092o;

    public d3(android.view.View view, java.lang.CharSequence charSequence) {
        this.f91084d = view;
        this.f91085e = charSequence;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        java.lang.reflect.Method method = n3.o1.f415911a;
        this.f91086f = android.os.Build.VERSION.SDK_INT >= 28 ? n3.n1.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f91089i = Integer.MAX_VALUE;
        this.f91090m = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var2 = f91082p;
        if (d3Var2 != null) {
            d3Var2.f91084d.removeCallbacks(d3Var2.f91087g);
        }
        f91082p = d3Var;
        if (d3Var != null) {
            d3Var.f91084d.postDelayed(d3Var.f91087g, android.view.ViewConfiguration.getLongPressTimeout());
        }
    }

    public void a() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var = f91083q;
        android.view.View view = this.f91084d;
        if (d3Var == this) {
            f91083q = null;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e3 e3Var = this.f91091n;
            if (e3Var != null) {
                android.view.View view2 = e3Var.f91102b;
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) e3Var.f91101a.getSystemService("window")).removeView(view2);
                }
                this.f91091n = null;
                this.f91089i = Integer.MAX_VALUE;
                this.f91090m = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f91082p == this) {
            b(null);
        }
        view.removeCallbacks(this.f91088h);
    }

    public void c(boolean z17) {
        int height;
        int i17;
        java.lang.String str;
        int i18;
        java.lang.String str2;
        long longPressTimeout;
        long j17;
        long j18;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        android.view.View view = this.f91084d;
        if (n3.x0.b(view)) {
            b(null);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var = f91083q;
            if (d3Var != null) {
                d3Var.a();
            }
            f91083q = this;
            this.f91092o = z17;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e3 e3Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e3(view.getContext());
            this.f91091n = e3Var;
            int i19 = this.f91089i;
            int i27 = this.f91090m;
            boolean z18 = this.f91092o;
            android.view.View view2 = e3Var.f91102b;
            boolean z19 = view2.getParent() != null;
            android.content.Context context = e3Var.f91101a;
            if (z19) {
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            e3Var.f91103c.setText(this.f91085e);
            android.view.WindowManager.LayoutParams layoutParams = e3Var.f91104d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ace);
            if (view.getWidth() < dimensionPixelOffset) {
                i19 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.acd);
                height = i27 + dimensionPixelOffset2;
                i17 = i27 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i17 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z18 ? com.p314xaae8f345.mm.R.C30860x5b28f31.ach : com.p314xaae8f345.mm.R.C30860x5b28f31.acg);
            android.view.View rootView = view.getRootView();
            android.view.ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof android.view.WindowManager.LayoutParams) || ((android.view.WindowManager.LayoutParams) layoutParams2).type != 2) {
                android.content.Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof android.content.ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof android.app.Activity) {
                        rootView = ((android.app.Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((android.content.ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                str2 = "window";
            } else {
                android.graphics.Rect rect = e3Var.f91105e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i18 = 0;
                } else {
                    android.content.res.Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i18 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = e3Var.f91107g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = e3Var.f91106f;
                view.getLocationOnScreen(iArr2);
                int i28 = iArr2[i18] - iArr[i18];
                iArr2[i18] = i28;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i28 + i19) - (rootView.getWidth() / 2);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i18, i18);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i29 = iArr2[1];
                int i37 = ((i17 + i29) - dimensionPixelOffset3) - measuredHeight;
                int i38 = i29 + height + dimensionPixelOffset3;
                if (z18) {
                    if (i37 >= 0) {
                        layoutParams.y = i37;
                    } else {
                        layoutParams.y = i38;
                    }
                } else if (measuredHeight + i38 <= rect.height()) {
                    layoutParams.y = i38;
                } else {
                    layoutParams.y = i37;
                }
                str2 = str;
            }
            ((android.view.WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f91092o) {
                j18 = 2500;
            } else {
                if ((n3.u0.g(view) & 1) == 1) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j17 = 3000;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j17 = 15000;
                }
                j18 = j17 - longPressTimeout;
            }
            java.lang.Runnable runnable = this.f91088h;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j18);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        if (this.f91091n != null && this.f91092o) {
            return false;
        }
        android.view.View view2 = this.f91084d;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f91089i = Integer.MAX_VALUE;
                this.f91090m = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f91091n == null) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int abs = java.lang.Math.abs(x17 - this.f91089i);
            int i17 = this.f91086f;
            if (abs > i17 || java.lang.Math.abs(y17 - this.f91090m) > i17) {
                this.f91089i = x17;
                this.f91090m = y17;
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        this.f91089i = view.getWidth() / 2;
        this.f91090m = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        a();
    }
}
