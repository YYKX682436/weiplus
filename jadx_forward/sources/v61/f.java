package v61;

@j95.b
/* loaded from: classes10.dex */
public final class f extends i95.w implements zl.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f514968d = jz5.h.b(v61.e.f514966d);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1014x633fb29.C11386xb7a97d05 f514969e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.account.model.AuthSyncMsgService$exptListener$1] */
    public f() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f514969e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.account.model.AuthSyncMsgService$exptListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "received ExptChangeEvent");
                v61.f.this.Ai();
                return false;
            }
        };
    }

    public final void Ai() {
        int b17 = ih.a.b("clicfg_login_agree_sync_msg_enable_solid", 1);
        Bi().A("auth_sync_expt_enable_key", b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "expt config clicfg_login_agree_sync_msg_enable: " + b17);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f514968d).mo141623x754a37bb();
    }

    public boolean Di() {
        int i17 = Bi().getInt("auth_sync_expt_enable_key", 0);
        if (i17 == 0) {
            Ni(0);
        }
        return i17 != 0;
    }

    public void Ni(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "setAuthSyncFlag: " + i17);
        if (i17 == 1) {
            Bi().putInt("auth_sync_flag_key", 1);
        } else if (i17 != 2) {
            Bi().putInt("auth_sync_flag_key", 0);
        } else {
            Bi().putInt("auth_sync_flag_key", 2);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "onAccountInitialized");
        Ai();
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "onAccountReleased");
        if (Di()) {
            Ni(2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "onAccountReleased done");
    }

    public int wi() {
        int i17 = Bi().getInt("auth_sync_flag_key", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthSyncMsgService", "getAuthSyncFlag: " + i17);
        return i17;
    }
}
