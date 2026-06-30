package lz2;

/* loaded from: classes14.dex */
public class o extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 f403881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79) {
        super(false);
        this.f403881d = dialogC15522xdfb03a79;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79 = this.f403881d;
        lz2.w wVar = dialogC15522xdfb03a79.f218526n;
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "click left btn");
        if (wVar.f403895i) {
            wVar.b(-1);
        } else {
            wVar.a();
        }
        dialogC15522xdfb03a79.dismiss();
    }
}
