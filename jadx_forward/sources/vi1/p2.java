package vi1;

/* loaded from: classes7.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f518960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f518962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.app.ProgressDialog progressDialog, vi1.k3 k3Var, boolean z17) {
        super(1);
        this.f518960d = progressDialog;
        this.f518961e = k3Var;
        this.f518962f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.yz5 yz5Var = (r45.yz5) obj;
        this.f518960d.dismiss();
        vi1.k3 k3Var = this.f518961e;
        if (yz5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber SendVerifyCode cgi failed");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.n2(k3Var));
            vi1.k3.a(k3Var, "SendVerifyCode cgi fail");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "SendVerifyCode cgi success");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vi1.o2(this.f518962f, k3Var, yz5Var));
        }
        return jz5.f0.f384359a;
    }
}
