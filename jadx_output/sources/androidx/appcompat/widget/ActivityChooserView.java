package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ActivityChooserView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.b0 f9347d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.c0 f9348e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f9349f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f9350g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f9351h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f9352i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f9353m;

    /* renamed from: n, reason: collision with root package name */
    public n3.f f9354n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f9355o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.widget.ListPopupWindow f9356p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f9357q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9358r;

    /* loaded from: classes5.dex */
    public static class InnerLayout extends android.widget.LinearLayout {

        /* renamed from: d, reason: collision with root package name */
        public static final int[] f9359d = {android.R.attr.background};

        public InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            int resourceId;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9359d);
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : k.a.a(context, resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f9355o);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().isShowing();
    }

    public androidx.appcompat.widget.v getDataModel() {
        this.f9347d.getClass();
        return null;
    }

    public androidx.appcompat.widget.ListPopupWindow getListPopupWindow() {
        if (this.f9356p == null) {
            androidx.appcompat.widget.ListPopupWindow listPopupWindow = new androidx.appcompat.widget.ListPopupWindow(getContext(), null, com.tencent.mm.R.attr.f478316gj);
            this.f9356p = listPopupWindow;
            listPopupWindow.d(this.f9347d);
            androidx.appcompat.widget.ListPopupWindow listPopupWindow2 = this.f9356p;
            listPopupWindow2.f9431u = this;
            listPopupWindow2.D = true;
            listPopupWindow2.E.setFocusable(true);
            androidx.appcompat.widget.ListPopupWindow listPopupWindow3 = this.f9356p;
            androidx.appcompat.widget.c0 c0Var = this.f9348e;
            listPopupWindow3.f9432v = c0Var;
            listPopupWindow3.E.setOnDismissListener(c0Var);
        }
        return this.f9356p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9347d.getClass();
        this.f9358r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9347d.getClass();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9355o);
        }
        if (b()) {
            a();
        }
        this.f9358r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f9349f.layout(0, 0, i19 - i17, i27 - i18);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f9353m.getVisibility() != 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i18), 1073741824);
        }
        android.view.View view = this.f9349f;
        measureChild(view, i17, i18);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(androidx.appcompat.widget.v vVar) {
        androidx.appcompat.widget.b0 b0Var = this.f9347d;
        b0Var.f9519d.f9347d.getClass();
        b0Var.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.f9358r) {
                return;
            }
            b0Var.getClass();
            throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i17) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i17) {
        this.f9352i.setContentDescription(getContext().getString(i17));
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.f9352i.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i17) {
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f9357q = onDismissListener;
    }

    public void setProvider(n3.f fVar) {
        this.f9354n = fVar;
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new androidx.appcompat.widget.w(this);
        this.f9355o = new androidx.appcompat.widget.x(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296177e, i17, 0);
        obtainStyledAttributes.getInt(1, 4);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f487883ak, (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.c0 c0Var = new androidx.appcompat.widget.c0(this);
        this.f9348e = c0Var;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482553hl);
        this.f9349f = findViewById;
        this.f9350g = findViewById.getBackground();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.crk);
        this.f9353m = frameLayout;
        frameLayout.setOnClickListener(c0Var);
        frameLayout.setOnLongClickListener(c0Var);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f484262dk5);
        frameLayout2.setOnClickListener(c0Var);
        frameLayout2.setAccessibilityDelegate(new androidx.appcompat.widget.y(this));
        frameLayout2.setOnTouchListener(new androidx.appcompat.widget.z(this, frameLayout2));
        this.f9351h = frameLayout2;
        android.widget.ImageView imageView = (android.widget.ImageView) frameLayout2.findViewById(com.tencent.mm.R.id.h88);
        this.f9352i = imageView;
        imageView.setImageDrawable(drawable);
        androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(this);
        this.f9347d = b0Var;
        b0Var.registerDataSetObserver(new androidx.appcompat.widget.a0(this));
        android.content.res.Resources resources = context.getResources();
        java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479973kl));
    }
}
