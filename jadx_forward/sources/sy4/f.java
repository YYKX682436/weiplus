package sy4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495409d = 0;

    public f(sy4.g gVar, sy4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495409d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495409d;
        this.f495409d = i17 + 1;
        if (i17 == 0) {
            return sy4.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
