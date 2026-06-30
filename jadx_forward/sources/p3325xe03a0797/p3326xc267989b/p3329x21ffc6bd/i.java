package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f392031a = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("UNDEFINED");

    /* renamed from: b */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f392032b = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final void a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.Object obj, yz5.l lVar) {
        boolean z17;
        if (!(interfaceC29045xdcb5ca57 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390)) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(obj);
            return;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390 c29049xd7b07390 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) interfaceC29045xdcb5ca57;
        java.lang.Object b17 = p3325xe03a0797.p3326xc267989b.i0.b(obj, lVar);
        if (c29049xd7b07390.dispatcher.I(c29049xd7b07390.mo48699x76847179())) {
            c29049xd7b07390._state = b17;
            c29049xd7b07390.f72727xdec89770 = 1;
            c29049xd7b07390.dispatcher.D(c29049xd7b07390.mo48699x76847179(), c29049xd7b07390);
            return;
        }
        p3325xe03a0797.p3326xc267989b.w1 a17 = p3325xe03a0797.p3326xc267989b.v3.f392217a.a();
        if (a17.O()) {
            c29049xd7b07390._state = b17;
            c29049xd7b07390.f72727xdec89770 = 1;
            a17.M(c29049xd7b07390);
            return;
        }
        a17.N(true);
        try {
            oz5.l mo48699x76847179 = c29049xd7b07390.mo48699x76847179();
            int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) mo48699x76847179.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
            if (r2Var == null || r2Var.a()) {
                z17 = false;
            } else {
                java.util.concurrent.CancellationException x17 = r2Var.x();
                c29049xd7b07390.mo144025xe76581e5(b17, x17);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                c29049xd7b07390.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(x17)));
                z17 = true;
            }
            if (!z17) {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<T> interfaceC29045xdcb5ca572 = c29049xd7b07390.continuation;
                java.lang.Object obj2 = c29049xd7b07390.countOrElement;
                oz5.l mo48699x768471792 = interfaceC29045xdcb5ca572.mo48699x76847179();
                java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(mo48699x768471792, obj2);
                p3325xe03a0797.p3326xc267989b.c4 c18 = c17 != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.f392056a ? p3325xe03a0797.p3326xc267989b.m0.c(interfaceC29045xdcb5ca572, mo48699x768471792, c17) : null;
                try {
                    c29049xd7b07390.continuation.mo48700xdecd0e93(obj);
                    if (c18 == null || c18.k0()) {
                        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(mo48699x768471792, c17);
                    }
                } catch (java.lang.Throwable th6) {
                    if (c18 == null || c18.k0()) {
                        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(mo48699x768471792, c17);
                    }
                    throw th6;
                }
            }
            do {
            } while (a17.Q());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.Object obj, yz5.l lVar, int i17, java.lang.Object obj2) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a(interfaceC29045xdcb5ca57, obj, lVar);
    }
}
