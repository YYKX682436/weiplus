package ng2;

/* loaded from: classes10.dex */
public final class g extends ng2.c {

    /* renamed from: v, reason: collision with root package name */
    public final android.app.Activity f418496v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f418497w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f418498x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.app.Activity activity) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f418496v = activity;
        this.f418498x = jz5.h.b(new ng2.f(context));
    }

    @Override // lg2.b, kg2.a
    public void a() {
        qg2.d dVar = qg2.d.f444326a;
        try {
            new ng2.e(this).mo152xb9724478();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveFluentUtil", "safeInvoke exception ", th6);
        }
    }

    @Override // ng2.c, lg2.a
    public void k() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.WindowManager.LayoutParams a17 = qg2.d.f444326a.a();
        this.f418497w = new android.widget.FrameLayout(this.f400089d);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(w() ? this.f400091f : q().width(), w() ? this.f400092g : q().height());
        if (!w()) {
            layoutParams.gravity = 17;
        }
        android.widget.FrameLayout frameLayout = this.f418497w;
        if (frameLayout != null) {
            frameLayout.addView(this.f418490s, layoutParams);
        }
        ((android.view.WindowManager) ((jz5.n) this.f418498x).mo141623x754a37bb()).addView(this.f418497w, a17);
        android.widget.FrameLayout frameLayout2 = this.f418490s;
        if (frameLayout2 == null || (viewTreeObserver = frameLayout2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new ng2.d(this));
    }

    @Override // ng2.c, lg2.a
    public android.graphics.Rect n() {
        android.graphics.Point point;
        android.graphics.Point point2;
        og2.a aVar = this.f400100r;
        java.lang.Integer valueOf = (aVar == null || (point2 = aVar.f426686e) == null) ? null : java.lang.Integer.valueOf(point2.x);
        if (!(valueOf == null || valueOf.intValue() != 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561998yp);
        og2.a aVar2 = this.f400100r;
        java.lang.Integer valueOf2 = (aVar2 == null || (point = aVar2.f426686e) == null) ? null : java.lang.Integer.valueOf(point.y);
        if (!(valueOf2 == null || valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561997yo);
        android.graphics.Point T = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().T(this.f400091f, new android.graphics.Point(intValue, intValue2));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bl.c(this.f418496v) / 2);
        valueOf3.intValue();
        java.lang.Integer num = true ^ w() ? valueOf3 : null;
        int intValue3 = num != null ? num.intValue() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400090e, "calculateTargetRect floatBallPos: " + T + ", navigateHeight: " + intValue3 + ", windowSize: " + intValue + ", " + intValue2);
        int i17 = T.x;
        int i18 = T.y;
        return new android.graphics.Rect(i17, i18 + intValue3, intValue + i17, i18 + intValue2 + intValue3);
    }

    @Override // ng2.c, lg2.a
    public java.lang.String r() {
        return "SwitchInWindowDirector";
    }

    @Override // ng2.c, lg2.a
    public long t() {
        return 240L;
    }

    @Override // ng2.c
    public void x() {
        android.view.TextureView mo46536x4ee17f0a;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f418492u;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a()) == null || (bitmap = mo46536x4ee17f0a.getBitmap()) == null) {
            return;
        }
        android.widget.ImageView v17 = v();
        v17.setImageBitmap(bitmap);
        og2.a aVar = this.f400100r;
        if (aVar != null) {
            android.view.View view = aVar.f426685d;
            mo0.a aVar2 = view instanceof mo0.a ? (mo0.a) view : null;
            if (aVar2 != null) {
                android.view.View findViewWithTag = aVar2.findViewWithTag("nearby-live-fluent-preview-view-tag");
                if (findViewWithTag != null) {
                    aVar2.removeView(findViewWithTag);
                }
                v17.setTag("nearby-live-fluent-preview-view-tag");
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(s().width(), s().height());
                layoutParams.addRule(13);
                aVar2.addView(v17, layoutParams);
            }
        }
    }

    @Override // ng2.c
    public android.graphics.Bitmap y() {
        og2.a aVar = this.f400100r;
        if ((aVar != null ? aVar.f426687f : null) == null) {
            return super.y();
        }
        if (aVar != null) {
            return aVar.f426687f;
        }
        return null;
    }
}
