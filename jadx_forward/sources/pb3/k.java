package pb3;

/* loaded from: classes9.dex */
public class k implements pb3.a {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f434716d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b25 f434717e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 f434718f;

    /* renamed from: a, reason: collision with root package name */
    public pb3.b f434713a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f434714b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f434715c = null;

    /* renamed from: g, reason: collision with root package name */
    public int f434719g = -1;

    public final void a(android.content.Intent intent) {
        pb3.b bVar = this.f434713a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.fail ui == null");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f) bVar).a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d abstractActivityC16322x2b9a639d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) this.f434713a;
        abstractActivityC16322x2b9a639d.setResult(0, intent);
        abstractActivityC16322x2b9a639d.finish();
    }

    public final void b() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_sendid", this.f434715c);
        intent.putExtra("key_appid", this.f434714b);
        if (this.f434717e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                bundle.putByteArray("key_data", this.f434717e.mo14344x5f01b1f6());
                intent.putExtras(bundle);
                intent.putExtra("key_from", "value_open");
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxaReceiveLuckyMoneyLogic", e17, "goLuckyMoneyDetailUI WxaDetailResponse putByteArray error", new java.lang.Object[0]);
                a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{byte detail response fail}}"));
                return;
            }
        } else {
            intent.putExtra("key_from", "value_query");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) this.f434713a).T6(nb3.b.class, intent, new pb3.i(this));
    }
}
