package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class f5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.o3 f10563d;

    public f5(androidx.compose.ui.platform.o3 o3Var) {
        this.f10563d = o3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ((n0.q4) this.f10563d.f10676d).setValue(java.lang.Float.valueOf(floatValue));
        return jz5.f0.f302826a;
    }
}
