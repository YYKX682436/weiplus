package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class e1 implements uh1.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 f159271a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var) {
        this.f159271a = g1Var;
    }

    public void a(int i17, java.lang.String str) {
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketClose code:%d reason:%s ", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f159271a;
        if (android.text.TextUtils.isEmpty(g1Var.f159283d.f159155x) || !g1Var.f159290n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = g1Var.f159283d;
            synchronized (a1Var) {
                i18 = a1Var.f159137f;
            }
            if (!(i18 == 4) && ((long) a1Var.f159153v) < 10) {
                ik1.h0.a().b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.d1(this), 1000L);
                g1Var.f159283d.f159153v++;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketClose with ws lan");
            if (g1Var.f159288i.mo50262x39e05d35()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = g1Var.f159289m;
                l2Var.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g2(l2Var));
            }
            g1Var.f159290n = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = g1Var.f159287h;
        n1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
        java.util.concurrent.Future future = n1Var.f159349l;
        if (future != null) {
            future.cancel(false);
        }
        g1Var.f159283d.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = g1Var.f159289m;
        l2Var2.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var2));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var2));
        g1Var.f159283d.e(5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var3 = g1Var.f159289m;
        l2Var3.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j2(l2Var3, str));
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketError message:%s ", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f159271a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = g1Var.f159289m;
        l2Var.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j2(l2Var, str));
        }
        if (android.text.TextUtils.isEmpty(g1Var.f159283d.f159155x)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint %s fail, reset it empty", g1Var.f159283d.f159155x);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = g1Var.f159289m;
        java.lang.String str2 = g1Var.f159283d.f159155x;
        l2Var2.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z1(l2Var2, str2));
        g1Var.f159283d.f159155x = "";
    }
}
