package oh1;

/* loaded from: classes5.dex */
public class t0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh1.u0 f426827a;

    public t0(oh1.u0 u0Var) {
        this.f426827a = u0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "onEnterForeground");
        this.f426827a.f426836e = true;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (gm0.j1.b().m()) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(51);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotificationService", "cancel no login ");
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "onExitForeground");
        oh1.u0 u0Var = this.f426827a;
        if (u0Var.f426836e) {
            u0Var.f426835d = false;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this);
            u0Var.f426836e = false;
        }
    }
}
