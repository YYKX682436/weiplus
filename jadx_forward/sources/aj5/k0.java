package aj5;

/* loaded from: classes.dex */
public final class k0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f86991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f86992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f86993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86995i;

    public k0(java.util.HashMap hashMap, int i17, aj5.r0 r0Var, wi5.z zVar, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f86990d = hashMap;
        this.f86991e = i17;
        this.f86992f = r0Var;
        this.f86993g = zVar;
        this.f86994h = list;
        this.f86995i = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        int i17 = this.f86991e;
        this.f86990d.put(new java.lang.Integer(i17), vVar);
        java.util.List T6 = aj5.r0.T6(this.f86992f, i17, this.f86993g.f527902d, vVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f86994h;
        list.addAll(T6);
        arrayList.addAll(list);
        java.lang.Object mo771x2f8fd3 = this.f86995i.mo771x2f8fd3(arrayList, interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
    }
}
