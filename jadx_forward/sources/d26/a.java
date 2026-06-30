package d26;

/* loaded from: classes16.dex */
public class a implements p06.k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f307514e = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d26.a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f307515d;

    public a(e26.c0 storageManager, yz5.a compute) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compute, "compute");
        this.f307515d = ((e26.u) storageManager).b(compute);
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c cVar) {
        return p06.j.a(this, cVar);
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        return ((java.util.List) e26.b0.a(this.f307515d, this, f307514e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.List) e26.b0.a(this.f307515d, this, f307514e[0])).iterator();
    }
}
