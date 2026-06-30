package o22;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423938d = 0;

    public c(o22.d dVar, o22.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423938d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423938d;
        this.f423938d = i17 + 1;
        if (i17 == 0) {
            return t22.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
