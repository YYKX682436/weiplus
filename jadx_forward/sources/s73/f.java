package s73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f485713d = 0;

    public f(s73.g gVar, s73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f485713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f485713d;
        this.f485713d = i17 + 1;
        if (i17 == 0) {
            return s73.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
