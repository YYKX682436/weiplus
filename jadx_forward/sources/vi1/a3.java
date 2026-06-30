package vi1;

/* loaded from: classes7.dex */
public final class a3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518804d;

    public a3(vi1.k3 k3Var) {
        this.f518804d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "verify code is error, do send the right code");
        vi1.k3.d(this.f518804d);
    }
}
