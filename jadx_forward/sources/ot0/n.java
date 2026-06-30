package ot0;

/* loaded from: classes9.dex */
public class n extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f430126b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f430127c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430128d;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.n();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        int i17 = qVar.f430199i;
        if (i17 == 2000 || i17 == 2011) {
            this.f430126b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wcpayinfo.has_transfer_address"), 0);
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.receiver_username");
            if (str == null) {
                str = "";
            }
            this.f430127c = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.payer_username");
            this.f430128d = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentTransferMsgPiece", "hasTransferAddress: %s", java.lang.Integer.valueOf(this.f430126b));
        }
    }
}
