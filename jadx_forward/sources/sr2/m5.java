package sr2;

/* loaded from: classes.dex */
public final class m5 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f493172d;

    public m5(yz5.l lVar) {
        this.f493172d = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostRealNameAuthUIC", "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 30001) {
            yz5.l lVar = this.f493172d;
            if (i18 == -1) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            } else {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }
}
