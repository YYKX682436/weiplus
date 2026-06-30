package qg0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444266d = 0;

    public j(qg0.k kVar, qg0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444266d;
        this.f444266d = i17 + 1;
        if (i17 == 0) {
            return pg0.f3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
