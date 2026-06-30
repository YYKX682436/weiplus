package vh4;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518642d = 0;

    public o(vh4.p pVar, vh4.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518642d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518642d;
        this.f518642d = i17 + 1;
        if (i17 == 0) {
            return vh4.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
