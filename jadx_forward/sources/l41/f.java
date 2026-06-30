package l41;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f397340d = 0;

    public f(l41.g gVar, l41.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f397340d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f397340d;
        this.f397340d = i17 + 1;
        if (i17 == 0) {
            return l41.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
