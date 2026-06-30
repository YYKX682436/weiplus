package f61;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341369d = 0;

    public j(f61.k kVar, f61.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341369d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341369d;
        this.f341369d = i17 + 1;
        if (i17 == 0) {
            return f61.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
