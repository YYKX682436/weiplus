package lg0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400071d = 0;

    public f(lg0.g gVar, lg0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400071d;
        this.f400071d = i17 + 1;
        if (i17 == 0) {
            return kg0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
