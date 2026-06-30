package ci0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f123187d = 0;

    public j(ci0.k kVar, ci0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f123187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f123187d;
        this.f123187d = i17 + 1;
        if (i17 == 0) {
            return pc0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
