package sd5;

/* loaded from: classes9.dex */
public final class b implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final sd5.o f488231a;

    /* renamed from: b, reason: collision with root package name */
    public final hd5.n f488232b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f488233c;

    /* renamed from: d, reason: collision with root package name */
    public final hd5.q f488234d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f488235e;

    public b(yb5.d chattingContext, sd5.o coreDataSource, hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f488231a = coreDataSource;
        this.f488232b = action;
        this.f488233c = bundle;
        this.f488234d = qVar;
        this.f488235e = chattingContext.x();
    }

    @Override // he5.t
    public int a() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(this.f488235e);
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(success, "success");
        sd5.p.a("fillItem", new sd5.a(this, list));
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
    }

    @Override // he5.t
    public long d() {
        return this.f488231a.c();
    }
}
