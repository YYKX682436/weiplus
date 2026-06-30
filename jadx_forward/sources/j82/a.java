package j82;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f379683a;

    /* renamed from: b, reason: collision with root package name */
    public final i82.a f379684b;

    public a(android.content.Context context, i82.a aVar) {
        this.f379683a = context;
        this.f379684b = aVar;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: doImgPreview */
    public void m140460x767d2970(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 z7Var = new com.p314xaae8f345.mm.vfs.z7(android.net.Uri.parse(str));
        java.lang.String str2 = z7Var.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, l17, z7Var.f294813g, z7Var.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s no exist", str);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(z7Var.m82499x9616526c())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s", str);
        i82.a aVar = this.f379684b;
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(aVar.f67782xf37e0490, ",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        int i17 = 0;
        for (int i18 = 0; i18 < O1.size(); i18++) {
            java.lang.String str3 = aVar.f67781x9ec3d174 + "/" + ((java.lang.String) O1.get(i18));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str3)) {
                arrayList.add(str3);
                if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.endsWith((java.lang.String) O1.get(i18))) {
                    z17 = true;
                } else if (!z17) {
                    i17++;
                }
            }
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            strArr[i19] = (java.lang.String) arrayList.get(i19);
            java.lang.String str4 = (java.lang.String) arrayList.get(i19);
            java.lang.String str5 = z7Var.f294812f;
            int lastIndexOf = str5.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str5 = str5.substring(lastIndexOf + 1);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str4, str5)) {
                i17 = i19;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrlPath", str);
        intent.putExtra("nowUrl", strArr[i17]);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("currentPos", i17);
        intent.putExtra("shouldShowScanQrCodeMenu", false);
        android.content.Context context = this.f379683a;
        if (context instanceof android.app.Service) {
            intent.addFlags(268435456);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 4);
        bundle.putString("stat_url", "");
        intent.putExtra("_stat_obj", bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.t(intent, context);
    }
}
