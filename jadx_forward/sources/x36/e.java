package x36;

/* loaded from: classes16.dex */
public final class e implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.g f533200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x36.f0 f533201e;

    public e(x36.g gVar, x36.f0 f0Var) {
        this.f533200d = gVar;
        this.f533201e = f0Var;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        x36.b.b(source.f533227e, 0L, j17);
        while (true) {
            long j18 = 0;
            if (j17 <= 0) {
                return;
            }
            x36.c0 c0Var = source.f533226d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            while (true) {
                if (j18 >= 65536) {
                    break;
                }
                j18 += c0Var.f533192c - c0Var.f533191b;
                if (j18 >= j17) {
                    j18 = j17;
                    break;
                } else {
                    c0Var = c0Var.f533195f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                }
            }
            x36.g gVar = this.f533200d;
            gVar.i();
            try {
                this.f533201e.U(source, j18);
                if (gVar.j()) {
                    throw gVar.k(null);
                }
                j17 -= j18;
            } catch (java.io.IOException e17) {
                if (!gVar.j()) {
                    throw e17;
                }
                throw gVar.k(e17);
            } finally {
                gVar.j();
            }
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x36.g gVar = this.f533200d;
        gVar.i();
        try {
            this.f533201e.close();
            if (gVar.j()) {
                throw gVar.k(null);
            }
        } catch (java.io.IOException e17) {
            if (!gVar.j()) {
                throw e17;
            }
            throw gVar.k(e17);
        } finally {
            gVar.j();
        }
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        x36.g gVar = this.f533200d;
        gVar.i();
        try {
            this.f533201e.flush();
            if (gVar.j()) {
                throw gVar.k(null);
            }
        } catch (java.io.IOException e17) {
            if (!gVar.j()) {
                throw e17;
            }
            throw gVar.k(e17);
        } finally {
            gVar.j();
        }
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f533200d;
    }

    /* renamed from: toString */
    public java.lang.String m174963x9616526c() {
        return "AsyncTimeout.sink(" + this.f533201e + ')';
    }
}
