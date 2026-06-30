package bg2;

/* loaded from: classes2.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lu5 f20531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(bg2.l8 l8Var, r45.lu5 lu5Var, android.content.Context context) {
        super(1);
        this.f20530d = l8Var;
        this.f20531e = lu5Var;
        this.f20532f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        bg2.l8 l8Var = this.f20530d;
        java.lang.String str = l8Var.f20274e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toast view dismiss after ");
        sb6.append(l8Var.f20283q);
        sb6.append(", subType:");
        r45.lu5 lu5Var = this.f20531e;
        sb6.append(lu5Var.getInteger(0));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (lu5Var.getInteger(0) != 1) {
            l8Var.getClass();
            com.tencent.mars.xlog.Log.i(l8Var.f20274e, "[notifyRemoveFeed] scene:ToastView-StayAfter");
            pm0.v.X(new bg2.z7(null, this.f20532f, l8Var, true));
        }
        return jz5.f0.f302826a;
    }
}
