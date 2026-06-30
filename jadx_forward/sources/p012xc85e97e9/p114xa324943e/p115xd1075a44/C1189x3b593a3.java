package p012xc85e97e9.p114xa324943e.p115xd1075a44;

@p012xc85e97e9.p114xa324943e.p115xd1075a44.j
/* renamed from: androidx.viewpager.widget.PagerTitleStrip */
/* loaded from: classes15.dex */
public class C1189x3b593a3 extends android.view.ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f93940u = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.gravity};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f93941v = {android.R.attr.textAllCaps};

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f93942d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f93943e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f93944f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f93945g;

    /* renamed from: h, reason: collision with root package name */
    public int f93946h;

    /* renamed from: i, reason: collision with root package name */
    public float f93947i;

    /* renamed from: m, reason: collision with root package name */
    public int f93948m;

    /* renamed from: n, reason: collision with root package name */
    public int f93949n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93950o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93951p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.d f93952q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f93953r;

    /* renamed from: s, reason: collision with root package name */
    public int f93954s;

    /* renamed from: t, reason: collision with root package name */
    public int f93955t;

    public C1189x3b593a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f93946h = -1;
        this.f93947i = -1.0f;
        this.f93952q = new p012xc85e97e9.p114xa324943e.p115xd1075a44.d(this);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f93943e = textView;
        addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.f93944f = textView2;
        addView(textView2);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        this.f93945g = textView3;
        addView(textView3);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f93940u);
        boolean z17 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f17 = dimensionPixelSize;
            textView.setTextSize(0, f17);
            textView2.setTextSize(0, f17);
            textView3.setTextSize(0, f17);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f93949n = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f93955t = textView2.getTextColors().getDefaultColor();
        m8282xe8aec327(0.6f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f93941v);
            z17 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z17) {
            m8279x58e337e4(textView);
            m8279x58e337e4(textView2);
            m8279x58e337e4(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f93948m = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* renamed from: setSingleLineAllCaps */
    private static void m8279x58e337e4(android.widget.TextView textView) {
        textView.setTransformationMethod(new p012xc85e97e9.p114xa324943e.p115xd1075a44.e(textView.getContext()));
    }

    public void a(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar, p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.d dVar = this.f93952q;
        if (aVar != null) {
            aVar.m8348xfde4bf72(dVar);
            this.f93953r = null;
        }
        if (aVar2 != null) {
            aVar2.m8344x4b262a2b(dVar);
            this.f93953r = new java.lang.ref.WeakReference(aVar2);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93942d;
        if (c1190x18d3c3fe != null) {
            this.f93946h = -1;
            this.f93947i = -1.0f;
            b(c1190x18d3c3fe.m8300xfda78ef6(), aVar2);
            requestLayout();
        }
    }

    public void b(int i17, p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        int mo8338x7444f759 = aVar != null ? aVar.mo8338x7444f759() : 0;
        this.f93950o = true;
        java.lang.CharSequence charSequence = null;
        java.lang.CharSequence mo8340x337c8253 = (i17 < 1 || aVar == null) ? null : aVar.mo8340x337c8253(i17 - 1);
        android.widget.TextView textView = this.f93943e;
        textView.setText(mo8340x337c8253);
        android.widget.TextView textView2 = this.f93944f;
        textView2.setText((aVar == null || i17 >= mo8338x7444f759) ? null : aVar.mo8340x337c8253(i17));
        int i18 = i17 + 1;
        if (i18 < mo8338x7444f759 && aVar != null) {
            charSequence = aVar.mo8340x337c8253(i18);
        }
        android.widget.TextView textView3 = this.f93945g;
        textView3.setText(charSequence);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f93946h = i17;
        if (!this.f93951p) {
            c(i17, this.f93947i, false);
        }
        this.f93950o = false;
    }

    public void c(int i17, float f17, boolean z17) {
        int i18;
        int i19;
        int i27;
        int i28;
        if (i17 != this.f93946h) {
            b(i17, this.f93942d.m8299xf939df19());
        } else if (!z17 && f17 == this.f93947i) {
            return;
        }
        this.f93951p = true;
        android.widget.TextView textView = this.f93943e;
        int measuredWidth = textView.getMeasuredWidth();
        android.widget.TextView textView2 = this.f93944f;
        int measuredWidth2 = textView2.getMeasuredWidth();
        android.widget.TextView textView3 = this.f93945g;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i29 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i37 = paddingRight + i29;
        int i38 = (width - (paddingLeft + i29)) - i37;
        float f18 = f17 + 0.5f;
        if (f18 > 1.0f) {
            f18 -= 1.0f;
        }
        int i39 = ((width - i37) - ((int) (i38 * f18))) - i29;
        int i47 = measuredWidth2 + i39;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int max = java.lang.Math.max(java.lang.Math.max(baseline, baseline2), baseline3);
        int i48 = max - baseline;
        int i49 = max - baseline2;
        int i57 = max - baseline3;
        int max2 = java.lang.Math.max(java.lang.Math.max(textView.getMeasuredHeight() + i48, i49 + textView2.getMeasuredHeight()), i57 + textView3.getMeasuredHeight());
        int i58 = this.f93949n & 112;
        if (i58 == 16) {
            i18 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i58 != 80) {
                i19 = i48 + paddingTop;
                i27 = i49 + paddingTop;
                i28 = paddingTop + i57;
                textView2.layout(i39, i27, i47, textView2.getMeasuredHeight() + i27);
                int min = java.lang.Math.min(paddingLeft, (i39 - this.f93948m) - measuredWidth);
                textView.layout(min, i19, measuredWidth + min, textView.getMeasuredHeight() + i19);
                int max3 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i47 + this.f93948m);
                textView3.layout(max3, i28, max3 + measuredWidth3, textView3.getMeasuredHeight() + i28);
                this.f93947i = f17;
                this.f93951p = false;
            }
            i18 = (height - paddingBottom) - max2;
        }
        i19 = i48 + i18;
        i27 = i49 + i18;
        i28 = i18 + i57;
        textView2.layout(i39, i27, i47, textView2.getMeasuredHeight() + i27);
        int min2 = java.lang.Math.min(paddingLeft, (i39 - this.f93948m) - measuredWidth);
        textView.layout(min2, i19, measuredWidth + min2, textView.getMeasuredHeight() + i19);
        int max32 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i47 + this.f93948m);
        textView3.layout(max32, i28, max32 + measuredWidth3, textView3.getMeasuredHeight() + i28);
        this.f93947i = f17;
        this.f93951p = false;
    }

    /* renamed from: getMinHeight */
    public int mo8272xf7770f63() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* renamed from: getTextSpacing */
    public int m8280x2fd6c120() {
        return this.f93948m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe)) {
            throw new java.lang.IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) parent;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c1190x18d3c3fe.m8299xf939df19();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.d dVar = this.f93952q;
        c1190x18d3c3fe.m8320x64448492(dVar);
        c1190x18d3c3fe.m8288xa7bfb333(dVar);
        this.f93942d = c1190x18d3c3fe;
        java.lang.ref.WeakReference weakReference = this.f93953r;
        a(weakReference != null ? (p012xc85e97e9.p114xa324943e.p115xd1075a44.a) weakReference.get() : null, m8299xf939df19);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93942d;
        if (c1190x18d3c3fe != null) {
            a(c1190x18d3c3fe.m8299xf939df19(), null);
            this.f93942d.m8320x64448492(null);
            this.f93942d.m8313xd89903f0(this.f93952q);
            this.f93942d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.f93942d != null) {
            float f17 = this.f93947i;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            c(this.f93946h, f17, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int max;
        if (android.view.View.MeasureSpec.getMode(i17) != 1073741824) {
            throw new java.lang.IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i18, paddingTop, -2);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i17, (int) (size * 0.2f), -2);
        this.f93943e.measure(childMeasureSpec2, childMeasureSpec);
        android.widget.TextView textView = this.f93944f;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f93945g.measure(childMeasureSpec2, childMeasureSpec);
        if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
            max = android.view.View.MeasureSpec.getSize(i18);
        } else {
            max = java.lang.Math.max(mo8272xf7770f63(), textView.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, android.view.View.resolveSizeAndState(max, i18, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f93950o) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: setGravity */
    public void m8281xc1f6fb8c(int i17) {
        this.f93949n = i17;
        requestLayout();
    }

    /* renamed from: setNonPrimaryAlpha */
    public void m8282xe8aec327(float f17) {
        int i17 = ((int) (f17 * 255.0f)) & 255;
        this.f93954s = i17;
        int i18 = (i17 << 24) | (this.f93955t & 16777215);
        this.f93943e.setTextColor(i18);
        this.f93945g.setTextColor(i18);
    }

    /* renamed from: setTextColor */
    public void m8283x1c5c5ff4(int i17) {
        this.f93955t = i17;
        this.f93944f.setTextColor(i17);
        int i18 = (this.f93954s << 24) | (this.f93955t & 16777215);
        this.f93943e.setTextColor(i18);
        this.f93945g.setTextColor(i18);
    }

    /* renamed from: setTextSpacing */
    public void mo8277xc63c3494(int i17) {
        this.f93948m = i17;
        requestLayout();
    }
}
