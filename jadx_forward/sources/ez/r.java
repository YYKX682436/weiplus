package ez;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339303d = 0;

    public r(ez.s sVar, ez.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339303d;
        this.f339303d = i17 + 1;
        if (i17 == 0) {
            return ez.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
