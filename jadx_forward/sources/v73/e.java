package v73;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344) {
        super(false);
        this.f515217d = activityC16099xbf243344;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515217d;
        r45.n75 n75Var = activityC16099xbf243344.H;
        if (n75Var != null) {
            java.lang.String str = activityC16099xbf243344.f223793d;
            boolean z17 = n75Var.f462672i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16099xbf243344.L)) {
                int hashCode = activityC16099xbf243344.hashCode() & 65535;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16099xbf243344.f223793d, "show kinda select payment, requestCode:%d", java.lang.Integer.valueOf(hashCode));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("appId", activityC16099xbf243344.f223819J);
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, activityC16099xbf243344.L);
                h45.a0.h(activityC16099xbf243344, "selectPayment", hashMap, hashCode, new v73.h(activityC16099xbf243344, hashCode));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16099xbf243344.f223793d, "show select payway dialog");
            activityC16099xbf243344.mo73913x2b33b77f();
            at4.y1 y1Var = activityC16099xbf243344.T;
            if (y1Var != null) {
                at4.c2.f95349d.d(y1Var);
            }
            at4.y1 y1Var2 = new at4.y1(26, false, true, new v73.j(activityC16099xbf243344));
            activityC16099xbf243344.T = y1Var2;
            at4.c2 c2Var = at4.c2.f95349d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "fetch bind query data: " + y1Var2);
            if (y1Var2.f95550b) {
                y1Var2.f95552d.mo146xb9724478(c2Var.a(y1Var2.f95549a, null, at4.a2.f95339d, true));
                if (y1Var2.f95551c) {
                    c2Var.b(y1Var2);
                }
            } else {
                c2Var.b(y1Var2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 1, 0, 0, 0);
        }
    }
}
