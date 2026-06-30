package mn2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411484d = 0;

    public f(mn2.g gVar, mn2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411484d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411484d;
        this.f411484d = i17 + 1;
        if (i17 == 0) {
            return mn2.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
