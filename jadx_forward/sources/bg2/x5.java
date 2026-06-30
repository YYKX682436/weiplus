package bg2;

/* loaded from: classes2.dex */
public final class x5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f102182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(bg2.q6 q6Var, android.content.Context context) {
        super(1);
        this.f102182d = q6Var;
        this.f102183e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        bg2.q6 q6Var = this.f102182d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q6Var.f101946e, "toast view dismiss after " + q6Var.f101949h);
        if (!bd2.r.f100817a.b()) {
            q6Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q6Var.f101946e, "[notifyRemoveFeed] scene:ToastView-StayAfter");
            pm0.v.X(new bg2.f6(null, this.f102183e, q6Var, true));
        }
        return jz5.f0.f384359a;
    }
}
