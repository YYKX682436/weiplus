package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class u extends p012xc85e97e9.p087x9da2e250.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.s0 f93015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 f93016e;

    public u(p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.s0 s0Var) {
        this.f93016e = dialogInterfaceOnCancelListenerC1100xc25047d8;
        this.f93015d = s0Var;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public android.view.View b(int i17) {
        android.view.View m7401xc53b4c6f = this.f93016e.m7401xc53b4c6f(i17);
        if (m7401xc53b4c6f != null) {
            return m7401xc53b4c6f;
        }
        p012xc85e97e9.p087x9da2e250.app.s0 s0Var = this.f93015d;
        if (s0Var.c()) {
            return s0Var.b(i17);
        }
        return null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public boolean c() {
        return this.f93016e.m7403x79316580() || this.f93015d.c();
    }
}
