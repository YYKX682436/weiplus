package c0;

/* loaded from: classes14.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f36936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f36937e;

    public k(java.util.List list, n0.v2 v2Var) {
        this.f36936d = list;
        this.f36937e = v2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.i;
        java.util.List list = this.f36936d;
        if (z17) {
            list.add(mVar);
        } else if (mVar instanceof c0.j) {
            list.remove(((c0.j) mVar).f36935a);
        }
        this.f36937e.setValue(java.lang.Boolean.valueOf(!list.isEmpty()));
        return jz5.f0.f302826a;
    }
}
