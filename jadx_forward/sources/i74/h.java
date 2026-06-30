package i74;

/* loaded from: classes4.dex */
public class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.r0 f371020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f371021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s34.p0 f371022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.i f371023d;

    public h(i74.i iVar, a84.r0 r0Var, boolean[] zArr, s34.p0 p0Var) {
        this.f371023d = iVar;
        this.f371020a = r0Var;
        this.f371021b = zArr;
        this.f371022c = p0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public void a() {
        boolean f17;
        i74.i iVar = this.f371023d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "onMessageClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackPromptManager", "onMessageClick failed", th6);
        }
        if (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "onMessageClick: host invalid, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
            return;
        }
        a84.r0 r0Var = this.f371020a;
        if (r0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "onMessageClick: clickReport is null, skip report");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        } else {
            a84.t0.a(r0Var);
            this.f371021b[0] = true;
            n74.x.a(iVar.f371024d, this.f371022c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        }
    }
}
