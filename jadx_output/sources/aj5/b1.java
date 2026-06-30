package aj5;

/* loaded from: classes.dex */
public final class b1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5400f;

    public b1(aj5.g1 g1Var, wi5.z zVar, java.util.HashMap hashMap) {
        this.f5398d = g1Var;
        this.f5399e = zVar;
        this.f5400f = hashMap;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list = (java.util.List) obj;
        j75.f Q6 = this.f5398d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f5399e, this.f5400f, list));
        }
        return jz5.f0.f302826a;
    }
}
