package ed4;

/* loaded from: classes4.dex */
public class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f332826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.r0 f332827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f332829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l f332830h;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l lVar, android.view.ViewGroup viewGroup, s34.r0 r0Var, java.lang.String str, int i17) {
        this.f332830h = lVar;
        this.f332826d = viewGroup;
        this.f332827e = r0Var;
        this.f332828f = str;
        this.f332829g = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
        android.view.ViewGroup viewGroup = this.f332826d;
        if (!viewGroup.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l lVar = this.f332830h;
        int height = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l.F(lVar).D0.getHeight();
        int height2 = viewGroup.getHeight();
        if (height <= 0 || height2 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.CardAdTimeLineItem", "checkShowLivingAnim, contentH==0");
        } else {
            int b17 = (height - height2) + i65.a.b(lVar.f250782f, 8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l.F(lVar).f250896e1.d(this.f332827e, this.f332828f, this.f332829g, b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l.F(lVar).f250896e1.setVisibility(0);
        }
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
        return true;
    }
}
