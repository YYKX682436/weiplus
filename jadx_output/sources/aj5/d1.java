package aj5;

/* loaded from: classes.dex */
public final class d1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5415f;

    public d1(java.util.HashMap hashMap, aj5.g1 g1Var, wi5.z zVar) {
        this.f5413d = hashMap;
        this.f5414e = g1Var;
        this.f5415f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f5413d;
        hashMap.put(num, vVar);
        aj5.g1 g1Var = this.f5414e;
        j75.f Q6 = g1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f5415f, hashMap, aj5.g1.T6(g1Var, 0, ((java.lang.Boolean) ((jz5.n) g1Var.f5431d).getValue()).booleanValue(), vVar)));
        }
        return jz5.f0.f302826a;
    }
}
