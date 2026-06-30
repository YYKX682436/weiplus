package yw0;

/* loaded from: classes5.dex */
public final class g extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f548074b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.PointF f548075c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Float f548076d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f548077e;

    /* renamed from: f, reason: collision with root package name */
    public final int f548078f;

    /* renamed from: g, reason: collision with root package name */
    public final int f548079g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f548080h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f548081i;

    /* renamed from: j, reason: collision with root package name */
    public final int f548082j;

    /* renamed from: k, reason: collision with root package name */
    public long f548083k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.PointF f548084l;

    /* renamed from: m, reason: collision with root package name */
    public final ou0.c f548085m;

    /* renamed from: n, reason: collision with root package name */
    public final ou0.c f548086n;

    /* renamed from: o, reason: collision with root package name */
    public final ou0.a0 f548087o;

    /* renamed from: p, reason: collision with root package name */
    public yw0.c f548088p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawerAction, "drawerAction");
        this.f548074b = new android.graphics.PointF();
        this.f548075c = new android.graphics.PointF(1.0f, 1.0f);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560931pp, null);
        this.f548078f = color;
        this.f548079g = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac8, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null));
        paint.setStrokeWidth(j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh));
        this.f548080h = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(color);
        paint2.setStrokeWidth(j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh));
        this.f548081i = paint2;
        this.f548082j = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        this.f548084l = new android.graphics.PointF();
        this.f548085m = new ou0.c(30.0f, 0.0f);
        this.f548086n = new ou0.c(30.0f, 0.0f);
        this.f548087o = new ou0.a0(0.1f, 1.0f, 1.0f);
        this.f548088p = yw0.c.f548069e;
    }

    public static final void d(yw0.g gVar) {
        gVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - gVar.f548083k >= 200) {
            gVar.f548083k = currentTimeMillis;
            ((yw0.l) gVar.f548120a).f548102a.f548104a.performHapticFeedback(0, 2);
        }
    }

    @Override // yw0.s
    public void a() {
        this.f548087o.d();
        this.f548086n.d();
        this.f548085m.d();
        ((yw0.l) this.f548120a).a();
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.lang.Float f17 = this.f548076d;
        if (!this.f548077e || f17 == null) {
            return;
        }
        float f18 = i17;
        float f19 = i18;
        boolean z17 = f17.floatValue() > f18 / f19;
        float floatValue = z17 ? f18 : f17.floatValue() * f19;
        float floatValue2 = z17 ? f18 / f17.floatValue() : f19;
        float f27 = 2;
        float f28 = f18 / f27;
        float f29 = f19 / f27;
        android.graphics.PointF pointF = this.f548074b;
        float f37 = pointF.x * f18;
        float f38 = pointF.y * f19;
        int ordinal = this.f548088p.ordinal();
        android.graphics.Paint paint = this.f548081i;
        if (ordinal == 0) {
            paint.setColor(this.f548079g);
        } else if (ordinal == 1) {
            paint.setColor(this.f548078f);
        }
        android.graphics.PointF pointF2 = this.f548075c;
        float f39 = pointF2.x;
        float f47 = pointF2.y;
        canvas.drawRect(f37 - ((floatValue * f39) / f27), f38 - ((floatValue2 * f47) / f27), f37 + ((floatValue * f39) / f27), ((floatValue2 * f47) / f27) + f38, paint);
        boolean z18 = this.f548085m.f430420e;
        ou0.c cVar = this.f548086n;
        if (z18 || cVar.f430420e) {
            android.graphics.Paint paint2 = this.f548080h;
            int i27 = this.f548082j;
            if (z18) {
                i19 = i27;
                canvas.drawLine(f28, 0.0f, f28, 0.0f + i27, paint2);
                canvas.drawLine(f28, f19 - i19, f28, f19, paint2);
            } else {
                i19 = i27;
            }
            if (cVar.f430420e) {
                canvas.drawLine(0.0f, f29, i19 + 0.0f, f29, paint2);
                canvas.drawLine(f18 - i19, f29, f18, f29, paint2);
            }
        }
    }

    public final void e(android.graphics.PointF position) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(position, "position");
        this.f548074b.set(position.x, position.y);
        ((yw0.l) this.f548120a).a();
    }

    public final void f(android.graphics.PointF scale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        this.f548075c.set(scale.x, scale.y);
        ((yw0.l) this.f548120a).a();
    }
}
