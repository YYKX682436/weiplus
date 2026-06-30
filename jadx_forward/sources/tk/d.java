package tk;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f501394d = 0;

    public d(tk.e eVar, tk.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f501394d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f501394d;
        this.f501394d = i17 + 1;
        if (i17 == 0) {
            return ox.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
