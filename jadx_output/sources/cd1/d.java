package cd1;

/* loaded from: classes7.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40616d;

    public d(cd1.i iVar) {
        this.f40616d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "cancel by pressing back");
        this.f40616d.e(13001, "system NFC switch not opened");
    }
}
