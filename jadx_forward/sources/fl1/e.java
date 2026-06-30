package fl1;

/* loaded from: classes7.dex */
public class e implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.f f345282d;

    public e(fl1.k kVar, fl1.f fVar) {
        this.f345282d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        this.f345282d.a(3, null);
    }
}
