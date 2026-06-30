package hh4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363006d = 0;

    public c(hh4.d dVar, hh4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363006d;
        this.f363006d = i17 + 1;
        if (i17 == 0) {
            return gh4.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
