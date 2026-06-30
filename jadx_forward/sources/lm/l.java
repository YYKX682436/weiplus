package lm;

/* loaded from: classes9.dex */
public final class l implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f400847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f400848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f400849f;

    public l(java.lang.ref.WeakReference weakReference, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f400847d = weakReference;
        this.f400848e = y0Var;
        this.f400849f = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        w65.o oVar;
        w65.p pVar = (w65.p) obj;
        java.util.Objects.toString(pVar);
        java.lang.ref.WeakReference weakReference = this.f400847d;
        if (weakReference != null && (oVar = (w65.o) weakReference.get()) != null) {
            oVar.P2(pVar);
        }
        if (lm.k.f400846a[pVar.f524895a.ordinal()] == 1) {
            p3325xe03a0797.p3326xc267989b.z0.e(this.f400848e, null, 1, null);
            ((p3325xe03a0797.p3326xc267989b.r) this.f400849f).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(pVar));
        }
        return jz5.f0.f384359a;
    }
}
