package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActivityChooserView */
/* loaded from: classes15.dex */
public class C0077x141f33d1 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0 f90880d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c0 f90881e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f90882f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f90883g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f90884h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f90885i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f90886m;

    /* renamed from: n, reason: collision with root package name */
    public n3.f f90887n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f90888o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f90889p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f90890q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f90891r;

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$InnerLayout */
    /* loaded from: classes5.dex */
    public static class InnerLayout extends android.widget.LinearLayout {

        /* renamed from: d, reason: collision with root package name */
        public static final int[] f90892d = {android.R.attr.background};

        public InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            int resourceId;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f90892d);
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : k.a.a(context, resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    public C0077x141f33d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        m2634x9c99e208().mo2732x63a3b28a();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f90888o);
        return true;
    }

    public boolean b() {
        return m2634x9c99e208().mo2734x58a9c73b();
    }

    /* renamed from: getDataModel */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v m2633xe8c4c6e9() {
        this.f90880d.getClass();
        return null;
    }

    /* renamed from: getListPopupWindow */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e m2634x9c99e208() {
        if (this.f90889p == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e(getContext(), null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559849gj);
            this.f90889p = c0099x7ccac81e;
            c0099x7ccac81e.d(this.f90880d);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e2 = this.f90889p;
            c0099x7ccac81e2.f90964u = this;
            c0099x7ccac81e2.D = true;
            c0099x7ccac81e2.E.setFocusable(true);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e3 = this.f90889p;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c0 c0Var = this.f90881e;
            c0099x7ccac81e3.f90965v = c0Var;
            c0099x7ccac81e3.E.setOnDismissListener(c0Var);
        }
        return this.f90889p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f90880d.getClass();
        this.f90891r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f90880d.getClass();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f90888o);
        }
        if (b()) {
            a();
        }
        this.f90891r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f90882f.layout(0, 0, i19 - i17, i27 - i18);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f90886m.getVisibility() != 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i18), 1073741824);
        }
        android.view.View view = this.f90882f;
        measureChild(view, i17, i18);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: setActivityChooserModel */
    public void m2635x8ba4dedf(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v vVar) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0 b0Var = this.f90880d;
        b0Var.f91052d.f90880d.getClass();
        b0Var.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.f90891r) {
                return;
            }
            b0Var.getClass();
            throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    /* renamed from: setDefaultActionButtonContentDescription */
    public void m2636xf83c04a(int i17) {
    }

    /* renamed from: setExpandActivityOverflowButtonContentDescription */
    public void m2637xb1e097a2(int i17) {
        this.f90885i.setContentDescription(getContext().getString(i17));
    }

    /* renamed from: setExpandActivityOverflowButtonDrawable */
    public void m2638x3767713d(android.graphics.drawable.Drawable drawable) {
        this.f90885i.setImageDrawable(drawable);
    }

    /* renamed from: setInitialActivityCount */
    public void m2639x805cb1de(int i17) {
    }

    /* renamed from: setOnDismissListener */
    public void m2640xc07e953d(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f90890q = onDismissListener;
    }

    /* renamed from: setProvider */
    public void m2641x3bb6a473(n3.f fVar) {
        this.f90887n = fVar;
    }

    public C0077x141f33d1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w(this);
        this.f90888o = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377710e, i17, 0);
        obtainStyledAttributes.getInt(1, 4);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569416ak, (android.view.ViewGroup) this, true);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c0 c0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c0(this);
        this.f90881e = c0Var;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564086hl);
        this.f90882f = findViewById;
        this.f90883g = findViewById.getBackground();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.crk);
        this.f90886m = frameLayout;
        frameLayout.setOnClickListener(c0Var);
        frameLayout.setOnLongClickListener(c0Var);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f565795dk5);
        frameLayout2.setOnClickListener(c0Var);
        frameLayout2.setAccessibilityDelegate(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y(this));
        frameLayout2.setOnTouchListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z(this, frameLayout2));
        this.f90884h = frameLayout2;
        android.widget.ImageView imageView = (android.widget.ImageView) frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.h88);
        this.f90885i = imageView;
        imageView.setImageDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0 b0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0(this);
        this.f90880d = b0Var;
        b0Var.registerDataSetObserver(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a0(this));
        android.content.res.Resources resources = context.getResources();
        java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561506kl));
    }
}
