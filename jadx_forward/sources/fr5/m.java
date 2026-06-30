package fr5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f347518a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f347519b;

    /* renamed from: c, reason: collision with root package name */
    public final fr5.l f347520c;

    /* renamed from: d, reason: collision with root package name */
    public final float f347521d;

    /* renamed from: e, reason: collision with root package name */
    public final float f347522e;

    /* renamed from: f, reason: collision with root package name */
    public final fr5.f f347523f;

    /* renamed from: g, reason: collision with root package name */
    public zq5.l f347524g;

    /* renamed from: h, reason: collision with root package name */
    public zq5.l f347525h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.VelocityTracker f347526i;

    /* renamed from: j, reason: collision with root package name */
    public int f347527j;

    /* renamed from: k, reason: collision with root package name */
    public int f347528k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f347529l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347530m;

    /* renamed from: n, reason: collision with root package name */
    public zq5.l f347531n;

    /* renamed from: o, reason: collision with root package name */
    public int f347532o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f347533p;

    public m(android.view.View view, yz5.p canDrag, fr5.l onGestureListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canDrag, "canDrag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGestureListener, "onGestureListener");
        this.f347518a = view;
        this.f347519b = canDrag;
        this.f347520c = onGestureListener;
        this.f347527j = -1;
        this.f347530m = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        this.f347521d = viewConfiguration.getScaledTouchSlop();
        this.f347522e = viewConfiguration.getScaledMinimumFlingVelocity();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f347523f = new fr5.f(context, new fr5.d(new fr5.k(this), null, null, 6, null), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (((java.lang.Boolean) r13.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(r2 > 0.0f ? -1 : 1))).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014e, code lost:
    
        if (((java.lang.Boolean) r13.mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(r11 > 0.0f ? -1 : 1))).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr5.m.a(android.view.MotionEvent):void");
    }
}
