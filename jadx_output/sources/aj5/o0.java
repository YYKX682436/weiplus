package aj5;

/* loaded from: classes.dex */
public final class o0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5489f;

    public o0(java.util.HashMap hashMap, aj5.r0 r0Var, wi5.z zVar) {
        this.f5487d = hashMap;
        this.f5488e = r0Var;
        this.f5489f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f5487d;
        hashMap.put(num, vVar);
        aj5.r0 r0Var = this.f5488e;
        j75.f Q6 = r0Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f5489f, hashMap, aj5.r0.T6(r0Var, 0, ((java.lang.Boolean) ((jz5.n) r0Var.f5503d).getValue()).booleanValue(), vVar)));
        }
        return jz5.f0.f302826a;
    }
}
