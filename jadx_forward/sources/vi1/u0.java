package vi1;

/* loaded from: classes7.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f518995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f518996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vi1.b1 b1Var, android.app.ProgressDialog progressDialog) {
        super(1);
        this.f518995d = b1Var;
        this.f518996e = progressDialog;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.yz5 yz5Var = (r45.yz5) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendSms success");
        sb6.append(yz5Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.b1 b1Var = this.f518995d;
        if (yz5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", "sendSms:%d", java.lang.Integer.valueOf(yz5Var.f473071d));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.r0(yz5Var, b1Var));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.s0(b1Var));
        }
        ik1.h0.b(new vi1.t0(this.f518996e));
        return jz5.f0.f384359a;
    }
}
