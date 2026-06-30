package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes14.dex */
public class FaceScanRect extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f100150d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f100151e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f100152f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f100153g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f100154h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f100155i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f100156m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f100157n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f100158o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView[] f100159p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f100160q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f100161r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f100162s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f100163t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f100164u;

    /* renamed from: v, reason: collision with root package name */
    public i72.w f100165v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f100166w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f100167x;

    /* renamed from: y, reason: collision with root package name */
    public i72.v f100168y;

    public FaceScanRect(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(android.view.animation.Animation.AnimationListener animationListener) {
        i72.v vVar = this.f100168y;
        i72.v vVar2 = i72.v.CLOSED;
        if (vVar == vVar2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceScanRect", "hy: already closed");
            if (animationListener != null) {
                animationListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        this.f100168y = vVar2;
        int width = getWidth();
        int height = getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480405x0);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480406x1);
        int i17 = dimensionPixelSize * 2;
        int i18 = dimensionPixelSize2 * 2;
        float f17 = dimensionPixelSize2;
        float f18 = (((width - i17) - i18) + dimensionPixelSize2) / f17;
        float f19 = (((height - i17) - i18) + dimensionPixelSize2) / f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceScanRect", "hy: horizontalScale : %f, verticalScale : %f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, f18, 1.0f, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f100160q = scaleAnimation;
        scaleAnimation.setFillAfter(true);
        this.f100160q.setDuration(1500L);
        this.f100160q.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        this.f100160q.setAnimationListener(animationListener);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.0f, f18, 1.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f100161r = scaleAnimation2;
        scaleAnimation2.setFillAfter(true);
        this.f100161r.setDuration(1500L);
        this.f100161r.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        android.view.animation.ScaleAnimation scaleAnimation3 = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, f19, 1, 0.0f, 1, 0.0f);
        this.f100162s = scaleAnimation3;
        scaleAnimation3.setFillAfter(true);
        this.f100162s.setDuration(1500L);
        this.f100162s.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        android.view.animation.ScaleAnimation scaleAnimation4 = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, f19, 1, 0.0f, 1, 1.0f);
        this.f100163t = scaleAnimation4;
        scaleAnimation4.setFillAfter(true);
        this.f100163t.setDuration(1500L);
        this.f100163t.setInterpolator(getContext(), android.R.interpolator.accelerate_decelerate);
        this.f100151e.startAnimation(this.f100160q);
        this.f100154h.startAnimation(this.f100163t);
        this.f100155i.startAnimation(this.f100162s);
        this.f100158o.startAnimation(this.f100161r);
        android.view.View view = this.f100167x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100150d.setBackground(null);
        this.f100167x.clearAnimation();
        for (android.widget.ImageView imageView : this.f100159p) {
            imageView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478949lp));
        }
    }

    public android.view.ViewGroup getCenterHintHolder() {
        return this.f100166w;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        i72.w wVar = this.f100165v;
        if (wVar != null) {
            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = ((g72.r) wVar).f269243a.f100080q;
            android.graphics.RectF rectF = new android.graphics.RectF(r5.f100081r.getLeft(), r5.f100081r.getTop(), r5.f100081r.getRight(), r5.f100081r.getBottom());
            com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView faceDetectDecorView = faceDetectView.f100120e;
            faceDetectDecorView.f100114e = true;
            faceDetectDecorView.f100115f = true;
            faceDetectDecorView.f100116g = rectF;
            faceDetectDecorView.invalidate();
        }
    }

    public void setOnRefreshRectListener(i72.w wVar) {
        this.f100165v = wVar;
    }

    public FaceScanRect(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100150d = null;
        this.f100151e = null;
        this.f100152f = null;
        this.f100153g = null;
        this.f100154h = null;
        this.f100155i = null;
        this.f100156m = null;
        this.f100157n = null;
        this.f100158o = null;
        this.f100159p = null;
        this.f100160q = null;
        this.f100161r = null;
        this.f100162s = null;
        this.f100163t = null;
        this.f100164u = null;
        this.f100165v = null;
        this.f100166w = null;
        this.f100167x = null;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aaj, (android.view.ViewGroup) this, true);
        this.f100150d = findViewById(com.tencent.mm.R.id.dom);
        this.f100151e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dok);
        this.f100152f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dol);
        this.f100153g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.doh);
        this.f100154h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dog);
        this.f100155i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.doj);
        this.f100156m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.doi);
        this.f100157n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.doe);
        this.f100158o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dof);
        this.f100167x = findViewById(com.tencent.mm.R.id.dn7);
        this.f100166w = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dmq);
        this.f100159p = new android.widget.ImageView[]{this.f100151e, this.f100152f, this.f100153g, this.f100154h, this.f100155i, this.f100156m, this.f100157n, this.f100158o};
        this.f100168y = i72.v.INIT;
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f100164u = translateAnimation;
        translateAnimation.setRepeatCount(-1);
        this.f100164u.setRepeatMode(1);
        this.f100164u.setDuration(1000L);
    }
}
