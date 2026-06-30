package ed4;

/* loaded from: classes4.dex */
public class r implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 f332855a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 m0Var) {
        this.f332855a = m0Var;
    }

    @Override // b94.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 m0Var = this.f332855a;
        m0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        int i17 = 0;
        while (true) {
            try {
                if (i17 >= com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm.f252062d[2]) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 m70599xcb16a3ea = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) m0Var.f250921y.T.findViewById(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm.f252066h[i17])).m70599xcb16a3ea();
                if (m70599xcb16a3ea != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.PhotoTimeLineItem", "doOnShake, succ");
                    m70599xcb16a3ea.performClick();
                    break;
                }
                i17++;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.PhotoTimeLineItem", "doOnShake, exp=" + e17);
                ca4.q.c("doOnShake, photoAdItem", e17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.PhotoTimeLineItem", "doOnShake, failed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$4");
    }
}
