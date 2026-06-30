package cm3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f43413d = 0;

    public f(cm3.g gVar, cm3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f43413d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f43413d;
        this.f43413d = i17 + 1;
        if (i17 == 0) {
            return cm3.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
