package od0;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f426061f;

    public a0(od0.v vVar, int i17, java.lang.String str) {
        this.f426061f = vVar;
        this.f426059d = i17;
        this.f426060e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                int i17 = this.f426059d;
                if (i17 < 0) {
                    i17 = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getDisplayId();
                }
                if (i17 < 0) {
                    return;
                }
                r45.e40 e40Var = new r45.e40();
                e40Var.f454534d = this.f426060e;
                e40Var.f454535e = i17;
                if (((android.hardware.display.DisplayManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("display")).getDisplays().length <= 1 || i17 == 0) {
                    return;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                int i18 = 20;
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_show_in_other_display_report_count, 20);
                if (Ni >= 0) {
                    i18 = Ni;
                }
                if (od0.o0.c(12, 86400000L, i18)) {
                    this.f426061f.a8(540999722, 1008, 0, 0, e40Var.mo14344x5f01b1f6(), false);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "[-] report riod error:" + e17);
        }
    }
}
