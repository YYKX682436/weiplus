package lz2;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.i f403870d;

    public h(lz2.i iVar) {
        this.f403870d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        lz2.i iVar = this.f403870d;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        iVar.f403879d.finish();
    }
}
