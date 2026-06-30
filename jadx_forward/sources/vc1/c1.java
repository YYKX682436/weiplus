package vc1;

/* loaded from: classes13.dex */
public class c1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516455a;

    public c1(vc1.p1 p1Var) {
        this.f516455a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener
    /* renamed from: onClicked */
    public void mo14568x82f09148(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4408x88f0336e c4408x88f0336e) {
        vc1.p1 p1Var = this.f516455a;
        if (p1Var.I != null) {
            vc1.m2 m2Var = new vc1.m2();
            m2Var.f516545a = c4408x88f0336e.m37226xa86cd69f().m37195x2605e9e2();
            m2Var.f516546b = c4408x88f0336e.m37226xa86cd69f().m37196x79d7af9();
            m2Var.f516547c = c4408x88f0336e.m37225xfb82e301();
            if (c4408x88f0336e instanceof com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4404x46253a1) {
                com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4404x46253a1 c4404x46253a1 = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4404x46253a1) c4408x88f0336e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c4404x46253a1.m37183xd2c0f6e5())) {
                    m2Var.f516548d = c4404x46253a1.m37183xd2c0f6e5();
                    m2Var.f516549e = c4404x46253a1.m37185x99599e01();
                }
            }
            p1Var.I.a(m2Var);
        }
    }
}
