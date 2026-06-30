package ka0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387510d = 0;

    public j(ka0.k kVar, ka0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387510d;
        this.f387510d = i17 + 1;
        if (i17 == 0) {
            return ja0.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
