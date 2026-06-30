package l85;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398667d = 0;

    public c(l85.d dVar, l85.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398667d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398667d;
        this.f398667d = i17 + 1;
        if (i17 == 0) {
            return l85.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
