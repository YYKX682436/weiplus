package ez3;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339442d = 0;

    public j(ez3.k kVar, ez3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339442d;
        this.f339442d = i17 + 1;
        if (i17 == 0) {
            return ez3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
