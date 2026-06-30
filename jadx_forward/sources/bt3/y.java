package bt3;

/* loaded from: classes.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105992d = 0;

    public y(bt3.z zVar, bt3.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105992d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105992d;
        this.f105992d = i17 + 1;
        if (i17 == 0) {
            return bt3.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
