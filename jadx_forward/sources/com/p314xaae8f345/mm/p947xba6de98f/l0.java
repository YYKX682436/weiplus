package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class l0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f152571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f152572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f152573f;

    public l0(java.lang.ref.WeakReference weakReference, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f152571d = weakReference;
        this.f152572e = y0Var;
        this.f152573f = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var;
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var2;
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var3;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj;
        int ordinal = n1Var.f152636a.ordinal();
        java.lang.ref.WeakReference weakReference = this.f152571d;
        if (ordinal != 5) {
            if (ordinal != 15) {
                if (weakReference != null && (v2Var3 = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) != null) {
                    v2Var3.a(n1Var);
                }
                p3325xe03a0797.p3326xc267989b.z0.e(this.f152572e, null, 1, null);
                ((p3325xe03a0797.p3326xc267989b.r) this.f152573f).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(n1Var));
            } else if (weakReference != null && (v2Var2 = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) != null) {
                v2Var2.c(n1Var);
            }
        } else if (weakReference != null && (v2Var = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) != null) {
            v2Var.b(n1Var);
        }
        return jz5.f0.f384359a;
    }
}
