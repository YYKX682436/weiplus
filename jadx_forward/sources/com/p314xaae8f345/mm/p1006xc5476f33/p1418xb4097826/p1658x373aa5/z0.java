package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes15.dex */
public class z0 {
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public float A;
    public boolean B;
    public android.view.VelocityTracker C;

    /* renamed from: b, reason: collision with root package name */
    public int f214952b;

    /* renamed from: c, reason: collision with root package name */
    public int f214953c;

    /* renamed from: d, reason: collision with root package name */
    public int f214954d;

    /* renamed from: e, reason: collision with root package name */
    public int f214955e;

    /* renamed from: f, reason: collision with root package name */
    public int f214956f;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f214958h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x0 f214959i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u0 f214960j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w0 f214961k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f214962l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f214963m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f214964n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f214965o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f214966p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.MotionEvent f214967q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.MotionEvent f214968r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.MotionEvent f214969s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f214970t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f214971u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f214972v;

    /* renamed from: w, reason: collision with root package name */
    public long f214973w;

    /* renamed from: x, reason: collision with root package name */
    public float f214974x;

    /* renamed from: y, reason: collision with root package name */
    public float f214975y;

    /* renamed from: z, reason: collision with root package name */
    public float f214976z;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f214951a = "FinderGestureDetector";

    /* renamed from: g, reason: collision with root package name */
    public int f214957g = 400;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        D = ((java.lang.Integer) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Hb).mo141623x754a37bb()).r()).intValue();
        E = ((java.lang.Integer) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ib).mo141623x754a37bb()).r()).intValue();
        F = ((java.lang.Integer) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Kb).mo141623x754a37bb()).r()).intValue();
        G = android.view.ViewConfiguration.getTouchSlop();
    }

    public z0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x0 x0Var, android.os.Handler handler, java.lang.String str) {
        int scaledTouchSlop;
        int i17;
        int i18;
        if (handler != null) {
            this.f214958h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t0(this, handler);
        } else {
            this.f214958h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t0(this);
        }
        this.f214959i = x0Var;
        if (x0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w0) {
            this.f214961k = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w0) x0Var;
        }
        if (x0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v0) {
        }
        if (x0Var == null) {
            throw new java.lang.NullPointerException("OnGestureListener must not be null");
        }
        this.B = true;
        this.f214951a += "_" + str;
        if (context == null) {
            this.f214955e = 50;
            this.f214956f = 8000;
            i17 = G;
            i18 = 100;
            scaledTouchSlop = i17;
        } else {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f214955e = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f214956f = viewConfiguration.getScaledMaximumFlingVelocity();
            i17 = scaledTouchSlop2;
            i18 = scaledDoubleTapSlop;
        }
        this.f214952b = i17 * i17;
        this.f214953c = scaledTouchSlop * scaledTouchSlop;
        this.f214954d = i18 * i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z0.a(android.view.MotionEvent):boolean");
    }
}
