package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

@j95.b
/* loaded from: classes9.dex */
public class j extends i95.w implements mh0.n, mh0.m {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f149382d = new com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.C10696x2563e3b3(this, gm0.j1.b().f354778h);

    public void Ai(android.content.Context context, java.util.HashMap hashMap) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z3.d();
        ((java.util.HashMap) gb3.l.f351552c).clear();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "1@fackuser");
        intent.putExtra("key_red_packet_preview_extraInfo", hashMap);
        intent.putExtra("finish_direct", true);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public void Bi(java.lang.String str) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        p75.m0 j17 = dm.ec.f318248r.j(str);
        p75.n0 n0Var = dm.ec.f318246p;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f434209a;
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedger", "try delete record talker:%s ret:%s", str, java.lang.Integer.valueOf(Q4 != null ? Q4.mo70514xb06685ab(table, b17, e17) : -1));
    }

    public boolean Di(android.app.Activity activity) {
        if (activity != null) {
            if (!(activity instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e)) {
                ((vc.q) ((wc.n) i95.n0.c(wc.n.class))).getClass();
                if ((activity instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) || (activity instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayFeatureService", "onAccountInitialized call alive");
        this.f149382d.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayFeatureService", "onAccountReleased call dead");
        this.f149382d.mo48814x2efc64();
    }

    public void wi() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedger", "clearLedgerData");
        p75.n0 n0Var = dm.ec.f318246p;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        if (Q4 != null) {
            Q4.mo70514xb06685ab(table, null, null);
        }
    }
}
