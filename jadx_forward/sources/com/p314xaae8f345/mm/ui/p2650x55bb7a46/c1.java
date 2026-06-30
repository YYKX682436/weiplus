package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class c1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 f280045e;

    public c1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var, boolean z17) {
        this.f280045e = v0Var;
        this.f280044d = z17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        boolean z17 = this.f280044d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var = this.f280045e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "speaker true");
            android.content.Context context = v0Var.f284305r;
            if (context != null) {
                v0Var.f284304q.Z(com.p314xaae8f345.mm.R.raw.f80310x70efeba7, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdp), 2000L);
            }
            v0Var.G(true);
            v0Var.K();
            if (v0Var.f284293J) {
                v0Var.B(java.lang.Math.max(v0Var.f284311x - 2000, 0L));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "speaker off");
            v0Var.G(false);
            if (v0Var.f284293J) {
                v0Var.K();
                v0Var.B(java.lang.Math.max(v0Var.f284311x - 2000, 0L));
            } else if (((sl.j) v0Var.f284298h).c()) {
                ((sl.j) v0Var.f284298h).f490570j = false;
                v0Var.t(false, true);
            }
        }
        return false;
    }
}
