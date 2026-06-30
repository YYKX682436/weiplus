package m02;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404074d = 0;

    public f(m02.g gVar, m02.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404074d;
        this.f404074d = i17 + 1;
        if (i17 == 0) {
            return l02.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
