package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public abstract class fd implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f291956d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f291957e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f291958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f291959g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.BaseAdapter f291960h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver f291961i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f291962m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f291963n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f291964o = com.p314xaae8f345.mm.R.C30868x68b1db1.f575683fi;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291965p = false;

    public fd(android.content.Context context) {
        this.f291957e = context;
        android.content.res.Resources resources = context.getResources();
        this.f291959g = java.lang.Math.min((resources.getDisplayMetrics().widthPixels * 4) / 5, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561433id));
        if (context instanceof android.app.Activity) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f291958f = viewGroup.getChildAt(0);
            } else {
                this.f291958f = viewGroup;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 1.0f);
        resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561159b1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 36.0f);
        this.f291960h = b();
    }

    public void a() {
        if (c()) {
            this.f291956d.a();
        }
    }

    public abstract android.widget.BaseAdapter b();

    public boolean c() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f291956d;
        return c21505x98c24a7e != null && c21505x98c24a7e.f279010g.isShowing();
    }

    public boolean d(int i17) {
        int d17;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.Context context = this.f291957e;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            d17 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).mo2533x106ab264().l();
        } else {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d17 = displayMetrics.widthPixels > displayMetrics.heightPixels ? com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 40.0f) : com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 49.0f);
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = activity.getWindow().getDecorView().getHeight();
            int[] iArr = new int[2];
            activity.getWindow().getDecorView().getLocationOnScreen(iArr);
            d17 = (height - rect.height() < 0 || iArr[1] <= 200) ? d17 + rect.top : d17 + (height - rect.height());
        }
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        this.f291965p = displayMetrics2.widthPixels > displayMetrics2.heightPixels;
        if (this.f291956d == null) {
            this.f291956d = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e(context, null, 0);
        }
        this.f291956d.f279010g.setOnDismissListener(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f291956d;
        c21505x98c24a7e.f279021r = this;
        android.widget.BaseAdapter baseAdapter = this.f291960h;
        c21505x98c24a7e.b(baseAdapter);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e2 = this.f291956d;
        c21505x98c24a7e2.f279024u = true;
        c21505x98c24a7e2.f279010g.setFocusable(true);
        this.f291956d.f279010g.setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ccd));
        this.f291956d.f279010g.setAnimationStyle(this.f291964o);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e3 = this.f291956d;
        c21505x98c24a7e3.f279015l = i17;
        android.view.View view = this.f291958f;
        c21505x98c24a7e3.f279020q = view;
        if (view != null) {
            boolean z17 = this.f291961i == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f291961i = viewTreeObserver;
            if (z17) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e4 = this.f291956d;
        c21505x98c24a7e4.f279016m = d17;
        c21505x98c24a7e4.f279017n = true;
        c21505x98c24a7e4.f279025v = this.f291963n;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = baseAdapter.getCount();
        android.view.View view2 = null;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < count; i27++) {
            int itemViewType = baseAdapter.getItemViewType(i27);
            if (itemViewType != i19) {
                view2 = null;
                i19 = itemViewType;
            }
            if (this.f291962m == null) {
                this.f291962m = new android.widget.FrameLayout(context);
            }
            view2 = baseAdapter.getView(i27, view2, this.f291962m);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i18 = java.lang.Math.max(i18, view2.getMeasuredWidth());
        }
        c21505x98c24a7e4.c(java.lang.Math.min(i18, this.f291959g));
        this.f291956d.f279010g.setInputMethodMode(2);
        this.f291956d.d();
        this.f291956d.f279012i.setOnKeyListener(this);
        this.f291956d.f279012i.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e)));
        this.f291956d.f279012i.setDividerHeight(0);
        this.f291956d.f279012i.setVerticalScrollBarEnabled(true);
        this.f291956d.f279012i.setHorizontalScrollBarEnabled(false);
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.f291961i;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f291961i = this.f291958f.getViewTreeObserver();
            }
            this.f291961i.removeGlobalOnLayoutListener(this);
            this.f291961i = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        c();
        android.view.View view = this.f291958f;
        view.isShown();
        if (c()) {
            if (!view.isShown()) {
                a();
                return;
            }
            if (c()) {
                boolean z17 = this.f291965p;
                android.util.DisplayMetrics displayMetrics = this.f291957e.getResources().getDisplayMetrics();
                if (z17 != (displayMetrics.widthPixels > displayMetrics.heightPixels)) {
                    this.f291956d.a();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() != 1 || i17 != 82) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        a();
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
