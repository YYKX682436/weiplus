package kp;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f392266d = 0;

    public f(kp.g gVar, kp.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f392266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f392266d;
        this.f392266d = i17 + 1;
        if (i17 == 0) {
            return kp.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
