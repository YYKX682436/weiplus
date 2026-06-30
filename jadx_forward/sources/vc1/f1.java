package vc1;

/* loaded from: classes13.dex */
public class f1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516498a;

    public f1(vc1.p1 p1Var) {
        this.f516498a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener
    /* renamed from: onCollisionHidden */
    public void mo99163x1d64739d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden");
        if (interfaceC26059x88f1805a == null || interfaceC26059x88f1805a.mo36399xb5887064() == null) {
            return;
        }
        java.lang.String str = (java.lang.String) interfaceC26059x88f1805a.mo36399xb5887064();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden markerId:%s", str);
        vc1.p1 p1Var = this.f516498a;
        if (p1Var.z(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden map:%s TencentMarker is null, return", this);
        } else if (p1Var.f516641y != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            p1Var.f516641y.b(arrayList);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener
    /* renamed from: onCollisionShown */
    public void mo99164x1a53a4be(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown");
        if (interfaceC26059x88f1805a == null || interfaceC26059x88f1805a.mo36399xb5887064() == null) {
            return;
        }
        java.lang.String str = (java.lang.String) interfaceC26059x88f1805a.mo36399xb5887064();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown markerId:%s", str);
        vc1.p1 p1Var = this.f516498a;
        if (p1Var.z(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown map:%s TencentMarker is null, return", this);
        } else if (p1Var.f516641y != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            p1Var.f516641y.a(arrayList);
        }
    }
}
