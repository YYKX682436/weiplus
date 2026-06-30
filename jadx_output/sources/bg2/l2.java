package bg2;

/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f20265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(bg2.n2 n2Var) {
        super(1);
        this.f20265d = n2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bg2.n2 n2Var = this.f20265d;
        com.tencent.mars.xlog.Log.i(n2Var.f20322e, "invokeOnCancellation");
        n2Var.a7();
        return jz5.f0.f302826a;
    }
}
