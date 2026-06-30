package kf3;

/* loaded from: classes5.dex */
public class m implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.u f388927d;

    public m(kf3.u uVar) {
        this.f388927d = uVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        kf3.u uVar = this.f388927d;
        if (uVar.f388972d == -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            uVar.f388972d = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = uVar.f388972d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        int ceil = (int) java.lang.Math.ceil((60000 - elapsedRealtime) / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = uVar.f388969a;
        if (elapsedRealtime >= 50000 && elapsedRealtime <= 60000 && !uVar.f388981m) {
            android.os.Vibrator vibrator = (android.os.Vibrator) activityC16488xbf7e6679.mo55332x76847179().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(150L);
            }
            uVar.f388981m = true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = uVar.f388970b;
        c19666xfd6e2f33.m75520x8f50f29c(ceil);
        if (elapsedRealtime < 60000) {
            return true;
        }
        db5.d5 d5Var = c19666xfd6e2f33.X3;
        if (d5Var != null && d5Var.isShowing()) {
            if ((c19666xfd6e2f33.f271501c6 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_CANCEL) && c19666xfd6e2f33.T3) {
                c19666xfd6e2f33.S0(false);
            } else {
                c19666xfd6e2f33.c1();
            }
        } else {
            if (uVar.f388971c.mo47960x360802()) {
                activityC16488xbf7e6679.c7(new kf3.o(uVar));
            }
            c19666xfd6e2f33.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.SendVoice);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.e(activityC16488xbf7e6679, com.p314xaae8f345.mm.R.C30867xcad56011.f574911jy3);
        return false;
    }
}
