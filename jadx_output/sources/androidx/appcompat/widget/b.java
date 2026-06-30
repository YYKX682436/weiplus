package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public abstract class b extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.a f9511d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f9512e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.ActionMenuView f9513f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.widget.q f9514g;

    /* renamed from: h, reason: collision with root package name */
    public int f9515h;

    /* renamed from: i, reason: collision with root package name */
    public n3.z1 f9516i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9517m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9518n;

    public b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f9511d = new androidx.appcompat.widget.a(this);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478061l, typedValue, true) || typedValue.resourceId == 0) {
            this.f9512e = context;
        } else {
            this.f9512e = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(android.view.View view, int i17, int i18, int i19) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), i18);
        return java.lang.Math.max(0, (i17 - view.getMeasuredWidth()) - i19);
    }

    public int d(android.view.View view, int i17, int i18, int i19, boolean z17) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i27 = i18 + ((i19 - measuredHeight) / 2);
        if (z17) {
            view.layout(i17 - measuredWidth, i27, i17, measuredHeight + i27);
        } else {
            view.layout(i17, i27, i17 + measuredWidth, measuredHeight + i27);
        }
        return z17 ? -measuredWidth : measuredWidth;
    }

    public n3.z1 e(int i17, long j17) {
        n3.z1 z1Var = this.f9516i;
        if (z1Var != null) {
            z1Var.b();
        }
        androidx.appcompat.widget.a aVar = this.f9511d;
        if (i17 != 0) {
            n3.z1 a17 = n3.l1.a(this);
            a17.a(0.0f);
            a17.c(j17);
            aVar.f9507c.f9516i = a17;
            aVar.f9506b = i17;
            a17.d(aVar);
            return a17;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        n3.z1 a18 = n3.l1.a(this);
        a18.a(1.0f);
        a18.c(j17);
        aVar.f9507c.f9516i = a18;
        aVar.f9506b = i17;
        a18.d(aVar);
        return a18;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.a.f296173a, com.tencent.mm.R.attr.f478064o, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.q qVar = this.f9514g;
        if (qVar != null) {
            android.content.res.Configuration configuration2 = qVar.f341691e.getResources().getConfiguration();
            int i17 = configuration2.screenWidthDp;
            int i18 = configuration2.screenHeightDp;
            qVar.f9678w = (configuration2.smallestScreenWidthDp > 600 || i17 > 600 || (i17 > 960 && i18 > 720) || (i17 > 720 && i18 > 960)) ? 5 : (i17 >= 500 || (i17 > 640 && i18 > 480) || (i17 > 480 && i18 > 640)) ? 4 : i17 >= 360 ? 3 : 2;
            o.r rVar = qVar.f341692f;
            if (rVar != null) {
                rVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9518n = false;
        }
        if (!this.f9518n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9518n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9518n = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9517m = false;
        }
        if (!this.f9517m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9517m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9517m = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i17);

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != getVisibility()) {
            n3.z1 z1Var = this.f9516i;
            if (z1Var != null) {
                z1Var.b();
            }
            super.setVisibility(i17);
        }
    }
}
