package aj5;

/* loaded from: classes.dex */
public final class k0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5462i;

    public k0(java.util.HashMap hashMap, int i17, aj5.r0 r0Var, wi5.z zVar, java.util.List list, kotlinx.coroutines.flow.i2 i2Var) {
        this.f5457d = hashMap;
        this.f5458e = i17;
        this.f5459f = r0Var;
        this.f5460g = zVar;
        this.f5461h = list;
        this.f5462i = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        int i17 = this.f5458e;
        this.f5457d.put(new java.lang.Integer(i17), vVar);
        java.util.List T6 = aj5.r0.T6(this.f5459f, i17, this.f5460g.f446369d, vVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f5461h;
        list.addAll(T6);
        arrayList.addAll(list);
        java.lang.Object emit = this.f5462i.emit(arrayList, continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
