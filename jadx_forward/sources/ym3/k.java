package ym3;

/* loaded from: classes.dex */
public final class k implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.d f544695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.n f544696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.c f544697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f544698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.i f544699h;

    public k(ym3.d dVar, ym3.n nVar, ym3.c cVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, v65.i iVar) {
        this.f544695d = dVar;
        this.f544696e = nVar;
        this.f544697f = cVar;
        this.f544698g = i2Var;
        this.f544699h = iVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object mo771x2f8fd3;
        ym3.d dVar = (ym3.d) obj;
        ym3.d dVar2 = this.f544695d;
        dVar2.f544682c.addAll(dVar.f544682c);
        dVar2.f544681b = true;
        boolean z17 = dVar.f544681b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.f544698g;
        if (z17) {
            mo771x2f8fd3 = i2Var.mo771x2f8fd3(dVar2, interfaceC29045xdcb5ca57);
            if (mo771x2f8fd3 != pz5.a.f440719d) {
                return f0Var;
            }
        } else {
            ym3.n nVar = this.f544696e;
            int i17 = nVar.f544708e + 1;
            nVar.f544708e = i17;
            java.util.HashMap hashMap = nVar.f544709f;
            boolean containsKey = hashMap.containsKey(new java.lang.Integer(i17));
            ym3.c cVar = this.f544697f;
            if (!containsKey) {
                hashMap.put(new java.lang.Integer(nVar.f544708e), new java.lang.Integer(cVar.f544677b + dVar.f544682c.size()));
            }
            java.util.ArrayList arrayList = dVar2.f544682c;
            if (arrayList.size() >= cVar.f544678c) {
                mo771x2f8fd3 = i2Var.mo771x2f8fd3(dVar2, interfaceC29045xdcb5ca57);
                if (mo771x2f8fd3 != pz5.a.f440719d) {
                    return f0Var;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MergeDataSource", "continue to request next datasource:" + nVar.f544708e);
                mo771x2f8fd3 = ym3.n.d(this.f544696e, this.f544699h, new ym3.c(cVar.f544676a, 0, cVar.f544678c - arrayList.size(), null, 8, null), this.f544695d, this.f544698g, interfaceC29045xdcb5ca57);
                if (mo771x2f8fd3 != pz5.a.f440719d) {
                    return f0Var;
                }
            }
        }
        return mo771x2f8fd3;
    }
}
