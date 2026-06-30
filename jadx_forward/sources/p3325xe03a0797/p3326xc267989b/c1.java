package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes13.dex */
public abstract class c1 {
    public static final java.lang.String a(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object m143895xf1229813;
        if (interfaceC29045xdcb5ca57 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) {
            return interfaceC29045xdcb5ca57.toString();
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(interfaceC29045xdcb5ca57 + '@' + a(interfaceC29045xdcb5ca57));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = interfaceC29045xdcb5ca57.getClass().getName() + '@' + a(interfaceC29045xdcb5ca57);
        }
        return (java.lang.String) m143895xf1229813;
    }
}
