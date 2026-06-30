package v62;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v62.l f515050a;

    public k(v62.l lVar) {
        this.f515050a = lVar;
    }

    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQrCodeHandler", "hy: result: %s, code type: %d, code version: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        v62.l lVar = this.f515050a;
        if (!K0) {
            lVar.c(new v62.o(i17, str, i18));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved result!");
            lVar.c(null);
        }
    }
}
