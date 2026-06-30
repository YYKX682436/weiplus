package zn1;

/* loaded from: classes11.dex */
public final class h0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f555978a;

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        java.util.concurrent.Future future = this.f555978a;
        boolean z17 = false;
        if (future != null && !future.isDone()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbDeviceManager", "[onEnterForeground] Already connecting device, skip");
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        zn1.g0 g0Var = zn1.g0.f555976d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f555978a = t0Var.k(g0Var, 0L);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
    }
}
