package a22;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82377d = 0;

    public t(a22.u uVar, a22.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82377d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82377d;
        this.f82377d = i17 + 1;
        if (i17 == 0) {
            return a22.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
