package bi4;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f21084d = 0;

    public s(bi4.t tVar, bi4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21084d;
        this.f21084d = i17 + 1;
        if (i17 == 0) {
            return ki4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
