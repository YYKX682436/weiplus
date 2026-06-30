package ng0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418427d = 0;

    public b(ng0.c cVar, ng0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418427d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418427d;
        this.f418427d = i17 + 1;
        if (i17 == 0) {
            return ng0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
