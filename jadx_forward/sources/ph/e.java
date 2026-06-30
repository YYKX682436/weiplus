package ph;

/* loaded from: classes12.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ph.t a() {
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        return tVar;
    }

    public final boolean b() {
        boolean z17;
        if (ph.t.f435816k != null) {
            return true;
        }
        synchronized ("Matrix.battery.LifeCycle") {
            z17 = ph.t.f435816k != null;
        }
        return z17;
    }
}
