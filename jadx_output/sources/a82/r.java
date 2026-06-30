package a82;

/* loaded from: classes12.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.t f2147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f2148e;

    public r(a82.t tVar, o72.e2 e2Var) {
        this.f2147d = tVar;
        this.f2148e = e2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String field_dataId = this.f2148e.field_dataId;
        kotlin.jvm.internal.o.f(field_dataId, "field_dataId");
        java.lang.Object a76 = a82.t.a7(this.f2147d, field_dataId, (com.tencent.mm.modelcdntran.n1) obj, continuation);
        return a76 == pz5.a.f359186d ? a76 : jz5.f0.f302826a;
    }
}
