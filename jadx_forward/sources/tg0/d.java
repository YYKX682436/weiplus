package tg0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500590d = 0;

    public d(tg0.e eVar, tg0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500590d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500590d;
        this.f500590d = i17 + 1;
        if (i17 == 0) {
            return sg0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
