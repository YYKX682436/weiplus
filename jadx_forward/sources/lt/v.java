package lt;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402691d = 0;

    public v(lt.w wVar, lt.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402691d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402691d;
        this.f402691d = i17 + 1;
        if (i17 == 0) {
            return kt.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
