package cv;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304028d = 0;

    public j(cv.k kVar, cv.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304028d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304028d;
        this.f304028d = i17 + 1;
        if (i17 == 0) {
            return gl.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
