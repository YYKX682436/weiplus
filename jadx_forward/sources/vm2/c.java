package vm2;

/* loaded from: classes3.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.kv1 a(vm2.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        r45.yp1 yp1Var = dVar.f519621d;
        r45.qa0 qa0Var = dVar.f519622e;
        if (qa0Var == null) {
            java.util.LinkedList m75941xfb821914 = yp1Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGifts(...)");
            return (r45.kv1) kz5.n0.Z(m75941xfb821914);
        }
        java.util.LinkedList m75941xfb8219142 = yp1Var.m75941xfb821914(4);
        java.lang.Object obj = null;
        if (m75941xfb8219142 == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.kv1) next).m75945x2fec8307(0), qa0Var.m75945x2fec8307(1))) {
                obj = next;
                break;
            }
        }
        return (r45.kv1) obj;
    }
}
