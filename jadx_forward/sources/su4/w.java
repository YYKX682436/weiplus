package su4;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494654d = 0;

    public w(su4.x xVar, su4.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494654d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494654d;
        this.f494654d = i17 + 1;
        if (i17 == 0) {
            return s50.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
