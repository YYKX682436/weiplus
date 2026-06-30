package sf4;

/* loaded from: classes4.dex */
public final class q extends oj5.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f489093a;

    /* renamed from: b, reason: collision with root package name */
    public final sf4.r0 f489094b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.VelocityTracker f489095c;

    /* renamed from: d, reason: collision with root package name */
    public final int f489096d;

    /* renamed from: e, reason: collision with root package name */
    public final int f489097e;

    /* renamed from: f, reason: collision with root package name */
    public float f489098f;

    /* renamed from: g, reason: collision with root package name */
    public float f489099g;

    /* renamed from: h, reason: collision with root package name */
    public float f489100h;

    /* renamed from: i, reason: collision with root package name */
    public float f489101i;

    /* renamed from: j, reason: collision with root package name */
    public int f489102j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f489103k;

    public q(android.view.View galleryView, sf4.r0 galleryScaleListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryView, "galleryView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryScaleListener, "galleryScaleListener");
        this.f489093a = galleryView;
        this.f489094b = galleryScaleListener;
        this.f489096d = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 32);
        this.f489097e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 96);
    }

    @Override // oj5.y
    public boolean a(android.view.MotionEvent event, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f489095c == null) {
            this.f489095c = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f489095c;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            sf4.r0 r0Var = this.f489094b;
            android.view.View view = this.f489093a;
            boolean z18 = true;
            if (actionMasked == 1) {
                if (this.f489103k) {
                    android.view.VelocityTracker velocityTracker2 = this.f489095c;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    android.view.VelocityTracker velocityTracker3 = this.f489095c;
                    float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    android.view.VelocityTracker velocityTracker4 = this.f489095c;
                    float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                    if (this.f489102j != 2 ? !(this.f489100h > view.getWidth() / 2 || xVelocity > 50.0f) : !(this.f489101i > this.f489097e || yVelocity > 0.0f)) {
                        z18 = false;
                    }
                    if (z18) {
                        mf4.d.f407693a.a(13);
                        ((of4.c) r0Var).a();
                    } else {
                        view.animate().translationY(0.0f).start();
                    }
                }
                this.f489102j = 0;
                this.f489100h = 0.0f;
                this.f489101i = 0.0f;
                this.f489103k = false;
                android.view.VelocityTracker velocityTracker5 = this.f489095c;
                if (velocityTracker5 != null) {
                    velocityTracker5.clear();
                }
                android.view.VelocityTracker velocityTracker6 = this.f489095c;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                }
                this.f489095c = null;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f489102j = 0;
                    view.setTranslationY(0.0f);
                    this.f489100h = 0.0f;
                    this.f489101i = 0.0f;
                    this.f489103k = false;
                    android.view.VelocityTracker velocityTracker7 = this.f489095c;
                    if (velocityTracker7 != null) {
                        velocityTracker7.clear();
                    }
                    android.view.VelocityTracker velocityTracker8 = this.f489095c;
                    if (velocityTracker8 != null) {
                        velocityTracker8.recycle();
                    }
                    this.f489095c = null;
                }
            } else if (z17) {
                this.f489102j = i17;
                if ((i17 != 8 || this.f489098f >= this.f489096d) && i17 != 2) {
                    z18 = false;
                }
                this.f489103k = z18;
                float rawX = event.getRawX();
                float rawY = event.getRawY();
                this.f489100h = rawX - this.f489098f;
                this.f489101i = rawY - this.f489099g;
                if (this.f489103k) {
                    view.animate().cancel();
                    float height = this.f489102j == 2 ? this.f489101i : (this.f489100h * view.getHeight()) / view.getWidth();
                    float f17 = height >= 0.0f ? height : 0.0f;
                    view.setTranslationY(f17);
                    float height2 = 0.8f - (f17 / view.getHeight());
                    android.widget.ImageView imageView = ((of4.c) r0Var).f426638a.f253399g;
                    if (imageView != null) {
                        imageView.setAlpha(height2);
                    }
                }
            }
        } else {
            this.f489098f = event.getRawX();
            this.f489099g = event.getRawY();
        }
        return this.f489103k;
    }

    @Override // oj5.y
    public int b() {
        return 10;
    }
}
