package lz2;

/* loaded from: classes14.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 f403882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79) {
        super(false);
        this.f403882d = dialogC15522xdfb03a79;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        lz2.w wVar = this.f403882d.f218526n;
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "click right btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79 = wVar.f403890d;
        dialogC15522xdfb03a79.f218521f.setEnabled(false);
        dialogC15522xdfb03a79.f218520e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8r);
        dialogC15522xdfb03a79.f218520e.post(new lz2.r(dialogC15522xdfb03a79));
        wVar.c();
    }
}
