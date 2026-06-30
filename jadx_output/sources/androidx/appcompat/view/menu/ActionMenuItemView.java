package androidx.appcompat.view.menu;

/* loaded from: classes15.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements o.h0, android.view.View.OnClickListener, androidx.appcompat.widget.r {

    /* renamed from: g, reason: collision with root package name */
    public o.u f9264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f9265h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9266i;

    /* renamed from: m, reason: collision with root package name */
    public o.q f9267m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.f1 f9268n;

    /* renamed from: o, reason: collision with root package name */
    public o.c f9269o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9270p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9271q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9272r;

    /* renamed from: s, reason: collision with root package name */
    public int f9273s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9274t;

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // o.h0
    public void a(o.u uVar, int i17) {
        this.f9264g = uVar;
        setIcon(uVar.getIcon());
        setTitle(uVar.getTitleCondensed());
        setId(uVar.f341804d);
        setVisibility(uVar.isVisible() ? 0 : 8);
        setEnabled(uVar.isEnabled());
        if (uVar.hasSubMenu() && this.f9268n == null) {
            this.f9268n = new o.b(this);
        }
    }

    public boolean b() {
        return !android.text.TextUtils.isEmpty(getF131525i());
    }

    @Override // androidx.appcompat.widget.r
    public boolean c() {
        return b();
    }

    @Override // androidx.appcompat.widget.r
    public boolean d() {
        return b() && this.f9264g.getIcon() == null;
    }

    public final boolean e() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i17 = configuration.screenWidthDp;
        return i17 >= 480 || (i17 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z17 = true;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f9265h);
        if (this.f9266i != null) {
            if (!((this.f9264g.E & 4) == 4) || (!this.f9270p && !this.f9271q)) {
                z17 = false;
            }
        }
        boolean z19 = z18 & z17;
        setText(z19 ? this.f9265h : null);
        java.lang.CharSequence charSequence = this.f9264g.f341820w;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z19 ? null : this.f9264g.f341808h);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f9264g.f341821x;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            androidx.appcompat.widget.a3.a(this, z19 ? null : this.f9264g.f341808h);
        } else {
            androidx.appcompat.widget.a3.a(this, charSequence2);
        }
    }

    @Override // o.h0
    public o.u getItemData() {
        return this.f9264g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        o.q qVar = this.f9267m;
        if (qVar != null) {
            qVar.c(this.f9264g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9270p = e();
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        boolean b17 = b();
        if (b17 && (i19 = this.f9273s) >= 0) {
            super.setPadding(i19, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i17, i18);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f9272r;
        int min = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i27) : i27;
        if (mode != 1073741824 && i27 > 0 && measuredWidth < min) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824), i18);
        }
        if (b17 || this.f9266i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f9266i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.f1 f1Var;
        if (this.f9264g.hasSubMenu() && (f1Var = this.f9268n) != null && f1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z17) {
    }

    public void setChecked(boolean z17) {
    }

    public void setExpandedFormat(boolean z17) {
        if (this.f9271q != z17) {
            this.f9271q = z17;
            o.u uVar = this.f9264g;
            if (uVar != null) {
                o.r rVar = uVar.f341817t;
                rVar.f341790q = true;
                rVar.p(true);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f9266i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i17 = this.f9274t;
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

    public void setItemInvoker(o.q qVar) {
        this.f9267m = qVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        this.f9273s = i17;
        super.setPadding(i17, i18, i19, i27);
    }

    public void setPopupCallback(o.c cVar) {
        this.f9269o = cVar;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f9265h = charSequence;
        g();
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources = context.getResources();
        this.f9270p = e();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296175c, i17, 0);
        this.f9272r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f9274t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f9273s = -1;
        setSaveEnabled(false);
    }
}
