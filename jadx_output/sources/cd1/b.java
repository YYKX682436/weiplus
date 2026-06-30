package cd1;

/* loaded from: classes7.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40614d;

    public b(cd1.i iVar) {
        this.f40614d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        cd1.i iVar = this.f40614d;
        if (iVar.f40629g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "jumpNFCSetting mHceActivity is null");
        } else {
            nf.g.a(iVar.f40629g).j(new android.content.Intent("android.settings.NFC_SETTINGS"), new cd1.e(iVar));
        }
    }
}
