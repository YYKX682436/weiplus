package c05;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c05.n f37709d;

    public l(c05.n nVar) {
        this.f37709d = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard dialog lOk");
        c05.n nVar = this.f37709d;
        nVar.f338834b.d(new rs4.a(nVar.f37710c, "1", ""), true);
        at4.y0.a(1);
    }
}
