package org.p3367x5a555907.p3368x32b0ae;

/* loaded from: classes13.dex */
public final class d implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public org.p3367x5a555907.p3368x32b0ae.C29716x9bf78150 f429411d;

    public d(java.nio.ByteBuffer byteBuffer) {
        this.f429411d = new org.p3367x5a555907.p3368x32b0ae.C29716x9bf78150(byteBuffer, null);
    }

    public final void a() {
        if (this.f429411d == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 b(int i17) {
        a();
        return this.f429411d.a(i17);
    }

    public int c() {
        a();
        return this.f429411d.f429392h.length;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        org.p3367x5a555907.p3368x32b0ae.C29716x9bf78150 c29716x9bf78150 = this.f429411d;
        if (c29716x9bf78150 != null) {
            c29716x9bf78150.close();
            this.f429411d = null;
        }
    }

    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 f(int i17) {
        a();
        return this.f429411d.b(i17);
    }

    /* renamed from: finalize */
    public void m155097xd764dc1e() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public int i() {
        a();
        return this.f429411d.f429393i.length;
    }

    public void j(java.lang.Object[] objArr, java.util.Map map) {
        a();
        this.f429411d.c(objArr, map);
    }
}
