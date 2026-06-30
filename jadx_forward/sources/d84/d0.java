package d84;

/* loaded from: classes4.dex */
public final class d0 implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f308587a;

    public d0(d84.j0 j0Var) {
        this.f308587a = j0Var;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mWindowFocusChangeListener$1");
        d84.j0 j0Var = this.f308587a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.j(), "onWindowFocusChanged callback, pageValue is " + ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d84.j0.A(j0Var)).mo144003x754a37bb()).booleanValue() + ", focusValue is true");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d84.j0.F(j0Var)).k(java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.j(), "onWindowFocusChanged callback, pageValue is false, focusValue is false");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 A = d84.j0.A(j0Var);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) A).k(bool);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d84.j0.F(j0Var)).k(bool);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mWindowFocusChangeListener$1");
    }
}
