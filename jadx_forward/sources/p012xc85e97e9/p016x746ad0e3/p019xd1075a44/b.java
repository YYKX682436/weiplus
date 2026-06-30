package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public abstract class b extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a f91044d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f91045e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a f91046f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91047g;

    /* renamed from: h, reason: collision with root package name */
    public int f91048h;

    /* renamed from: i, reason: collision with root package name */
    public n3.z1 f91049i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91050m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91051n;

    public b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91044d = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a(this);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559594l, typedValue, true) || typedValue.resourceId == 0) {
            this.f91045e = context;
        } else {
            this.f91045e = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
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
        n3.z1 z1Var = this.f91049i;
        if (z1Var != null) {
            z1Var.b();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a aVar = this.f91044d;
        if (i17 != 0) {
            n3.z1 a17 = n3.l1.a(this);
            a17.a(0.0f);
            a17.c(j17);
            aVar.f91040c.f91049i = a17;
            aVar.f91039b = i17;
            a17.d(aVar);
            return a17;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        n3.z1 a18 = n3.l1.a(this);
        a18.a(1.0f);
        a18.c(j17);
        aVar.f91040c.f91049i = a18;
        aVar.f91039b = i17;
        a18.d(aVar);
        return a18;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.a.f377706a, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559597o, 0);
        mo2602x2925d5be(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91047g;
        if (qVar != null) {
            android.content.res.Configuration configuration2 = qVar.f423224e.getResources().getConfiguration();
            int i17 = configuration2.screenWidthDp;
            int i18 = configuration2.screenHeightDp;
            qVar.f91211w = (configuration2.smallestScreenWidthDp > 600 || i17 > 600 || (i17 > 960 && i18 > 720) || (i17 > 720 && i18 > 960)) ? 5 : (i17 >= 500 || (i17 > 640 && i18 > 480) || (i17 > 480 && i18 > 640)) ? 4 : i17 >= 360 ? 3 : 2;
            o.r rVar = qVar.f423225f;
            if (rVar != null) {
                rVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f91051n = false;
        }
        if (!this.f91051n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f91051n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f91051n = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f91050m = false;
        }
        if (!this.f91050m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f91050m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f91050m = false;
        }
        return true;
    }

    /* renamed from: setContentHeight */
    public abstract void mo2602x2925d5be(int i17);

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != getVisibility()) {
            n3.z1 z1Var = this.f91049i;
            if (z1Var != null) {
                z1Var.b();
            }
            super.setVisibility(i17);
        }
    }
}
