package a31;

/* loaded from: classes14.dex */
public class v extends com.tencent.mm.ui.tools.c9 implements y90.k {

    /* renamed from: r, reason: collision with root package name */
    public boolean f996r;

    /* renamed from: s, reason: collision with root package name */
    public int f997s;

    /* renamed from: t, reason: collision with root package name */
    public int f998t;

    /* renamed from: u, reason: collision with root package name */
    public y90.j f999u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout f1000v;

    /* renamed from: w, reason: collision with root package name */
    public final a31.s f1001w;

    public v() {
        this.f996r = true;
        this.f1001w = new a31.u(this);
    }

    @Override // com.tencent.mm.ui.tools.c9
    public boolean h() {
        return this.f996r;
    }

    @Override // com.tencent.mm.ui.tools.c9
    public boolean l(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17) {
            com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f1000v;
            boolean z17 = voiceSearchLayout != null && voiceSearchLayout.getVisibility() == 0;
            s();
            if (z17) {
                return true;
            }
        }
        return super.l(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void m(android.app.Activity activity, android.view.Menu menu) {
        super.m(activity, menu);
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f1000v;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.setOnSearchListener(this.f1001w);
        }
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void n(android.view.Menu menu) {
        s();
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void p() {
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        boolean z17 = false;
        if (o3Var != null) {
            o3Var.setEditTextEnabled(false);
            this.f210323h.setStatusBtnEnabled(false);
        }
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f1000v;
        if (voiceSearchLayout == null || voiceSearchLayout.getVisibility() != 8) {
            return;
        }
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout2 = this.f1000v;
        int i17 = this.f998t;
        voiceSearchLayout2.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = voiceSearchLayout2.getContext();
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.RECORD_AUDIO", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSearchLayout", "summerper checkPermission checkMicrophone[%b]", java.lang.Boolean.valueOf(d17));
        if (!d17) {
            if (voiceSearchLayout2.getContext() instanceof android.app.Activity) {
                tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                android.app.Activity activity = (android.app.Activity) voiceSearchLayout2.getContext();
                ((sb0.f) jVar2).getClass();
                j35.u.i(activity, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            return;
        }
        voiceSearchLayout2.f71757g = true;
        voiceSearchLayout2.f71758h = false;
        a31.s sVar = voiceSearchLayout2.f71755e;
        if (sVar != null) {
            a31.u uVar = (a31.u) sVar;
            if (!iq.b.C(com.tencent.mm.sdk.platformtools.x2.f193071a) && !iq.b.v(com.tencent.mm.sdk.platformtools.x2.f193071a) && !iq.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                a31.v vVar = uVar.f995a;
                g0Var.d(10453, java.lang.Integer.valueOf(vVar.f997s), 3);
                y90.j jVar3 = vVar.f999u;
                if (jVar3 != null) {
                    jVar3.m6();
                }
            }
        }
        voiceSearchLayout2.setVisibility(0);
        voiceSearchLayout2.f71766s.c(50L, 50L);
        voiceSearchLayout2.e(true, null);
        voiceSearchLayout2.f71765r = 0;
        z21.q qVar = new z21.q(new a31.r(voiceSearchLayout2), i17);
        voiceSearchLayout2.f71761n = qVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "start record");
        if (qVar.f469662d == 0 && com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            z17 = true;
        }
        qVar.f469667i = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "mEnableAmrMode: %b", java.lang.Boolean.valueOf(z17));
        s75.d.b(new z21.o(qVar), "SceneVoiceAddr_record");
    }

    public void s() {
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f1000v;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.c();
        }
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        if (o3Var != null) {
            o3Var.setEditTextEnabled(true);
            this.f210323h.setStatusBtnEnabled(true);
        }
    }

    public v(boolean z17, boolean z18) {
        super(z17, z18);
        this.f996r = true;
        this.f1001w = new a31.u(this);
    }
}
