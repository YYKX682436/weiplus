package go;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f355243d = 0;

    public h(go.i iVar, go.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f355243d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f355243d;
        this.f355243d = i17 + 1;
        if (i17 == 0) {
            return go.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
