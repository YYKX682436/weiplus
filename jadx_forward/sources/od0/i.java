package od0;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            int length = ((android.hardware.display.DisplayManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("display")).getDisplays().length;
            r45.lw4 h17 = ko3.l0.INSTANCE.h();
            if (length <= 1 || h17 == null) {
                return;
            }
            if (android.text.TextUtils.isEmpty(h17.f461421g) && android.text.TextUtils.isEmpty(h17.f461419e)) {
                return;
            }
            w04.l lVar = w04.l.INSTANCE;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i17 = 10;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_foreground_multi_display_report_count, 10);
            if (Ni >= 0) {
                i17 = Ni;
            }
            if (lVar.Cd(14, 86400000L, i17)) {
                od0.r.Ai(540999749, null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PSIR", th6, "[arsitcifmd] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
