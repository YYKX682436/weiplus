package x44;

/* loaded from: classes4.dex */
public final class s0 implements y44.b {

    /* renamed from: a, reason: collision with root package name */
    public final w44.a f533418a;

    public s0(w44.a aVar) {
        this.f533418a = aVar;
    }

    public void a(java.lang.String pkg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OnInstallAction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.InstallAction", "{pkg:\"" + pkg + "\", installed:1}");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("pkg", pkg);
        jSONObject.put("installed", 1);
        w44.a aVar = this.f533418a;
        if (aVar != null) {
            aVar.a("onApkInstalled", jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OnInstallAction");
    }
}
