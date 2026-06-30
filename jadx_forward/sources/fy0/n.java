package fy0;

/* loaded from: classes5.dex */
public final class n {
    public final int A;
    public final int B;
    public float C;
    public float D;
    public int E;
    public android.view.VelocityTracker F;

    /* renamed from: a, reason: collision with root package name */
    public final fy0.m f348726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f348727b;

    /* renamed from: c, reason: collision with root package name */
    public fy0.l f348728c;

    /* renamed from: d, reason: collision with root package name */
    public final int f348729d;

    /* renamed from: e, reason: collision with root package name */
    public final int f348730e;

    /* renamed from: f, reason: collision with root package name */
    public final int f348731f;

    /* renamed from: g, reason: collision with root package name */
    public fy0.k f348732g;

    /* renamed from: h, reason: collision with root package name */
    public final int f348733h;

    /* renamed from: i, reason: collision with root package name */
    public final int f348734i;

    /* renamed from: j, reason: collision with root package name */
    public final int f348735j;

    /* renamed from: k, reason: collision with root package name */
    public final int f348736k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f348737l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f348738m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f348739n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.MotionEvent f348740o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.MotionEvent f348741p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.MotionEvent f348742q;

    /* renamed from: r, reason: collision with root package name */
    public float f348743r;

    /* renamed from: s, reason: collision with root package name */
    public float f348744s;

    /* renamed from: t, reason: collision with root package name */
    public float f348745t;

    /* renamed from: u, reason: collision with root package name */
    public float f348746u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f348747v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f348748w;

    /* renamed from: x, reason: collision with root package name */
    public float f348749x;

    /* renamed from: y, reason: collision with root package name */
    public float f348750y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f348751z;

    static {
        android.view.ViewConfiguration.getTapTimeout();
        android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    public n(android.content.Context context, fy0.m mScaleListener, java.util.List mGestureListener, android.os.Handler handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mScaleListener, "mScaleListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mGestureListener, "mGestureListener");
        this.f348726a = mScaleListener;
        this.f348727b = mGestureListener;
        this.f348728c = fy0.l.f348722d;
        android.view.ViewConfiguration.getLongPressTimeout();
        this.f348733h = android.view.ViewConfiguration.getTapTimeout();
        android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f348734i = 1;
        this.f348735j = 2;
        this.f348736k = 3;
        this.f348747v = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.A = 2;
        this.B = 2;
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledDoubleTapSlop();
        this.f348730e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f348731f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f348729d = scaledTouchSlop * scaledTouchSlop;
        if (context.getApplicationInfo().targetSdkVersion > 22) {
            this.f348748w = true;
        }
        this.f348737l = handler != null ? new fy0.j(this, handler) : new fy0.j(this);
    }

    public final void a() {
        android.os.Handler handler = this.f348737l;
        if (handler != null) {
            handler.removeMessages(this.f348734i);
        }
        if (handler != null) {
            handler.removeMessages(this.f348735j);
        }
        if (handler != null) {
            handler.removeMessages(this.f348736k);
        }
        android.view.VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.F = null;
        this.f348739n = false;
        if (this.f348738m) {
            this.f348738m = false;
        }
        this.f348728c = fy0.l.f348722d;
    }

    public final void b() {
        android.os.Handler handler = this.f348737l;
        if (handler != null) {
            handler.removeMessages(this.f348734i);
        }
        if (handler != null) {
            handler.removeMessages(this.f348735j);
        }
        if (handler != null) {
            handler.removeMessages(this.f348736k);
        }
        this.f348739n = false;
        if (this.f348738m) {
            this.f348738m = false;
        }
    }

    public final boolean c() {
        return this.E != 0;
    }
}
