package cj5;

/* loaded from: classes.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f42234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(cj5.u3 u3Var) {
        super(0);
        this.f42234d = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        cj5.u3 u3Var = this.f42234d;
        j75.f Q6 = u3Var.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            boolean z17 = n0Var.f446325u;
            java.lang.String str = n0Var.f446328x;
            if (str == null) {
                str = "";
            }
            cj5.u3.U6(u3Var, z17, str);
        }
        return jz5.f0.f302826a;
    }
}
