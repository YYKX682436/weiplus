package f16;

/* loaded from: classes16.dex */
public final class g implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final n16.c f340258d;

    public g(n16.c fqNameToMatch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqNameToMatch, "fqNameToMatch");
        this.f340258d = fqNameToMatch;
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fqName, this.f340258d)) {
            return f16.f.f340254a;
        }
        return null;
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return kz5.o0.f395526d;
    }
}
