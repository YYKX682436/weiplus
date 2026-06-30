package cd1;

/* loaded from: classes7.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122147d;

    public b(cd1.i iVar) {
        this.f122147d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        cd1.i iVar = this.f122147d;
        if (iVar.f122162g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "jumpNFCSetting mHceActivity is null");
        } else {
            nf.g.a(iVar.f122162g).j(new android.content.Intent("android.settings.NFC_SETTINGS"), new cd1.e(iVar));
        }
    }
}
