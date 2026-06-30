package aa3;

/* loaded from: classes9.dex */
public final class v0 implements com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa3.x0 f2607a;

    public v0(aa3.x0 x0Var) {
        this.f2607a = x0Var;
    }

    @Override // com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener
    public final void onInputChanged() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "secureEditText input change callback");
        this.f2607a.v();
    }
}
