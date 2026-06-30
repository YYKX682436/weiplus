package lv;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403005d = 0;

    public f(lv.g gVar, lv.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403005d;
        this.f403005d = i17 + 1;
        if (i17 == 0) {
            return lv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
