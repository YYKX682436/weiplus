package z81;

/* loaded from: classes13.dex */
public class i implements z81.a {

    /* renamed from: a, reason: collision with root package name */
    public e91.b f552244a;

    /* renamed from: b, reason: collision with root package name */
    public e91.b f552245b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Stack f552246c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Stack f552247d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f552248e;

    /* renamed from: f, reason: collision with root package name */
    public z81.k f552249f;

    /* renamed from: g, reason: collision with root package name */
    public final z81.a f552250g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f552251h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f552252i;

    public i(z81.a aVar) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f552248e = paint;
        new c01.k2(null);
        this.f552252i = true;
        this.f552250g = aVar;
        this.f552244a = d91.c.f308984b.a();
        this.f552245b = this.f552252i ? d91.b.f308983b.a() : new e91.b();
        this.f552244a.setStyle(android.graphics.Paint.Style.STROKE);
        this.f552245b.setStyle(android.graphics.Paint.Style.FILL);
        this.f552244a.setAntiAlias(true);
        this.f552245b.setAntiAlias(true);
        this.f552244a.setStrokeWidth(ik1.w.c(1));
        this.f552245b.setStrokeWidth(ik1.w.c(1));
        this.f552246c = new java.util.Stack();
        this.f552247d = new java.util.Stack();
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    public void a() {
        this.f552246c.clear();
        this.f552247d.clear();
        this.f552244a.reset();
        this.f552245b.reset();
        this.f552244a.setStyle(android.graphics.Paint.Style.STROKE);
        this.f552245b.setStyle(android.graphics.Paint.Style.FILL);
        this.f552244a.setAntiAlias(true);
        this.f552245b.setAntiAlias(true);
        this.f552244a.setStrokeWidth(ik1.w.c(1));
        this.f552245b.setStrokeWidth(ik1.w.c(1));
    }

    @Override // z81.a
    /* renamed from: invalidate */
    public void mo178562x92d0313b() {
        this.f552250g.mo178562x92d0313b();
    }
}
