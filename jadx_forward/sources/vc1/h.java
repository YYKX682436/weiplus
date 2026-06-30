package vc1;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f516504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516505e;

    public h(vc1.p1 p1Var, float f17) {
        this.f516505e = p1Var;
        this.f516504d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17 = this.f516504d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s zoomTo scale:%f", this, java.lang.Float.valueOf(f17));
        vc1.p1 p1Var = this.f516505e;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo98897xb5885626 = p1Var.f516601e.mo98897xb5885626();
        if (mo98897xb5885626 != null) {
            p1Var.f516592J = false;
            mo98897xb5885626.mo98953x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98893xd67f85ae(f17), vc1.p1.F0, p1Var.T);
        }
    }
}
