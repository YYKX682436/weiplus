package ki5;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389703d = 0;

    public d(ki5.e eVar, ki5.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389703d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389703d;
        this.f389703d = i17 + 1;
        if (i17 == 0) {
            return ki5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
