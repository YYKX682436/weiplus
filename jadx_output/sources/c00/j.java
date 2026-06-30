package c00;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36986d = 0;

    public j(c00.k kVar, c00.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36986d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36986d;
        this.f36986d = i17 + 1;
        if (i17 == 0) {
            return h00.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
