package tg3;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500728d = 0;

    public l(tg3.m mVar, tg3.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500728d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500728d;
        this.f500728d = i17 + 1;
        if (i17 == 0) {
            return fo.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
