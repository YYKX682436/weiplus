package sm2;

/* loaded from: classes3.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f491068e;

    public k4(sm2.o4 o4Var, boolean z17) {
        this.f491067d = o4Var;
        this.f491068e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kn0.p pVar;
        kn0.p pVar2;
        kn0.p pVar3;
        sm2.o4 o4Var = this.f491067d;
        if (((mm2.n0) o4Var.c(mm2.n0.class)).Q6(xy2.c.e(o4Var.f101127b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "startLiveVideo: skip FINDER_LIVE_MODE_SWITCH for co-live invitee");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SWITCH_MODE_FROM_MINIWINDOW", this.f491068e);
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", ((mm2.c1) o4Var.c(mm2.c1.class)).l7());
        in0.q qVar = o4Var.f101130e;
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", (qVar == null || (pVar3 = qVar.D) == null) ? false : pVar3.f391122i);
        fm2.a aVar = o4Var.f101128c;
        if (aVar != null) {
            aVar.mo46557x60d69242(qo0.b.f446899i4, bundle);
        }
        if (((mm2.c1) o4Var.c(mm2.c1.class)).a8()) {
            return;
        }
        if (((mm2.c1) o4Var.c(mm2.c1.class)).l7()) {
            in0.q qVar2 = o4Var.f101130e;
            if (qVar2 == null || (pVar2 = qVar2.D) == null) {
                return;
            }
            pVar2.l();
            return;
        }
        in0.q qVar3 = o4Var.f101130e;
        if (qVar3 == null || (pVar = qVar3.D) == null) {
            return;
        }
        pVar.m();
    }
}
