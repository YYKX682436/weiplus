package androidx.viewpager.widget;

@androidx.viewpager.widget.j
/* loaded from: classes15.dex */
public class PagerTitleStrip extends android.view.ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f12407u = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.gravity};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f12408v = {android.R.attr.textAllCaps};

    /* renamed from: d, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f12409d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f12410e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f12411f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f12412g;

    /* renamed from: h, reason: collision with root package name */
    public int f12413h;

    /* renamed from: i, reason: collision with root package name */
    public float f12414i;

    /* renamed from: m, reason: collision with root package name */
    public int f12415m;

    /* renamed from: n, reason: collision with root package name */
    public int f12416n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12417o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12418p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.viewpager.widget.d f12419q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f12420r;

    /* renamed from: s, reason: collision with root package name */
    public int f12421s;

    /* renamed from: t, reason: collision with root package name */
    public int f12422t;

    public PagerTitleStrip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12413h = -1;
        this.f12414i = -1.0f;
        this.f12419q = new androidx.viewpager.widget.d(this);
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f12410e = textView;
        addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.f12411f = textView2;
        addView(textView2);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        this.f12412g = textView3;
        addView(textView3);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12407u);
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
        this.f12416n = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f12422t = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f12408v);
            z17 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z17) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f12415m = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(android.widget.TextView textView) {
        textView.setTransformationMethod(new androidx.viewpager.widget.e(textView.getContext()));
    }

    public void a(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        androidx.viewpager.widget.d dVar = this.f12419q;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(dVar);
            this.f12420r = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(dVar);
            this.f12420r = new java.lang.ref.WeakReference(aVar2);
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f12409d;
        if (viewPager != null) {
            this.f12413h = -1;
            this.f12414i = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public void b(int i17, androidx.viewpager.widget.a aVar) {
        int count = aVar != null ? aVar.getCount() : 0;
        this.f12417o = true;
        java.lang.CharSequence charSequence = null;
        java.lang.CharSequence pageTitle = (i17 < 1 || aVar == null) ? null : aVar.getPageTitle(i17 - 1);
        android.widget.TextView textView = this.f12410e;
        textView.setText(pageTitle);
        android.widget.TextView textView2 = this.f12411f;
        textView2.setText((aVar == null || i17 >= count) ? null : aVar.getPageTitle(i17));
        int i18 = i17 + 1;
        if (i18 < count && aVar != null) {
            charSequence = aVar.getPageTitle(i18);
        }
        android.widget.TextView textView3 = this.f12412g;
        textView3.setText(charSequence);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f12413h = i17;
        if (!this.f12418p) {
            c(i17, this.f12414i, false);
        }
        this.f12417o = false;
    }

    public void c(int i17, float f17, boolean z17) {
        int i18;
        int i19;
        int i27;
        int i28;
        if (i17 != this.f12413h) {
            b(i17, this.f12409d.getAdapter());
        } else if (!z17 && f17 == this.f12414i) {
            return;
        }
        this.f12418p = true;
        android.widget.TextView textView = this.f12410e;
        int measuredWidth = textView.getMeasuredWidth();
        android.widget.TextView textView2 = this.f12411f;
        int measuredWidth2 = textView2.getMeasuredWidth();
        android.widget.TextView textView3 = this.f12412g;
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
        int i58 = this.f12416n & 112;
        if (i58 == 16) {
            i18 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i58 != 80) {
                i19 = i48 + paddingTop;
                i27 = i49 + paddingTop;
                i28 = paddingTop + i57;
                textView2.layout(i39, i27, i47, textView2.getMeasuredHeight() + i27);
                int min = java.lang.Math.min(paddingLeft, (i39 - this.f12415m) - measuredWidth);
                textView.layout(min, i19, measuredWidth + min, textView.getMeasuredHeight() + i19);
                int max3 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i47 + this.f12415m);
                textView3.layout(max3, i28, max3 + measuredWidth3, textView3.getMeasuredHeight() + i28);
                this.f12414i = f17;
                this.f12418p = false;
            }
            i18 = (height - paddingBottom) - max2;
        }
        i19 = i48 + i18;
        i27 = i49 + i18;
        i28 = i18 + i57;
        textView2.layout(i39, i27, i47, textView2.getMeasuredHeight() + i27);
        int min2 = java.lang.Math.min(paddingLeft, (i39 - this.f12415m) - measuredWidth);
        textView.layout(min2, i19, measuredWidth + min2, textView.getMeasuredHeight() + i19);
        int max32 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i47 + this.f12415m);
        textView3.layout(max32, i28, max32 + measuredWidth3, textView3.getMeasuredHeight() + i28);
        this.f12414i = f17;
        this.f12418p = false;
    }

    public int getMinHeight() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f12415m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof androidx.viewpager.widget.ViewPager)) {
            throw new java.lang.IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) parent;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        androidx.viewpager.widget.d dVar = this.f12419q;
        viewPager.setInternalPageChangeListener(dVar);
        viewPager.addOnAdapterChangeListener(dVar);
        this.f12409d = viewPager;
        java.lang.ref.WeakReference weakReference = this.f12420r;
        a(weakReference != null ? (androidx.viewpager.widget.a) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.viewpager.widget.ViewPager viewPager = this.f12409d;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.f12409d.setInternalPageChangeListener(null);
            this.f12409d.removeOnAdapterChangeListener(this.f12419q);
            this.f12409d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.f12409d != null) {
            float f17 = this.f12414i;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            c(this.f12413h, f17, true);
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
        this.f12410e.measure(childMeasureSpec2, childMeasureSpec);
        android.widget.TextView textView = this.f12411f;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f12412g.measure(childMeasureSpec2, childMeasureSpec);
        if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
            max = android.view.View.MeasureSpec.getSize(i18);
        } else {
            max = java.lang.Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, android.view.View.resolveSizeAndState(max, i18, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f12417o) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i17) {
        this.f12416n = i17;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f17) {
        int i17 = ((int) (f17 * 255.0f)) & 255;
        this.f12421s = i17;
        int i18 = (i17 << 24) | (this.f12422t & 16777215);
        this.f12410e.setTextColor(i18);
        this.f12412g.setTextColor(i18);
    }

    public void setTextColor(int i17) {
        this.f12422t = i17;
        this.f12411f.setTextColor(i17);
        int i18 = (this.f12421s << 24) | (this.f12422t & 16777215);
        this.f12410e.setTextColor(i18);
        this.f12412g.setTextColor(i18);
    }

    public void setTextSpacing(int i17) {
        this.f12415m = i17;
        requestLayout();
    }
}
