package rx;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f482423d = 0;

    public s(rx.t tVar, rx.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f482423d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f482423d;
        this.f482423d = i17 + 1;
        if (i17 == 0) {
            return rx.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
