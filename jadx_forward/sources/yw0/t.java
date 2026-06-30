package yw0;

/* loaded from: classes5.dex */
public final class t extends yw0.s implements com.p314xaae8f345.p457x3304c6.p479x4179489f.y {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f548121b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f548122c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f548123d;

    /* renamed from: e, reason: collision with root package name */
    public final float f548124e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f548125f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f548126g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f548127h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f548128i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f548129j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Paint f548130k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawerAction, "drawerAction");
        this.f548121b = context;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f));
        this.f548122c = c3972x4b2f2ae;
        this.f548123d = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.mtr);
        this.f548124e = j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.c_);
        c3972x4b2f2ae.m32426x28f8d21c().set(0.08000001f, 0.11f);
        c3972x4b2f2ae.m32427xfb854877().set(0.84f, 0.76f);
        this.f548125f = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561024ag3));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh) + j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561174bg));
        this.f548128i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561025ag4));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint2.setStrokeWidth(j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh));
        this.f548129j = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f548130k = paint3;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f548127h && this.f548126g) {
            android.graphics.RectF rectF = this.f548125f;
            if (!rectF.isEmpty()) {
                canvas.drawColor(i65.a.d(this.f548121b, com.p314xaae8f345.mm.R.C30859x5a72f63.f561026ag5));
                float f17 = 0.0f;
                while (f17 < canvas.getWidth() + canvas.getHeight()) {
                    canvas.drawLine(0.0f, f17, f17, 0.0f, this.f548129j);
                    f17 += this.f548124e;
                }
                canvas.drawRect(rectF, this.f548130k);
                canvas.drawRect(rectF, this.f548128i);
            }
        }
    }

    @Override // yw0.s
    public void c(boolean z17, int i17, int i18, int i19, int i27) {
        float f17 = i19 - i17;
        float f18 = i27 - i18;
        float f19 = 0.625f * f18;
        android.graphics.RectF rectF = this.f548125f;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = this.f548122c;
        if (f17 < f19) {
            rectF.set(c3972x4b2f2ae.m32426x28f8d21c().f129332x * f17, c3972x4b2f2ae.m32426x28f8d21c().f129333y * f18, (c3972x4b2f2ae.m32426x28f8d21c().f129332x + c3972x4b2f2ae.m32427xfb854877().f129332x) * f17, (c3972x4b2f2ae.m32426x28f8d21c().f129333y + c3972x4b2f2ae.m32427xfb854877().f129333y) * f18);
        } else {
            rectF.setEmpty();
        }
        java.util.Objects.toString(c3972x4b2f2ae);
        java.util.Objects.toString(rectF);
    }
}
