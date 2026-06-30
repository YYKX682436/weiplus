package c50;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38624d = 0;

    public w(c50.x xVar, c50.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38624d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38624d;
        this.f38624d = i17 + 1;
        if (i17 == 0) {
            return v40.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
