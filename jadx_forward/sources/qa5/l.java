package qa5;

/* loaded from: classes5.dex */
public final class l implements qa5.g {

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f442659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f442660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f442661d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442662e;

    /* renamed from: f, reason: collision with root package name */
    public int f442663f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442664g;

    /* renamed from: h, reason: collision with root package name */
    public int f442665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f442666i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f442667j;

    /* renamed from: k, reason: collision with root package name */
    public qa5.f f442668k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f442669l;

    public l(android.view.View attachView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        this.f442659b = attachView;
        this.f442663f = 200;
        this.f442665h = -1;
    }

    @Override // qa5.g
    public void a(boolean z17) {
        this.f442660c = z17;
    }

    @Override // qa5.g
    public void b(qa5.f fVar) {
        this.f442668k = fVar;
    }

    public final jz5.l c(int i17, int i18, boolean z17, yz5.a aVar) {
        android.animation.ValueAnimator valueAnimator = this.f442667j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z17) {
            this.f442662e = true;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        int measuredWidth = this.f442659b.getMeasuredWidth();
        this.f442669l = java.lang.Integer.valueOf(i18);
        ofInt.addUpdateListener(new qa5.h(this));
        ofInt.addListener(new qa5.i(this, aVar));
        if (this.f442664g) {
            ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        } else {
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        ofInt.setDuration(this.f442663f);
        if (this.f442661d) {
            this.f442667j = ofInt;
        } else {
            ofInt.start();
            this.f442667j = ofInt;
        }
        return new jz5.l(java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r0.isRunning() == true) goto L11;
     */
    @Override // qa5.g
    /* renamed from: cancel */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo159676xae7a2e7a() {
        /*
            r3 = this;
            boolean r0 = r3.f442661d
            if (r0 == 0) goto L5
            return
        L5:
            android.animation.ValueAnimator r0 = r3.f442667j
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.isRunning()
            r2 = 1
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L30
            android.animation.ValueAnimator r0 = r3.f442667j
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            r0 = 0
            r3.f442667j = r0
            r3.f442662e = r1
            java.lang.Integer r0 = r3.f442669l
            if (r0 == 0) goto L2b
            int r0 = r0.intValue()
            r3.f442665h = r0
        L2b:
            android.view.View r0 = r3.f442659b
            r0.requestLayout()
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qa5.l.mo159676xae7a2e7a():void");
    }

    public void d(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i27 - i18;
        android.animation.ValueAnimator valueAnimator = this.f442667j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f442662e = true;
        } else {
            this.f442662e = false;
            this.f442665h = i28;
        }
    }

    public jz5.l e(int i17, int i18) {
        if (!this.f442660c) {
            return null;
        }
        android.view.View view = this.f442659b;
        view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i19 = this.f442665h;
        if (i19 != -1 && measuredHeight != i19) {
            return c(i19, measuredHeight, false, null);
        }
        android.animation.ValueAnimator valueAnimator = this.f442667j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f442667j = null;
        return null;
    }

    public jz5.l f(int i17, int i18) {
        boolean z17 = this.f442660c;
        if (!z17 || !z17 || this.f442666i == null || !this.f442662e) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f442659b.getMeasuredWidth());
        java.lang.Integer num = this.f442666i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        return new jz5.l(valueOf, num);
    }

    @Override // qa5.g
    /* renamed from: pause */
    public void mo159677x65825f6() {
        this.f442661d = true;
    }

    @Override // qa5.g
    /* renamed from: resume */
    public void mo159678xc84dc82d() {
        this.f442661d = false;
        android.animation.ValueAnimator valueAnimator = this.f442667j;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.f442667j = null;
    }
}
