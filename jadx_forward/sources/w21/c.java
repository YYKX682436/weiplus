package w21;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523836d = 0;

    public c(w21.d dVar, w21.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523836d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523836d;
        this.f523836d = i17 + 1;
        if (i17 == 0) {
            return w21.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
