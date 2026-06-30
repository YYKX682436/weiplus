package mc5;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407188d = 0;

    public j(mc5.k kVar, mc5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407188d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407188d;
        this.f407188d = i17 + 1;
        if (i17 == 0) {
            return mc5.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
