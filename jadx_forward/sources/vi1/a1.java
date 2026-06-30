package vi1;

/* loaded from: classes7.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f518799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f518800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f518802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(vi1.b1 b1Var, boolean z17, java.lang.String str, android.app.ProgressDialog progressDialog) {
        super(1);
        this.f518799d = b1Var;
        this.f518800e = z17;
        this.f518801f = str;
        this.f518802g = progressDialog;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.x20 x20Var = (r45.x20) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verifyCode success:");
        sb6.append(x20Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.b1 b1Var = this.f518799d;
        if (x20Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", "checkVerifyCode:%d", java.lang.Integer.valueOf(x20Var.f471223d));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.x0(x20Var, b1Var, this.f518800e, this.f518801f));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.y0(b1Var));
        }
        ik1.h0.b(new vi1.z0(this.f518802g));
        return jz5.f0.f384359a;
    }
}
