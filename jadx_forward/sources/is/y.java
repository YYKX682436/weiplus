package is;

/* loaded from: classes11.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f375913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ js.v0 f375915f;

    public y(is.i0 i0Var, android.app.Activity activity, java.lang.String str, js.v0 v0Var) {
        this.f375913d = activity;
        this.f375914e = str;
        this.f375915f = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.Activity activity = this.f375913d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class);
        intent.putExtra("bindmcontact_mobile", this.f375914e);
        intent.putExtra("mobile_verify_purpose", 5);
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, ".plugin.account.ui.MobileVerifyUI", intent, 1, new is.x(this));
    }
}
