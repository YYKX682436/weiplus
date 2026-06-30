package i74;

/* loaded from: classes4.dex */
public class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.r0 f371016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f371017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 f371018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.i f371019d;

    public g(i74.i iVar, a84.r0 r0Var, boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var) {
        this.f371019d = iVar;
        this.f371016a = r0Var;
        this.f371017b = zArr;
        this.f371018c = q2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onHide */
    public void mo50890xc39a57c1() {
        boolean f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        try {
            i74.i iVar = this.f371019d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackPromptManager", "onHide failed", th6);
        }
        if (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "onHide: host invalid, skip report");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        if (this.f371017b[0]) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = this.f371018c;
        if (q2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "snackBar onHide: no pending op, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "snackBar onHide, report feedback snackbar exposed but not clicked!");
            gm0.j1.i();
            gm0.j1.n().f354821b.g(q2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onShow */
    public void mo50891xc39f557c() {
        boolean f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "snackBar onShow");
            i74.i iVar = this.f371019d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackPromptManager", "onShow failed", th6);
        }
        if (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "onShow: host invalid, skip ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        a84.r0 r0Var = this.f371016a;
        if (r0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "snackBar onShow: exposeReport is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        } else {
            a84.t0.a(r0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        }
    }
}
