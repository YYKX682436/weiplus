package vc1;

/* loaded from: classes13.dex */
public class d1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516486a;

    public d1(vc1.p1 p1Var) {
        this.f516486a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingDeactivated */
    public boolean mo65975xf3e3a8aa() {
        vc1.p1 p1Var = this.f516486a;
        if (p1Var.M == null) {
            return true;
        }
        vc1.v1 v1Var = new vc1.v1();
        v1Var.f516719a = "";
        v1Var.f516720b = "";
        v1Var.f516721c = new java.util.LinkedList();
        v1Var.f516722d = -1;
        p1Var.N = v1Var;
        p1Var.M.a(v1Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingFocused */
    public boolean mo65976xa4a722b1() {
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorLevelActivated */
    public boolean mo65977xc2ec745f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 c4401x15ff5647) {
        vc1.p1 p1Var = this.f516486a;
        if (p1Var.M == null) {
            return true;
        }
        vc1.v1 v1Var = new vc1.v1();
        v1Var.f516719a = c4401x15ff5647.m37175x3935e1d5();
        v1Var.f516720b = c4401x15ff5647.m37176x266119d5();
        v1Var.f516721c = new java.util.LinkedList();
        for (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1 c4403x18de38d1 : c4401x15ff5647.m37177x2328f865()) {
            vc1.w1 w1Var = new vc1.w1();
            w1Var.f516725a = c4403x18de38d1.m37182xfb82e301();
            v1Var.f516721c.add(w1Var);
        }
        v1Var.f516722d = c4401x15ff5647.m37174xd84262ca();
        p1Var.N = v1Var;
        p1Var.M.a(v1Var);
        return true;
    }
}
