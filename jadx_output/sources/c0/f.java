package c0;

/* loaded from: classes14.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f36930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f36931e;

    public f(java.util.List list, n0.v2 v2Var) {
        this.f36930d = list;
        this.f36931e = v2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.d;
        java.util.List list = this.f36930d;
        if (z17) {
            list.add(mVar);
        } else if (mVar instanceof c0.e) {
            list.remove(((c0.e) mVar).f36929a);
        }
        this.f36931e.setValue(java.lang.Boolean.valueOf(!list.isEmpty()));
        return jz5.f0.f302826a;
    }
}
