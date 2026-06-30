package cd1;

/* loaded from: classes7.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40615d;

    public c(cd1.i iVar) {
        this.f40615d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "user click cancel button of NFC tips dialog.");
        this.f40615d.e(13001, "system NFC switch not opened");
    }
}
