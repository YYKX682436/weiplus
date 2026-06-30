package w65;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f524891d = 0;

    public i(w65.j jVar, w65.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f524891d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f524891d;
        this.f524891d = i17 + 1;
        if (i17 == 0) {
            return lm.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
