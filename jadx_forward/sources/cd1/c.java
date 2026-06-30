package cd1;

/* loaded from: classes7.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122148d;

    public c(cd1.i iVar) {
        this.f122148d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "user click cancel button of NFC tips dialog.");
        this.f122148d.e(13001, "system NFC switch not opened");
    }
}
