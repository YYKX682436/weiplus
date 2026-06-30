package mm1;

@j95.b
/* loaded from: classes11.dex */
public class q0 extends i95.w implements nm1.e {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_playsound_rate_control_time, -1L);
        long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_playsound_evict_rate_control_time, -1L);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_playsound_rate_control_enable, true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySoundNew", "setRateControlParam enable:" + fj6 + ", rateControl:" + Ui + ", evictRateControl:" + Ui2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274061e = fj6;
        if (Ui > 0 && Ui2 > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274059c = Ui;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274060d = Ui2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySoundNew", "setRateControlParam " + Ui + ' ' + Ui2);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.f274573a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_playsound_notification_mute_check_enable, true);
    }
}
