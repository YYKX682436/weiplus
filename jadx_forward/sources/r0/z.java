package r0;

/* loaded from: classes14.dex */
public final class z extends r0.v {

    /* renamed from: g, reason: collision with root package name */
    public final r0.i f449528g;

    public z(r0.i parentIterator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentIterator, "parentIterator");
        this.f449528g = parentIterator;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449527f + 2;
        this.f449527f = i17;
        java.lang.Object[] objArr = this.f449525d;
        return new r0.c(this.f449528g, objArr[i17 - 2], objArr[i17 - 1]);
    }
}
