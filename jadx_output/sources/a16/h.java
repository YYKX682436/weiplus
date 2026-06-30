package a16;

/* loaded from: classes16.dex */
public final class h implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final a16.l f641d;

    /* renamed from: e, reason: collision with root package name */
    public final e16.d f642e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f643f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.w f644g;

    public h(a16.l c17, e16.d annotationOwner, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(annotationOwner, "annotationOwner");
        this.f641d = c17;
        this.f642e = annotationOwner;
        this.f643f = z17;
        this.f644g = ((e26.u) c17.f649a.f615a).d(new a16.g(this));
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        p06.c cVar;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        e16.d dVar = this.f642e;
        e16.a a17 = dVar.a(fqName);
        return (a17 == null || (cVar = (p06.c) this.f644g.invoke(a17)) == null) ? y06.f.f458671a.a(fqName, dVar, this.f641d) : cVar;
    }

    @Override // p06.k
    public boolean isEmpty() {
        e16.d dVar = this.f642e;
        return dVar.getAnnotations().isEmpty() && !dVar.b();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        e16.d dVar = this.f642e;
        return new q26.h((q26.i) q26.h0.j(q26.h0.t(q26.h0.o(kz5.n0.J(dVar.getAnnotations()), this.f644g), y06.f.f458671a.a(l06.w.f314933n, dVar, this.f641d)), q26.c0.f359832d));
    }

    public /* synthetic */ h(a16.l lVar, e16.d dVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(lVar, dVar, (i17 & 4) != 0 ? false : z17);
    }
}
