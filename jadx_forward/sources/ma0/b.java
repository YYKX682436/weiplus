package ma0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406662d = 0;

    public b(ma0.c cVar, ma0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406662d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406662d;
        this.f406662d = i17 + 1;
        if (i17 == 0) {
            return ma0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
