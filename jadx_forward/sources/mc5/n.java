package mc5;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407191d = 0;

    public n(mc5.o oVar, mc5.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407191d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407191d;
        this.f407191d = i17 + 1;
        if (i17 == 0) {
            return mc5.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
