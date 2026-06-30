package lt;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402688d = 0;

    public r(lt.s sVar, lt.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402688d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402688d;
        this.f402688d = i17 + 1;
        if (i17 == 0) {
            return kt.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
