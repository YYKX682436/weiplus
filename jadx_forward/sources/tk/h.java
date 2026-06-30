package tk;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f501397d = 0;

    public h(tk.i iVar, tk.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f501397d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f501397d;
        this.f501397d = i17 + 1;
        if (i17 == 0) {
            return ox.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
