package bg2;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(bg2.x0 x0Var) {
        super(0);
        this.f20345d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cg2.k kVar;
        bg2.x0 x0Var = this.f20345d;
        if (x0Var.f20619n && (kVar = x0Var.f20616h) != null) {
            kVar.setReuse(false);
        }
        return jz5.f0.f302826a;
    }
}
