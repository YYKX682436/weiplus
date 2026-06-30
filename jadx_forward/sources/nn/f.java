package nn;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420050d = 0;

    public f(nn.g gVar, nn.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420050d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420050d;
        this.f420050d = i17 + 1;
        if (i17 == 0) {
            return nn.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
