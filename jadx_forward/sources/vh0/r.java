package vh0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518486d = 0;

    public r(vh0.s sVar, vh0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518486d;
        this.f518486d = i17 + 1;
        if (i17 == 0) {
            return vh0.g3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
