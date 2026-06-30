package x44;

/* loaded from: classes4.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f533405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q64.b bVar) {
        super(2);
        this.f533405d = bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String phoneNumber = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$onServerRun$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneNumber, "phoneNumber");
        q64.b bVar = this.f533405d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", intValue);
            bundle.putString("phone", phoneNumber);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$onServerRun$1");
        return f0Var;
    }
}
