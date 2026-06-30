package vh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518387d = 0;

    public f(vh0.g gVar, vh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518387d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518387d;
        this.f518387d = i17 + 1;
        if (i17 == 0) {
            return vh0.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
