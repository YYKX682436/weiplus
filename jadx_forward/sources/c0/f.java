package c0;

/* loaded from: classes14.dex */
public final class f implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f118464e;

    public f(java.util.List list, n0.v2 v2Var) {
        this.f118463d = list;
        this.f118464e = v2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.d;
        java.util.List list = this.f118463d;
        if (z17) {
            list.add(mVar);
        } else if (mVar instanceof c0.e) {
            list.remove(((c0.e) mVar).f118462a);
        }
        this.f118464e.mo148714x53d8522f(java.lang.Boolean.valueOf(!list.isEmpty()));
        return jz5.f0.f384359a;
    }
}
