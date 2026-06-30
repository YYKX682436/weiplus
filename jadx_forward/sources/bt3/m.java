package bt3;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105877d = 0;

    public m(bt3.n nVar, bt3.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105877d;
        this.f105877d = i17 + 1;
        if (i17 == 0) {
            return bt3.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
