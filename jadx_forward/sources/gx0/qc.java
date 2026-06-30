package gx0;

/* loaded from: classes5.dex */
public final class qc implements jx0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.sc f358419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f358420b;

    public qc(gx0.sc scVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713) {
        this.f358419a = scVar;
        this.f358420b = c4190xd8dd3713;
    }

    @Override // jx0.h0
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a seekTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekTime, "seekTime");
    }

    @Override // jx0.h0
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    @Override // jx0.h0
    public java.lang.Object c(boolean z17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (!z17) {
            return java.lang.Boolean.FALSE;
        }
        gx0.w8 w8Var = (gx0.w8) ((jz5.n) this.f358419a.f358486t).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = this.f358420b.A();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getPresentationStartTime(...)");
        w8Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(w8Var.m158345xefc66565(), null, null, new gx0.j5(true, w8Var, A, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
