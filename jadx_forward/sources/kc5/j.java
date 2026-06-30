package kc5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388097d = 0;

    public j(kc5.k kVar, kc5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388097d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388097d;
        this.f388097d = i17 + 1;
        if (i17 == 0) {
            return kc5.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
