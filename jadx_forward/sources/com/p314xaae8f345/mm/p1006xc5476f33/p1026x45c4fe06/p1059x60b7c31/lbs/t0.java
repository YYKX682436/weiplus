package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u0 f163015d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u0 u0Var) {
        this.f163015d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u0 u0Var = this.f163015d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var = u0Var.f163018f;
        v0Var.f163037u = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = u0Var.f163016d;
        double d17 = v0Var.f163028i;
        double d18 = v0Var.f163029m;
        int i18 = u0Var.f163017e;
        if (v0Var.f163036t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "showing location list");
            return;
        }
        v0Var.f163036t = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(e9Var.getF229340d());
        android.view.View inflate = android.view.LayoutInflater.from(e9Var.getF229340d()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dys, (android.view.ViewGroup) null, false);
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bzf)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h0(v0Var, e9Var, i18, y1Var));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.iny)).setText(e9Var.Z0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjb));
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
        v0Var.f163027h = hashMap;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567432jh1);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568331v23);
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) e9Var.mo32091x9a3f0ba2().E0()).H1;
        boolean z18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f163030n) || ((java.util.HashMap) v0Var.f163027h).isEmpty()) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f163030n) && !((java.util.HashMap) v0Var.f163027h).isEmpty() && (("tencent".equalsIgnoreCase(v0Var.f163030n) && !((java.util.HashMap) v0Var.f163027h).containsKey("com.tencent.map")) || (("baidu".equalsIgnoreCase(v0Var.f163030n) && !((java.util.HashMap) v0Var.f163027h).containsKey("com.baidu.BaiduMap")) || (("amap".equalsIgnoreCase(v0Var.f163030n) && !((java.util.HashMap) v0Var.f163027h).containsKey("com.autonavi.minimap")) || ("google".equalsIgnoreCase(v0Var.f163030n) && !((java.util.HashMap) v0Var.f163027h).containsKey("com.google.android.apps.maps")))))) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.f163030n) && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f163023v.contains(v0Var.f163030n));
        boolean z19 = "tencent".equalsIgnoreCase(v0Var.f163030n) && z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "forceShowPreferTencentApp:%b, tencentMapDownloadGuide:%b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
        if (!z18 || z19) {
            i17 = i18;
            textView.setVisibility(0);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.i0(v0Var, textView, linearLayout, e9Var, y1Var, i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(12809, 23, "", "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
            if ("tencent".equalsIgnoreCase(v0Var.f163030n)) {
                v0Var.G(e9Var, y1Var, linearLayout, false, i17);
                g0Var.d(12809, 21, "", "", "", e9Var.Z0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.juc), 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
            } else {
                java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f163024w.get(v0Var.f163030n);
                g0Var.d(12809, 21, "", "", "", ((java.util.HashMap) v0Var.f163027h).get(str), 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
                v0Var.F(e9Var, linearLayout, str, (java.lang.String) ((java.util.HashMap) v0Var.f163027h).get(str), v0Var.f163030n, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l0(v0Var, str, e9Var, i17, y1Var), false);
            }
        } else {
            i17 = i18;
            v0Var.I(e9Var, y1Var, linearLayout, i17);
        }
        y1Var.k(inflate);
        y1Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j0(v0Var, e9Var, i17, y1Var));
        y1Var.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k0(v0Var, e9Var, i17);
        y1Var.d(true);
        y1Var.s();
    }
}
