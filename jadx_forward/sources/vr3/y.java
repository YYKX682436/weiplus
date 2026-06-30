package vr3;

/* loaded from: classes10.dex */
public final class y implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f521190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr3.z f521191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs3.f f521192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f521193g;

    public y(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, vr3.z zVar, cs3.f fVar, yz5.l lVar) {
        this.f521190d = c1163xf1deaba4;
        this.f521191e = zVar;
        this.f521192f = fVar;
        this.f521193g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f521190d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int a17 = this.f521191e.a(this.f521192f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "content measure callback, height: " + a17);
        this.f521193g.mo146xb9724478(java.lang.Integer.valueOf(a17));
    }
}
