package vh4;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518661d = 0;

    public s(vh4.t tVar, vh4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518661d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518661d;
        this.f518661d = i17 + 1;
        if (i17 == 0) {
            return vh4.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
