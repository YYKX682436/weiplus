package vc1;

/* loaded from: classes13.dex */
public class t implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516705a;

    public t(vc1.p1 p1Var) {
        this.f516705a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
    /* renamed from: onInfoWindowClick */
    public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onInfoWindowClick");
        if (interfaceC4409x88f1805a == null) {
            return;
        }
        java.lang.String str = (java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064();
        vc1.p1 p1Var = this.f516705a;
        vc1.o1 z17 = p1Var.z(str);
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s appbrandMarker is null, return", this);
            return;
        }
        vc1.d2 d2Var = p1Var.f516605g;
        if (d2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s mapCalloutClick is null, return", this);
        } else {
            d2Var.a(z17);
        }
    }
}
