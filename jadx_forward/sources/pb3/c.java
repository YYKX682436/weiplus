package pb3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f f434705e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f) {
        this.f434705e = activityC16327xba05db3f;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f = this.f434705e;
        activityC16327xba05db3f.f226587r.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.G(activityC16327xba05db3f.f226588s, 0);
        pb3.a aVar = activityC16327xba05db3f.f226582m;
        if (aVar != null) {
            pb3.k kVar = (pb3.k) aVar;
            int i17 = kVar.f434719g;
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onOpenBtnClick return state = %d", java.lang.Integer.valueOf(i17));
            } else if (kVar.f434713a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "openLuckyMoney ui == null");
            } else {
                new lb3.c(kVar.f434714b, kVar.f434715c, kVar.f434716d).a(new pb3.h(kVar));
            }
        }
    }
}
