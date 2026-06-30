package gl;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354303d = 0;

    public n(gl.o oVar, gl.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354303d;
        this.f354303d = i17 + 1;
        if (i17 == 0) {
            return gl.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
