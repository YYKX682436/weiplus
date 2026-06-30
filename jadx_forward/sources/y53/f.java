package y53;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541015d = 0;

    public f(y53.g gVar, y53.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541015d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541015d;
        this.f541015d = i17 + 1;
        if (i17 == 0) {
            return y53.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
