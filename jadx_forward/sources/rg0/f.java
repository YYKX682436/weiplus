package rg0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476705d = 0;

    public f(rg0.g gVar, rg0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476705d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476705d;
        this.f476705d = i17 + 1;
        if (i17 == 0) {
            return rg0.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
