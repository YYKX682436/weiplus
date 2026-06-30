package sd5;

/* loaded from: classes9.dex */
public final class h implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f488246a;

    /* renamed from: b, reason: collision with root package name */
    public final sd5.o f488247b;

    /* renamed from: c, reason: collision with root package name */
    public final hd5.n f488248c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f488249d;

    /* renamed from: e, reason: collision with root package name */
    public final hd5.q f488250e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f488251f;

    public h(yb5.d chattingContext, sd5.o coreDataSource, hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f488246a = chattingContext;
        this.f488247b = coreDataSource;
        this.f488248c = action;
        this.f488249d = bundle;
        this.f488250e = qVar;
        this.f488251f = chattingContext.x();
    }

    @Override // he5.t
    public int a() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(this.f488251f);
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(success, "success");
        sd5.p.a("fillItem", new sd5.g(this, list));
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
        return this.f488247b.c();
    }
}
