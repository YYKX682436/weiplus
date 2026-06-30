package androidx.appcompat.widget;

/* loaded from: classes14.dex */
public class d3 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: p, reason: collision with root package name */
    public static androidx.appcompat.widget.d3 f9549p;

    /* renamed from: q, reason: collision with root package name */
    public static androidx.appcompat.widget.d3 f9550q;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f9551d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f9552e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9553f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f9554g = new androidx.appcompat.widget.b3(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f9555h = new androidx.appcompat.widget.c3(this);

    /* renamed from: i, reason: collision with root package name */
    public int f9556i;

    /* renamed from: m, reason: collision with root package name */
    public int f9557m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.e3 f9558n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9559o;

    public d3(android.view.View view, java.lang.CharSequence charSequence) {
        this.f9551d = view;
        this.f9552e = charSequence;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        java.lang.reflect.Method method = n3.o1.f334378a;
        this.f9553f = android.os.Build.VERSION.SDK_INT >= 28 ? n3.n1.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f9556i = Integer.MAX_VALUE;
        this.f9557m = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(androidx.appcompat.widget.d3 d3Var) {
        androidx.appcompat.widget.d3 d3Var2 = f9549p;
        if (d3Var2 != null) {
            d3Var2.f9551d.removeCallbacks(d3Var2.f9554g);
        }
        f9549p = d3Var;
        if (d3Var != null) {
            d3Var.f9551d.postDelayed(d3Var.f9554g, android.view.ViewConfiguration.getLongPressTimeout());
        }
    }

    public void a() {
        androidx.appcompat.widget.d3 d3Var = f9550q;
        android.view.View view = this.f9551d;
        if (d3Var == this) {
            f9550q = null;
            androidx.appcompat.widget.e3 e3Var = this.f9558n;
            if (e3Var != null) {
                android.view.View view2 = e3Var.f9569b;
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) e3Var.f9568a.getSystemService("window")).removeView(view2);
                }
                this.f9558n = null;
                this.f9556i = Integer.MAX_VALUE;
                this.f9557m = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f9549p == this) {
            b(null);
        }
        view.removeCallbacks(this.f9555h);
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
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        android.view.View view = this.f9551d;
        if (n3.x0.b(view)) {
            b(null);
            androidx.appcompat.widget.d3 d3Var = f9550q;
            if (d3Var != null) {
                d3Var.a();
            }
            f9550q = this;
            this.f9559o = z17;
            androidx.appcompat.widget.e3 e3Var = new androidx.appcompat.widget.e3(view.getContext());
            this.f9558n = e3Var;
            int i19 = this.f9556i;
            int i27 = this.f9557m;
            boolean z18 = this.f9559o;
            android.view.View view2 = e3Var.f9569b;
            boolean z19 = view2.getParent() != null;
            android.content.Context context = e3Var.f9568a;
            if (z19) {
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            e3Var.f9570c.setText(this.f9552e);
            android.view.WindowManager.LayoutParams layoutParams = e3Var.f9571d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ace);
            if (view.getWidth() < dimensionPixelOffset) {
                i19 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.acd);
                height = i27 + dimensionPixelOffset2;
                i17 = i27 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i17 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z18 ? com.tencent.mm.R.dimen.ach : com.tencent.mm.R.dimen.acg);
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
                android.graphics.Rect rect = e3Var.f9572e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i18 = 0;
                } else {
                    android.content.res.Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i18 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = e3Var.f9574g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = e3Var.f9573f;
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
            if (this.f9559o) {
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
            java.lang.Runnable runnable = this.f9555h;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j18);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        if (this.f9558n != null && this.f9559o) {
            return false;
        }
        android.view.View view2 = this.f9551d;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f9556i = Integer.MAX_VALUE;
                this.f9557m = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f9558n == null) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int abs = java.lang.Math.abs(x17 - this.f9556i);
            int i17 = this.f9553f;
            if (abs > i17 || java.lang.Math.abs(y17 - this.f9557m) > i17) {
                this.f9556i = x17;
                this.f9557m = y17;
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
        this.f9556i = view.getWidth() / 2;
        this.f9557m = view.getHeight() / 2;
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
