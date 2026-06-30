package b92;

/* loaded from: classes10.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(b92.v1 v1Var, java.lang.String str) {
        super(0);
        this.f18479d = v1Var;
        this.f18480e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b92.v1 v1Var = this.f18479d;
        long j17 = v1Var.f18533r;
        java.lang.String str = this.f18480e;
        java.lang.String wi6 = b92.v1.wi(v1Var, str, "getSimpleDns");
        if ((wi6.length() > 0) && j17 == v1Var.f18533r) {
            v1Var.f18525g.put(str, wi6);
            pm0.v.H(v1Var.f18526h, new b92.l1(str));
        }
        return jz5.f0.f302826a;
    }
}
