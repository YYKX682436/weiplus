package b25;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17398d = 0;

    public f(b25.g gVar, b25.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17398d;
        this.f17398d = i17 + 1;
        if (i17 == 0) {
            return b25.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
