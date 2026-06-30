package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes13.dex */
public class c1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226304a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226304a = x1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource
    /* renamed from: getMyLocation */
    public android.location.Location mo14571x7b085d77() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226304a;
        android.location.Location location = x1Var.M1;
        if (location == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPoiMapUI", "get MyLocation latit:%f, longtitude:%f", java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(x1Var.M1.getLongitude()));
        return x1Var.M1;
    }
}
