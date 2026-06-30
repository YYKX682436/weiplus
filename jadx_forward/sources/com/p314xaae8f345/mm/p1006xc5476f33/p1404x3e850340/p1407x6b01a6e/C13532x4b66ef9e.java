package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceScanRect */
/* loaded from: classes14.dex */
public class C13532x4b66ef9e extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f181683d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f181684e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f181685f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f181686g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f181687h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f181688i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f181689m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f181690n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f181691o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView[] f181692p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f181693q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f181694r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f181695s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f181696t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f181697u;

    /* renamed from: v, reason: collision with root package name */
    public i72.w f181698v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f181699w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f181700x;

    /* renamed from: y, reason: collision with root package name */
    public i72.v f181701y;

    public C13532x4b66ef9e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(android.view.animation.Animation.AnimationListener animationListener) {
        i72.v vVar = this.f181701y;
        i72.v vVar2 = i72.v.CLOSED;
        if (vVar == vVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceScanRect", "hy: already closed");
            if (animationListener != null) {
                animationListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        this.f181701y = vVar2;
        int width = getWidth();
        int height = getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561938x0);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561939x1);
        int i17 = dimensionPixelSize * 2;
        int i18 = dimensionPixelSize2 * 2;
        float f17 = dimensionPixelSize2;
        float f18 = (((width - i17) - i18) + dimensionPixelSize2) / f17;
        float f19 = (((height - i17) - i18) + dimensionPixelSize2) / f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceScanRect", "hy: horizontalScale : %f, verticalScale : %f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, f18, 1.0f, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f181693q = scaleAnimation;
        scaleAnimation.setFillAfter(true);
        this.f181693q.setDuration(1500L);
        this.f181693q.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        this.f181693q.setAnimationListener(animationListener);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.0f, f18, 1.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f181694r = scaleAnimation2;
        scaleAnimation2.setFillAfter(true);
        this.f181694r.setDuration(1500L);
        this.f181694r.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        android.view.animation.ScaleAnimation scaleAnimation3 = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, f19, 1, 0.0f, 1, 0.0f);
        this.f181695s = scaleAnimation3;
        scaleAnimation3.setFillAfter(true);
        this.f181695s.setDuration(1500L);
        this.f181695s.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        android.view.animation.ScaleAnimation scaleAnimation4 = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, f19, 1, 0.0f, 1, 1.0f);
        this.f181696t = scaleAnimation4;
        scaleAnimation4.setFillAfter(true);
        this.f181696t.setDuration(1500L);
        this.f181696t.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        this.f181684e.startAnimation(this.f181693q);
        this.f181687h.startAnimation(this.f181696t);
        this.f181688i.startAnimation(this.f181695s);
        this.f181691o.startAnimation(this.f181694r);
        android.view.View view = this.f181700x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181683d.setBackground(null);
        this.f181700x.clearAnimation();
        for (android.widget.ImageView imageView : this.f181692p) {
            imageView.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560482lp));
        }
    }

    /* renamed from: getCenterHintHolder */
    public android.view.ViewGroup m55288x6f64c0be() {
        return this.f181699w;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        i72.w wVar = this.f181698v;
        if (wVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = ((g72.r) wVar).f350776a.f181613q;
            android.graphics.RectF rectF = new android.graphics.RectF(r5.f181614r.getLeft(), r5.f181614r.getTop(), r5.f181614r.getRight(), r5.f181614r.getBottom());
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13527xdbf7520a c13527xdbf7520a = c13528xdd12ba45.f181653e;
            c13527xdbf7520a.f181647e = true;
            c13527xdbf7520a.f181648f = true;
            c13527xdbf7520a.f181649g = rectF;
            c13527xdbf7520a.invalidate();
        }
    }

    /* renamed from: setOnRefreshRectListener */
    public void m55289xde6eb192(i72.w wVar) {
        this.f181698v = wVar;
    }

    public C13532x4b66ef9e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181683d = null;
        this.f181684e = null;
        this.f181685f = null;
        this.f181686g = null;
        this.f181687h = null;
        this.f181688i = null;
        this.f181689m = null;
        this.f181690n = null;
        this.f181691o = null;
        this.f181692p = null;
        this.f181693q = null;
        this.f181694r = null;
        this.f181695s = null;
        this.f181696t = null;
        this.f181697u = null;
        this.f181698v = null;
        this.f181699w = null;
        this.f181700x = null;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aaj, (android.view.ViewGroup) this, true);
        this.f181683d = findViewById(com.p314xaae8f345.mm.R.id.dom);
        this.f181684e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dok);
        this.f181685f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dol);
        this.f181686g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.doh);
        this.f181687h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dog);
        this.f181688i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.doj);
        this.f181689m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.doi);
        this.f181690n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.doe);
        this.f181691o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dof);
        this.f181700x = findViewById(com.p314xaae8f345.mm.R.id.dn7);
        this.f181699w = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dmq);
        this.f181692p = new android.widget.ImageView[]{this.f181684e, this.f181685f, this.f181686g, this.f181687h, this.f181688i, this.f181689m, this.f181690n, this.f181691o};
        this.f181701y = i72.v.INIT;
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f181697u = translateAnimation;
        translateAnimation.setRepeatCount(-1);
        this.f181697u.setRepeatMode(1);
        this.f181697u.setDuration(1000L);
    }
}
