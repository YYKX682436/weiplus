package x44;

/* loaded from: classes4.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f533414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.s f533415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, x44.s sVar) {
        super(2);
        this.f533414d = pVar;
        this.f533415e = sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String respUsername = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respUsername, "respUsername");
        yz5.p pVar = this.f533414d;
        if (intValue != 0 || android.text.TextUtils.isEmpty(respUsername)) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(intValue), respUsername);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            this.f533415e.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m70010xdf8cbf17(respUsername);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FollowBrand", "there is an exception: " + th6.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
            pVar.mo149xb9724478(0, respUsername);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$request$1");
        return f0Var;
    }
}
