package xa0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f534302d = 0;

    public f(xa0.g gVar, xa0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f534302d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f534302d;
        this.f534302d = i17 + 1;
        if (i17 == 0) {
            return wa0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
