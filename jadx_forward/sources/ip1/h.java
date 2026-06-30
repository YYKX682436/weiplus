package ip1;

/* loaded from: classes8.dex */
public final class h implements rk4.o5 {
    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarController", "audioPanelTaskBar MusicPlayerEvent.callback event: " + i17);
        if (i17 == 1 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 11 || i17 == 12) {
            if (i17 == 3) {
                ip1.r rVar = ip1.r.f375141a;
                ip1.r.f375143c = false;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ip1.r.f375142b;
                if (o4Var != null) {
                    o4Var.putBoolean("key_clear_data_flag", false);
                }
            }
            kp1.l1 l1Var = ip1.q.f375130b;
            if (l1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6) l1Var).o();
            }
        }
    }
}
