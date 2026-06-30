package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public abstract class f1 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f9576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9577e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9578f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f9579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f9580h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f9581i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9582m;

    /* renamed from: n, reason: collision with root package name */
    public int f9583n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f9584o = new int[2];

    public f1(android.view.View view) {
        this.f9579g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9576d = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f9577e = tapTimeout;
        this.f9578f = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public final void a() {
        java.lang.Runnable runnable = this.f9581i;
        android.view.View view = this.f9579g;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f9580h;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract o.k0 b();

    public abstract boolean c();

    public boolean d() {
        o.k0 b17 = b();
        if (b17 == null || !b17.isShowing()) {
            return true;
        }
        b17.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f9582m = false;
        this.f9583n = -1;
        java.lang.Runnable runnable = this.f9580h;
        if (runnable != null) {
            this.f9579g.removeCallbacks(runnable);
        }
    }
}
