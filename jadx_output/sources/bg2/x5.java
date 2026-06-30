package bg2;

/* loaded from: classes2.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(bg2.q6 q6Var, android.content.Context context) {
        super(1);
        this.f20649d = q6Var;
        this.f20650e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        bg2.q6 q6Var = this.f20649d;
        com.tencent.mars.xlog.Log.i(q6Var.f20413e, "toast view dismiss after " + q6Var.f20416h);
        if (!bd2.r.f19284a.b()) {
            q6Var.getClass();
            com.tencent.mars.xlog.Log.i(q6Var.f20413e, "[notifyRemoveFeed] scene:ToastView-StayAfter");
            pm0.v.X(new bg2.f6(null, this.f20650e, q6Var, true));
        }
        return jz5.f0.f302826a;
    }
}
