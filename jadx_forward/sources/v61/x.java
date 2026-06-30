package v61;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515018d = 0;

    public x(v61.y yVar, v61.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515018d;
        this.f515018d = i17 + 1;
        if (i17 == 0) {
            return v61.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
