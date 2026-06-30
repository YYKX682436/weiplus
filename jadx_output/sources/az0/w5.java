package az0;

/* loaded from: classes5.dex */
public final class w5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f16014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f16015e;

    public w5(kotlin.jvm.internal.e0 e0Var, kotlinx.coroutines.flow.k kVar) {
        this.f16014d = e0Var;
        this.f16015e = kVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f16014d.f310115d = floatValue;
        java.lang.Object emit = this.f16015e.emit(new java.lang.Float(floatValue), continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
