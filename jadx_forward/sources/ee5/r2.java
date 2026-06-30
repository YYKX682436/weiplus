package ee5;

/* loaded from: classes9.dex */
public final class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.t2 f333565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f333567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f333568g;

    public r2(ee5.t2 t2Var, int i17, java.util.Set set, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f333565d = t2Var;
        this.f333566e = i17;
        this.f333567f = set;
        this.f333568g = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ee5.t2 t2Var = this.f333565d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t2Var.f333581d, "delete message");
        de5.a.f310929a.c(19, this.f333566e);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i3.a(t2Var.m158354x19263085(), this.f333567f, new ee5.q2(this.f333568g, t2Var));
    }
}
