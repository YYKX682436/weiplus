package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* renamed from: com.tencent.mm.plugin.qrcode.model.OpenCustomerServiceChatResultReceiver */
/* loaded from: classes9.dex */
public class ResultReceiverC16943x29779eb1 extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public boolean f236479d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n f236480e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f236481f;

    public ResultReceiverC16943x29779eb1(android.os.Handler handler, com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar, java.lang.Runnable runnable) {
        super(handler);
        this.f236479d = false;
        this.f236481f = null;
        this.f236480e = nVar;
        this.f236481f = runnable;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar2;
        if (bundle != null && (i18 = bundle.getInt("result_key_action", -1)) >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenCustomerServiceChatResultReceiver", "startKfConversation onReceiveResult action: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bundle.getInt("result_key_err_code", -1)), bundle.getString("result_key_err_msg"));
            if (i18 == 5) {
                this.f236479d = true;
                return;
            }
            if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar3 = this.f236480e;
                if (nVar3 != null) {
                    ((e04.p) nVar3).D(true);
                    return;
                }
                return;
            }
            if (i18 == 4) {
                if (this.f236479d || (nVar2 = this.f236480e) == null) {
                    return;
                }
                ((e04.p) nVar2).D(true);
                return;
            }
            if (i18 == 3) {
                if (this.f236481f != null) {
                    this.f236480e = null;
                    ((ku5.t0) ku5.t0.f394148d).E(this.f236481f, 600L);
                    return;
                }
                return;
            }
            if (i18 != 6 || this.f236479d || (nVar = this.f236480e) == null) {
                return;
            }
            ((e04.p) nVar).D(true);
        }
    }
}
