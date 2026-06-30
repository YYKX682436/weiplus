package uc5;

/* loaded from: classes10.dex */
public abstract class l0 extends xm3.a {
    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        boolean z17;
        uc5.l0 other = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (compareTo(other) != 0) {
            return false;
        }
        if (this instanceof uc5.k0) {
            z17 = true;
        } else if (this instanceof uc5.h0) {
            if (other instanceof uc5.h0) {
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((uc5.h0) this).f508027d.f508009d, ((uc5.h0) other).f508027d.f508009d);
            }
            z17 = false;
        } else if (this instanceof uc5.i0) {
            if (other instanceof uc5.i0) {
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((uc5.i0) this).f508034d, ((uc5.i0) other).f508034d);
            }
            z17 = false;
        } else {
            if (!(this instanceof uc5.j0)) {
                throw new jz5.j();
            }
            z17 = other instanceof uc5.j0;
        }
        return z17;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }
}
