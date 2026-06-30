package hw;

@j95.b
/* loaded from: classes7.dex */
public final class v0 extends hw.o0 implements gw.i {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f366974q = "MagicEcsTimeline";

    @Override // hw.o0
    public synchronized hw.c0 Di(int i17) {
        hw.s0 s0Var;
        fw.h Ai = ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai();
        s0Var = new hw.s0(Ai);
        s0Var.B = new hw.u0(this);
        s0Var.f364535q = Ai;
        s0Var.X0();
        ((ku5.t0) ku5.t0.f394148d).q(hw.m0.f366936d);
        return s0Var;
    }

    @Override // hw.o0
    public synchronized void K6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLFeatureService", "destroyBrandServiceBiz");
        super.K6(i17);
    }

    @Override // hw.o0
    public java.lang.String Ni() {
        return "MagicEcsTLFeatureService";
    }

    @Override // hw.o0
    public java.lang.String Ri() {
        return this.f366974q;
    }

    @Override // hw.o0
    public dq0.a0 Ui() {
        return ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai();
    }

    @Override // hw.o0
    public boolean Zi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_magic_brandservice, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLFeatureService", "openBrandServiceCard " + z17);
        return z17;
    }

    @Override // hw.o0
    public boolean aj() {
        zv.e0 e0Var = zv.e0.f557470a;
        return zv.e0.f557472c;
    }

    @Override // hw.o0
    public void bj(java.lang.String eventName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLFeatureService", "notifyStateChange eventName:".concat(eventName));
        super.bj(eventName);
    }

    @Override // hw.o0
    public void cj() {
        synchronized (this) {
        }
        ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai().n("notifyBizRecreate", null, dq0.u.f323871d);
    }

    @Override // hw.o0
    public boolean hj() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_brandservice_preinit_num, 1) == 1;
    }

    @Override // hw.o0, i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEcsTLFeatureService", "onAccountReleased");
        super.mo836xb8969aab(context);
    }
}
