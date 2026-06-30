package a16;

/* loaded from: classes16.dex */
public final class h implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final a16.l f82174d;

    /* renamed from: e, reason: collision with root package name */
    public final e16.d f82175e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82176f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.w f82177g;

    public h(a16.l c17, e16.d annotationOwner, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotationOwner, "annotationOwner");
        this.f82174d = c17;
        this.f82175e = annotationOwner;
        this.f82176f = z17;
        this.f82177g = ((e26.u) c17.f82182a.f82148a).d(new a16.g(this));
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        p06.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        e16.d dVar = this.f82175e;
        e16.a a17 = dVar.a(fqName);
        return (a17 == null || (cVar = (p06.c) this.f82177g.mo146xb9724478(a17)) == null) ? y06.f.f540204a.a(fqName, dVar, this.f82174d) : cVar;
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        e16.d dVar = this.f82175e;
        return dVar.mo126781xa083c1ee().isEmpty() && !dVar.b();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        e16.d dVar = this.f82175e;
        return new q26.h((q26.i) q26.h0.j(q26.h0.t(q26.h0.o(kz5.n0.J(dVar.mo126781xa083c1ee()), this.f82177g), y06.f.f540204a.a(l06.w.f396466n, dVar, this.f82174d)), q26.c0.f441365d));
    }

    public /* synthetic */ h(a16.l lVar, e16.d dVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(lVar, dVar, (i17 & 4) != 0 ? false : z17);
    }
}
