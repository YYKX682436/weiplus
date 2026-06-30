package d83;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308500d = 0;

    public g(d83.h hVar, d83.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308500d;
        this.f308500d = i17 + 1;
        if (i17 == 0) {
            return d83.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
