package bb0;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18764d = 0;

    public x(bb0.y yVar, bb0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18764d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18764d;
        this.f18764d = i17 + 1;
        if (i17 == 0) {
            return bb0.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
