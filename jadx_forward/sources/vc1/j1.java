package vc1;

/* loaded from: classes13.dex */
public class j1 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516527r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(vc1.p1 p1Var, android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7) {
        super(context, interfaceC25945x718093f7);
        this.f516527r = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChange */
    public void mo14565x21a09eb4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        super.mo14565x21a09eb4(c4394xa89e978e);
        vc1.p1 p1Var = this.f516527r;
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

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChangeFinish */
    public void mo14566x31824067(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        super.mo14566x31824067(c4394xa89e978e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish");
        if (this.f516527r.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            c4394xa89e978e.m37103x30959487().m37195x2605e9e2();
            c4394xa89e978e.m37103x30959487().m37196x79d7af9();
            q1Var.f516660a = c4394xa89e978e.m37104xfb888c49();
            q1Var.f516661b = c4394xa89e978e.m37101x2fd5b378();
            q1Var.f516662c = c4394xa89e978e.m37102xfb854d80();
            vc1.p1 p1Var = this.f516527r;
            p1Var.K.a(q1Var, p1Var.f516592J);
            this.f516527r.f516592J = false;
        }
        vc1.p1.f(this.f516527r);
        if (this.f516527r.f516629s == null || this.f516527r.f516629s.m100127xcde25b9().mo100156xc7416b2f(c4394xa89e978e.m37104xfb888c49()).size() <= 0) {
            return;
        }
        java.util.Set mo100156xc7416b2f = ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7) ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68) this.f516527r.f516629s.m100127xcde25b9()).m100164xcde25b9()).mo100156xc7416b2f(c4394xa89e978e.m37104xfb888c49());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster size:%d", java.lang.Integer.valueOf(mo100156xc7416b2f.size()));
        java.util.Iterator it = mo100156xc7416b2f.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster item size:%d", java.lang.Integer.valueOf(((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) it.next()).mo100118x749b8e0a().size()));
        }
    }
}
