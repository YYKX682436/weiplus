package q26;

/* loaded from: classes10.dex */
public final class l implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f441398d;

    /* renamed from: e, reason: collision with root package name */
    public int f441399e = -2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.m f441400f;

    public l(q26.m mVar) {
        this.f441400f = mVar;
    }

    public final void b() {
        java.lang.Object mo146xb9724478;
        int i17 = this.f441399e;
        q26.m mVar = this.f441400f;
        if (i17 == -2) {
            mo146xb9724478 = mVar.f441403a.mo152xb9724478();
        } else {
            yz5.l lVar = mVar.f441404b;
            java.lang.Object obj = this.f441398d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            mo146xb9724478 = lVar.mo146xb9724478(obj);
        }
        this.f441398d = mo146xb9724478;
        this.f441399e = mo146xb9724478 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f441399e < 0) {
            b();
        }
        return this.f441399e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f441399e < 0) {
            b();
        }
        if (this.f441399e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f441398d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f441399e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
