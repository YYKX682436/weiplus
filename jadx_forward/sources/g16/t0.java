package g16;

/* loaded from: classes15.dex */
public final class t0 {
    public t0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final g16.u0 a(m16.f signature) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        if (signature instanceof m16.e) {
            java.lang.String name = signature.c();
            java.lang.String desc = signature.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
            return new g16.u0(name.concat(desc), null);
        }
        if (!(signature instanceof m16.d)) {
            throw new jz5.j();
        }
        java.lang.String name2 = signature.c();
        java.lang.String desc2 = signature.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name2, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc2, "desc");
        return new g16.u0(name2 + '#' + desc2, null);
    }
}
