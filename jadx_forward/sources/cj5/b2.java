package cj5;

/* loaded from: classes.dex */
public final class b2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.i0 f123608e;

    public b2(cj5.l2 l2Var, wi5.i0 i0Var) {
        this.f123607d = l2Var;
        this.f123608e = i0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ym3.o oVar = (ym3.o) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "loadStateSharedFlow loadState:" + oVar.f544710a);
        if (oVar.f544710a == ym3.p.f544712d) {
            cj5.l2 l2Var = this.f123607d;
            l2Var.Y6().k().post(new cj5.a2(this.f123608e, l2Var));
        }
        return jz5.f0.f384359a;
    }
}
