package aj5;

/* loaded from: classes.dex */
public final class z0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5535i;

    public z0(java.util.HashMap hashMap, int i17, aj5.g1 g1Var, wi5.z zVar, java.util.List list, kotlinx.coroutines.flow.i2 i2Var) {
        this.f5530d = hashMap;
        this.f5531e = i17;
        this.f5532f = g1Var;
        this.f5533g = zVar;
        this.f5534h = list;
        this.f5535i = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        int i17 = this.f5531e;
        this.f5530d.put(new java.lang.Integer(i17), vVar);
        java.util.List T6 = aj5.g1.T6(this.f5532f, i17, this.f5533g.f446369d, vVar);
        java.util.List list = this.f5534h;
        list.addAll(T6);
        java.lang.Object emit = this.f5535i.emit(kz5.n0.S0(list), continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
