package pb3;

/* loaded from: classes9.dex */
public class i implements mb3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f434711a;

    public i(pb3.k kVar) {
        this.f434711a = kVar;
    }

    @Override // mb3.d
    public void a(int i17, android.content.Intent intent) {
        pb3.k kVar = this.f434711a;
        if (i17 != -1) {
            kVar.a(intent);
            return;
        }
        pb3.b bVar = kVar.f434713a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.succeed ui == null");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) bVar).a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d abstractActivityC16322x2b9a639d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) kVar.f434713a;
        abstractActivityC16322x2b9a639d.setResult(-1, new android.content.Intent());
        abstractActivityC16322x2b9a639d.finish();
    }
}
