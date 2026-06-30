package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class q4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 f284131d;

    public q4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var) {
        this.f284131d = h4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        db5.d5 d5Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284131d;
        long c17 = ((com.p314xaae8f345.mm.p944x882e457a.g1) h4Var.f283170b.b()).c();
        int ceil = (int) java.lang.Math.ceil((60000 - c17) / 1000.0d);
        yb5.d dVar = h4Var.f283178j;
        if (c17 >= 50000 && c17 <= 60000 && !h4Var.f283187s) {
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.Vibrator vibrator = (android.os.Vibrator) g17.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(150L);
            }
            h4Var.f283187s = true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = h4Var.f283169a;
        c19666xfd6e2f33.m75520x8f50f29c(ceil);
        if (c17 < 60000) {
            return true;
        }
        db5.d5 d5Var2 = c19666xfd6e2f33.X3;
        if (d5Var2 != null && d5Var2.isShowing()) {
            boolean z18 = c19666xfd6e2f33.T3;
            if (z18) {
                if (c19666xfd6e2f33.f271501c6 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_VOICE) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "record countdown, voice mode auto send voiceAutoSendCount = %s", java.lang.Integer.valueOf(h4Var.f283188t));
                    int i17 = h4Var.f283188t;
                    if (i17 < 1) {
                        h4Var.f283188t = i17 + 1;
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
                        if (k5Var != null) {
                            k5Var.f(false);
                            z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(java.lang.System.nanoTime() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
                            c19666xfd6e2f33.L3 = a0Var;
                            c19666xfd6e2f33.K3.b(a0Var);
                            java.lang.String str = u35.d.f505968a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
                            eVar.getClass();
                            eVar.G = str;
                            if (!c19666xfd6e2f33.f271623x0.q(false) && (d5Var = c19666xfd6e2f33.X3) != null && d5Var.isShowing()) {
                                c19666xfd6e2f33.X3.dismiss();
                            }
                        }
                    } else {
                        c19666xfd6e2f33.S0(true);
                        h4Var.f283188t = 0;
                    }
                }
            }
            if (z18) {
                if (c19666xfd6e2f33.f271501c6 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_CANCEL) {
                    c19666xfd6e2f33.S0(false);
                    h4Var.f283188t = 0;
                }
            }
            c19666xfd6e2f33.c1();
            h4Var.f283188t = 0;
        } else {
            h4Var.P();
            c19666xfd6e2f33.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.SendVoice);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.e(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.f574911jy3);
        return false;
    }
}
