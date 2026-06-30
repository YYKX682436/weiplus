package vf0;

/* loaded from: classes11.dex */
public final class v2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf0.y2 f517824d;

    public v2(vf0.y2 y2Var) {
        this.f517824d = y2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qi3.e0 e0Var = (qi3.e0) obj;
        java.util.Objects.toString(e0Var);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) ((jz5.n) this.f517824d.f517839m).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            ((wf0.j1) it.next()).l1(e0Var);
        }
        return jz5.f0.f384359a;
    }
}
