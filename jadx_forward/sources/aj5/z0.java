package aj5;

/* loaded from: classes.dex */
public final class z0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f87063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f87065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f87066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f87067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f87068i;

    public z0(java.util.HashMap hashMap, int i17, aj5.g1 g1Var, wi5.z zVar, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f87063d = hashMap;
        this.f87064e = i17;
        this.f87065f = g1Var;
        this.f87066g = zVar;
        this.f87067h = list;
        this.f87068i = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        int i17 = this.f87064e;
        this.f87063d.put(new java.lang.Integer(i17), vVar);
        java.util.List T6 = aj5.g1.T6(this.f87065f, i17, this.f87066g.f527902d, vVar);
        java.util.List list = this.f87067h;
        list.addAll(T6);
        java.lang.Object mo771x2f8fd3 = this.f87068i.mo771x2f8fd3(kz5.n0.S0(list), interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
    }
}
