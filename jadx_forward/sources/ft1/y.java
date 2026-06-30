package ft1;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348051d = 0;

    public y(ft1.z zVar, ft1.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348051d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348051d;
        this.f348051d = i17 + 1;
        if (i17 == 0) {
            return ft1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
