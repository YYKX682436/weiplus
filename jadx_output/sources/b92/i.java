package b92;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18437d = 0;

    public i(b92.j jVar, b92.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18437d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18437d;
        this.f18437d = i17 + 1;
        if (i17 == 0) {
            return b92.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
