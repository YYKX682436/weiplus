package j93;

/* loaded from: classes.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380069d = 0;

    public y(j93.z zVar, j93.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380069d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380069d;
        this.f380069d = i17 + 1;
        if (i17 == 0) {
            return j93.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
