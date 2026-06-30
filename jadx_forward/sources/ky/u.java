package ky;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f394969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f394971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, boolean z17, long j17, java.lang.String str) {
        super(1);
        this.f394969d = context;
        this.f394970e = z17;
        this.f394971f = j17;
        this.f394972g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Canvas, "$this$Canvas");
        float b17 = d1.k.b(Canvas.a()) * 5;
        boolean z17 = this.f394970e;
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560389aj4 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560388aj3;
        android.content.Context context = this.f394969d;
        float f17 = 2;
        g1.h.b(Canvas, e1.a0.b(b3.l.m9702x7444d5ad(context, i17)), b17, d1.f.a(d1.k.d(Canvas.a()) / f17, b17), 0.0f, null, null, 0, 120, null);
        g1.h.b(Canvas, this.f394971f, b17, d1.f.a(d1.k.d(Canvas.a()) / f17, b17), 0.0f, new g1.n(Canvas.R(f17), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        e1.u a17 = ((g1.b) Canvas.p()).a();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(context.getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.aay : com.p314xaae8f345.mm.R.C30859x5a72f63.aik));
        paint.setTextSize(Canvas.H(p2.u.b(14)));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        float d17 = d1.k.d(Canvas.a()) / f17;
        float b18 = (d1.k.b(Canvas.a()) / f17) - ((paint.descent() + paint.ascent()) / f17);
        android.graphics.Canvas canvas = e1.c.f327762a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        ((e1.b) a17).f327758a.drawText(this.f394972g, d17, b18, paint);
        return jz5.f0.f384359a;
    }
}
