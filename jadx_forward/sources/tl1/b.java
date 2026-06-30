package tl1;

/* loaded from: classes15.dex */
public final class b extends tl1.v {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f501732w = 0;

    public b(android.content.Context context) {
        super(context);
        super.setId(com.p314xaae8f345.mm.R.id.f564722z2);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        setOnClickListener(new tl1.a(this));
    }

    public void h() {
        d(true);
    }

    public void i() {
        if (this.f501762r) {
            clearAnimation();
            this.f501762r = false;
        }
        if (this.f501761q) {
            return;
        }
        if (this.f501751d == null) {
            setVisibility(8);
            return;
        }
        java.lang.Runnable runnable = this.f501764t;
        if (runnable != null) {
            ((tl1.s) runnable).run();
            this.f501764t = null;
        }
        this.f501751d.mo51211xc39f557c(this);
        clearAnimation();
        setVisibility(0);
        this.f501761q = true;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559273a1);
        this.f501759o.startAnimation(loadAnimation);
        startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559271z));
        loadAnimation.setAnimationListener(new tl1.l(this));
    }

    @Override // tl1.v, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!isShown()) {
            super.onMeasure(i17, i18);
            return;
        }
        int measuredHeight = (getParent() == null || !(getParent() instanceof android.view.ViewGroup)) ? 0 : ((android.view.ViewGroup) getParent()).getMeasuredHeight();
        if (measuredHeight > 0) {
            g(i17, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // tl1.v
    /* renamed from: setHeader */
    public void mo166745xf81398f(java.lang.String str) {
        super.mo166745xf81398f(str);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }
}
