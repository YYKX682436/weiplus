package com.tencent.mm.feature.wxpay;

@j95.b
/* loaded from: classes9.dex */
public class j extends i95.w implements mh0.n, mh0.m {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67849d = new com.tencent.mm.feature.wxpay.WxPayFeatureService$1(this, gm0.j1.b().f273245h);

    public void Ai(android.content.Context context, java.util.HashMap hashMap) {
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.tencent.mm.plugin.luckymoney.model.z3.b();
        com.tencent.mm.plugin.luckymoney.model.z3.d();
        ((java.util.HashMap) gb3.l.f270019c).clear();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "1@fackuser");
        intent.putExtra("key_red_packet_preview_extraInfo", hashMap);
        intent.putExtra("finish_direct", true);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public void Bi(java.lang.String str) {
        androidx.lifecycle.c1 a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        p75.m0 j17 = dm.ec.f236715r.j(str);
        p75.n0 n0Var = dm.ec.f236713p;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f352676a;
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedger", "try delete record talker:%s ret:%s", str, java.lang.Integer.valueOf(Q4 != null ? Q4.delete(table, b17, e17) : -1));
    }

    public boolean Di(android.app.Activity activity) {
        if (activity != null) {
            if (!(activity instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
                ((vc.q) ((wc.n) i95.n0.c(wc.n.class))).getClass();
                if ((activity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) || (activity instanceof com.tencent.mm.wallet_core.ui.WalletPreferenceUI) || (activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI) || (activity instanceof com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayFeatureService", "onAccountInitialized call alive");
        this.f67849d.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayFeatureService", "onAccountReleased call dead");
        this.f67849d.dead();
    }

    public void wi() {
        androidx.lifecycle.c1 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedger", "clearLedgerData");
        p75.n0 n0Var = dm.ec.f236713p;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f352676a;
        kotlin.jvm.internal.o.g(table, "table");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        if (Q4 != null) {
            Q4.delete(table, null, null);
        }
    }
}
