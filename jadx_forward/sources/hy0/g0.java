package hy0;

/* loaded from: classes5.dex */
public final class g0 extends hy0.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f367350d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f367351e;

    /* renamed from: f, reason: collision with root package name */
    public final int f367352f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f367353g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f367354h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f367355i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Path f367356j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367357k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Path f367358l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f367359m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f367360n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f367361o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f367362p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f367363q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f367364r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f367365s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Path f367366t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367350d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setAlpha(12);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367351e = paint;
        this.f367352f = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 4);
        this.f367353g = new android.graphics.RectF();
        this.f367354h = new android.graphics.RectF();
        this.f367355i = new android.graphics.Rect();
        this.f367356j = new android.graphics.Path();
        this.f367357k = jz5.h.b(new hy0.a0(context));
        this.f367358l = new android.graphics.Path();
        this.f367359m = jz5.h.b(new hy0.f0(context));
        jz5.g b17 = jz5.h.b(new hy0.e0(context));
        this.f367360n = jz5.h.b(new hy0.d0(context));
        jz5.g b18 = jz5.h.b(new hy0.b0(context));
        jz5.g b19 = jz5.h.b(new hy0.c0(context));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f367361o = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).intValue());
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).floatValue());
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367362p = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
        paint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint4.setStrokeWidth(d());
        this.f367363q = paint4;
        this.f367364r = jz5.h.b(hy0.z.f367575d);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setStyle(android.graphics.Paint.Style.FILL);
        paint5.setColor(j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acz, null));
        this.f367365s = paint5;
        this.f367366t = new android.graphics.Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b5  */
    @Override // iy0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Canvas r25, hy0.z2 r26) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.g0.a(android.graphics.Canvas, hy0.z2):void");
    }

    public final float d() {
        return ((java.lang.Number) this.f367357k.mo141623x754a37bb()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) ((jz5.n) this.f367360n).mo141623x754a37bb()).floatValue();
    }
}
