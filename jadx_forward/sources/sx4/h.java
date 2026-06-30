package sx4;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx4.q f495143a;

    public h(sx4.q qVar) {
        this.f495143a = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d
    public void c() {
        sx4.q qVar = this.f495143a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "float page, reload url:%s from net", qVar.f495179j);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar.f495172c;
        if (c22633x83752a59 == null || c22633x83752a59.getParent() == null || qVar.f495178i == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f495179j)) {
            return;
        }
        qVar.f495172c.mo120194xc77ccada();
        qVar.f495172c.mo32265x141096a9(qVar.f495178i.f269103w);
    }
}
