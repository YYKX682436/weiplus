package rc5;

/* loaded from: classes5.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.x f475726d;

    public u(rc5.x xVar) {
        this.f475726d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd;
        sb5.s0 s0Var;
        rc5.x xVar = this.f475726d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = null;
        rc5.x.q7(xVar, xVar.m158354x19263085().getWindow(), null, 2, null);
        rc5.t tVar = new rc5.t(xVar);
        xVar.getClass();
        yb5.d dVar = xVar.W6().f279685f;
        if (dVar != null && (s0Var = (sb5.s0) dVar.f542241c.a(sb5.s0.class)) != null) {
            c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e;
        }
        if (c19666xfd6e2f33 == null || (c19678x1ab789dd = c19666xfd6e2f33.f271515f2) == null) {
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) c19678x1ab789dd.f271667s;
        if (linkedList.contains(tVar)) {
            return;
        }
        linkedList.add(tVar);
    }
}
