package zs4;

/* loaded from: classes.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f556842f;

    public n(java.lang.String str, android.app.Activity activity, boolean z17) {
        this.f556840d = str;
        this.f556841e = activity;
        this.f556842f = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f556840d);
        intent.putExtra("showShare", false);
        android.app.Activity activity = this.f556841e;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activity, intent);
        dialogInterface.dismiss();
        if (this.f556842f) {
            activity.finish();
        }
    }
}
