package dk2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f315793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(dk2.g0 g0Var) {
        super(1);
        this.f315793d = g0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dk2.g0 g0Var = this.f315793d;
        if (g0Var.f315003c != 2 && (b4Var = g0Var.f315014n) != null) {
            b4Var.d();
        }
        dk2.g0.c(g0Var, booleanValue);
        return jz5.f0.f384359a;
    }
}
