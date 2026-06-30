package j14;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378716d = 0;

    public f(j14.g gVar, j14.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f378716d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f378716d;
        this.f378716d = i17 + 1;
        if (i17 == 0) {
            return j14.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
