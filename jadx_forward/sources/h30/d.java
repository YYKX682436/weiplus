package h30;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359916d = 0;

    public d(h30.e eVar, h30.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359916d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359916d;
        this.f359916d = i17 + 1;
        if (i17 == 0) {
            return h30.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
