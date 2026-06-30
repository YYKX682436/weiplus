package c61;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120815d = 0;

    public s(c61.t tVar, c61.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120815d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120815d;
        this.f120815d = i17 + 1;
        if (i17 == 0) {
            return c61.q7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
