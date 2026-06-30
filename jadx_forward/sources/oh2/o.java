package oh2;

/* loaded from: classes10.dex */
public final class o {
    public final float A;

    /* renamed from: a, reason: collision with root package name */
    public final float f426914a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f426915b;

    /* renamed from: c, reason: collision with root package name */
    public my5.a f426916c;

    /* renamed from: d, reason: collision with root package name */
    public final float f426917d;

    /* renamed from: e, reason: collision with root package name */
    public final float f426918e;

    /* renamed from: f, reason: collision with root package name */
    public final float f426919f;

    /* renamed from: g, reason: collision with root package name */
    public final int f426920g;

    /* renamed from: h, reason: collision with root package name */
    public final int f426921h;

    /* renamed from: i, reason: collision with root package name */
    public final float f426922i;

    /* renamed from: j, reason: collision with root package name */
    public final float f426923j;

    /* renamed from: k, reason: collision with root package name */
    public float f426924k;

    /* renamed from: l, reason: collision with root package name */
    public float f426925l;

    /* renamed from: m, reason: collision with root package name */
    public final float f426926m;

    /* renamed from: n, reason: collision with root package name */
    public float f426927n;

    /* renamed from: o, reason: collision with root package name */
    public float f426928o;

    /* renamed from: p, reason: collision with root package name */
    public float f426929p;

    /* renamed from: q, reason: collision with root package name */
    public float f426930q;

    /* renamed from: r, reason: collision with root package name */
    public float f426931r;

    /* renamed from: s, reason: collision with root package name */
    public float f426932s;

    /* renamed from: t, reason: collision with root package name */
    public int f426933t;

    /* renamed from: u, reason: collision with root package name */
    public int f426934u;

    /* renamed from: v, reason: collision with root package name */
    public int f426935v;

    /* renamed from: w, reason: collision with root package name */
    public final int f426936w;

    /* renamed from: x, reason: collision with root package name */
    public float f426937x;

    /* renamed from: y, reason: collision with root package name */
    public final float f426938y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f426939z;

    public o(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float a17 = i65.a.a(context, 17.0f);
        this.f426914a = a17;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(a17);
        paint.setAntiAlias(true);
        this.f426915b = paint;
        this.f426917d = i65.a.a(context, 0.0f);
        paint.setTextSize(a17);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f426918e = fontMetrics.descent - fontMetrics.ascent;
        paint.setTextSize(a17 * 1.2f);
        android.graphics.Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        this.f426919f = fontMetrics2.descent - fontMetrics2.ascent;
        this.f426920g = -1;
        this.f426921h = -1;
        this.f426922i = i65.a.a(context, 28.0f);
        this.f426923j = i65.a.a(context, 0.0f);
        this.f426924k = i65.a.a(context, 24.0f);
        this.f426925l = i65.a.a(context, 24.0f);
        this.f426926m = i65.a.a(context, 52.0f);
        this.f426928o = 1.4f;
        this.f426929p = 1.0f;
        this.f426930q = 1.0f;
        this.f426931r = 0.5f;
        this.f426933t = -1;
        this.f426934u = -1;
        this.f426935v = -1;
        this.f426936w = 2;
        this.f426937x = (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x - this.f426924k) - this.f426925l;
        this.f426938y = i65.a.a(context, 80.0f);
        this.f426939z = new android.graphics.Rect();
        this.A = 0.1f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r0 = r12.f426915b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r3 < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r1 = (my5.b) r13.f414393d.get(r3);
        r3 = r13.f414390a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, "mText");
        r2 = r3.substring(0, r1.f414388c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, "substring(...)");
        r13 = r13.f414390a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, "mText");
        r13 = r13.substring(r1.f414388c, r1.f414389d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, "substring(...)");
        r2 = r0.measureText(r2);
        r14 = ((float) (r14 - r1.f414386a)) / ((float) r1.f414387b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r14 <= 1.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        r14 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r2 + (r0.measureText(r13) * r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        return r0.measureText(r13.f414390a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(my5.c r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f414393d
            java.lang.String r1 = "mCharacters"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        Ld:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L45
            my5.b r4 = (my5.b) r4
            long r6 = r4.f414386a
            java.util.ArrayList r4 = r13.f414393d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            java.lang.Object r4 = kz5.n0.a0(r4, r5)
            my5.b r4 = (my5.b) r4
            if (r4 == 0) goto L2f
            long r8 = r4.f414386a
            goto L34
        L2f:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L34:
            long r10 = (long) r14
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 > 0) goto L3f
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 >= 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = r2
        L40:
            if (r4 == 0) goto L43
            goto L4b
        L43:
            r3 = r5
            goto Ld
        L45:
            kz5.c0.p()
            r13 = 0
            throw r13
        L4a:
            r3 = -1
        L4b:
            android.graphics.Paint r0 = r12.f426915b
            if (r3 < 0) goto L95
            java.util.ArrayList r1 = r13.f414393d
            java.lang.Object r1 = r1.get(r3)
            my5.b r1 = (my5.b) r1
            java.lang.String r3 = r13.f414390a
            java.lang.String r4 = "mText"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            int r5 = r1.f414388c
            java.lang.String r2 = r3.substring(r2, r5)
            java.lang.String r3 = "substring(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r13 = r13.f414390a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, r4)
            int r4 = r1.f414388c
            int r5 = r1.f414389d
            java.lang.String r13 = r13.substring(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, r3)
            float r2 = r0.measureText(r2)
            long r3 = (long) r14
            long r5 = r1.f414386a
            long r3 = r3 - r5
            float r14 = (float) r3
            long r3 = r1.f414387b
            float r1 = (float) r3
            float r14 = r14 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 <= 0) goto L8e
            r14 = r1
        L8e:
            float r13 = r0.measureText(r13)
            float r13 = r13 * r14
            float r2 = r2 + r13
            goto L9b
        L95:
            java.lang.String r13 = r13.f414390a
            float r2 = r0.measureText(r13)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oh2.o.a(my5.c, int):float");
    }

    public final void b() {
        this.f426935v = -1;
        this.f426927n = 0.0f;
        this.f426928o = 1.5f;
        this.f426929p = 1.0f;
        this.f426933t = -1;
        this.f426931r = 0.5f;
        this.f426930q = 1.0f;
        this.f426932s = 0.0f;
        this.f426934u = this.f426936w - 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KtvLyricsDrawer", "reset");
    }
}
