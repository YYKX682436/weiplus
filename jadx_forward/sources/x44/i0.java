package x44;

/* loaded from: classes4.dex */
public final class i0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long optLong = data.optLong(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("appId");
        boolean z17 = true;
        if (optLong <= 0) {
            if (optString == null || optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.InstallDownload", "the download id and app id are all empty!");
                b(g("the download id and app id are all empty!"));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
                return;
            }
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar.m134976x2690a4ac();
        h02.b bVar = gVar.f81913d;
        if (optString != null && optString.length() != 0) {
            z17 = false;
        }
        h02.a z07 = !z17 ? bVar.z0(optString) : bVar.D0(optLong);
        if (z07 != null) {
            yb0.a aVar = yb0.a.f542145a;
            java.lang.String str = z07.f68411x238eb002;
            if (str == null) {
                str = "";
            }
            java.lang.String m17 = env.b().m();
            aVar.a(str, m17 != null ? m17 : "");
            if (z07.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(z07.f68419xf1e9b966)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                yb0.b.a(z07.f68419xf1e9b966, z07.f68411x238eb002);
                long j17 = z07.f68408x32b20428;
                x44.h0 h0Var = new x44.h0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j17, false, h0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdJs.InstallDownload", "the download task isn't completed!!!");
                b(g("the download task isn't completed!!!"));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.InstallDownload", "it can't find download info with the download id " + optLong + " or app id " + optString + '!');
            b(g("it can't find download info with the download id " + optLong + " or app id " + optString + '!'));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
    }
}
