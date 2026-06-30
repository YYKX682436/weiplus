package in5;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f374660a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f374661b;

    /* renamed from: c, reason: collision with root package name */
    public in5.q f374662c;

    /* renamed from: d, reason: collision with root package name */
    public int f374663d;

    /* renamed from: e, reason: collision with root package name */
    public int f374664e;

    /* renamed from: f, reason: collision with root package name */
    public int f374665f;

    /* renamed from: g, reason: collision with root package name */
    public int f374666g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f374667h;

    /* renamed from: i, reason: collision with root package name */
    public int f374668i;

    public t0(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f374660a = mContext;
        android.content.res.Resources resources = mContext.getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.f374661b = resources;
        this.f374662c = in5.q.f374646d;
        this.f374667h = r3;
        this.f374663d = 0;
        int[] iArr = {-1};
        this.f374668i = -1;
    }

    public final in5.u0 a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.f374668i);
        return new in5.u0(this.f374662c, this.f374667h, paint, this.f374663d, this.f374664e, this.f374665f, this.f374666g, 0, null);
    }

    public final in5.t0 b(int i17) {
        this.f374668i = b3.l.m9702x7444d5ad(this.f374660a, i17);
        return this;
    }

    public final in5.t0 c(int i17) {
        this.f374667h[0] = b3.l.m9702x7444d5ad(this.f374660a, i17);
        return this;
    }

    public final in5.t0 d(int i17) {
        this.f374663d = this.f374661b.getDimensionPixelSize(i17);
        return this;
    }
}
