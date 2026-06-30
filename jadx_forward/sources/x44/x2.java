package x44;

/* loaded from: classes4.dex */
public final class x2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f533461a;

    public x2(yz5.p pVar) {
        this.f533461a = pVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
        yz5.p pVar = this.f533461a;
        if (i17 == 0 && i18 == 0) {
            try {
                fVar = oVar.f152244b.f152233a;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ServiceChat", "there is a exception in " + e17.getMessage());
                pVar.mo149xb9724478(1, "");
            }
            if (fVar != null) {
                if (fVar instanceof r45.qo3) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoResponse");
                    java.lang.String subBusinessUsername = ((r45.qo3) fVar).f465680d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subBusinessUsername, "subBusinessUsername");
                    pVar.mo149xb9724478(0, subBusinessUsername);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ServiceChat", "the type of response is not GetSubBusinessInfoResponse");
                    pVar.mo149xb9724478(1, "");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ServiceChat", "the getSubBusinessInfo error the error code is " + i18);
        pVar.mo149xb9724478(1, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$getSubBusinessInfo$1");
    }
}
