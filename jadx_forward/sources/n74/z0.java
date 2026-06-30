package n74;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b f416987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n74.b1 f416988e;

    public z0(n74.b1 b1Var, ca4.b bVar) {
        this.f416988e = b1Var;
        this.f416987d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ca4.b bVar = this.f416987d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
        try {
            java.lang.String str = bVar.f121358g;
            n74.b1 b1Var = this.f416988e;
            if (str != null) {
                n74.b1.a(b1Var).f38078x88b8744a = bVar.f121358g;
            }
            n74.b1.a(b1Var).f38079xad31f4e4 = bVar.f121359h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", "adExtTailWordingExchangeValue: " + n74.b1.a(b1Var).f38079xad31f4e4 + ", adExtTailWording: " + n74.b1.a(b1Var).f38078x88b8744a + "，adInfo hashcode: " + n74.b1.a(b1Var).hashCode());
            if (bVar.f121354c != null) {
                n74.b1.a(b1Var).f38057x2f13d7b2 = bVar.f121354c;
            }
            n74.b1.a(b1Var).f38058x2f17b6f2 = bVar.f121352a;
            if (bVar.f121355d.size() > 0) {
                n74.b1.a(b1Var).f38061x48a65a51.clear();
                n74.b1.a(b1Var).f38061x48a65a51.addAll(bVar.f121355d);
            }
            if (bVar.f121353b != null) {
                n74.b1.a(b1Var).f38060xc67219e0 = bVar.f121353b;
            }
            if (bVar.f121356e != null) {
                n74.b1.a(b1Var).f38059xdaab2aea = bVar.f121356e;
            }
            if (bVar.f121357f != null) {
                n74.b1.a(b1Var).f38056x26a52bf4 = bVar.f121357f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", "adActionExtTailWording: " + n74.b1.a(b1Var).f38060xc67219e0 + "，adInfo hashcode: " + n74.b1.a(b1Var).hashCode());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
    }
}
