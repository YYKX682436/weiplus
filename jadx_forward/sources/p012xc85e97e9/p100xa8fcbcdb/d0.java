package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class d0 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.e0 f93340e;

    public d0(p012xc85e97e9.p100xa8fcbcdb.e0 e0Var) {
        this.f93340e = e0Var;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb y17;
        p012xc85e97e9.p100xa8fcbcdb.e0 e0Var = this.f93340e;
        e0Var.f93342h.mo7102x1bd2f9af(view, lVar);
        int u07 = e0Var.f93341g.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = e0Var.f93341g.mo7946xf939df19();
        if ((mo7946xf939df19 instanceof p012xc85e97e9.p100xa8fcbcdb.x) && (y17 = ((p012xc85e97e9.p100xa8fcbcdb.x) mo7946xf939df19).y(u07)) != null) {
            y17.y(lVar);
        }
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        return this.f93340e.f93342h.mo7240xcdbe3403(view, i17, bundle);
    }
}
