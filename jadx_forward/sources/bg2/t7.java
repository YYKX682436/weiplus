package bg2;

/* loaded from: classes2.dex */
public final class t7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f102063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lu5 f102064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(bg2.l8 l8Var, r45.lu5 lu5Var, android.content.Context context) {
        super(1);
        this.f102063d = l8Var;
        this.f102064e = lu5Var;
        this.f102065f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        bg2.l8 l8Var = this.f102063d;
        java.lang.String str = l8Var.f101807e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toast view dismiss after ");
        sb6.append(l8Var.f101816q);
        sb6.append(", subType:");
        r45.lu5 lu5Var = this.f102064e;
        sb6.append(lu5Var.m75939xb282bd08(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (lu5Var.m75939xb282bd08(0) != 1) {
            l8Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l8Var.f101807e, "[notifyRemoveFeed] scene:ToastView-StayAfter");
            pm0.v.X(new bg2.z7(null, this.f102065f, l8Var, true));
        }
        return jz5.f0.f384359a;
    }
}
