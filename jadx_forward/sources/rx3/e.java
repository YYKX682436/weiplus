package rx3;

/* loaded from: classes10.dex */
public final class e implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f482555d;

    public e(java.util.ArrayList arrayList) {
        this.f482555d = arrayList;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ox3.a aVar = (ox3.a) obj;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar.f431254d.f497121d);
            this.f482555d.add(aVar);
        }
        return jz5.f0.f384359a;
    }
}
