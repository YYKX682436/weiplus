package d83;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308486d = 0;

    public c(d83.d dVar, d83.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308486d;
        this.f308486d = i17 + 1;
        if (i17 == 0) {
            return d83.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
