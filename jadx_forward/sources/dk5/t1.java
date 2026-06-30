package dk5;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f316427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 f316429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f316430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316431h;

    public t1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, boolean z17, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var, boolean z18) {
        this.f316431h = activityC22567x42e895b8;
        this.f316427d = z17;
        this.f316428e = str;
        this.f316429f = w3Var;
        this.f316430g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        boolean z17 = this.f316427d;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316431h;
        dk5.s1 s1Var = (z17 && activityC22567x42e895b8.f292508y0) ? new dk5.s1(this) : null;
        if (activityC22567x42e895b8.f292508y0) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "MsgRetransmitUI.getLatch() await");
                activityC22567x42e895b8.f292505x0.await();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "MsgRetransmitUI.getLatch() await done");
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        java.lang.String str = this.f316428e;
        boolean z18 = this.f316427d;
        boolean z19 = this.f316430g;
        if (activityC22567x42e895b8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, context is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, username is empty");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var = this.f316429f;
        if (w3Var == null || (list = w3Var.f287734a) == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, select items empty");
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5.f280226t.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t3(w3Var, str, activityC22567x42e895b8, z19, z18, s1Var));
        }
    }
}
