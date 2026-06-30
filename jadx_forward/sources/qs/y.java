package qs;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.fl flVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf c5744xa2fd12cf = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf) abstractC20979x809547d1;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        if (c5744xa2fd12cf == null || (flVar = c5744xa2fd12cf.f136067g) == null) {
            return false;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        wi6.f552066d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiWeixinData", "wechat notification event talker[%s] unreadCount[%d] silence[%b]", flVar.f88216a, java.lang.Integer.valueOf(flVar.f88217b), java.lang.Boolean.valueOf(flVar.f88218c));
        return false;
    }
}
