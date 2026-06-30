package zs4;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556812e;

    public c(boolean z17, android.app.Activity activity) {
        this.f556811d = z17;
        this.f556812e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
        dialogInterface.dismiss();
        if (this.f556811d) {
            this.f556812e.finish();
        }
    }
}
