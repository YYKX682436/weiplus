package cd1;

/* loaded from: classes7.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122149d;

    public d(cd1.i iVar) {
        this.f122149d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "cancel by pressing back");
        this.f122149d.e(13001, "system NFC switch not opened");
    }
}
