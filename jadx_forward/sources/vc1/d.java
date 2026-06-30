package vc1;

/* loaded from: classes13.dex */
public class d implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516484a;

    public d(vc1.p1 p1Var) {
        this.f516484a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChange */
    public void mo14565x21a09eb4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        vc1.p1 p1Var = this.f516484a;
        if (p1Var.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            c4394xa89e978e.m37103x30959487().m37195x2605e9e2();
            c4394xa89e978e.m37103x30959487().m37196x79d7af9();
            q1Var.f516660a = c4394xa89e978e.m37104xfb888c49();
            q1Var.f516661b = c4394xa89e978e.m37101x2fd5b378();
            q1Var.f516662c = c4394xa89e978e.m37102xfb854d80();
            p1Var.K.b(q1Var, p1Var.f516592J);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChangeFinish */
    public void mo14566x31824067(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        vc1.p1 p1Var = this.f516484a;
        if (p1Var.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            c4394xa89e978e.m37103x30959487().m37195x2605e9e2();
            c4394xa89e978e.m37103x30959487().m37196x79d7af9();
            q1Var.f516660a = c4394xa89e978e.m37104xfb888c49();
            q1Var.f516661b = c4394xa89e978e.m37101x2fd5b378();
            q1Var.f516662c = c4394xa89e978e.m37102xfb854d80();
            p1Var.K.a(q1Var, p1Var.f516592J);
            p1Var.f516592J = false;
        }
        vc1.p1.f(p1Var);
    }
}
