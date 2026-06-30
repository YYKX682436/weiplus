package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class y0 implements android.view.View.OnTouchListener {
    public static final int A;

    /* renamed from: z, reason: collision with root package name */
    public static final int f272833z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 f272834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f272835e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f272836f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f272837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272838h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f272839i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f272840m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a f272841n;

    /* renamed from: o, reason: collision with root package name */
    public int f272842o;

    /* renamed from: p, reason: collision with root package name */
    public int f272843p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View.OnLongClickListener f272844q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272845r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f272846s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f272847t;

    /* renamed from: u, reason: collision with root package name */
    public float f272848u;

    /* renamed from: v, reason: collision with root package name */
    public float f272849v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f272850w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.x0 f272851x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w0 f272852y;

    static {
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        f272833z = tapTimeout;
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        A = longPressTimeout;
        if (longPressTimeout > tapTimeout * 2) {
            A = longPressTimeout - tapTimeout;
        }
    }

    public y0() {
        this.f272834d = null;
        this.f272835e = false;
        this.f272836f = null;
        this.f272838h = false;
        this.f272840m = null;
        this.f272845r = false;
        this.f272846s = true;
        this.f272848u = -1.0f;
        this.f272849v = -1.0f;
        this.f272850w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f272851x = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.x0(this, null);
        this.f272852y = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w0(this);
    }

    public final void a(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            b();
        }
    }

    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var = this.f272834d;
        if (z0Var != null) {
            z0Var.mo2167x263a2556(false);
            this.f272834d.m75734xe9f5beed(null);
            this.f272836f.invalidate();
            this.f272836f = null;
            this.f272834d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bf  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public y0(android.content.Context context) {
        this.f272834d = null;
        this.f272835e = false;
        this.f272836f = null;
        this.f272838h = false;
        this.f272840m = null;
        this.f272845r = false;
        this.f272846s = true;
        this.f272848u = -1.0f;
        this.f272849v = -1.0f;
        this.f272850w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f272851x = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.x0(this, null);
        this.f272852y = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w0(this);
        this.f272840m = context;
    }
}
