package aj5;

/* loaded from: classes.dex */
public final class m0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5477f;

    public m0(aj5.r0 r0Var, wi5.z zVar, java.util.HashMap hashMap) {
        this.f5475d = r0Var;
        this.f5476e = zVar;
        this.f5477f = hashMap;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list = (java.util.List) obj;
        j75.f Q6 = this.f5475d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f5476e, this.f5477f, list));
        }
        return jz5.f0.f302826a;
    }
}
