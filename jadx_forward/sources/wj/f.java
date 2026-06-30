package wj;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527932d = 0;

    public f(wj.g gVar, wj.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527932d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527932d;
        this.f527932d = i17 + 1;
        if (i17 == 0) {
            return wj.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
