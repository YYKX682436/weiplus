package x44;

/* loaded from: classes4.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f533323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(q64.b bVar, java.lang.String str) {
        super(2);
        this.f533323d = bVar;
        this.f533324e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        q64.b bVar = this.f533323d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, intValue);
            bundle.putInt("state", intValue2);
            bundle.putString("hbCoverId", this.f533324e);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$onServerRun$1");
        return f0Var;
    }
}
