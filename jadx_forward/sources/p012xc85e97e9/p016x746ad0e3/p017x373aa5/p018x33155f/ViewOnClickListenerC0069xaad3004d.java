package p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f;

/* renamed from: androidx.appcompat.view.menu.ActionMenuItemView */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC0069xaad3004d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 implements o.h0, android.view.View.OnClickListener, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r {

    /* renamed from: g, reason: collision with root package name */
    public o.u f90797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f90798h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90799i;

    /* renamed from: m, reason: collision with root package name */
    public o.q f90800m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f90801n;

    /* renamed from: o, reason: collision with root package name */
    public o.c f90802o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90803p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90804q;

    /* renamed from: r, reason: collision with root package name */
    public final int f90805r;

    /* renamed from: s, reason: collision with root package name */
    public int f90806s;

    /* renamed from: t, reason: collision with root package name */
    public final int f90807t;

    public ViewOnClickListenerC0069xaad3004d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // o.h0
    public void a(o.u uVar, int i17) {
        this.f90797g = uVar;
        m2578x764b6bfb(uVar.getIcon());
        m2581x53bfe316(uVar.getTitleCondensed());
        setId(uVar.f423337d);
        setVisibility(uVar.isVisible() ? 0 : 8);
        setEnabled(uVar.isEnabled());
        if (uVar.hasSubMenu() && this.f90801n == null) {
            this.f90801n = new o.b(this);
        }
    }

    public boolean b() {
        return !android.text.TextUtils.isEmpty(getF213058i());
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r
    public boolean c() {
        return b();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r
    public boolean d() {
        return b() && this.f90797g.getIcon() == null;
    }

    public final boolean e() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i17 = configuration.screenWidthDp;
        return i17 >= 480 || (i17 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z17 = true;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f90798h);
        if (this.f90799i != null) {
            if (!((this.f90797g.E & 4) == 4) || (!this.f90803p && !this.f90804q)) {
                z17 = false;
            }
        }
        boolean z19 = z18 & z17;
        setText(z19 ? this.f90798h : null);
        java.lang.CharSequence charSequence = this.f90797g.f423353w;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z19 ? null : this.f90797g.f423341h);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f90797g.f423354x;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, z19 ? null : this.f90797g.f423341h);
        } else {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, charSequence2);
        }
    }

    @Override // o.h0
    /* renamed from: getItemData */
    public o.u mo2574xc2025ad3() {
        return this.f90797g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        o.q qVar = this.f90800m;
        if (qVar != null) {
            qVar.c(this.f90797g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f90803p = e();
        g();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        boolean b17 = b();
        if (b17 && (i19 = this.f90806s) >= 0) {
            super.setPadding(i19, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i17, i18);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f90805r;
        int min = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i27) : i27;
        if (mode != 1073741824 && i27 > 0 && measuredWidth < min) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824), i18);
        }
        if (b17 || this.f90799i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f90799i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f1Var;
        if (this.f90797g.hasSubMenu() && (f1Var = this.f90801n) != null && f1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setCheckable */
    public void m2575x7388e820(boolean z17) {
    }

    /* renamed from: setChecked */
    public void m2576xdd7d58e5(boolean z17) {
    }

    /* renamed from: setExpandedFormat */
    public void m2577x6eae9712(boolean z17) {
        if (this.f90804q != z17) {
            this.f90804q = z17;
            o.u uVar = this.f90797g;
            if (uVar != null) {
                o.r rVar = uVar.f423350t;
                rVar.f423323q = true;
                rVar.p(true);
            }
        }
    }

    /* renamed from: setIcon */
    public void m2578x764b6bfb(android.graphics.drawable.Drawable drawable) {
        this.f90799i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i17 = this.f90807t;
            if (intrinsicWidth > i17) {
                intrinsicHeight = (int) (intrinsicHeight * (i17 / intrinsicWidth));
                intrinsicWidth = i17;
            }
            if (intrinsicHeight > i17) {
                intrinsicWidth = (int) (intrinsicWidth * (i17 / intrinsicHeight));
            } else {
                i17 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i17);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    /* renamed from: setItemInvoker */
    public void m2579xc53f16a5(o.q qVar) {
        this.f90800m = qVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        this.f90806s = i17;
        super.setPadding(i17, i18, i19, i27);
    }

    /* renamed from: setPopupCallback */
    public void m2580xa0b5abcf(o.c cVar) {
        this.f90802o = cVar;
    }

    /* renamed from: setTitle */
    public void m2581x53bfe316(java.lang.CharSequence charSequence) {
        this.f90798h = charSequence;
        g();
    }

    public ViewOnClickListenerC0069xaad3004d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources = context.getResources();
        this.f90803p = e();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377708c, i17, 0);
        this.f90805r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f90807t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f90806s = -1;
        setSaveEnabled(false);
    }
}
