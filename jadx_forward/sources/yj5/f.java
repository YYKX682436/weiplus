package yj5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f544246d = 0;

    public f(yj5.g gVar, yj5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f544246d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f544246d;
        this.f544246d = i17 + 1;
        if (i17 == 0) {
            return yj5.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
