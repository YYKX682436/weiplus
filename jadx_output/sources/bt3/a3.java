package bt3;

/* loaded from: classes12.dex */
public class a3 implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.SensorController f24195p;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.c1 f24196d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f24197e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24198f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24199g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.s7 f24201i;

    /* renamed from: n, reason: collision with root package name */
    public int f24203n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24200h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f24202m = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f24204o = new java.util.LinkedList();

    public a3() {
        this.f24198f = true;
        ((com.tencent.mm.app.o7) ((com.tencent.mm.modelbase.d1) i95.n0.c(com.tencent.mm.modelbase.d1.class))).getClass();
        sl.j jVar = new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0);
        this.f24196d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
        this.f24199g = bool.booleanValue();
        this.f24198f = true ^ bool.booleanValue();
        jVar.f409043p = this;
        jVar.f409042o = this;
        if (ym1.f.Ri() || ym1.f.Ni()) {
            jVar.f(false);
        } else {
            jVar.f(this.f24198f);
        }
        if (f24195p == null) {
            f24195p = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (this.f24201i == null) {
            this.f24201i = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        c();
        java.util.Iterator it = this.f24204o.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = (com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) ((bt3.z2) it.next());
            recordVoiceBaseView.c();
            recordVoiceBaseView.f155336h.c();
        }
    }

    public boolean b(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.c1 c1Var = this.f24196d;
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        java.util.Iterator it = this.f24204o.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = (com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) ((bt3.z2) it.next());
            recordVoiceBaseView.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!(str == null ? "" : str).equals(recordVoiceBaseView.f155338m)) {
                recordVoiceBaseView.c();
            }
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = f24195p;
        if (sensorController != null && !sensorController.f192433h) {
            sensorController.b(this);
            if (this.f24201i.a(new bt3.y2(this))) {
                this.f24202m = 0L;
            } else {
                this.f24202m = -1L;
            }
        }
        this.f24197e = str;
        this.f24203n = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f24198f, true, i17)) {
                com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    public void c() {
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.modelbase.c1 c1Var = this.f24196d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = f24195p;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f24201i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f24197e)) {
            return;
        }
        if (this.f24200h) {
            this.f24200h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f24202m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f24200h = true;
                return;
            }
        }
        this.f24200h = false;
        com.tencent.mm.modelbase.c1 c1Var = this.f24196d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        if (this.f24199g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            this.f24198f = false;
        } else {
            if (c1Var != null && !((sl.j) c1Var).c()) {
                ((sl.j) c1Var).f(true);
                this.f24198f = true;
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f24198f = z17;
            if (z17) {
                return;
            }
            b(this.f24197e, this.f24203n);
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        c();
        java.util.Iterator it = this.f24204o.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = (com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) ((bt3.z2) it.next());
            recordVoiceBaseView.c();
            recordVoiceBaseView.f155336h.c();
        }
    }
}
