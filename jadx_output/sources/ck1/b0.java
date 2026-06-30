package ck1;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f42307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ck1.y0 y0Var) {
        super(0);
        this.f42307d = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ck1.u0 u0Var = (ck1.u0) this.f42307d;
        int y17 = ((int) u0Var.f42388g.getY()) + u0Var.f42388g.getMeasuredHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "invoke#measuredHeightResolver, titleHeight: " + y17);
        return java.lang.Integer.valueOf(y17);
    }
}
