package x44;

/* loaded from: classes4.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f533460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(q64.b bVar) {
        super(1);
        this.f533460d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$onServerRun$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$onServerRun$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        q64.b bVar = this.f533460d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("result", it.toString());
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$onServerRun$1");
        return f0Var;
    }
}
