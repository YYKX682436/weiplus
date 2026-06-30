package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public abstract class f1 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f91109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91110e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91111f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f91112g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f91113h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f91114i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91115m;

    /* renamed from: n, reason: collision with root package name */
    public int f91116n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f91117o = new int[2];

    public f1(android.view.View view) {
        this.f91112g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f91109d = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f91110e = tapTimeout;
        this.f91111f = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public final void a() {
        java.lang.Runnable runnable = this.f91114i;
        android.view.View view = this.f91112g;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f91113h;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract o.k0 b();

    public abstract boolean c();

    public boolean d() {
        o.k0 b17 = b();
        if (b17 == null || !b17.mo2734x58a9c73b()) {
            return true;
        }
        b17.mo2732x63a3b28a();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        if (r4 != 3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f91115m = false;
        this.f91116n = -1;
        java.lang.Runnable runnable = this.f91113h;
        if (runnable != null) {
            this.f91112g.removeCallbacks(runnable);
        }
    }
}
