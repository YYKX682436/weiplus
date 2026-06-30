package fc4;

/* loaded from: classes3.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f342645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f342646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f342647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f342648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f342649i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fc4.g f342650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f342651n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f342652o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f342653p;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15, float f17, boolean z17, int i17, int i18, android.view.View view, fc4.g gVar, int i19, int i27, boolean z18) {
        this.f342644d = viewOnLongClickListenerC18284x499dee15;
        this.f342645e = f17;
        this.f342646f = z17;
        this.f342647g = i17;
        this.f342648h = i18;
        this.f342649i = view;
        this.f342650m = gVar;
        this.f342651n = i19;
        this.f342652o = i27;
        this.f342653p = z18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342644d;
        viewOnLongClickListenerC18284x499dee15.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = viewOnLongClickListenerC18284x499dee15.getWidth() / 2;
        int height = viewOnLongClickListenerC18284x499dee15.getHeight() / 2;
        viewOnLongClickListenerC18284x499dee15.setPivotX(viewOnLongClickListenerC18284x499dee15.getWidth() / 2.0f);
        viewOnLongClickListenerC18284x499dee15.setPivotY(viewOnLongClickListenerC18284x499dee15.getHeight() / 2.0f);
        int width2 = viewOnLongClickListenerC18284x499dee15.getWidth();
        int height2 = viewOnLongClickListenerC18284x499dee15.getHeight();
        float width3 = this.f342646f ? (this.f342647g * 1.0f) / (viewOnLongClickListenerC18284x499dee15.getWidth() / this.f342645e) : (this.f342648h * 1.0f) / width2;
        if (java.lang.Float.isInfinite(width3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
            return true;
        }
        android.view.View view = this.f342649i;
        view.clearAnimation();
        view.animate().setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(1.0f).setListener(new fc4.b(this.f342650m, view, viewOnLongClickListenerC18284x499dee15)).setUpdateListener(new fc4.c(width3, this.f342644d, this.f342651n, width, this.f342652o, height, this.f342653p, width2, this.f342648h, height2, this.f342647g, this.f342650m));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
        return true;
    }
}
