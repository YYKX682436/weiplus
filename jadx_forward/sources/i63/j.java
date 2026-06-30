package i63;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f370541d = 0;

    public j(i63.k kVar, i63.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f370541d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f370541d;
        this.f370541d = i17 + 1;
        if (i17 == 0) {
            return i63.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
