package ts5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f503271d = 0;

    public j(ts5.k kVar, ts5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f503271d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f503271d;
        this.f503271d = i17 + 1;
        if (i17 == 0) {
            return b92.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
