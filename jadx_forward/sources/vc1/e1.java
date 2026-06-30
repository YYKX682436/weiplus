package vc1;

/* loaded from: classes13.dex */
public class e1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516490a;

    public e1(vc1.p1 p1Var) {
        this.f516490a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener
    /* renamed from: onPolylineClick */
    public void mo14569xbcfe5009(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 interfaceC26078x2558e5e0, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onPolylineClick id:%s", interfaceC26078x2558e5e0.mo36409x5db1b11());
        vc1.p1 p1Var = this.f516490a;
        if (p1Var.f516639x == null || c26041x873d1d26 == null) {
            return;
        }
        vc1.y1 y1Var = new vc1.y1(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af);
        if (!((java.util.concurrent.ConcurrentHashMap) p1Var.X).containsKey(interfaceC26078x2558e5e0.mo36409x5db1b11())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "not exist id:%s in polyLinesInnerIdMapOuterId", interfaceC26078x2558e5e0.mo36409x5db1b11());
            return;
        }
        p1Var.f516639x.a((java.lang.String) ((java.util.concurrent.ConcurrentHashMap) p1Var.X).get(interfaceC26078x2558e5e0.mo36409x5db1b11()), y1Var);
    }
}
