package x44;

/* loaded from: classes4.dex */
public final class p extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f533408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.p pVar, int i17) {
        super(i17);
        this.f533408e = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k64.s
    public void b(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
        yz5.p pVar = this.f533408e;
        if (i17 != 0) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
            return;
        }
        if (m1Var instanceof ns.l) {
            java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
            pVar.mo149xb9724478(0, J2 != null ? J2 : "");
        } else if (m1Var instanceof ab0.s) {
            java.lang.String str = ((l41.o) ((ab0.s) m1Var)).f397417f;
            pVar.mo149xb9724478(0, str != null ? str : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
    }
}
