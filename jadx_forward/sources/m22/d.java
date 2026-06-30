package m22;

/* loaded from: classes15.dex */
public final class d implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f404555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f404556e;

    /* renamed from: f, reason: collision with root package name */
    public int f404557f;

    /* renamed from: g, reason: collision with root package name */
    public int f404558g;

    /* renamed from: h, reason: collision with root package name */
    public int f404559h;

    /* renamed from: i, reason: collision with root package name */
    public int f404560i;

    /* renamed from: m, reason: collision with root package name */
    public final int f404561m;

    /* renamed from: n, reason: collision with root package name */
    public m22.b f404562n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f404563o;

    /* renamed from: p, reason: collision with root package name */
    public m22.a f404564p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f404565q;

    /* renamed from: r, reason: collision with root package name */
    public final int f404566r;

    /* renamed from: s, reason: collision with root package name */
    public long f404567s;

    /* renamed from: t, reason: collision with root package name */
    public final m22.c f404568t;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404559h = -1;
        this.f404560i = -1;
        this.f404561m = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f404562n = m22.b.f404550d;
        this.f404566r = ym5.x.a(context, 800.0f);
        this.f404568t = new m22.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r13 != 3) goto L87;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.d.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r7 != 3) goto L39;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.d.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
        if (z17) {
            this.f404556e = java.lang.Boolean.FALSE;
        }
    }

    public final int d(float f17, float f18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f404563o;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        android.view.View k07 = c1163xf1deaba4.k0(f17, f18);
        if (k07 == null) {
            return -1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f404565q;
        if (c1161x57298f5d != null) {
            return c1161x57298f5d.m8032xa86cd69f(k07);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutManager");
        throw null;
    }
}
