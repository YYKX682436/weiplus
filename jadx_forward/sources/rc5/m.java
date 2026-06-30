package rc5;

/* loaded from: classes11.dex */
public final class m extends android.widget.FrameLayout {
    public android.animation.Animator A;

    /* renamed from: d, reason: collision with root package name */
    public final float f475701d;

    /* renamed from: e, reason: collision with root package name */
    public final float f475702e;

    /* renamed from: f, reason: collision with root package name */
    public final rc5.x f475703f;

    /* renamed from: g, reason: collision with root package name */
    public int f475704g;

    /* renamed from: h, reason: collision with root package name */
    public int f475705h;

    /* renamed from: i, reason: collision with root package name */
    public int f475706i;

    /* renamed from: m, reason: collision with root package name */
    public int f475707m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f475708n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f475709o;

    /* renamed from: p, reason: collision with root package name */
    public final rc5.n f475710p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f475711q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f475712r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f475713s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f475714t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f475715u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f475716v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f475717w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f475718x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.l f475719y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f475720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rc5.x uic, int i17, float f17, float f18, yz5.l enableDragProbe, yz5.l isBoucingProbe, rc5.n nVar) {
        super(uic.m158354x19263085());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enableDragProbe, "enableDragProbe");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isBoucingProbe, "isBoucingProbe");
        this.f475701d = f17;
        this.f475702e = f18;
        this.f475703f = uic;
        this.f475704g = i17;
        this.f475705h = i17 - i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        int i18 = (int) (this.f475704g * f17);
        this.f475706i = i18;
        this.f475707m = (int) (i18 * f18);
        this.f475708n = enableDragProbe;
        this.f475709o = isBoucingProbe;
        this.f475710p = nVar;
        this.f475711q = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new rc5.e(this));
        this.f475715u = uic.y7();
        this.f475717w = new android.view.animation.AccelerateInterpolator(0.8f);
        this.f475718x = new android.view.animation.AccelerateInterpolator(0.2f);
        new android.view.animation.DecelerateInterpolator(0.8f);
        new android.view.animation.DecelerateInterpolator(0.2f);
        this.f475719y = new rc5.k(this);
        this.f475720z = new rc5.l(this);
    }

    public final void a() {
        if (this.f475715u) {
            android.view.View view = this.f475713s;
            if (view != null) {
                view.setClipToOutline(false);
                view.setOutlineProvider(null);
                return;
            }
            return;
        }
        android.view.View view2 = this.f475713s;
        if (view2 != null) {
            fq1.e eVar = fq1.e.f347040a;
            jz5.g gVar = rc5.x.D;
            eVar.g(view2, ((java.lang.Number) ((jz5.n) rc5.x.D).mo141623x754a37bb()).floatValue(), true, false);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f475711q.h(true)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!((java.lang.Boolean) this.f475708n.mo146xb9724478(event)).booleanValue() || ((java.lang.Boolean) this.f475709o.mo146xb9724478(event)).booleanValue() || this.f475716v) {
            return false;
        }
        return this.f475711q.t(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f475711q.m(event);
        return true;
    }
}
