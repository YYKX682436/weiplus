package ak5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87216d = 0;

    public j(ak5.k kVar, ak5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87216d;
        this.f87216d = i17 + 1;
        if (i17 == 0) {
            return ak5.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
