package mi1;

/* loaded from: classes7.dex */
public final class n2 implements mi1.w0 {

    /* renamed from: f, reason: collision with root package name */
    public final mi1.e f408169f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f408171h;

    /* renamed from: m, reason: collision with root package name */
    public final int f408173m;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mi1.t2 f408175o;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f408167d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f408168e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f408170g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f408172i = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f408174n = null;

    public n2(mi1.t2 t2Var, mi1.e eVar, int i17) {
        this.f408175o = t2Var;
        this.f408173m = 0;
        this.f408169f = eVar;
        this.f408173m = i17;
    }

    public final boolean a() {
        return this.f408175o.f408226d.peekFirst() == this;
    }

    @Override // mi1.w0
    public void b(java.lang.CharSequence charSequence) {
        this.f408175o.m(new mi1.p2(this, charSequence));
    }

    @Override // mi1.w0
    public void c(android.graphics.drawable.Drawable drawable) {
        this.f408175o.m(new mi1.o2(this, drawable));
    }

    @Override // mi1.w0
    /* renamed from: dismiss */
    public void mo147359x63a3b28a() {
        this.f408175o.m(new mi1.s2(this));
    }

    @Override // mi1.w0
    public void e(final java.util.Map map) {
        this.f408175o.m(new java.lang.Runnable() { // from class: mi1.n2$$d
            @Override // java.lang.Runnable
            public final void run() {
                mi1.n2 n2Var = mi1.n2.this;
                java.util.Map map2 = map;
                n2Var.f408171h = map2;
                if (n2Var.a()) {
                    mi1.g gVar = (mi1.g) n2Var.f408175o;
                    gVar.getClass();
                    gVar.f408092i = ((mi1.a) map2.get("key_type")).ordinal();
                    if (!gVar.p()) {
                        gVar.f408089f.e(map2);
                    }
                    long longValue = ((java.lang.Long) map2.get("key_show_duration")).longValue();
                    mi1.RunnableC29148x6255fdf runnableC29148x6255fdf = new mi1.RunnableC29148x6255fdf(n2Var);
                    n2Var.f408174n = runnableC29148x6255fdf;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnableC29148x6255fdf, longValue);
                }
            }
        });
    }

    @Override // mi1.w0
    public void f(int i17, boolean z17) {
        this.f408175o.m(new mi1.r2(this, i17, z17));
    }

    @Override // mi1.w0
    public void i(final boolean z17) {
        this.f408175o.m(new java.lang.Runnable() { // from class: mi1.n2$$b
            @Override // java.lang.Runnable
            public final void run() {
                mi1.g gVar = (mi1.g) mi1.n2.this.f408175o;
                if (gVar.p()) {
                    return;
                }
                gVar.f408089f.i(z17);
            }
        });
    }
}
