package gu0;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357187f;

    public e(hu0.a0 a0Var, int i17, int i18) {
        this.f357185d = a0Var;
        this.f357186e = i17;
        this.f357187f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f357185d;
        a0Var.getClass();
        int i17 = this.f357187f;
        if (i17 <= 0) {
            return;
        }
        int i18 = this.f357186e;
        float e17 = e06.p.e(i18 / i17, 0.0f, 1.0f);
        a0Var.f366548n = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEditPanelHeightChanged: currentHeightPx=" + i18 + ", baseHeightPx=" + i17 + ", progress=" + e17 + ", state=" + a0Var.f366547m);
        hu0.p pVar = a0Var.f366547m;
        if (pVar == hu0.p.f366579e) {
            return;
        }
        if (pVar == hu0.p.f366581g) {
            a0Var.Q6();
        }
        a0Var.O6(i17, e17);
    }
}
