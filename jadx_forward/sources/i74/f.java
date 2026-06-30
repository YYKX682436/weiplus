package i74;

/* loaded from: classes4.dex */
public class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f371014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i74.i f371015e;

    public f(i74.i iVar, android.view.ViewTreeObserver viewTreeObserver) {
        this.f371015e = iVar;
        this.f371014d = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$1");
        this.f371014d.removeOnPreDrawListener(this);
        i74.i iVar = this.f371015e;
        m74.b bVar = iVar.f371025e;
        if (bVar != null && iVar.f371027g != null && bVar.getContentView() != null) {
            int c17 = iVar.c(iVar.f371027g, iVar.f371025e.getContentView());
            iVar.n(c17);
            iVar.f371025e.update(iVar.f371027g, 0, c17, -1, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "onNoInterestingClick onPreDraw, yOff is " + c17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$1");
        return true;
    }
}
