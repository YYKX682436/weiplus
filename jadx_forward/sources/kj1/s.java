package kj1;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389909d = 0;

    public s(kj1.t tVar, kj1.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389909d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389909d;
        this.f389909d = i17 + 1;
        if (i17 == 0) {
            return kj1.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
