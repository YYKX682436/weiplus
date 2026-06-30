package x44;

/* loaded from: classes4.dex */
public final class q1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long optLong = data.optLong(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("appId");
        if (optLong <= 0) {
            if (optString == null || optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.QueryDownload", "the download id and app id are all empty!");
                b(g("the download id and app id are all empty!"));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
                return;
            }
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar.m134976x2690a4ac();
        h02.b bVar = gVar.f81913d;
        h02.a z07 = !(optString == null || optString.length() == 0) ? bVar.z0(optString) : bVar.D0(optLong);
        if (z07 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", z07.f68404x28d45f97);
            jSONObject.put(dm.i4.f66865x76d1ec5a, z07.f68408x32b20428);
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, z07.f68419xf1e9b966);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, z07.f68418xf1e8cfcc);
            jSONObject.put("md5", z07.f68426x4b6e68b9);
            jSONObject.put("downloadedSize", z07.f68413xf432b5ad);
            jSONObject.put("totalSize", z07.f68443x78351860);
            jSONObject.put("fileSize", z07.f68420xf1eb3542);
            jSONObject.put("isAutoDownload", z07.f68405x56e99a7c);
            jSONObject.put("isAutoInstall", z07.f68406x8d834527);
            jSONObject.put("status", z07.f68441x10a0fed7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
            m(jSONObject);
            b(jSONObject);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.QueryDownload", "query download info failed!!");
            b(w44.d.k(this, -1, "query download info failed!!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryDownloadTask");
    }
}
