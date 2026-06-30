package ki4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389670d = 0;

    public j(ki4.k kVar, ki4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389670d;
        this.f389670d = i17 + 1;
        if (i17 == 0) {
            return ki4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
