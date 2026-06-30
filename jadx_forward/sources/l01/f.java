package l01;

/* loaded from: classes7.dex */
public final class f implements l01.o, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f396296d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.b f396297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.h0 f396298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r.a f396299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396300h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f396301i;

    public f(l01.b bVar, l01.b bVar2, l01.h0 h0Var, r.a aVar, java.lang.String str, java.util.Map map) {
        this.f396297e = bVar2;
        this.f396298f = h0Var;
        this.f396299g = aVar;
        this.f396300h = str;
        this.f396301i = map;
    }

    @Override // l01.o
    public void a() {
        java.io.InputStream b17;
        if (this.f396296d) {
            return;
        }
        try {
            if (this.f396298f.b()) {
                b17 = l01.h0.a(this.f396298f, null);
            } else {
                b17 = ((l01.k) this.f396297e.f396277f).b(this.f396298f.f396306b);
            }
            if (b17 != null) {
                r.a aVar = this.f396299g;
                if (aVar != null) {
                    aVar.mo1850x58b836e(b17);
                } else {
                    s46.d.a(b17);
                }
                c();
                return;
            }
            if (!this.f396298f.b()) {
                ((ku5.t0) ku5.t0.f394148d).g(new l01.e(this));
            } else {
                r.a aVar2 = this.f396299g;
                if (aVar2 != null) {
                    aVar2.mo1850x58b836e(null);
                }
                c();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandSimpleImageLoader", "loadIntoDiskCache diskCache.openRead failed, url=%s, e=%s", this.f396300h, th6);
            r.a aVar3 = this.f396299g;
            if (aVar3 != null) {
                aVar3.mo1850x58b836e(null);
            }
            c();
        }
    }

    @Override // l01.o
    public void b() {
        this.f396296d = true;
    }

    public final void c() {
        l01.p pVar = this.f396297e.f396275d;
        pVar.f396317a.mo50293x3498a0(new l01.d(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.b bVar = this.f396297e;
        l01.p pVar = bVar.f396275d;
        l01.h0 h0Var = this.f396298f;
        boolean d17 = pVar.d(h0Var.f396306b);
        l01.p pVar2 = bVar.f396275d;
        java.lang.String str = h0Var.f396306b;
        if (d17) {
            pVar2.a(str, this);
            return;
        }
        pVar2.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((java.util.HashMap) pVar2.f396319c).put(str, java.lang.Boolean.TRUE);
        }
        a();
    }
}
