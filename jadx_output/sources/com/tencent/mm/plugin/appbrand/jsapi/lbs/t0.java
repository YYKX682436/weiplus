package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.u0 f81482d;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.lbs.u0 u0Var) {
        this.f81482d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.u0 u0Var = this.f81482d;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = u0Var.f81485f;
        v0Var.f81504u = false;
        com.tencent.mm.plugin.appbrand.e9 e9Var = u0Var.f81483d;
        double d17 = v0Var.f81495i;
        double d18 = v0Var.f81496m;
        int i18 = u0Var.f81484e;
        if (v0Var.f81503t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "showing location list");
            return;
        }
        v0Var.f81503t = true;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(e9Var.getF147807d());
        android.view.View inflate = android.view.LayoutInflater.from(e9Var.getF147807d()).inflate(com.tencent.mm.R.layout.dys, (android.view.ViewGroup) null, false);
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bzf)).setOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.lbs.h0(v0Var, e9Var, i18, y1Var));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.iny)).setText(e9Var.Z0().getString(com.tencent.mm.R.string.mjb));
        android.app.Activity Z0 = e9Var.Z0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("com.tencent.map");
        arrayList.add("com.google.android.apps.maps");
        arrayList.add("com.baidu.BaiduMap");
        arrayList.add("com.autonavi.minimap");
        arrayList.add("com.sogou.map.android.maps");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18))));
        android.content.pm.PackageManager packageManager = Z0.getPackageManager();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
            if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                hashMap.put(activityInfo.packageName, activityInfo.loadLabel(Z0.getPackageManager()).toString());
            }
        }
        v0Var.f81494h = hashMap;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485899jh1);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486798v23);
        boolean z17 = ((com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) e9Var.getRuntime().E0()).H1;
        boolean z18 = (com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f81497n) || ((java.util.HashMap) v0Var.f81494h).isEmpty()) || (!com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f81497n) && !((java.util.HashMap) v0Var.f81494h).isEmpty() && (("tencent".equalsIgnoreCase(v0Var.f81497n) && !((java.util.HashMap) v0Var.f81494h).containsKey("com.tencent.map")) || (("baidu".equalsIgnoreCase(v0Var.f81497n) && !((java.util.HashMap) v0Var.f81494h).containsKey("com.baidu.BaiduMap")) || (("amap".equalsIgnoreCase(v0Var.f81497n) && !((java.util.HashMap) v0Var.f81494h).containsKey("com.autonavi.minimap")) || ("google".equalsIgnoreCase(v0Var.f81497n) && !((java.util.HashMap) v0Var.f81494h).containsKey("com.google.android.apps.maps")))))) || (!com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f81497n) && !com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.f81490v.contains(v0Var.f81497n));
        boolean z19 = "tencent".equalsIgnoreCase(v0Var.f81497n) && z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "forceShowPreferTencentApp:%b, tencentMapDownloadGuide:%b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
        if (!z18 || z19) {
            i17 = i18;
            textView.setVisibility(0);
            textView.setOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.lbs.i0(v0Var, textView, linearLayout, e9Var, y1Var, i17));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(12809, 23, "", "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
            if ("tencent".equalsIgnoreCase(v0Var.f81497n)) {
                v0Var.G(e9Var, y1Var, linearLayout, false, i17);
                g0Var.d(12809, 21, "", "", "", e9Var.Z0().getString(com.tencent.mm.R.string.juc), 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
            } else {
                java.lang.String str = (java.lang.String) com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.f81491w.get(v0Var.f81497n);
                g0Var.d(12809, 21, "", "", "", ((java.util.HashMap) v0Var.f81494h).get(str), 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
                v0Var.F(e9Var, linearLayout, str, (java.lang.String) ((java.util.HashMap) v0Var.f81494h).get(str), v0Var.f81497n, true, new com.tencent.mm.plugin.appbrand.jsapi.lbs.l0(v0Var, str, e9Var, i17, y1Var), false);
            }
        } else {
            i17 = i18;
            v0Var.I(e9Var, y1Var, linearLayout, i17);
        }
        y1Var.k(inflate);
        y1Var.n(new com.tencent.mm.plugin.appbrand.jsapi.lbs.j0(v0Var, e9Var, i17, y1Var));
        y1Var.f212037s = new com.tencent.mm.plugin.appbrand.jsapi.lbs.k0(v0Var, e9Var, i17);
        y1Var.d(true);
        y1Var.s();
    }
}
