package vi1;

/* loaded from: classes7.dex */
public final class i3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518871d;

    public i3(vi1.k3 k3Var) {
        this.f518871d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "cancel to verify sms");
        dialogInterface.dismiss();
        vi1.k3 k3Var = this.f518871d;
        k3Var.g();
        vi1.k3.a(k3Var, "user cancel");
        android.view.View view = k3Var.f518922f;
        if (view != null) {
            view.post(new vi1.b3(k3Var));
        }
    }
}
