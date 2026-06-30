package p16;

/* loaded from: classes16.dex */
public class n0 implements p16.e {

    /* renamed from: d, reason: collision with root package name */
    public final p16.m0 f432860d;

    /* renamed from: e, reason: collision with root package name */
    public p16.e f432861e;

    /* renamed from: f, reason: collision with root package name */
    public int f432862f;

    public n0(p16.o0 o0Var, p16.k0 k0Var) {
        p16.m0 m0Var = new p16.m0(o0Var, null);
        this.f432860d = m0Var;
        this.f432861e = m0Var.next().iterator();
        this.f432862f = o0Var.f432864e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432862f > 0;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return java.lang.Byte.valueOf(mo157702x54deae9b());
    }

    @Override // p16.e
    /* renamed from: nextByte */
    public byte mo157702x54deae9b() {
        if (!this.f432861e.hasNext()) {
            this.f432861e = this.f432860d.next().iterator();
        }
        this.f432862f--;
        return this.f432861e.mo157702x54deae9b();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
