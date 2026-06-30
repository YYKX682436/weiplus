package u1;

/* loaded from: classes14.dex */
public final class o extends u1.p0 implements u1.s1 {

    /* renamed from: h, reason: collision with root package name */
    public b1.f f505181h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.b f505182i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f505183m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.a f505184n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u1.c1 layoutNodeWrapper, b1.h modifier) {
        super(layoutNodeWrapper, modifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNodeWrapper, "layoutNodeWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        b1.h hVar = (b1.h) this.f505188e;
        this.f505181h = hVar instanceof b1.f ? (b1.f) hVar : null;
        this.f505182i = new u1.m(this, layoutNodeWrapper);
        this.f505183m = true;
        this.f505184n = new u1.n(this);
    }

    @Override // u1.p0
    public void a() {
        b1.h hVar = (b1.h) this.f505188e;
        this.f505181h = hVar instanceof b1.f ? (b1.f) hVar : null;
        this.f505183m = true;
        this.f505190g = true;
    }

    public final void c(e1.u canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        u1.c1 c1Var = this.f505187d;
        long b17 = p2.r.b(c1Var.f483585f);
        b1.f fVar = this.f505181h;
        u1.w wVar = c1Var.f505087h;
        if (fVar != null && this.f505183m) {
            u1.q0.a(wVar).getSnapshotObserver().a(this, u1.l.f505149d, this.f505184n);
        }
        wVar.getClass();
        u1.o0 sharedDrawScope = u1.q0.a(wVar).getSharedDrawScope();
        u1.o oVar = sharedDrawScope.f505186e;
        sharedDrawScope.f505186e = this;
        s1.x0 f07 = c1Var.f0();
        p2.s mo7007x6fcfed3f = c1Var.f0().mo7007x6fcfed3f();
        g1.c cVar = sharedDrawScope.f505185d;
        g1.a aVar = cVar.f349039d;
        p2.f fVar2 = aVar.f349033a;
        p2.s sVar = aVar.f349034b;
        e1.u uVar = aVar.f349035c;
        long j17 = aVar.f349036d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f07, "<set-?>");
        aVar.f349033a = f07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mo7007x6fcfed3f, "<set-?>");
        aVar.f349034b = mo7007x6fcfed3f;
        aVar.f349035c = canvas;
        aVar.f349036d = b17;
        canvas.c();
        ((b1.h) this.f505188e).P(sharedDrawScope);
        canvas.b();
        g1.a aVar2 = cVar.f349039d;
        aVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar2, "<set-?>");
        aVar2.f349033a = fVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        aVar2.f349034b = sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<set-?>");
        aVar2.f349035c = uVar;
        aVar2.f349036d = j17;
        sharedDrawScope.f505186e = oVar;
    }

    @Override // u1.s1
    /* renamed from: isValid */
    public boolean mo7155x7b953cf2() {
        return this.f505187d.p0();
    }
}
