package a82;

/* loaded from: classes12.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f2244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f2245e;

    public z(a82.d0 d0Var, o72.e2 e2Var) {
        this.f2244d = d0Var;
        this.f2245e = e2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String field_dataId = this.f2245e.field_dataId;
        kotlin.jvm.internal.o.f(field_dataId, "field_dataId");
        java.lang.Object a76 = a82.d0.a7(this.f2244d, field_dataId, (com.tencent.mm.modelcdntran.n1) obj, continuation);
        return a76 == pz5.a.f359186d ? a76 : jz5.f0.f302826a;
    }
}
