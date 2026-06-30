package qb0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442679d = 0;

    public f(qb0.g gVar, qb0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442679d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442679d;
        this.f442679d = i17 + 1;
        if (i17 == 0) {
            return qb0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
