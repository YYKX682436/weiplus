package vi1;

/* loaded from: classes7.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f519048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f519049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(android.app.ProgressDialog progressDialog, vi1.k3 k3Var) {
        super(1);
        this.f519048d = progressDialog;
        this.f519049e = k3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.x20 x20Var = (r45.x20) obj;
        this.f519048d.dismiss();
        vi1.k3 k3Var = this.f519049e;
        if (x20Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber checkVerifyCode cgi fail");
            vi1.k3.a(k3Var, "checkVerifyCode cgi fail");
            vi1.j2 j2Var = k3Var.f518919c;
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518910z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                j2Var.f518910z = valueOf.longValue() + 1;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.x2(k3Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "checkVerifyCode success");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.y2(k3Var, x20Var));
        }
        return jz5.f0.f384359a;
    }
}
