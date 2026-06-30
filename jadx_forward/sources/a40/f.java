package a40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82705d = 0;

    public f(a40.g gVar, a40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82705d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82705d;
        this.f82705d = i17 + 1;
        if (i17 == 0) {
            return a40.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
